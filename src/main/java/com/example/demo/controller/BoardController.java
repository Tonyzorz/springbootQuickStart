package com.example.demo.controller;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.BoardVO;

@RestController
public class BoardController {

		public BoardController() {
			// TODO Auto-generated constructor stub
			System.out.println("===> BoardController 생성");
		}
		
//		@RequestMapping(value="/hello", method=RequestMethod.GET) same as below 
		@GetMapping("/hello")
		public String hello(String name) {
			return "Hello :" + name;
		}
		
		@GetMapping("/getBoard")
		public BoardVO getBoard() {
			BoardVO board = new BoardVO();
			board.setSeq(1);
			board.setTitle("title");
			board.setWriter("tester");
			board.setContent("content");
			board.setCreateDate(new Date());
			board.setCnt(0);
			return board;
		}
		
		@GetMapping("/getBoardList")
		public List<BoardVO> getBoardList() {
			List<BoardVO> boardList = new ArrayList<BoardVO>();
			for(int i = 1; i <= 11; i++) {
				BoardVO board = new BoardVO();
				board.setSeq(i);
				board.setTitle("title" + i);
				board.setWriter("writer" + i);
				board.setContent(i + "content");
				board.setCreateDate(new Date());
				board.setCnt(0);
				boardList.add(board);
				
			}
			return boardList;
		}
		
		
}
