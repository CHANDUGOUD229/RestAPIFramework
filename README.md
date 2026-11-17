# 🚀 REST API Automation Framework

### 💡 End-to-End API Testing | Rest Assured | Java | Cucumber BDD | TestNG | Maven

## 📌 Project Overview

This repository contains a **Java-based REST API Automation Testing Framework** designed to validate RESTful services through structured, reusable, and maintainable automation practices.

The framework follows a Behaviour-Driven Development (BDD) approach using **Cucumber and TestNG**, with Rest Assured for API request execution and response validation.

The implementation focuses on end-to-end API workflows, including creating a place, retrieving the created place, and deleting it. It also uses POJO-based request models to support serialization and maintain a clean separation between test data and test execution.

The framework is designed with maintainability, reusability, readability, and scalability in mind.

## 🎯 Key Objectives

- Automate end-to-end REST API validation.
- Validate HTTP status codes and response payloads.
- Implement reusable API request specifications.
- Maintain readable test scenarios using Cucumber BDD.
- Apply POJO-based serialization for request payloads.
- Organize API resources and test data separately.
- Generate execution reports for test analysis.
- Support consistent execution through Maven and CI/CD workflows.

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| ☕ Java | Core programming language |
| 🌐 Rest Assured | REST API automation |
| 🥒 Cucumber BDD | Behaviour-driven test scenarios |
| 🧪 TestNG | Test execution and assertions |
| 📦 Maven | Build and dependency management |
| 🔄 Jackson | JSON serialization and deserialization support |
| 📊 Cucumber Reports | BDD execution reporting |
| 📋 TestNG Reports | Test execution reporting |
| 📝 Git & GitHub | Version control and source management |
| 💻 IntelliJ IDEA | Development environment |

## 🏗️ Framework Architecture

The framework follows a layered approach to separate test scenarios, execution logic, API resources, request models, and reusable utilities.

### 📂 Major Framework Components

| Component | Responsibility |
|---|---|
| Feature Files | Define API test scenarios in Gherkin |
| Step Definitions | Connect Gherkin steps with automation logic |
| Test Runner | Configure and execute Cucumber scenarios through TestNG |
| API Resources | Maintain reusable API endpoint definitions |
| POJO Classes | Represent API request payload structures |
| Test Data Builder | Prepare dynamic request data |
| Utility Layer | Manage request specifications, logging, configuration, and response handling |
| Global Properties | Maintain environment-level configuration |
| Reporting | Provide execution results and test visibility |

## 🔍 Key Automation Capabilities

### 1. 🌐 REST API Automation

- Execute REST API requests using Rest Assured.
- Support reusable API request handling.
- Validate API response status codes.
- Verify response fields and business-level values.
- Perform end-to-end API workflow validation.

### 2. 🔄 End-to-End API Workflow

The framework validates the complete Place API lifecycle:

**Create Place → Retrieve Place → Validate Place Details → Delete Place**

- **Add Place API:** Creates a new place using dynamically supplied test data.
- **Get Place API:** Retrieves the created place using its generated place ID.
- **Response Validation:** Verifies the response status and expected business values.
- **Delete Place API:** Deletes the previously created place and validates the response.

This workflow demonstrates how multiple API operations can be validated together as part of an end-to-end test scenario.

### 3. 🧩 Serialization Using POJO Classes

The framework uses Plain Old Java Objects (POJOs) to represent structured API request payloads.

Key benefits:

- Improves request payload readability and maintainability.
- Reduces dependency on manually constructed JSON payloads.
- Supports structured request data management.
- Makes test data reusable across API scenarios.
- Helps maintain a clear separation between data models and test logic.

### 4. 🥒 Behaviour-Driven Development (BDD)

Cucumber is used to define test scenarios in a business-readable format using Gherkin.

Benefits:

- Improves collaboration between QA, developers, and business stakeholders.
- Keeps test scenarios readable and understandable.
- Supports Scenario Outline and Examples for data-driven testing.
- Separates business scenarios from implementation details.

### 5. 🧪 TestNG Integration

TestNG is integrated with the Cucumber runner to manage test execution and assertions.

Key capabilities:

- Cucumber scenario execution through TestNG.
- Assertion-based API validation.
- Structured test execution.
- Test execution reporting.

### 6. 📋 API Response Validation

