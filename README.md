# Exam2Paper

This is a small Java program that helps convert Blackboard exams into a printable paper format.

It works with the following question types:

* Multiple Choice
* Multiple Answer
* Short Answer
* Essay
* Fill in the Blank

It does NOT work with, images, links, or complex formatting.

## Requirements

Java 8. Will run on Java 7 with formatting issues. Tested on Windows only.

## Instructions

1. Export the assessment you want and save it to your computer
2. Open the ZIP file.
3. You should see several files named *res00001.DAT*, *res00002.DAT*, and so on. Take the largest one and copy it to an easy-to-find location.
4. Run the Exam2Paper JAR file.
5. Click on *Choose File...* to browse for the *.DAT* file you found earlier.
6. Click on *Analyze* to generate the formatted text.
7. Copy/paste and edit the result as desired.

![Demo](http://i.imgur.com/7Pf2a0V.png)

## Known Issues

* Some HTML tags are occasionally not stripped out when analyzing the DAT file. Resolve with a simple find + replace.



