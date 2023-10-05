package com.workintech.StackChallenge;


import java.awt.*;
import java.nio.charset.CharacterCodingException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("ABCCBA"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

    }

    public static boolean checkForPalindrome(String text) {
        System.out.println("Text : " +  text);

        text = text.replaceAll("[.',?!_\\-\\s]", "").toLowerCase(Locale.ENGLISH);
        Stack<Character> stackList1 = new Stack<>();
        Stack<Character> stackList2 = new Stack<>();
        Stack<Character> stackList3 = new Stack<>();

        for(char i : text.toCharArray()){
            stackList1.push(i);

            stackList3.push(i);

        }
        for (char i: text.toCharArray()){
            char pop = stackList1.pop();
            stackList2.push(pop);

        }
        if(stackList2.equals(stackList3)){
            return true;
        }




        return false;
    }


}