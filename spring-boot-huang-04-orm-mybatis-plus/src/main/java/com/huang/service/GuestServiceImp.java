package com.huang.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huang.mapper.GuestMapper;
import com.huang.bean.Guest;
import org.springframework.stereotype.Service;

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
