package com.bcyoung.forum;

import com.bcyoung.forum.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = ForumApplication.class)
public class MailTests {
    @Autowired
    private MailClient mailClient;

    @Test
    public void testTextMail(){
        mailClient.sendMail("bcyan@stu.xidian.edu.cn","test","test");
    }
}
