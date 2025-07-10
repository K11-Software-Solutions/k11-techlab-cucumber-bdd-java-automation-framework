# 🧱 K11 TechLab – Cucumber BDD Java Automation Framework

A robust, extensible test automation framework built with **Java**, **Cucumber BDD**, **Selenium WebDriver**, and **TestNG**, designed for scalable end-to-end testing across web and API layers.  

This project demonstrates best practices in test framework architecture, combining modular design, data-driven execution, CI/CD compatibility, and comprehensive reporting.

---

## 🚀 Features

- **Gherkin-Driven Test Design**  
  Write business-readable feature files using Cucumber syntax for UI and API scenarios.

- **Page Object Model (POM)**  
  Clean separation of page structure and test logic to enhance reusability and maintainability.

- **Modular Architecture**  
  Decoupled layers for step definitions, test utilities, and configuration management.

- **Data-Driven Testing**  
  Scenario outlines and external data sources support dynamic test inputs.

- **Integrated API Testing**  
  Extend the framework with REST Assured or HTTP clients for service-level validation.

- **Parallel Execution**  
  Run tests concurrently via TestNG and Maven profiles to reduce execution time.

- **Advanced Reporting**  
  Supports Allure Reports, ExtentReports, and Cucumber built-in reports for detailed insights.

- **CI/CD Friendly**  
  Maven-based build lifecycle, Git version control, and Jenkins/GitHub Actions integration support continuous testing.

---

## 📁 Project Structure
src/
└── test/
    ├── java/
    │   ├── stepdefinitions/   # Cucumber step implementations
    │   ├── pages/             # Page Object Model classes
    │   ├── utils/             # Reusable helper methods and utilities
    │   └── runners/           # Test runners (TestNG, Cucumber options)
    └── resources/
        ├── features/          # Gherkin feature files
        └── config/            # Environment configs and test data



---

## 🛠️ Tech Stack

- Java 11+  
- Cucumber BDD  
- Selenium WebDriver  
- TestNG  
- Maven  
- Allure / ExtentReports  
- Git, Jenkins (optional)

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

#📦 Use Cases
Build UI and API test coverage for web-based applications

Define executable specifications using Gherkin for improved team collaboration

Use as a baseline framework for enterprise test automation projects

Customize and scale based on project needs (e.g., add Appium, DB validations)

#📄 License
This framework is released under the MIT License. Feel free to fork, extend, and contribute.

#📬 Contact
For consulting, training, or implementation support:
🔗 softwaretestautomation.org
📧 kavita.jadhav.sdet@gmail.com

