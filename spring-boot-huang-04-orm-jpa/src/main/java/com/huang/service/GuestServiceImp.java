package com.huang.service;

import com.huang.bean.Guest;
import com.huang.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements GuestService {

    @Autowired
    private GuestRepository repository;

    @Override
    public List<Guest> list() {
        return repository.findAll();

    }
}
