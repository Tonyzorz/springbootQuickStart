package com.example.demo;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.domain.Board;
import com.example.demo.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTest {

	@Autowired autowired
	private BoardRepository boardRepo;
	
	@Test
	public void testInsertBoard() {
		Board board = new Board();
		board.setTitle("게시글");
		board.setWriter("테스터");
		board.setContent("잘 등록되나요");
		board.setCreateDate(new Date());
		board.setCnt(0L);
		
		boardRepo.save(board);
		
	}
}
