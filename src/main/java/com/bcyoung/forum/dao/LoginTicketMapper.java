package com.bcyoung.forum.dao;

import com.bcyoung.forum.entity.LoginTicket;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginTicketMapper {
    int insertLoginTicket(LoginTicket loginTicket);

    LoginTicket selectByTicket(String ticket);

    int updateStatus(String ticket, int status);

}
