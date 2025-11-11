# 🧮 Java Swing Calculator Application

This project implements a **fully functional graphical calculator** using **Java Swing**. It is designed to demonstrate **object-oriented programming (OOP)** principles and **separation of concerns** in a practical, feature-rich desktop utility.

---

## 🚀 Project Overview

The **Java Swing Calculator** provides users with a comprehensive set of arithmetic and advanced mathematical operations through an intuitive **Graphical User Interface (GUI)**.  
The design emphasizes **modularity**, ensuring that the application logic, user interface components, and operation handling are cleanly separated.

---

## ✨ Features

- **Basic Arithmetic:** Addition (+), Subtraction (-), Multiplication (×), and Division (/).  
- **Advanced Operations:** Square (x²), Square Root (√x), Cube (x³), and Cube Root (³√x).  
- **Input Control:** Dedicated buttons for digits, decimal input, and result calculation (=).  
- **Correction Tools:**  
  - **AC (All Clear):** Resets the display.  
  - **Backspace (←):** Deletes the last digit.  
- **Power Control:** ON/OFF button to enable or disable calculator functionality.  
- **Robust UI:** Developed using the standard **Java Swing** toolkit for reliable desktop performance.

---

## 🏗️ Project Structure

CalculatorApp/
│
├── Calculator.java # Main entry point – launches the calculator window
├── CalcFrame.java # GUI setup – manages layout and component assembly
├── CalcTextField.java # Display component – handles input/output display
├── CalcButtons.java # Input components – manages number and function buttons
└── CalcFunctions.java # Core logic – executes all mathematical operations


---

## 🛠️ Installation and Usage

### Prerequisites
- **Java Development Kit (JDK)** 8 or higher  
- **IDE** such as IntelliJ, Eclipse, or NetBeans (or a configured command-line Java environment)

### Steps to Run (Command Line)

1. **Clone the repository:**
   ```bash
   git clone https://github.com/asadabbasse2006/Calculator
   cd java-calculator

```bash
javac *.java

java Calculator
The application follows a modular architecture, keeping UI and logic separate for better maintainability.

