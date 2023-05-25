package com.bcyoung.forum.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginTicket {
    private int id;
    private int userId;
    private String ticket;
    private int status;
    private Date expired;
}
