Java Swing Calculator Application

This project implements a fully functional, graphical calculator application using Java Swing. It is designed to demonstrate object-oriented programming principles and separation of concerns in a practical, feature-rich desktop utility.

🚀 Project Overview

The Java Swing Calculator provides users with a comprehensive set of arithmetic and advanced mathematical operations through an intuitive Graphical User Interface (GUI). The design emphasizes modularity, ensuring that the application logic, user interface components, and operation handling are cleanly separated.

✨ Features

Basic Arithmetic: Supports fundamental operations including addition (+), subtraction (-), multiplication (×), and division (/).

Advanced Operations: Includes specialized functions such as Square ($x^2$), Square Root ($\sqrt{x}$), Cube ($x^3$), and Cube Root ($\sqrt[3]{x}$).

Input Control: Dedicated buttons for numbers, decimal input, and an Equals button (=) for result calculation.

Correction Tools: Clear (AC) to reset the display and Backspace (←) to delete the last digit.

Power Control: A toggleable ON/OFF button to enable or disable calculator functionality.

Robust UI: Developed using the standard Java Swing toolkit for reliable desktop performance.

🏗️ Project Structure

The application follows a modular design, with each core responsibility isolated into its own class for maintainability.

CalculatorApp/
│
├── Calculator.java         # Main Entry Point: Contains the `main` method to initialize and launch the application frame.
├── CalcFrame.java          # GUI Setup: Manages the top-level application window, layout, and component assembly.
├── CalcTextField.java      # Display Component: Handles the display area for input and results.
├── CalcButtons.java        # Input Components: Responsible for creating and managing all number and function buttons.
└── CalcFunctions.java      # Core Logic: Contains the methods and state management for executing all mathematical operations.


🛠️ Installation and Usage

Prerequisites

Java Development Kit (JDK) 8 or higher

A Java Integrated Development Environment (IDE) like IntelliJ, Eclipse, or NetBeans, or a command-line environment configured with Java.

Steps to Run (Command Line)

Clone the repository:

git clone [repository_url]
cd java-calculator


Compile the source files:

javac *.java


Execute the application:

java Calculator


Basic Operation Guide

Power On: Ensure the calculator is enabled using the ON/OFF button.

Input: Use the number buttons to enter your first operand.

Operation Selection: Click an operation button (+, -, ×, /, etc.).

Second Input (if applicable): Enter the second operand.

Calculate: Press the = button to display the final result.

Reset: Use the Clear button (AC) to reset the display and memory for a new calculation.

💡 Future Enhancements

We are continually improving the application. Planned features for future iterations include:

Keyboard Input Support: Allowing users to type numbers and operations directly.

Calculation History: Implementing a persistent record of past calculations.

Theming: Introduction of a Dark Mode or other customizable visual themes.

🤝 Contributing

Contributions are welcome! If you have suggestions for new features, bug fixes, or improvements to the documentation or code structure, please feel free to:

Fork the repository.

Create a new branch (git checkout -b feature/AmazingFeature).

Commit your changes (git commit -m 'Add some AmazingFeature').

Push to the branch (git push origin feature/AmazingFeature).

Open a Pull Request.

📜 License

This project is licensed under the MIT License. See the LICENSE file for details.
