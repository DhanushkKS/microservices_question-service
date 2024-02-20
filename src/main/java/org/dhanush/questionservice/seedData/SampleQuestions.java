package org.dhanush.questionservice.seedData;

import lombok.Data;
import org.dhanush.questionservice.entites.Question;

@Data
public class SampleQuestions {
  static Question[] dummyQuestions = {
          new Question(1, "java", "easy", "What is the main purpose of a constructor in Java?", "To create objects", "To initialize class variables", "To define class hierarchy", "To destroy objects", "To create objects"),
          new Question(2, "python", "medium", "What does the 'self' keyword represent in Python?", "It refers to the current instance of the class", "It is a built-in function", "It represents the parent class", "It represents the child class", "It refers to the current instance of the class"),
          new Question(3, "javascript", "hard", "What is event bubbling in JavaScript?", "A method for propagating events through the DOM tree", "A method for handling asynchronous events", "A method for capturing events during the capturing phase", "A method for stopping event propagation", "A method for propagating events through the DOM tree"),
          new Question(4, "c#", "easy", "What does the 'using' statement do in C#?", "It imports a namespace", "It declares a variable", "It defines a class", "It includes a header file", "It imports a namespace"),
          new Question(5, "php", "medium", "What is the purpose of the 'require_once' function in PHP?", "To include and evaluate a specified file during script execution", "To check if a file exists", "To declare a constant", "To include a file only once during script execution", "To include and evaluate a specified file during script execution"),
          new Question(6, "java", "medium", "What is method overloading in Java?", "Defining multiple methods with the same name but different parameters", "Defining multiple methods with the same name and same parameters", "Defining a method with a variable number of arguments", "Defining a method with no return type", "Defining multiple methods with the same name but different parameters"),
          new Question(7, "python", "hard", "What is a generator in Python?", "A function that returns an iterable set of items one at a time", "A built-in data type", "A method for iterating over dictionaries", "A method for converting strings to lists", "A function that returns an iterable set of items one at a time"),
          new Question(8, "javascript", "easy", "What does 'typeof' operator do in JavaScript?", "Returns the data type of a variable", "Checks if a variable is defined", "Compares two variables", "Converts a string to a number", "Returns the data type of a variable"),
          new Question(9, "c#", "medium", "What is the difference between '==' and '===' operators in C#?", "They are the same", "The '===' operator checks for both value and type equality", "The '==' operator checks for value equality only", "The '===' operator is used for assignment", "The '===' operator checks for both value and type equality"),
          new Question(10, "php", "hard", "What is the purpose of the 'foreach' loop in PHP?", "To iterate over arrays", "To define a function", "To declare a class", "To define a constant", "To iterate over arrays"),
          new Question(11, "java", "easy", "What is encapsulation in Java?", "Binding data and methods that manipulate the data together", "Inheriting properties from a parent class", "Hiding the implementation details of a class", "Creating multiple instances of a class", "Binding data and methods that manipulate the data together"),
          new Question(12, "python", "medium", "What is the difference between 'append()' and 'extend()' methods in Python lists?", "They are the same", "The 'append()' method adds a single element to the list", "The 'extend()' method adds multiple elements to the list", "The 'extend()' method removes elements from the list", "The 'append()' method adds a single element to the list"),
          new Question(13, "javascript", "hard", "What is a closure in JavaScript?", "A function that has access to its own scope only", "A function that has access to the outer function's scope even after the outer function has returned", "A function that has access to the global scope only", "A function that has access to the window object", "A function that has access to the outer function's scope even after the outer function has returned"),
          new Question(14, "c#", "easy", "What is a namespace in C#?", "A way to organize code into logical groups", "A class that cannot be instantiated", "A keyword to define data types", "A method for defining constants", "A way to organize code into logical groups"),
          new Question(15, "php", "medium", "What is the purpose of the 'implode()' function in PHP?", "To split a string into an array", "To combine array elements into a string", "To convert a string to uppercase", "To convert a string to lowercase", "To combine array elements into a string"),
          new Question(16, "java", "medium", "What is polymorphism in Java?", "The ability of an object to take on many forms", "The ability to define multiple constructors in a class", "The ability to override static methods", "The ability to access private members of a class", "The ability of an object to take on many forms"),
          new Question(17, "python", "hard", "What are decorators in Python?", "Functions that modify the functionality of other functions", "Built-in data types", "Data structures used for caching", "Methods for sorting lists", "Functions that modify the functionality of other functions"),
          new Question(18, "javascript", "easy", "What is the 'querySelector()' method used for in JavaScript?", "To select elements in the DOM using CSS selectors", "To create a new DOM element", "To remove elements from the DOM", "To add event listeners to elements", "To select elements in the DOM using CSS selectors"),
          new Question(19, "c#", "medium", "What is the difference between 'public', 'private', and 'protected' access modifiers in C#?", "They are the same", "'public' allows access from any other class, 'private' allows access only within the same class, 'protected' allows access within the same class and its subclasses", "'public' allows access only within the same class, 'private' allows access from any other class, 'protected' allows access within the same class and its subclasses", "'public' allows access from any other class, 'private' allows access within the same class and its subclasses"," 'protected' allows access only within the same class"),
          new Question(20, "php", "hard", "What is the purpose of the 'header()' function in PHP?", "To set HTTP response headers", "To include a file", "To redirect the user to another page", "To define a constant", "To set HTTP response headers"),
          new Question(21, "java", "easy", "What is inheritance in Java?", "The process by which one class acquires the properties and behaviors of another class", "The process of creating multiple objects from a single class", "The process of defining a class within another class", "The process of restricting access to certain class members", "The process by which one class acquires the properties and behaviors of another class"),
          new Question(22, "python", "medium", "What is the difference between 'list' and 'tuple' in Python?", "Lists are mutable, tuples are immutable", "Lists can only store integers, tuples can store any data type", "Tuples are resizable, lists are fixed-size", "Tuples can only store one element, lists can store multiple elements", "Lists are mutable, tuples are immutable"),
          new Question(23, "javascript", "hard", "What is the difference between '=='' and '===' operators in JavaScript?", "They are the same", "'===' checks both value and type equality, '==' checks only value equality", "'==' checks both value and type equality, '===' checks only value equality", "'==' is used for assignment, '===' is used for comparison", "'===' checks both value and type equality, '==' checks only value equality"),
          new Question(24, "c#", "easy", "What is a constructor in C#?", "A special method that is automatically called when an object is created", "A method for destroying objects", "A keyword to define data types", "A way to organize code into logical groups", "A special method that is automatically called when an object is created"),
          new Question(25, "php", "medium", "What is the purpose of the 'explode()' function in PHP?", "To split a string into an array", "To combine array elements into a string", "To convert a string to uppercase", "To convert a string to lowercase", "To split a string into an array"),
          new Question(26, "java", "medium", "What is method overriding in Java?", "The ability to define a method in a subclass with the same signature as a method in the superclass", "The ability to define multiple methods with the same name but different parameters", "The ability to define a method with a variable number of arguments", "The ability to access private members of a class", "The ability to define a method in a subclass with the same signature as a method in the superclass"),
          new Question(27, "python", "hard", "What are generators in Python?", "Functions that return a lazy iterator", "Built-in data types", "Methods for sorting lists", "Data structures used for caching", "Functions that return a lazy iterator"),
          new Question(28, "javascript", "easy", "What is the purpose of the 'getElementById()' method in JavaScript?", "To select elements in the DOM by their id attribute", "To create a new DOM element", "To remove elements from the DOM", "To add event listeners to elements", "To select elements in the DOM by their id attribute"),
          new Question(29, "c#", "medium", "What is the purpose of the 'static' keyword in C#?", "To declare a class member that belongs to the class itself, rather than to instances of the class", "To specify a fixed-size collection", "To indicate that a method can be overridden in a subclass", "To prevent inheritance", "To declare a class member that belongs to the class itself, rather than to instances of the class"),
          new Question(30, "php", "hard", "What is the purpose of the 'session_start()' function in PHP?", "To start a new session or resume the existing session", "To set session variables", "To destroy a session", "To unset session variables", "To start a new session or resume the existing session")
  };


}