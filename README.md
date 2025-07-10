# 🧱 K11 TechLab – Cucumber BDD Java Automation Framework

A robust, extensible test automation framework built with **Java**, **Cucumber BDD**, **Selenium WebDriver**, **TestNG**, **Appium**, and **REST Assured** — designed for scalable end-to-end testing across web, mobile, and API layers.

This project demonstrates best practices in automation framework architecture, combining modular design, data-driven execution, CI/CD readiness, and comprehensive reporting.

---

## 🚀 Features

- **Gherkin-Driven Test Design**  
  Write business-readable feature files using Cucumber syntax for UI, API, and mobile scenarios.

- **Page Object Model (POM)**  
  Clean separation of UI page elements and test logic for enhanced reusability and maintainability.

- **Modular Architecture**  
  Separate layers for step definitions, utilities, mobile/page objects, runners, and configurations.

- **Data-Driven Testing**  
  Supports scenario outlines and external data sources for flexible test input and logic.

- **Mobile Testing with Appium**  
  Automate Android and iOS native/hybrid apps using Appium drivers integrated into the test suite.

- **REST API Testing with REST Assured**  
  Validate API responses, status codes, and payloads via REST Assured, fully integrated into BDD steps.

- **Parallel Execution**  
  Configure and execute test runs in parallel using TestNG and Maven profiles.

- **Advanced Reporting**  
  Supports Allure Reports, ExtentReports, and Cucumber HTML for detailed and actionable reporting.

- **CI/CD Friendly**  
  Fully compatible with Git, Maven, Jenkins, and GitHub Actions for continuous delivery and testing.

---

## 📁 Project Structure






---


---

## 🛠️ Tech Stack

- Java 11+  
- Cucumber BDD  
- Selenium WebDriver  
- Appium (Android/iOS)  
- REST Assured  
- TestNG  
- Maven  
- Allure / ExtentReports  
- Git, Jenkins / GitHub Actions

---

## 🔧 Setup & Usage

```bash
# Clone the repository
git clone https://github.com/K11-Software-Solutions/k11-techlab-cucumber-bdd-java-automation-framework.git
cd k11-techlab-cucumber-bdd-java-automation-framework

# Execute tests via Maven
mvn clean test

# Generate Allure report
mvn allure:report

#Configuration files can be adjusted under src/test/resources/config/ to point to desired environments or test data sources.

.

##📦 Use Cases
Build UI and API test coverage for web-based applications

Define executable specifications using Gherkin for improved team collaboration

Use as a baseline framework for enterprise test automation projects

Customize and scale based on project needs (e.g., add Appium, DB validations)

##📄 License
This framework is released under the MIT License. Feel free to fork, extend, and contribute.

#📬 Contact
For consulting, training, or implementation support:
🔗 softwaretestautomation.org
📧 kavita.jadhav.sdet@gmail.com

