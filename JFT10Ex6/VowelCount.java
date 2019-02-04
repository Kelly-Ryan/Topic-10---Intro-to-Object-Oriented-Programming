/*
Kelly Ryan
28 January 2019

Write a Java program to determine the number of vowels found in a piece of text.

Create a class named VowelCount.

The class should include a method also named vowelCount(). One method parameter should be specified, a String named message.

The method should return a String detailing the total number of vowels and breakdown (a, e, i, o, u) found in the message.

Create a second class named Test. In this class create an object of type VowelCount from within the main method.
Call the method, vowelCount() and pass the String, "Walking on the moon", to the method.

 Hint: Investigate the String class in the API to find the following methods:

o A method to return the length of a String.
o A method to extract a character at a specific index of a String.

Store your source code in a folder named JFT10Ex6.
 */

public class VowelCount {

    int vowelCount, aCount, eCount, iCount, oCount, uCount;

    public String vowelCount(String s) {

        s = s.toLowerCase();
        char[] letters = s.toCharArray();

        for(int i = 0; i < letters.length; i++) {

            if(letters[i] == 'a'){

                aCount++;
                vowelCount++;

            } else if (letters[i] == 'e') {

                eCount++;
                vowelCount++;

            } else if (letters[i] == 'i') {

                iCount++;
                vowelCount++;

            } else if (letters[i] == 'o') {

                oCount++;
                vowelCount++;

            } else if (letters[i] == 'u') {

                uCount++;
                vowelCount++;

            }
        }

        return "No. of vowels: " + vowelCount + "\n" + "a count: " + aCount + "\n" +  "e count: " + eCount +  "\n" +
                "i count: " + iCount + "\n" + "o count: " + oCount +  "\n" + "u count: " + uCount ;

    }


}