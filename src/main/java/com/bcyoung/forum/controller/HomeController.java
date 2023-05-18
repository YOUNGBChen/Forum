package com.bcyoung.forum.controller;

import com.bcyoung.forum.entity.DiscussPost;
import com.bcyoung.forum.entity.Page;
import com.bcyoung.forum.entity.User;
import com.bcyoung.forum.service.DiscussPostsService;
import com.bcyoung.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    private DiscussPostsService discussPostsService;
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String getIndexPage(Model model, Page page){
        page.setRows(discussPostsService.findDiscussPostRows(0));
        page.setPath("/index");
        List<DiscussPost> discussPosts = discussPostsService.findDiscussPosts(0, page.getOffset(), page.getLimit());
        List<Map<String,Object>> list = new ArrayList<>();
        if(discussPosts != null){
            for(DiscussPost discussPost: discussPosts){
                Map<String, Object> map = new HashMap<>();
                map.put("post", discussPost);
                User user = userService.findUserById(discussPost.getUserId());
                map.put("user", user);
                list.add(map);
            }
        }
        model.addAttribute("discussPosts", list);
        return "/index";
    }
}
