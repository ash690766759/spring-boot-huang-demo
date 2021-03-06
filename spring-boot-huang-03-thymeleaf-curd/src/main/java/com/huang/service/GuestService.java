package com.huang.service;

import com.huang.bean.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> list();

    void add(Guest g);

    void update(Guest g);

    Guest get(String name);

    void detele(String name);
}
