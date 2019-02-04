/*
Kelly Ryan
25 January 2019

Question 2
Create a Java application to model a Jelly class. Jelly objects will be instantiated (created) from the Jelly class.
A Jelly should have the following attributes:

manufacturer    String
price           float
flavour         String
noCalories      float
expiryDate      String

A Jelly should have the following methods:

 setInstructions() – a method that returns the message, "Leave Jelly to set in a cool environment for 1hr"
.
 toString() – a method that returns a string, capturing the values held in the instance variables / attributes of a Jelly object, created from the Jelly class.

In the second class of the application (Main), create the main method.

In the main method, create three Jelly objects with the following attributes:
manufacturer    price   flavour     noCalories  expiryDate
Chivers        3.50    Strawberry  24          25/06/2016
Nestle         3.42    Banana      26          27/07/2016
Danone         3.00    Lemon       28          28/06/2015

For each object, call the setInstructions() and toString() methods in turn.
Store your source code in a folder named JFT10Ex2.
*/


public class Main {

    public static void main(String[] args) {

        Jelly jelly1 = new Jelly();
        Jelly jelly2 = new Jelly();
        Jelly jelly3 = new Jelly();

        jelly1.manufacturer = "Chivers";
        jelly1.price = 3.50f;
        jelly1.flavour = "Strawberry";
        jelly1.noCalories = 24.0f;
        jelly1.expiryDate = "25/06/2016";

        jelly2.manufacturer = "Nestle";
        jelly2.price = 3.42f;
        jelly2.flavour = "Banana";
        jelly2.noCalories = 26.0f;
        jelly2.expiryDate = "27/07/2016";

        jelly3.manufacturer = "Danone";
        jelly3.price = 3.0f;
        jelly3.flavour = "Lemon";
        jelly3.noCalories = 28.0f;
        jelly3.expiryDate = "28/06/2015";

        System.out.println(jelly1.setInstructions() + "\n" + jelly1.toString());
        System.out.println(jelly2.setInstructions() + "\n" + jelly2.toString());
        System.out.println(jelly3.setInstructions() + "\n" + jelly3.toString());
    }
}