package com.huang.bean;

import lombok.Data;

/**
 * 数据接收类*/
@Data
public class Vegetables {
    private String potato;
    private String eggplant;
    private String greenpeper;

    public Vegetables(String potato, String eggplant, String greenpeper) {
        this.potato = potato;
        this.eggplant = eggplant;
        this.greenpeper = greenpeper;
    }
}
