package com.lionde.community.mapper;

import com.lionde.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into user(name, account_id, token, gmt_create, gmt_modified) value(#{name},#{accoutId},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}
