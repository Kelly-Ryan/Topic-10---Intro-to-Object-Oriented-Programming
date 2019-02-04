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

public class Jelly {

    //instance variables
    public String manufacturer;
    public float price;
    public String flavour;
    public float noCalories;
    public String expiryDate;
    
    public String setInstructions() {

        return "Leave Jelly to set in a cool environment for 1 hr.";
    }

    public String toString() {

        return "Manufacturer: " + manufacturer + "\n" + "Price: " + price + "\n" + "Flavour: " + flavour + "\n" +
                "No. of calories: " + noCalories + "\n" + "Expiry Date: " + expiryDate + "\n";
    }

}
