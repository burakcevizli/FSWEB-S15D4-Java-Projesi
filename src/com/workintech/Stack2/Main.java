package com.workintech.Stack2;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
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
        text = text.replaceAll("[.',?!_\\-\\s]", "").toLowerCase(Locale.ENGLISH);
        Queue<Character> queueList = new LinkedList<>();
        Stack<Character> stackList = new Stack<>();
        Stack<Character> stacklist2 = new Stack<>();



        for(char i : text.toCharArray()){
            queueList.offer(i);
            stackList.push(i);

        }
        for(char i : text.toCharArray()){
            stacklist2.push(stackList.pop());
        }
        for(char i : text.toCharArray()){
            if(queueList.equals(stacklist2)){
                return true;
            }
        }



        return false;
    }
}
