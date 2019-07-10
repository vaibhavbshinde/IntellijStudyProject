package com.java.general.study;

import org.testng.annotations.Test;

public class BubbleSort {

    //public static void main(String[] args){
    @Test
    public void bubbleSortImplementation(){
        int arr[] = {50,10,90,200,40,6};

        int n = arr.length;
        int temp =0;

        System.out.println("Array before doing bubble sort : ");
        System.out.print("{");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.print("}");

        for(int i=0;i<n;i++){   // to Iterate the first value with all remaining

            for (int j=1;j<(n-1);j++){ // Compare value with all remaining element and after that do the swap

                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println("Array After doing bubble sort : ");
        System.out.print("{");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.print("}");


    }

}
