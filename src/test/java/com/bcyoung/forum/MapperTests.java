package com.bcyoung.forum;

import com.bcyoung.forum.dao.DiscussPostMapper;
import com.bcyoung.forum.dao.LoginTicketMapper;
import com.bcyoung.forum.entity.DiscussPost;
import com.bcyoung.forum.entity.LoginTicket;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = ForumApplication.class)
public class MapperTests {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Autowired
    private LoginTicketMapper loginTicketMapper;
    @Test
    public void testSelectPosts(){
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(0, 0, 10);
        System.out.println(discussPosts);
    }

    @Test
    public void insertLoginTicket(){
        LoginTicket loginTicket = new LoginTicket();
        loginTicket.setUserId(1);
        loginTicket.setStatus(0);
        loginTicket.setTicket("abc");
        loginTicket.setExpired(new Date(System.currentTimeMillis()));

        loginTicketMapper.insertLoginTicket(loginTicket);
    }

    @Test
    public void selectByTicket(){
        LoginTicket loginTicket = loginTicketMapper.selectByTicket("abc");
        loginTicketMapper.updateStatus("abc",1);
        LoginTicket loginTicket2 = loginTicketMapper.selectByTicket("abc");
        System.out.println(loginTicket2);
    }
}
