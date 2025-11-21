# email_assistant
Smart Email Assistant (Java + Spring Boot + Gemini API)
Smart Email Assistant (Java + Spring Boot + Gemini API)

A simple and intelligent email generator built using Java Spring Boot and Gemini REST API, with a clean HTML/CSS frontend.
The system generates professional, casual, or relative-style emails automatically based on the user's input.

🚀 Features

✔ Generate emails in different tones (Professional, Casual, Relative)

✔ Powered by Gemini AI (REST API) — no SDK required

✔ Clean and simple HTML + CSS frontend

✔ Fast and lightweight Spring Boot backend

✔ Fully CORS-enabled API

✔ Easy-to-run project (no database required)

<img width="714" height="601" alt="Screenshot from 2025-11-21 21-30-14" src="https://github.com/user-attachments/assets/bc0f28cb-6f48-4382-8bab-5df9d54097d4" />

🛠️ Tech Stack
Backend

Java 17

Spring Boot 3

OkHttp (REST client)

Gemini REST API

Jackson (JSON parsing)

Frontend

HTML5

CSS3

JavaScript (Fetch API)

📁 Project Structure
smart-email-assistant/
│
├── backend/
│   ├── controller/
│   ├── service/
│   ├── model/
│   ├── application.properties
│   └── pom.xml
│
└── frontend/
    ├── index.html
    └── style.css

⚙️ How It Works

User selects a category (Professional, Casual, Relative)

Enters the recipient name and purpose

Frontend sends a request to Spring Boot

Spring Boot calls Gemini's REST API using OkHttp

The generated email appears instantly in the UI

▶️ Running the Project
Backend
cd backend
mvn spring-boot:run

Frontend

Just open:

frontend/index.html

💡 Future Enhancements

🔹 Add dark mode

🔹 Add "Copy to Clipboard" button

🔹 Add PDF export

🔹 Email sending via SMTP

🔹 Save past generated emails
