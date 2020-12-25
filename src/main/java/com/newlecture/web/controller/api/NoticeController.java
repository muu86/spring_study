package com.newlecture.web.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// �������� @Controller ������̼�
// �ڵ����� ��üȭ
// bean id �� �ڵ�����
// Ŭ���� �̸� ù ���� �ҹ��ڷ�
// noticeController �� ���� ��
// ������ customer ��Ű���� ���� id ��ü�� ��������� ������ Conflict ���� �߻�
// Controller ("�̸�") �� �������� �������ָ� �ȴ�.

@RestController("apiNoticeController")
@RequestMapping("/api/notice/")
public class NoticeController {
	
	@RequestMapping("list")
	public String list() {
		
		
		
		return "�������� notice list";
	}
}
