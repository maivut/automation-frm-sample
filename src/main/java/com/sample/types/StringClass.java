package com.sample.types;

import java.util.*;

public class StringClass {
    public String reverseStringByWord(){
        String s = "This is String test";
        String[] arr = s.trim().split("\\s+");
        System.out.println(Arrays.toString(arr));
        int left = 0, right = arr.length-1;

        while (left < right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(String.join(" ", arr));
        return String.join(" ", arr);
    }
}
