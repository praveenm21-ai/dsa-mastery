package com.dev.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoArray {
   /* public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
      List<Integer> unionArray=new ArrayList<>();
            unionArray=unionOfArray(arr1,arr2);
            for(int i:unionArray){
                System.out.print(i);
        }
    }

    private static List<Integer> unionOfArray(int[] arr1, int[] arr2) {

        List<Integer> union=new ArrayList<>();
        int i=0,j=0;
        while(i< arr1.length && j<arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<arr1.length){
          if(union.size()==0||union.get(union.size()-1)!=arr1[i])  {
              union.add(arr1[i]);
          }
          i++;
        }
        while(j< arr2.length){
            if(union.size()==0||union.get(union.size()-1)!=arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }*/

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        Set<Integer> st=new HashSet<>();
        st=unionArray(arr1,arr2);
        for(int it:st){
            System.out.print(it);
        }
    }

    private static Set<Integer> unionArray(int[] arr1, int[] arr2) {
        Set<Integer> ans=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            ans.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            ans.add(arr2[j]);
        }
        return ans;
    }

}
