//package com.example.demo;
//
//import java.util.Date;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.example.demo.domain.Board;
//import com.example.demo.persistence.BoardRepository;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class Chapter51ApplicationTests {
//	@Autowired
//	private BoardRepository boardRepo;
////	
////	@Test
////	public void testInsertBoard() {
////		Board board = new Board();
////		board.setTitle("i");
////		board.setWriter("sdf");
////		board.setContent("df");
////		board.setCreateDate(new Date());
////		board.setCnt(0L);
////		
////		boardRepo.save(board);
////	}
//	
////	@Test
////	public void testGetBoard() {
////		Board board = boardRepo.findById(1L).get();
////		System.out.println(board.toString());
////	}
//	
////	@Test
////	public void testUpdateBoard() {
////		System.out.println("=====1st data======");
////		Board board = boardRepo.findById(1L).get();
////		
////		System.out.println("======1st data revised");
////		board.setTitle("edited the data");
////		boardRepo.save(board);
////	}
//
////	@Test
////	public void testDeleteBoard() {
////		boardRepo.deleteById(2L);
////	}
//}
