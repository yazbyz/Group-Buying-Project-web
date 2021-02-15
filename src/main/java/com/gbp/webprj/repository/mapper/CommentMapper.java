package com.gbp.webprj.repository.mapper;

import com.gbp.webprj.model.CommentDto;

public interface CommentMapper {
	
	CommentDto selectCommentById(int userId);
	
}
