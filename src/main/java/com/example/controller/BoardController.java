package com.example.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Board;

@Controller
public class BoardController {

	@RequestMapping("/getBoardList")
	public String getBoardList(Model model) {
		List<Board> boardList = new ArrayList<Board>();
		for(int i = 1; i <= 10; i++) {
			Board board = new Board();
			board.setSeq(new Long(i));
			board.setTitle("title");
			board.setWriter("writer");
			board.setContent("content");
			board.setCreateDate(new Date());
			board.setCnt(0L);
			boardList.add(board);
		}
		model.addAttribute("boardList", boardList);
		return "getBoardList";
	}
}
