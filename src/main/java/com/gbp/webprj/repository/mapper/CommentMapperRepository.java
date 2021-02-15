package com.gbp.webprj.repository.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gbp.webprj.model.CommentDto;

@Repository
public class CommentMapperRepository {
	@Autowired
	private CommentMapper commentMapper;

	public CommentDto selectCommentById(int userId) {
		return commentMapper.selectCommentById(userId);
	}
}
