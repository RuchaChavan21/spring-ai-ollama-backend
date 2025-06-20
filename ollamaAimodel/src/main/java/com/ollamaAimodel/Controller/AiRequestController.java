package com.ollamaAimodel.Controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ollamaAimodel.Model.AiRequest;
import com.ollamaAimodel.Service.AiRequestService;

import org.springframework.web.bind.annotation.RequestBody; 

@RestController
@RequestMapping("/ai")
public class AiRequestController {
	
	@Autowired
	private AiRequestService aiRequestService;
	
	@Autowired
	private ChatClient chatClient;
	
	
	@PostMapping("/ask")
	public String askAI(@RequestBody AiRequest aiRequest) {
		return aiRequestService.getAiResponse(aiRequest.getPrompt());
	}
	
	@GetMapping("/test")
	public String test() {
		return chatClient.prompt().user("Who are you").call().content();
	}
}
