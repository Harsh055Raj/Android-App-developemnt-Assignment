package com.harsh;

public class Java_String {
    public static void main(String[] args) {
        int vowel = 0, consonent = 0;
        String val = "My name is Harsh Raj";
        val = val.toLowerCase();

        for(int i = 0; i < val.length(); i++) {
            if(val.charAt(i) == 'a' || val.charAt(i) == 'e' || val.charAt(i) == 'i' || val.charAt(i) == 'o' || val.charAt(i) == 'u') {
                vowel++;
            }
            else if(val.charAt(i) >= 'a' && val.charAt(i)<='z') {
                consonent++;
            }
        }
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + consonent);
    }




    }
