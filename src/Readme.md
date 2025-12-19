
# 🏦 Bank Management System (Java Console App)

This project is a **Java console-based Bank Management System** designed for students to practice:

- Java basics
- Object Oriented Programming (OOP)
- Interfaces
- Inheritance & Polymorphism
- Exception Handling
- HashMap & ArrayList
- Clean folder/package structure

No database, no frameworks — **pure Core Java only**.

---

## 📁 Project Folder Structure


BankManagementSystem
│
└── src
└── com
└── bank
│
├── app
│ └── BankApplication.java
│
├── model
│ ├── User.java
│ ├── Account.java
│ ├── SavingsAccount.java
│ └── CurrentAccount.java
│
├── service
│ ├── BankService.java
│ └── BankServiceImpl.java
│
├── repository
│ └── BankRepository.java
│
├── exception
│ ├── InsufficientBalanceException.java
│ ├── AccountNotFoundException.java
│ └── InvalidInputException.java
│
├── util
│ ├── InputUtil.java
│ └── IDGenerator.java
│
└── constants
└── AccountType.java

---

## 📌 Package Explanation

### `app`
- Entry point of the application
- Contains `main()` method
- Displays menu and handles user flow

### `model`
- Contains data classes
- Represents real-world entities like User and Account
- Uses inheritance for account types

### `service`
- Contains business logic
- Interface + implementation approach
- Separates logic from main class

### `repository`
- Stores data in memory
- Uses `HashMap` for accounts
- Uses `ArrayList` for transaction history

### `exception`
- Custom exceptions for error handling
- Improves readability and debugging

### `util`
- Utility/helper classes
- Input validation
- Account number generation

### `constants`
- Enums and constant values
- Improves code safety and clarity

---

## ✨ Application Features

- Create Bank Account
- Savings & Current Account support
- Deposit money
- Withdraw money
- View account details
- Transaction history
- Proper exception handling
- In-memory data storage

---

## 🧠 Concepts Covered

| Concept | Usage |
|------|------|
| Class & Object | User, Account |
| Inheritance | SavingsAccount, CurrentAccount |
| Interface | BankService |
| Polymorphism | Account handling |
| Exception Handling | Custom exceptions |
| HashMap | Account storage |
| ArrayList | Transaction history |
| Enum | AccountType |

---

## 📋 Student Task Breakdown

### Task 1: Create Account
- Take user input
- Generate account number
- Store account in HashMap

### Task 2: Deposit Money
- Validate amount
- Update balance

### Task 3: Withdraw Money
- Check balance
- Throw exception if insufficient funds

### Task 4: View Account Details
- Fetch data using account number

### Task 5: Transaction History
- Store every transaction in a list
- Display when required

---

## ▶ How to Run the Project

1. Open project in any Java IDE (IntelliJ / Eclipse / VS Code)
2. Run:

com.bank.app.BankApplication
3. Follow console menu options

---

## ❗ Rules & Restrictions

- ❌ No database
- ❌ No Spring / Hibernate
- ❌ No static business logic
- ✅ Core Java only
- ✅ Console-based input/output

---

## 🎯 Learning Outcome

After completing this project, students will:
- Understand real-world Java structure
- Write clean, modular code
- Use collections effectively
- Handle runtime errors properly
- Be confident in OOP concepts

---

## 🚀 Next Enhancement Ideas (Optional)

- Add login system
- Export transactions to file
- Monthly interest calculation
- Admin & Customer roles

---


