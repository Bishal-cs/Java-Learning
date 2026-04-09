# ☕ Java Programming Foundations

This repository contains my personal study notes on Java. It covers the history, features, and the core architecture of the Java platform.

---

## 1. Introduction to Java
Java is a **high-level, robust, and object-oriented** programming language developed by **James Gosling** at **Sun Microsystems** in **1995**.

* **Historical Note:** It was originally named **Oak** (after an oak tree outside Gosling's office), but later renamed to Java.
* **Core Philosophy:** "Write Once, Run Anywhere" (WORA).

---

## 2. Key Features of Java
| Feature | Description |
| :--- | :--- |
| **Simple** | Syntax is clean and based on **C / C++**, but without complex features like pointers. |
|**OOPs (Object-Oriented Programming)**| Everything in Java is an Object. It follows concepts like Inheritance, Polymorphism, Abstraction, and Encapsulation.|
| **Platform Independent** | Unlike many other languages, Java is compiled into platform-neutral bytecode. "Write Once, Run Anywhere."|
| **Secure** | Runs in a sandbox environment; no explicit pointers prevent unauthorized memory access. |
| **Robust** | Strong memory management, lack of pointers, automatic Garbage Collection, and Exception Handling. |
| **Architecture Neutral** | Primitive data types have a fixed size regardless of the architecture (e.g., int is always 4 bytes in both 32-bit and 64-bit systems). |
| **Multi-threaded** | Supports the execution of two or more parts of a program concurrently to maximize CPU utilization. |

---

## 3. The Java Environment: JDK, JRE, & JVM

To understand how Java works, you have to understand the "Russian Doll" relationship between these three components:



### 🔹 JVM (Java Virtual Machine)
* **What it is:** An abstract machine/runtime environment.
* **Role:** It loads, verifies, and executes the bytecode. It is platform-dependent (different versions for Windows, Mac, Linux), but it makes the code platform-independent.

### 🔹 JRE (Java Runtime Environment)
* **Formula:** `JRE = JVM + Libraries (rt.jar)`
* **Role:** It provides the minimum requirements to **run** a Java application. It does not contain development tools like compilers.

### 🔹 JDK (Java Development Kit)
* **Formula:** `JDK = JRE + Development Tools`
* **Role:** This is the full package needed to **develop** and run Java programs. 
* **Tools included:** * `javac`: The compiler (converts `.java` to `.class`).
    * `jar`: Archiver for packaging libraries.
    * `jdb`: The debugger.

![JDK||JRE||JVM|| Structure Example.](/images/JDK_diagram.png)

---

## 4. Java Data Types
Java is a **statically-typed** language, meaning all variables must be declared before they can be used.

![Java Data Types Diagram](/images/java-data-types.png)
 - [website link](https://www.tpointtech.com/java-data-types)

### Primitive Data Types (Predefined)


### Non-Primitive Data Types (Reference Types)

---

## 🚀 How a Java Program Runs
1. **Source Code:** You write code in a `.java` file.
2. **Compilation:** The **JDK** uses `javac` to turn that code into **Bytecode** (`.class` file).
3. **Execution:** The **JVM** (inside the JRE) interprets that bytecode so the computer can understand it.
