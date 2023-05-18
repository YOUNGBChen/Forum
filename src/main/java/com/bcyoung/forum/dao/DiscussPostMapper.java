package com.bcyoung.forum.dao;

import com.bcyoung.forum.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    // 分页查询帖子
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // 分页查询帖子数量
    int selectDiscussPostRows(@Param("userId") int userId);


}
