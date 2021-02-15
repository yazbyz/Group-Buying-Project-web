package com.gbp.webprj.service;

import java.util.List;

import com.gbp.webprj.model.postingDto;

public interface PostingService {
	
	//글 작성(삽입)
	public void insertPosting(postingDto postingDto);
	

	//글 + 사진 조회
	//public HashMap<postingDto, PhotoDto> selectPostingContent(String posting_id);
	//내가 참여한 모든 글 조회 
	public postingDto selectPosting(String user_id);
	//내가 참여한 모든 글 중에, 진행 중인 글 조회 
	public postingDto selectPostingNow(String user_id);
	//내가 참여한 모든 글 중에, 종료된 글 조회
	public postingDto selectPostingEnd(String user_id);
	//내가 참여한 모든 글 중에, 내가 신청한 글 조회
	public postingDto selectPostingIRequested(String user_id);
	//내가 참여한 모든 글 중에, 내가 작성한 글 조회
	public postingDto selectPostingISuggested(String user_id);
	//모든 글 조회 
	public List<postingDto> selectAllPosting();
	
	//글 수정
	public void updatePosting(postingDto postingDto);
	
	//글 삭제 
	
}
