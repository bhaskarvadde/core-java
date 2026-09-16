package com.stringHandling;

//Write a Java program to perform String Compression. The program should count the consecutive occurrences
//of each character in a given string and print the character followed by its count.
//Input:aaabbccccd
//Output:a3b2c4d1

public class OccurenceOfChars {
    public static void main(String[] args) {

        String str = "aaabbccccd";

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
                System.out.print(str.charAt(i));
                System.out.print(count);
                count = 1;
            } else {
                count++;
            }
        }
    }
}
