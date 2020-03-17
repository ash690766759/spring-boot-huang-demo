package com.huang.mapper;

import com.huang.model.Guest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface GuestMapper {
    @Select("select name,role from guest")
    List<Guest> list();

    @Insert("insert into guest (name,role) values(#{name},#{role})")
    void add(Guest g);
}
