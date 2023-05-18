package com.bcyoung.forum.dao;

import com.bcyoung.forum.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectById(int userId);
}
