package com.newlecture.web.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링은 @Controller 어노테이션
// 자동으로 객체화
// bean id 를 자동으로
// 클래스 이름 첫 글자 소문자로
// noticeController 로 만들 것
// 기존의 customer 패키지에 동일 id 객체가 만들어지기 때문에 Conflict 오류 발생
// Controller ("이름") 을 수동으로 지정해주면 된다.

@RestController("apiNoticeController")
@RequestMapping("/api/notice/")
public class NoticeController {
	
	@RequestMapping("list")
	public String list() {
		
		
		
		return "공지사항 notice list";
	}
}
