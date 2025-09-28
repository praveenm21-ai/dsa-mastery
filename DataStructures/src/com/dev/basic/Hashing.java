package com.dev.basic;

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        String s="acaabcccbdbbb";
        hashing(s);
    }

    private static void hashing(String s) {
        int hash[] = new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']+=1;
        }
        Scanner in=new Scanner(System.in);
        System.out.println("How manny times u want to Search?:");
        int t=in.nextInt();
        while(t--!=0){
            System.out.println("Enter an ELement to know how many times it occurs");
            char n=in.next().charAt(0);
            System.out.println(hash[n-'a']);
        }

    }
}
