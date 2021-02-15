package com.gbp.webprj.repository.mapper;

import com.gbp.webprj.model.CommentDto;

public interface UserMapper {

	CommentDto selectSuggestRate(int userId);
	
	CommentDto selectRequestRate(int userId);
	
}
