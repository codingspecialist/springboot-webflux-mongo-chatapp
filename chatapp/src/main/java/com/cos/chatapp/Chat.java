package com.cos.chatapp;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//STS 툴에 lombok 설정하는 법 (인터넷)

@Data
@Document(collection = "chat")
public class Chat {
	@Id
	private String id;
	private String msg;
	private String sender; // 보내는 사람
	private String receiver; // 받는 사람 (귓속말)
	private Integer roomNum; // 방 번호
	
	private LocalDateTime createdAt;
}




