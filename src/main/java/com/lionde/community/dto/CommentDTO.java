package com.lionde.community.dto;

import com.lionde.community.model.User;
import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Integer likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}