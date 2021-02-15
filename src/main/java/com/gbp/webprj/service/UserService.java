package com.gbp.webprj.service;

import com.gbp.webprj.model.UserDto;

public interface UserService {

	//사용자 삽입 
	public void insertUser(UserDto userDto);
	
	//email로 사용자id 조회(가입 여부 확인) 
	public String selectUserId(String email);
	//사용자 정보 조회
	public UserDto selectUserInfo(String user_id);
	
	//사용자 정보 수
	public void updateUser(UserDto userDto);
	
	//사용자 탈퇴 
	public void deleteUser(String user_id);
	
}
