package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.persistence.BoardRepository;
import com.example.demo.persistence.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationMappingTest {

	@Autowired
	private BoardRepository boardRepo;
	@Autowired
	private MemberRepository memberRepo;
//	
//	@Test
//	public void testManyToOneInsert() {
//		Member member1 = new Member();
//		member1.setId("member1");
//		member1.setPassword("member111");
//		member1.setName("Clarence");
//		member1.setRole("User");
////		memberRepo.save(member1);
//		
//		Member member2 = new Member();
//		member2.setId("member2");
//		member2.setPassword("member222");
//		member2.setName("Taewon");
//		member2.setRole("Admin");
////		memberRepo.save(member2);
//		
//		for(int i = 1; i <= 3; i++) {
//			Board board = new Board();
//			board.setMember(member1);
//			board.setTitle("test"+i);
//			board.setContent("content"+i);
//			board.setCreateDate(new Date());
//			board.setCnt(0L);
////			boardRepo.save(board);
//		}
//		memberRepo.save(member1);
//		for(int i = 1; i <= 3; i++) {
//			Board board = new Board();
//			board.setMember(member2);
//			board.setTitle("test"+i);
//			board.setContent("content"+i);
//			board.setCreateDate(new Date());
//			board.setCnt(0L);
////			boardRepo.save(board);
//		}
//		memberRepo.save(member2);
//	}
//	
//	@Test
//	public void testManyToOneSelect() {
//		Board board = boardRepo.findById(5L).get();
//		System.out.println(board.getSeq() + " 번 게시글 정보");
//		System.out.println(board.getTitle());
//		System.out.println(board.getContent());
//		System.out.println(board.getMember().getName());
//		System.out.println(board.getMember().getRole());
//	}
//	
//	@Test
//	public void testTwoWayMapping() {
//		Member member = memberRepo.findById("member1").get();
//		
//		System.out.println("===================");
//		System.out.println(member.getName());
//		System.out.println("===================");
//		List<Board> list = member.getBoardList();
//		for (Board board : list) {
//			System.out.println(board.toString());
//		}
//	}
	
	@Test
	public void testCascadeDelete() {
		memberRepo.deleteById("member2");
	}
}
