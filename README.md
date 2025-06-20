# 🧠 Spring AI + Ollama Backend (Gemma 2B Integration)

This is a Spring Boot backend that connects to **Ollama** to run **local AI models** like `gemma:2b` using **Spring AI 1.0.0**.  
It exposes a simple REST API to send prompts and get smart AI responses — 100% offline and private.

---

🚀 Features

- 🔗 Spring Boot 3.5.x
- 🤖 Spring AI 1.0.0 integration
- 🧩 Works with local LLMs via Ollama (Gemma, Phi-3, LLaMA3, etc.)
- 💬 REST API endpoint to send prompts
- ⚙️ Easily swappable models via `application.properties`

---

📦 Requirements

- Java 22
- Maven
- [Ollama installed](https://ollama.com/download) (on Windows/Linux/Mac)
- A model like `gemma:2b` or `phi3:mini` pulled via Ollama

---

⚙️ API Usage

### POST `/ai/ask`

**Request Body:**
```json
{
  "prompt": "What is Spring Boot?"
}

