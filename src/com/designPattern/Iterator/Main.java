package com.designPattern.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("1-books"));
        bookShelf.appendBook(new Book("2-books"));
        bookShelf.appendBook(new Book("3-books"));

        Iterator iterator = bookShelf.iterable();
        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
