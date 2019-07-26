package com.jipinxiaohei.nizhan.service;


import com.jipinxiaohei.nizhan.po.Comment;

import java.util.List;


public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
