package com.huang.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huang.mapper.GuestMapper;
import com.huang.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp extends ServiceImpl<GuestMapper,Guest> implements GuestService {
/*
    @Autowired
    private GuestMapper mapper;

    @Override
    public List<Guest> list() {
        return mapper.selectList(null);
    }*/
}
