package com.chelayel.ioc.library;

import lombok.Data;

@Data
public class LibraryManagerBook {
    private Literature literature;

    public LibraryManagerBook() {
        this.literature = new Book();
    }
}
