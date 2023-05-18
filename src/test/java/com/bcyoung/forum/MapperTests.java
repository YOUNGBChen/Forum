package com.bcyoung.forum;

import com.bcyoung.forum.dao.DiscussPostMapper;
import com.bcyoung.forum.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = ForumApplication.class)
public class MapperTests {
    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Test
    public void testSelectPosts(){
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(0, 0, 10);
        System.out.println(discussPosts);
    }
}
