package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Board;
import com.example.demo.persistence.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardRepository boardRepo;
	
	@Override
	public List<Board> getBoardList(Board board){
		return (List<Board>) boardRepo.findAll();
	}
	
	@Override
	public void insertBoard(Board board) {
		boardRepo.save(board);
	}
	
	@Override
	public Board getBoard(Board board) {
		return boardRepo.findById(board.getSeq()).get();
	}
	
	@Override
	public void updateBoard(Board board) {
		Board findBoard = boardRepo.findById(board.getSeq()).get();
		
		findBoard.setTitle(board.getTitle());
		findBoard.setContent(board.getContent());
		boardRepo.save(findBoard);
	}
	@Override
	public void deleteBoard(Board board) {
		Board deleteBoard = boardRepo.findById(board.getSeq()).get();
		boardRepo.delete(deleteBoard);
//		much easier way below, didn't know such jpa existed
//		boardRepo.deleteById(board.getSeq());
	}
	
}
