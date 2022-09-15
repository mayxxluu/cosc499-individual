# COSC 499 - Individual Github Exercise
Welcome to my first Github repository for COSC 499 Capstone Software Engineering! The purpose of this repo is to get myself familiar with again with using Git and practicing push/pull requests, commits, etc.

For this exercise, I have created a very simple Java program that takes a user's input (either integers or strings), sorts the input, and returns the sorted output back to the user.

## How to Run

In order to run this simple program, you will need to clone this Github repository and then run the SortArray.java file. 

>To clone this repository, scroll to the top of this page and click on the green **Code** button. 


## Explanation of Classes and Files

There are a few important files in this repo that are important to note. In the **src** folder, there are 2 more folders:
- main
- test

The **main** folder contains the 3 necessary Java files to run the program:

|File Name|Description|
|---|---|
|SortArray.java|This Java class is responsible for taking the user's input, evalauating and applying the correct method (sort integer or sort string), and displaying the output.|
|SortInt.java|This Java class contains the method to sort the user's integer input.|
|SortStr.java|This Java class contains the method to sort the user's string input (input that does not only contain integers).


The **test** folder contains 2 Java files that tests each of the methods to ensure that they work without having to use SortArray.java to get user input:
|File Name|Description|
|---|---|
|TestInt.java|This Java class is responsible for testing the sort_int() method in SortInt.java.|
|TestStr.java|This Java class is responsible for testing the sort_str() method in SortStr.java.|