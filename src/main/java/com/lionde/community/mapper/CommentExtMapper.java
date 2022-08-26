package com.lionde.community.mapper;

import com.lionde.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}
