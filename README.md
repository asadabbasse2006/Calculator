# 🧮 Java Swing Calculator Application

A **fully functional desktop calculator** built using **Java Swing**, demonstrating **Object-Oriented Programming (OOP)** principles and a **clean separation of concerns**.  
The application provides a responsive graphical interface and supports both **basic** and **advanced** mathematical operations.

---

## 🚀 Project Overview

The **Java Swing Calculator** is a modular desktop application designed to showcase:

- Java Swing GUI development
- Clean architecture (MVC-inspired design)
- Maintainable and extensible OOP code
- Practical event-driven programming

All calculator features are implemented without external libraries, using only **standard Java (JDK 8+)**.

---

## ✨ Features

### 🔢 Arithmetic Operations
- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`×`)
- Division (`/`)

### 📐 Advanced Mathematical Functions
- Square (`x²`)
- Square Root (`√x`)
- Cube (`x³`)
- Cube Root (`³√x`)

### 🧩 Input & Control
- Numeric buttons (0–9)
- Decimal point input
- Equals (`=`) for evaluation

### 🛠️ Utility Controls
- **AC (All Clear):** Clears the entire display
- **Backspace (←):** Deletes the last entered digit
- **ON / OFF:** Enables or disables the calculator

### 🖥️ User Interface
- Built with **Java Swing**
- Clean, responsive, and intuitive layout
- Desktop-compatible across platforms

---

## 🏗️ Project Architecture

The project follows a **modular design** inspired by the **MVC (Model–View–Controller)** pattern.

CalculatorApp/
│
├── Calculator.java # Application entry point
├── CalcFrame.java # Main window & layout setup
├── CalcTextField.java # Display component (input/output)
├── CalcButtons.java # Button panel and UI controls
├── CalcController.java # Handles user actions and events
├── CalcFunctions.java # Core mathematical logic
└── Operation.java # Enum for supported operations

yaml
Copy code

### 🧠 Design Highlights
- **UI and logic are fully separated**
- **Controller handles all events**
- **Math logic is isolated and reusable**
- **Enums replace magic strings for safety**

---

## 🛠️ Installation & Usage

### ✅ Prerequisites
- Java Development Kit (**JDK 8 or higher**)
- Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans)  
  *or* a configured command-line environment

---

### ▶️ Run via Command Line

1. **Clone the repository**
   ```bash
   git clone https://github.com/asadabbasse2006/Calculator
   cd Calculator
Compile the source files

bash
Copy code
javac *.java
Run the application

bash
Copy code
java Calculator
🧪 Error Handling
Division by zero and invalid operations are handled gracefully

The calculator never crashes during invalid input

Display resets safely when powered OFF

📈 Code Quality Improvements
This version includes:

✔ MVC-style separation

✔ Centralized event handling

✔ Safer numeric calculations

✔ Cleaner button creation

✔ Readable and extensible structure

All improvements were made without changing calculator features or behavior.

📌 Future Enhancements (Optional)
(Not included in this version)

Keyboard input support

Dark mode UI

JavaFX version

Unit testing with JUnit

Memory (M+, M-, MR)

👤 Author
Asad Abbas
GitHub: asadabbasse2006

📜 License
This project is open-source and available for educational and personal use.
