package com.huang.mapper;

import com.huang.bean.Guest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface GuestMapper {
    @Select("select name,role from guest")
    List<Guest> aaa();
}
