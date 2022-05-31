package com.zlj.community.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class DiscussPost {

    private Integer id;

    private Integer userId;

    private String title;

    private String text;

    private Integer type;

    private Integer status;

    private Date createTime;

    private Integer commentCount;

    private Double score;
}
