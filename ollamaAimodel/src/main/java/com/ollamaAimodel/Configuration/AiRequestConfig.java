package com.ollamaAimodel.Configuration;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiRequestConfig {
	
	private final ChatModel chatModel;

	public AiRequestConfig(ChatModel chatModel) {
		this.chatModel = chatModel;
	}
	
	@Bean
	public ChatClient chatClient() {
		return ChatClient.builder(chatModel).build();
	}
}
