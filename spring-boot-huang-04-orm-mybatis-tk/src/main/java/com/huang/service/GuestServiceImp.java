package com.huang.service;

import com.huang.bean.Guest;
import com.huang.tkmapper.GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements GuestService {

    @Autowired
    private GuestMapper mapper;

    @Override
    public List<Guest> list() {
        return mapper.selectAll();
    }
}
