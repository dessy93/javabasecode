package com.Thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureTest {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            System.out.println("enter");
            String dir = in.nextLine();
            System.out.println("enter");
            String keyword = in.nextLine();

            MatchCounter counter = new MatchCounter(new File(dir),keyword);
            FutureTask<Integer> task = new FutureTask<>(counter);
            Thread t = new Thread(task);
            t.start();

            try {
                System.out.println(task.get() + "matching files");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    static class MatchCounter implements Callable<Integer>{

        private File dir;
        private String keywork;

        public MatchCounter(File dir, String keywork) {
            this.dir = dir;
            this.keywork = keywork;
        }

        @Override
        public Integer call() throws Exception {
            int count = 0;
            try {
                File[] files = dir.listFiles();
                List<Future<Integer>> results = new ArrayList<>();

                for (File file : files){
                    if (file.isDirectory()){
                        MatchCounter counter = new MatchCounter(file,keywork);
                        FutureTask<Integer> task = new FutureTask<>(counter);
                        results.add(task);
                        Thread t = new Thread(task);
                        t.start();
                    }else {
                        if (search(file))
                            count++;
                    }

                }

                for (Future<Integer> result:results){
                    try {
                        count+= result.get();
                    }catch (ExecutionException e){
                        e.printStackTrace();
                    }
                }

            }catch (Exception e){

            }



            return count;
        }

        public boolean search(File file){
            try {
                try (Scanner in = new Scanner(file,"UTF-8")){
                    boolean found = false;
                    while (!found && in.hasNextLine()){
                        String line = in.nextLine();
                        if (line.contains(keywork))
                            found = true;
                    }
                    return found;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }catch (Exception e){
                return false;
            }
            return true;
        }
    }
}
