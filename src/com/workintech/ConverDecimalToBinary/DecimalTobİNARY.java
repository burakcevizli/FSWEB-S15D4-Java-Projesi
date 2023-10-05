package com.workintech.ConverDecimalToBinary;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DecimalTobİNARY {
    public static void main(String[] args) {
        System.out.println(DecimalToBinary(5));
        System.out.println(DecimalToBinary(6));
        System.out.println(DecimalToBinary(13));

    }
    public static LinkedList DecimalToBinary(int x){
        Stack<Integer> remainder = new Stack<>();
        LinkedList<Integer> result = new LinkedList<>();

        while(x>0){
            int y = x % 2 ;
            remainder.push(y);
            x = x/2;
        }
        Iterator<Integer> iterator = remainder.iterator();
        while(iterator.hasNext()){
            result.push(iterator.next());
        }

        return result;
    }


}
