package com.chelayel.ioc.library;

public class Book implements Literature {

    @Override
    public String getType() {
        return "Book";
    }

    @Override
    public String getPrice() {
        return "5 $";
    }
}
