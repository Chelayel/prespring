package com.chelayel.ioc.library;

import lombok.Data;

@Data
public class Magazine implements Literature {
    @Override
    public String getType() {
        return "Magazine";
    }

    @Override
    public String getPrice() {
        return "10 $";
    }
}
