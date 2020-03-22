package com.huang.mapper;

import com.huang.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {
    static List<Guest> guests = new ArrayList<>();
    static {
        guests.add(new Guest("黄晓明","店长"));
        guests.add(new Guest("秦海璐","财务"));
        guests.add(new Guest("老林","总厨"));
        guests.add(new Guest("王俊凯","经历"));
        guests.add(new Guest("杨紫","前台"));
    }

    public List<Guest> list(){
        System.out.println(guests);
        return guests;
    }

    public void add(Guest g){
        guests.add(g);
    }

    public void update(Guest g){
        Guest oldG = get(g.getName());
        oldG.setRole(g.getRole());
    }

    public Guest get(String name){
        for (Guest guest:guests){
            if (name.equals(guest.getName())){
                return guest;
            }
        }
        return new Guest("","");
    }

    public void detele(String name){
        guests.remove(get(name));
    }

}
