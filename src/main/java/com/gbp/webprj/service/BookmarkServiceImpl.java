package com.gbp.webprj.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbp.webprj.model.BookmarkDao;

@Service
public class BookmarkServiceImpl implements BookmarkService{

	@Autowired
	BookmarkDao bookmarkDao;
	
	@Override
	public String create(Map<String, Object> map) {
		int affectRowCount = this.bookmarkDao.insert(map);
		if(affectRowCount == 1) {
			return map.get("bookmark_id").toString();
		}
		return null;
	}
}
