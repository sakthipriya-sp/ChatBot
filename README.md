# 📖 Java Web Scraper

## 📌 Overview
The **Java Web Scraper** is a lightweight tool that searches for relevant documentation across multiple sources. It utilizes **JSoup** for web scraping and provides a **fallback Google search link** if no direct matches are found.

## ✨ Features
- ✅ Scrapes documentation from multiple sources
- ✅ Uses **JSoup** for HTML parsing
- ✅ Provides a **fallback Google search** if direct results aren’t found
- ✅ Easily extendable to support more sites

---

## 🛠️ Installation & Setup

### **1️⃣ Prerequisites**
- Java 8+ installed
- Maven installed

### **2️⃣ Clone the Repository**
```bash
git clone https://github.com/yourusername/java-web-scraper.git
cd java-web-scraper
```

### **3️⃣ Add Dependencies**
Ensure the following dependency is in `pom.xml`:
```xml
<dependency>
    <groupId>org.jsoup</groupId>
    <artifactId>jsoup</artifactId>
    <version>1.15.3</version>
</dependency>
```

### **4️⃣ Build & Run**
Compile and execute the scraper:
```bash
mvn clean install
java -jar target/webscraper.jar
```

---

## 📜 Usage
The scraper scans the following documentation sources:
- [Segment Docs](https://segment.com/docs/)
- [mParticle Docs](https://docs.mparticle.com/)
- [Lytics Docs](https://docs.lytics.com/)
- [Zeotap Docs](https://docs.zeotap.com/home/en-us/)

If no direct match is found, it suggests a Google search link for further results.

---

## 📂 Project Structure
```
java-web-scraper
│── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.example.util
│   │   │   │   ├── WebScraper.java
│   │   │   │   ├── Main.java
│── pom.xml
│── README.md
```

---

## 🎯 Expected Output
```
✅ Found relevant info: https://docs.mparticle.com/
✅ Found relevant info: https://docs.lytics.com/

🔍 No direct match found. Try searching here: https://www.google.com/search?q=site:segment.com/docs OR site:docs.mparticle.com OR site:docs.lytics.com OR site:docs.zeotap.com identity resolution
```

---



## 📌 Future Enhancements
🚀 **Better Parsing:** Extract structured data from pages  
🚀 **Error Handling:** Improve handling for blocked sites  
🚀 **Web Interface:** Convert this into a simple web-based tool  

---

## 📞 Support
For issues or suggestions, open an **issue** on the repository.

Let me know if you need any modifications! 🚀

