package com.huang.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Food {
    private String rice;
    private String meat;

    public Food(String rice, String meat) {
        this.rice = rice;
        this.meat = meat;
    }
}
