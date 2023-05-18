package com.bcyoung.forum.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (DiscussPost)实体类
 *
 * @author makejava
 * @since 2023-05-16 20:00:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscussPost{
    private static final long serialVersionUID = -87134804523010385L;
    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int commentCount;
    private double score;

}

