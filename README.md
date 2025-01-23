# Katalon Automation Portfolio

## Description
This project is a short and simple automation suite built with Katalon Studio v8.6 to demonstrate Web UI and API testing. It utilizes Gherkin and Cucumber for Web UI testing scenarios.  

---

## How to Run the Automation
Test Suites available for execution:
1. **API_Scenarios**
2. **WebUI_Scenarios**

### Steps to Run:
1. Open the project in Katalon Studio.
2. Navigate to the "Test Suites" folder in the explorer.
3. Run the desired test suite (API_Scenarios or WebUI_Scenarios).
4. After execution, reports can be found in the "Reports" folder.
   - For the WebUI_Scenarios Test Suite, exported PDF reports will include screenshots of the testing process.

---

## Explanation of Test Suites

### **API_Scenarios**
This test suite runs two test cases to demonstrate API testing:
1. **Check if User Exists**  
   - Sends a request to the `POST_User` API with a registered username from the Global Variable in the "default" profile.  
   - If the user exists, the test is marked as "Passed" using the `KeywordsUtil.markPassed()` method; otherwise, it is marked as "Failed" using the `KeywordsUtil.markFailed()` method.

2. **Register New User**  
   - Sends a request to the `POST_User` API with a randomly generated username using the custom keyword `CustomKeywords.'utils.randomize.generateRandomString'(7)`.  
   - The Global Variable for the username is updated dynamically with the generated username.  
   - If registration succeeds, the test is marked as "Passed"; otherwise, it is marked as "Failed."

---

### **WebUI_Scenarios**
This test suite runs two test cases to demonstrate Web UI automation:
1. **Input Textboxes**  
   - Inputs example data into fields on a web page and verifies the results after clicking the "Submit" button.

2. **Managing Checkboxes**  
   - Verifies if a checkbox is checked and iterates through all checkboxes using a dynamic web object and a `while` loop.  
   - Both test cases utilize corresponding Cucumber `.feature` files for scenario definitions.

#### Cucumber Feature Files
- Located in the `Include/features` folder.
- Files:
  - `VerifyTextbox.feature` – Includes the scenario and example data for the "Input Textboxes" test.
  - `VerifyCheckbox.feature` – Defines the steps for managing and verifying checkboxes.

#### Scripts for Feature Files
- Located in the `Include/scripts/groovy/demoQA` folder.
- Each feature file has a corresponding Groovy script to execute the steps.

---

## API Objects
1. **GET_Books**  
   - A simple GET request to retrieve data about books.

2. **POST_User**  
   - Sends a POST request with a JSON body.
   - The `username` uses the default value set in the Global Variable, while the `password` is provided as a local variable in the test case.  
   - This demonstrates the use of both Global and Local Variables in API testing.

---

## Web Test Objects
- Web objects are created manually by inspecting elements in the browser and using the "XPATH" selector method for precision.
- Some objects are parameterized for dynamic use.a

### Example: Dynamic Object
```xpath
(//*[@class='rct-icon rct-icon-uncheck'])[${RowNumber}]
```
This object allows dynamic data to be passed, enabling interaction with specific elements on the page.

Example Usage:
```xpath
WebUI.click(findTestObject('Checkbox page/Checkboxes_LoopAllUnchecked', [('RowNumber') : i]))
```
Notes on XPath:
Parentheses () are used to control multiple elements with the same XPath:

(//*[@class='rct-icon rct-icon-uncheck'])[1] – Selects the first unchecked checkbox.

(//*[@class='rct-icon rct-icon-uncheck'])[2] – Selects the second unchecked checkbox.

## Folder Structure
- Test Cases: Contains individual test case scripts.
- Test Suites: Groups test cases for batch execution.
- Object Repository: Stores Web UI objects.
- Include/features: Contains Cucumber .feature files.
- Include/scripts/groovy: Stores Groovy scripts for custom keywords and feature file steps.
- Reports: Stores execution reports.

## Acknowledgments
This project demonstrates key concepts in Web UI and API automation testing using Katalon Studio.

Created by Jessica Putri for her professional automation portfolio.




