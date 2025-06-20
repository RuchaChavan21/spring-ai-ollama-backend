package com.ollamaAimodel.ServiceImpl;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ollamaAimodel.Service.AiRequestService;

@Service
public class AiRequestServiceImpl implements AiRequestService {

	@Autowired
	private ChatClient chatClient;

	@Override
	public String getAiResponse(String message) {
		if(message == null || message.trim().isEmpty()) {
			return "Error : Input message cannot be null or empty";
		}
		
		try {
			return chatClient.prompt().user(message).call().content();
		} catch (Exception e) {
			// TODO: handle exception
			return "Exception: "+e.getMessage();
		}
	}
}
