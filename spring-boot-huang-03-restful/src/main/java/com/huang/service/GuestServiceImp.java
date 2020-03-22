package com.huang.service;

import com.huang.bean.Guest;
import com.huang.mapper.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements GuestService {

    @Autowired
    private GuestDao dao;

    @Override
    public List<Guest> list() {
        return dao.list();
    }

    @Override
    public void add(Guest g) {
        dao.add(g);
    }

    @Override
    public void update(Guest g) {
        dao.update(g);
    }

    @Override
    public Guest get(String name) {
        return dao.get(name);
    }

    @Override
    public void detele(String name) {
        dao.detele(name);
    }
}
