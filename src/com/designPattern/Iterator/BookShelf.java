package com.designPattern.Iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate{

    private Book[] books;
    private ArrayList<Book> bookss = new ArrayList();
    private int last = 0;

//    public BookShelf(int maxsize) {
//        this.bookss = new Book[maxsize];
//    }

    public Book getBookAt(int index){
        return bookss.get(index);
    }

    public void appendBook(Book book){
        this.bookss.add(last,book);
        last++;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterable() {
        return new BookShelfIteraotr(this);
    }
}
