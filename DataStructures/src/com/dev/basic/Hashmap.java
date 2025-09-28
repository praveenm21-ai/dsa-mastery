package com.dev.basic;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,1,2,2,12,3};
        hashMap(arr);
    }

    private static void hashMap(int arr[]) {
        HashMap<Integer,Integer> hashma=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int value=0;
            if(hashma.containsKey(key)){
                value=hashma.get(key);
            }
            value++;
            hashma.put(key,value);
        }
        System.out.println("How many times You want to search the frequency of an element in an array");
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        while(x--!=0){
            System.out.println("Enter the element to Search");
            int t=in.nextInt();
            if(hashma.containsKey(t)) {
                System.out.println(hashma.get(t));
            }
            else{
                System.out.println(0);
            }
        }
    }
}
