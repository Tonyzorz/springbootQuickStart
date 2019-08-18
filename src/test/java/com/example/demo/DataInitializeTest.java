package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.Board;
import com.example.demo.domain.Member;
import com.example.demo.persistence.BoardRepository;
import com.example.demo.persistence.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataInitializeTest {
	@Autowired
	private MemberRepository memberRepo;
	@Autowired
	private BoardRepository boardRepo;
	
	@Test
	public void testDataInsert() {
		Member member1 = new Member();
		member1.setId("member1");
		member1.setName("tom");
		member1.setPassword("tom");
		member1.setRole("ROLE_USER");
		memberRepo.save(member1);
		
		Member member2 = new Member();
		member2.setId("member2");
		member2.setName("taewon");
		member2.setPassword("taewon");
		member2.setRole("ROLE_ADMIN");
		memberRepo.save(member2);
		
		for(int i = 0; i <= 3; i++) {
			Board board = new Board();
			board.setWriter("tom");
			board.setTitle("title tom made" + i);
			board.setContent("content tom made" + i);
			boardRepo.save(board);
		}
		for(int i = 0; i <= 3; i++) {
			Board board = new Board();
			board.setWriter("taewon");
			board.setTitle("title taewon made" + i);
			board.setContent("content taewon made" + i);
			boardRepo.save(board);
		}
	}
}
