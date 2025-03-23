# Selenium Cross-Browser Parallel Test Execution

## Overview
This project demonstrates **parallel test execution** across multiple browsers using **Selenium WebDriver** and **TestNG**. By running tests concurrently on different browsers, it reduces execution time and ensures compatibility across various environments.

## Features
- **Cross-browser testing** (Chrome, Firefox, Edge, etc.)
- **Parallel execution** using TestNG XML configuration
- **Data-driven testing** with external test data sources
- **Maven-based dependency management**
- **Custom WebDriver management** for different browsers
- **Detailed test reports** using TestNG reports

## Technologies & Tools Used
- **Programming Language**: Java
- **Testing Framework**: TestNG
- **Automation Tool**: Selenium WebDriver
- **Build Tool**: Maven
- **Browser Drivers**: ChromeDriver, GeckoDriver, EdgeDriver
- **Reporting**: TestNG Reports / Extent Reports

## Project Structure
```
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── utilities        # Utility classes for WebDriver & test management
│   ├── test
│   │   ├── java
│   │   │   ├── testCases        # Test scripts for different browsers
│   │   │   ├── base             # Base setup and teardown logic
├── testng.xml                   # TestNG configuration for parallel execution
├── pom.xml                      # Maven dependencies and project setup
├── README.md                     # Documentation
```

## Installation & Setup
### Prerequisites
- Java 8 or later installed
- Maven installed
- Selenium WebDriver dependencies (handled via Maven)
- Browser drivers (ChromeDriver, GeckoDriver, EdgeDriver)

### Steps to Set Up the Project
1. **Clone the repository:**
   ```sh
   git clone https://github.com/MarwanSultan/Selenium-Cross-Browser-Parallel-Test-Execution.git
   ```
2. **Navigate to the project directory:**
   ```sh
   cd Selenium-Cross-Browser-Parallel-Test-Execution
   ```
3. **Install dependencies:**
   ```sh
   mvn clean install
   ```
4. **Run parallel tests using TestNG XML configuration:**
   ```sh
   mvn test -DsuiteXmlFile=testng.xml
   ```

## How to Use
- Modify `testng.xml` to configure browser-specific tests.
- Ensure browser drivers are available in the system path or specify paths in the WebDriver setup.
- Check test execution reports in the `test-output` folder after running the tests.

## Configuring Parallel Execution
You can modify `testng.xml` to specify **parallel execution settings**:
```xml
<suite name="ParallelSuite" parallel="tests" thread-count="3">
    <test name="Chrome Test">
        <parameter name="browser" value="chrome"/>
        <classes>
            <class name="testCases.TestClass"/>
        </classes>
    </test>
    <test name="Firefox Test">
        <parameter name="browser" value="firefox"/>
        <classes>
            <class name="testCases.TestClass"/>
        </classes>
    </test>
</suite>
```

## Reporting
To generate a TestNG report after execution:
```sh
mvn surefire-report:report
```

## Contributing
- Fork the repository
- Create a feature branch (`feature-branch-name`)
- Commit your changes and push them
- Create a Pull Request

## License
This project is licensed under the **MIT License**.

## Author
**Marwan Sultan**  
LinkedIn: [Your LinkedIn Profile](https://www.linkedin.com/in/marwansultan/)  
Email: marwan.sultan@gmail.com  

---

This README provides a clear and professional documentation for your project. Let me know if you need modifications! 🚀
