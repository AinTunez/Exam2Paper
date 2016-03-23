# Exam2Paper

This is a small Java program that helps convert Blackboard exams into a printable paper format.

It works with the following question types:

* Multiple Choice
* Multiple Answer
* Short Answer
* Essay
* Fill in the Blank

## Requirements

JRE 8. Will run on JRE 7 with formatting issues.

## Instructions

1. In Blackboard, export your test to a ZIP package.
2. Open the ZIP package and find the largest .DAT file (usually called res00001.dat).
3. Copy that file to a folder on your computer.
4. Run the Exam2Paper JAR file.
5. In the field labeled ".DAT file", enter the full path to the DAT file you just extracted.
6. Click "Analyze."

![Demo](http://i.imgur.com/0S1Je3C.png)

## Known Issues

* Some HTML tags are occasionally not stripped out when analyzing the DAT file. Resolve with a simple find + replace.



