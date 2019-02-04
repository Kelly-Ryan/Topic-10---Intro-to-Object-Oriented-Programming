/*
Kelly Ryan
28 January 2019

Question 5
Write a Java program to determine whether an integer falls within a range of values.

Create a class named NumberRange and include a method named checkInRange.
The method should be passed three values (int lower_range_value, int upper_range_value and int no_to_search.
If the no_to_search is found within the range, the message, "No. in range" should be returned. Otherwise, the message, "No. not in range!" should be returned.

Create a Test class and create a NumberRange object in the main method.
Call the checkInRange() method and pass the following values, (5,500,333).
Output the value of the String returned from the method.

Store your source code in a folder named JFT10Ex5.
 */


public class NumberRange {

    public String checkInRange(int lower_range_value, int upper_range_value, int no_to_search){

        return (no_to_search <= upper_range_value && no_to_search >= lower_range_value)? "No. in range": "No. not in range!";
    }

}