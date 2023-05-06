package com.chelayel.ioc.library;

import lombok.Data;

@Data
public class LibraryManagerMagazine {
    private Literature literature;

    public LibraryManagerMagazine() {
        this.literature = new Magazine();
    }
}
