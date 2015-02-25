package com.thoughtworks.voidmethods;

import java.util.ArrayList;
import java.util.Collection;

public class BookBanner {
//    private Collection<String> bannedBooks = new ArrayList<String>();
    private Library bannedLibrary;

    public BookBanner(Library library) {
        this.bannedLibrary = library;
    }

    public void remove(Collection<String> bannedBooks) {
        for (String book : bannedBooks){
            this.bannedLibrary.removeBook(book);
        }
    }
}
