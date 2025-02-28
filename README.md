# Spring Boot Chatbot

This is a simple chatbot built using **Spring Boot** and **Thymeleaf**, which can fetch documentation-based answers using a web scraper.

## Features
- Accepts user queries via a web interface.
- Searches for relevant answers in the provided documentation sources.
- Displays responses dynamically without refreshing the page.

## Technologies Used
- **Spring Boot** (Backend)
- **Thymeleaf** (Frontend)
- **Jsoup** (Web Scraping)
- **HTML, CSS, JavaScript** (For UI)

## Prerequisites
- Java 17+
- Maven
- Spring Boot
- An IDE like IntelliJ IDEA or VS Code

## Setup and Installation

1. **Clone the Repository**
   ```sh
   git clone https://github.com/yourusername/spring-boot-chatbot.git
   cd spring-boot-chatbot
Build and Run

sh
Copy
Edit
mvn spring-boot:run
Access the Chatbot Open your browser and go to:

arduino
Copy
Edit
http://localhost:8080
API Endpoints
Method	Endpoint	Description
GET	/	Loads the chatbot UI
POST	/ask	Sends a user query and returns a chatbot response
Example Usage
User: What are Zeotap’s identity resolution capabilities?
Chatbot: Found relevant info at: https://docs.zeotap.com/home/en-us/
Known Issues
Some documentation sites may block automated scraping (e.g., returning 403 Forbidden).
A more advanced approach, such as using official APIs, may be needed for reliable data retrieval.
Future Enhancements
Implement an API-based documentation fetcher.
Improve the UI with a modern frontend framework like React or Angular.
Support multi-language responses.
License
This project is licensed under the MIT License.

Contact
For any issues, feel free to reach out!

📧 Email: sakthipriyatanjore@gmail.com.com
🌐 GitHub: sakthipriya-sp
