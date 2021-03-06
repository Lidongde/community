package com.lionde.community.mapper;

import com.lionde.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("insert into tableuser (name, account_id, token, gmt_create, gmt_modified, avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("select * from tableuser where token = #{token}")
    User findByToken(@Param("token") String token);
}
