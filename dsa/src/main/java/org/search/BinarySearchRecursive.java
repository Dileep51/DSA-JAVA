package org.search;

import java.util.Arrays;

public class BinarySearchRecursive {
    static boolean found;
    public static void main(String[] args) {
        int[] numArray ={2,4,7,1,22,11,112,113};
        Arrays.sort(numArray);
        binarySearch(numArray,22,0,numArray.length-1);
        if(!found)
            System.out.println("Number not found");
    }
    public static void binarySearch(int[] arr,int target,int start,int end){
        int mid=(start+end)/2;
        if(start<=end){
            if(arr[mid]==target){
                System.out.println("Number "+arr[mid]+" found at index "+mid);
                found=true;
                return;
            } else if (arr[mid]<target) {
                binarySearch(arr,target,mid+1,end);
            }
            else if(arr[mid]>target){
                binarySearch(arr,target,start,mid-1);
            }
        }
    }
}
