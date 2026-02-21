<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<body>
<div class="container">

<h1>📱 CalculatorApp</h1>

<p>
A modular Java calculator application built using clean architecture principles.
Each class has a single responsibility, making the project easy to maintain and extend.
</p>

<hr>

<h2>📂 Project Structure</h2>

<pre>
CalculatorApp/
│
├── Calculator.java        # Application entry point
├── CalcFrame.java         # Main window & layout setup
├── CalcTextField.java     # Display component (input/output)
├── CalcButtons.java       # Button panel and UI controls
├── CalcController.java    # Handles user actions and events
├── CalcFunctions.java     # Core mathematical logic
└── Operation.java         # Enum for supported operations
</pre>

<hr>

<h2>🧩 File Responsibilities</h2>

<h3>🔹 Calculator.java</h3>
<ul>
<li>Program entry point</li>
<li>Launches the calculator application</li>
<li>Initializes the main frame</li>
</ul>

<h3>🔹 CalcFrame.java</h3>
<ul>
<li>Builds the main GUI window</li>
<li>Manages layout and component placement</li>
<li>Integrates buttons and display</li>
</ul>

<h3>🔹 CalcTextField.java</h3>
<ul>
<li>Handles calculator display</li>
<li>Shows user input and results</li>
<li>Manages text formatting</li>
</ul>

<h3>🔹 CalcButtons.java</h3>
<ul>
<li>Creates all calculator buttons</li>
<li>Defines button layout</li>
<li>Sends button events to controller</li>
</ul>

<h3>🔹 CalcController.java</h3>
<ul>
<li>Processes user interactions</li>
<li>Connects UI with calculation logic</li>
<li>Maintains application state</li>
</ul>

<h3>🔹 CalcFunctions.java</h3>
<ul>
<li>Implements mathematical operations</li>
<li>Performs calculations</li>
<li>Handles edge cases</li>
</ul>

<h3>🔹 Operation.java</h3>
<ul>
<li>Enum representing supported operations</li>
<li>Improves code readability</li>
<li>Prevents magic strings</li>
</ul>

<hr>

<h2>🚀 Features</h2>
<ul>
<li>Clean MVC-like structure</li>
<li>Modular and maintainable code</li>
<li>Easy to extend with new operations</li>
<li>Java Swing-based GUI</li>
</ul>

<hr>

<h2>🛠️ Requirements</h2>
<ul>
<li>Java JDK 8 or higher</li>
<li>Any Java IDE (IntelliJ, Eclipse, VS Code)</li>
</ul>

<hr>

<h2>▶️ How to Run</h2>

<pre>
javac *.java
java Calculator
</pre>

<hr>

<h2>📌 Future Improvements</h2>
<ul>
<li>Scientific calculator mode</li>
<li>Keyboard input support</li>
<li>Calculation history</li>
<li>Dark mode UI</li>
</ul>

<p>⭐ Feel free to fork and enhance!</p>

</div>
</body>
</html>
