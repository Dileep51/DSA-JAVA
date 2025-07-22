package org.search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numArray ={2,4,7,1,22,811};
        Arrays.sort(numArray);
        binarySearch(numArray,112);
    }
    public static void binarySearch(int[] arr, int target){
         int start=0;
         int end=arr.length;
         boolean found=false;
         while(start<=end){
            int mid=(start+end)/2;
             if(arr[mid] ==target){
                 System.out.println("Number "+arr[mid]+" found at index "+mid);
                 found=true;
                 return;
             } else if (arr[mid]<target) {
                 start=mid+1;
             }
             else{
                end=mid-1;
             }
         }
         if(!found)
             System.out.println("Number not found");
    }
}
