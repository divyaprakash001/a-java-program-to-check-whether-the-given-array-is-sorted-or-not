package com.divya;   // you can put here your package name

public class array_is_sorted_or_not {
    public static void main(String[] args) {
        System.out.println("A java program to check whether the array is sorted or not.");

        boolean isSorted = true;         //initialise to true
        int [] arr = {1,2,3, 4,56,324,5,25,54,2};
        for(int i=0; i < arr.length-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
               isSorted = false;
               break;
            }
        }

        if(isSorted)
        {
            System.out.println("Sorted array");
        }
        else{
            System.out.println("Unsorted array");
        }

    }
}
