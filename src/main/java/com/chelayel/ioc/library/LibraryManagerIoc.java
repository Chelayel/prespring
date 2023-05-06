package com.chelayel.ioc.library;

import lombok.Data;

@Data
public class LibraryManagerIoc {

    private Literature literature;

    public LibraryManagerIoc(Literature literature) {
        this.literature = literature;
    }
}
