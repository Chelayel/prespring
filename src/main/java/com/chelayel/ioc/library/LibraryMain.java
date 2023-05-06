package com.chelayel.ioc.library;

public class LibraryMain {
    public static void main(String[] args) {

        LibraryManagerMagazine libraryManagerMagazine = new LibraryManagerMagazine();
        libraryManagerMagazine.getLiterature().getType();

        LibraryManagerBook libraryManagerBook = new LibraryManagerBook();
        libraryManagerBook.getLiterature().getType();

        LibraryManagerIoc libraryManagerIoc = new LibraryManagerIoc(new Book());
        System.out.println(libraryManagerIoc.getLiterature().getType());
    }
}