The framework validates API responses using multiple checkpoints:

- HTTP status code validation.
- Response content-type validation through reusable response specifications.
- JSON response field validation.
- Business value validation.
- Verification of dynamically generated place IDs.
- Validation of retrieved place details against the original request data.

### 7. 📊 Reporting and Logging

The framework supports execution visibility through:

- Cucumber HTML reports.
- Cucumber JSON reports.
- TestNG execution reports.
- Request and response logging for debugging and troubleshooting.

These reports help identify failed scenarios, understand API behaviour, and investigate test execution issues.

## 🔁 Execution Workflow

The overall test execution flow is:

1. **Feature File:** Cucumber reads the API test scenario.
2. **Step Definition:** Maps each Gherkin step to the corresponding Java implementation.
3. **Test Data Builder:** Prepares the required API request data.
4. **POJO Serialization:** Converts structured Java request objects into JSON payloads.
5. **Request Specification:** Applies common API configuration and request settings.
6. **API Resource:** Resolves the required endpoint.
7. **Rest Assured:** Executes the API request.
8. **Response Validation:** Validates status codes and response data.
9. **Reporting:** Captures execution results for analysis.

## 🧪 Test Coverage

| Test Scenario | Validation |
|---|---|
| Add Place API | Validates successful place creation |
| Get Place API | Retrieves the place using the generated place ID |
| Place Details Validation | Verifies the retrieved place name |
| Delete Place API | Validates successful deletion |
| Response Status Validation | Checks expected HTTP status codes |
| Response Body Validation | Verifies expected response fields and values |
| Serialization | Uses POJO-based request payloads |

## ⚙️ Build and Execution

The project uses Maven for dependency management and test execution.

**Execution options:**

- Run the Cucumber TestNG runner from the IDE.
- Execute the test suite through Maven.
- Execute the Maven verification lifecycle to generate configured reports.

**Prerequisites:**

- Java Development Kit
- Apache Maven
- IntelliJ IDEA or another Java IDE
- Git
- Internet connectivity to access the target API

## 🔄 CI/CD Integration

The framework can be integrated into CI/CD pipelines to support automated API test execution.

A typical pipeline can include:

- Source code checkout from GitHub.
- Java and Maven environment setup.
- Dependency resolution.
- Automated API test execution.
- Report generation.
- Build result publishing.

This supports repeatable test execution and provides visibility into API quality during software delivery.

## 📈 Framework Design Principles

The framework emphasizes the following engineering practices:

- **Reusability:** Common request configurations and utilities are maintained centrally.
- **Maintainability:** API resources, test data, and request models are separated.
- **Readability:** BDD scenarios describe test behaviour in a business-friendly format.
- **Scalability:** The layered structure provides a foundation for adding further API scenarios.
- **Debuggability:** Request and response logging supports troubleshooting.
- **Data-driven Testing:** Scenario Outline and Examples support multiple test data combinations.

## 🚀 Future Enhancements

The framework can be extended with additional capabilities such as:

- Advanced JSON Schema validation across API responses.
- Environment-specific configuration management.
- Secure external management of API credentials.
- Parallel execution of independent scenarios.
- Enhanced negative and boundary-value testing.
- Authentication and authorization testing.
- Additional API integrations and end-to-end workflows.
- Advanced CI/CD report publishing.

## 👨‍💻 Project Information

**Project Name:** E2E API Testing Framework  
**Framework Type:** REST API Automation  
**Programming Language:** Java  
**API Automation Tool:** Rest Assured  
**BDD Framework:** Cucumber  
**Test Runner:** TestNG  
**Build Tool:** Maven  
**IDE:** IntelliJ IDEA  
**Version Control:** Git & GitHub

---

## ⭐ Conclusion

This project demonstrates a structured approach to REST API automation using Java, Rest Assured, Cucumber BDD, and TestNG.

It brings together API execution, POJO-based serialization, reusable request handling, response validation, and reporting into a maintainable automation framework.

The primary goal is to improve API test reliability, reduce repetitive manual validation, and establish a scalable foundation for continuous API quality assurance.

**🔗 Repository:** [RestAPIFramework – GitHub](https://github.com/CHANDUGOUD229/RestAPIFramework)

---

⭐ If you find this project useful, feel free to explore the repository and share your feedback!