package com.huang.service;

import com.huang.mapper.GuestMapper;
import com.huang.bean.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements GuestService {

    @Autowired
    private GuestMapper mapper;

    @Override
    public List<Guest> list() {
        return mapper.list();
    }

    @Override
    public void add(Guest g) {
        mapper.add(g);
    }
}
