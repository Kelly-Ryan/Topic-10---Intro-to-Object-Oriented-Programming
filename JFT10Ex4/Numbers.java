/*
Kelly Ryan
28 January 2018

Question 4
Create a Java class named Numbers to perform simple mathematical operations. Include the following methods:

Method Signatures

public int sum(int num1, int num2)
public float divide(float num1, float num2)
public float multiply(int num1, int num2)
public float remainder(float num1, float num2)
public void message() (print the String: This is a class that performs simple, mathematical operations)

 */

public class Numbers {

    public int sum(int num1, int num2) {

        return num1 + num2;

    }

    public float divide(float num1, float num2) {

        return num1 / num2;

    }

    public float multiply(int num1, int num2) {

        return num1 * num2;

    }

    public float remainder(float num1, float num2) {

        return num1 % num2;
    }

    public void message() {

        System.out.println("This is a class that performs simple, mathematical operations.");
    }

}