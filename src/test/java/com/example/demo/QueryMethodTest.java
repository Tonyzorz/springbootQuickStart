package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.Board;
import com.example.demo.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryMethodTest {
	@Autowired 
	private BoardRepository boardRepo;
	
//	@Before
//	public void dataPrepare() {
//		for (int i = 1; i <= 200; i++) {
//			Board board = new Board();
//			board.setTitle("test" + i);
//			board.setWriter("writer");
//			board.setContent("content"+ i);
//			board.setCreateDate(new Date());
//			board.setCnt(0L);
//			boardRepo.save(board);
//		}
//	}
//	
//	@Test
//	public void testFindByTitle() {
//		List<Board> boardList = boardRepo.findByTitle("test10");
//		
//		System.out.println("==============result================");
//		for (Board board : boardList) {
//			System.out.println("-->" + board.toString());
//		}
//	}
//	
//	@Test
//	public void testByContentContaining() {
//		List<Board> BoardList = boardRepo.findByContentContaining("17");
//		
//		System.out.println("contentContaining results results results");
//		for (Board board : BoardList) {
//			System.out.println(board.toString());
//		}
//	}
//	
//	@Test
//	public void testByTitleContainingOrContentContaining() {
//		List<Board> BoardList = boardRepo.findByTitleContainingOrContentContaining("17", "17");
//		System.out.println("TESTBYTITLECONTAINGORCONTENTCONTAINING");
//		for(Board board : BoardList) {
//			
//			System.out.println(board.toString());
//		}
//	}
//	
//	@Test
//	public void testByTitleContainingOrderBySeqDesc() {
//		List<Board> BoardList = boardRepo.findByTitleContainingOrderBySeqDesc("17");
//		System.out.println("ordering by seq descending order");
//		for(Board board: BoardList) {
//			System.out.println(board.toString());
//		}
//	}
	@Test
	public void testByTitleContainingPaging() {
		Pageable paging = PageRequest.of(0, 5, Sort.Direction.DESC, "seq");
		List<Board> boardList = boardRepo.findByTitleContaining("test", paging);
		
		System.out.println("titlecontainingnginginpaginginginginging");
		for(Board board : boardList) {
			System.out.println(board.toString());
		}
	}
	
//	@Test
//	public void testFindByTitleContaining() {
//		Pageable paging = PageRequest.of(0, 5);
//		Page<Board> pageInfo = boardRepo.findByTitleContainingOrderBySeqDesc("test", paging);
//		
//		System.out.println("page size" + pageInfo.getSize());
//		System.out.println("total pages" + pageInfo.getTotalPages());
//		System.out.println("total count" + pageInfo.getTotalElements());
//		System.out.println("next" + pageInfo.nextPageable());
//		
//		List<Board> boardList = pageInfo.getContent();
//		System.out.println("search result");
//		for(Board board : boardList) {
//			System.out.println(board.toString());
//		}
//	}
	
	@Test
	public void testQueryAnnotationTest1() {
		List<Board> boardList = boardRepo.queryAnnotationTest1("test10");
		
		System.out.println("search result");
		for(Board board : boardList) {
			System.out.println(board.toString());
		}
		
	}
	
	@Test
	public void testQueryAnnotationTest2() {
		List<Object[]> boardList = boardRepo.queryAnnotationTest2("test11");
		System.out.println("testqueryannotationtest2");
		
		for(Object[] row : boardList) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	@Test
	public void testQueryAnnotationTest3() {
		List<Object[]> boardList = boardRepo.queryAnnotationTest3("test10");
		System.out.println("testqueryannotationtest33333");
		
		for(Object[] row : boardList) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	@Test
	public void testQueryAnnotationTest4() {
		Pageable paging = PageRequest.of(0, 3, Sort.Direction.DESC, "seq");
		List<Board> boardList = boardRepo.queryAnnotationTest4(paging);
		System.out.println("testqueryannotation4444");
		
		for(Board board : boardList) {
			System.out.println(board.toString());
		}
		
	}
}
