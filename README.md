# Automation Test Project

This project is a **Java Selenium Automation Testing framework** built using **JUnit, Maven, and the Page Object Model (POM)** design pattern.  
The framework automates login functionality and validates both successful and failed login attempts.

## 🚀 Technologies Used

- Java
- Selenium WebDriver
- JUnit 5
- Maven
- Page Object Model (POM)
- IntelliJ IDEA
- Git & GitHub

## 📁 Project Structure
AutomationTests
│
├── src
│ ├── main
│ │ └── java
│ │ └── amanidrummond
│ │ └── LoginPage.java
│ │
│ └── test
│ └── java
│ └── tests
│ └── LoginTest.java
│
├── pom.xml
└── README.md

## 🧪 Test Cases

The project currently includes automated tests for:

### 1. Valid Login Test
Verifies that a user can log in with valid credentials and is redirected to the success page.

### 2. Invalid Username Test
Ensures the application displays an error message when the username is incorrect.

### 3. Invalid Password Test
Ensures the system handles incorrect passwords properly.

## ⚙️ Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/aadrummond261/AutomationTests.git
2. Open the project
Open the project in IntelliJ IDEA.
3. Install dependencies
Maven will automatically download dependencies from the pom.xml file.
If needed run:
mvn clean install
4. Run the tests
You can run the tests from:
IntelliJ test runner
Maven command line
mvn test
📌 Features
Page Object Model for maintainable automation
Reusable test components
Automated login validation
Structured Maven project
Easy integration with CI/CD pipelines
🎯 Future Improvements
Add more UI automation tests
Integrate with CI/CD (GitHub Actions / Jenkins)
Add reporting (Allure or Extent Reports)
Cross-browser testing
API automation integration
👨‍💻 Author
Amani Drummond
Aspiring Backend Developer focused on Java, Automation Testing, and Software Quality Engineering.
