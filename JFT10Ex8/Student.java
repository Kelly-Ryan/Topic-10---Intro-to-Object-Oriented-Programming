/*
Kelly Ryan
31 January 2019


Question 8
Write a Java class to model a Student (Student.java).

The class should have the following instance variables.

public String firstName;
public String lastName;
public byte age;
public String className;
public float gradeAverage;
public String address;

The class should also have the following instance methods.
 toString()

Create a second class named Test.java. In the main method, create three Student objects with appropriate attributes.

Call the toString() method on each object in turn.

Using static (class) variables and methods, answer the following questions:
 How many student objects have been created?
 What is the average student grade for the class?

Store your source code in a folder named JFT10Ex8.
 */

public class Student {

    private static int studentObjectCount;

    public String firstName;
    public String lastName;
    public byte age;
    public String className;
    public float gradeAverage;
    public String address;

    public Student(){

        studentObjectCount++;
    }

    public String toString(){

        return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Age: " + age + "\n" +
                "Class Name: " + className + "\n" + "Grade Average: " + gradeAverage + "\n" + "Address: " + address + "\n";


    }

    public static int getStudentObjectCount(){

        return studentObjectCount;
    }



}