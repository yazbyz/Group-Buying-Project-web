package com.gbp.webprj.service;

import com.gbp.webprj.model.CommentDto;

public interface CommentService {

	//댓글 삽입 
	public void insertComment(CommentDto commentDto);
	
	//댓글 조회
	public CommentDto selectComment(String comment_id);
	//게시글 댓글 조회
	public CommentDto SelectCommentsInPosting(String posting_id);
	
	//댓글 수정 
	public void updateComment(String comment_id);
	
	//댓글 삭제
	public void deleteComment(String comment_id);
}
