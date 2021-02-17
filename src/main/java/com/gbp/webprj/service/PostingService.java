package com.gbp.webprj.service;

import java.util.List;

import com.gbp.webprj.model.PostingDto;

public interface PostingService {
	
	//글 작성(삽입)
	public void insertPosting(PostingDto postingDto);
	

	//글 + 사진 조회
	//public HashMap<postingDto, PhotoDto> selectPostingContent(String posting_id);
	//내가 참여한 모든 글 조회 
	public PostingDto selectPosting(String user_id);
	//내가 참여한 모든 글 중에, 진행 중인 글 조회 
	public PostingDto selectPostingNow(String user_id);
	//내가 참여한 모든 글 중에, 종료된 글 조회
	public PostingDto selectPostingEnd(String user_id);
	//내가 참여한 모든 글 중에, 내가 신청한 글 조회
	public PostingDto selectPostingIRequested(String user_id);
	//내가 참여한 모든 글 중에, 내가 작성한 글 조회
	public PostingDto selectPostingISuggested(String user_id);
	//모든 글 조회 
	public List<PostingDto> selectAllPosting();
	
	//글 수정
	public void updatePosting(PostingDto postingDto);
	
	//글 삭제 
	
}
