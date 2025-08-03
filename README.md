# ATS UI Tests (Selenide + TestNG)

This project contains a simple UI test for [Automation Test Store](https://automationteststore.com), implemented using Java, Selenide, and TestNG.

## Scenario Covered

**Scenario 1: Successful login for an existing user**

**Precondition:**  
A user with valid credentials exists.

**Steps:**
1. Open the website.
2. Click the "Login or Register" button.
3. Enter username: `James`
4. Enter password: `123456`
5. Click the "Login" button.
6. Verify that the message **"Welcome back James"** is displayed in the header.

## Technologies Used

- Java
- Selenide
- TestNG
- Maven
- Page Object Model (POM)

