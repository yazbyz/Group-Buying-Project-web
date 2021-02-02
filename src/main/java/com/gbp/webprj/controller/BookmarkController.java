package com.gbp.webprj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gbp.webprj.service.BookmarkService;

@Controller
public class BookmarkController {
	
	@Autowired
	BookmarkService bookmarkService;

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createPost(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		
		String bookmarkId = this.bookmarkService.create(map);
		if(bookmarkId == null) {
			mav.setViewName("redirect:/create");
		} else {
			mav.setViewName("redirect:/detail?bookmarkId=" + bookmarkId);
		}
		return mav;
	}
}
