package com.kkaty.weekfourtestmonday;

import java.util.*;
import java.util.regex.*;



public class PiglatinTranslation
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in); // calls the Scanner class
        String text; // this String variable holds the user input

        System.out.println("Enter the sentence you would want to conver:");
        text = keyboard.nextLine();// stores the user input to the text variable



        String delimiter = "\\s"; //states how the word would be splitted
        Pattern pattern = Pattern.compile(delimiter,Pattern.CASE_INSENSITIVE); //specifies the string pattern which is to be search

        //used to perform case insenstive  searhc of  the string
        String []result = pattern.split(text);


        for(int index = 0; index < result.length; index++) {
            String word = result[index]; // stores the word in a String varibale
            StringBuilder newWord = new StringBuilder();

            String[] wordSplit = word.split("([aeiouAEIOU]).*");

            if (wordSplit.length == 0) // If there is no consonant before the first vowel, this paer of the if logic is called
            {
                //Get the word and appends "ay" to the end.
                newWord.append(word);
                newWord.append("ay");
                System.out.print(newWord + " "); //Prints out the final world


            } else // if there is consonant before the first vowel, this part of if logic is called
            {
                for (String a : wordSplit) {
                    String tempWord = word.replaceFirst(a, ""); //replaces the consonants before the first vowels with blank spaces


                    newWord.append(tempWord); // Store tempWord the StringBuffer object "newWord"
                    newWord.append(a); // appends the first consonant or consonants to the end of the word
                    newWord.append("ay"); //appends the "ay"
                    System.out.print(newWord + " "); //prints out the final word

                }


            }


        }
    }
}