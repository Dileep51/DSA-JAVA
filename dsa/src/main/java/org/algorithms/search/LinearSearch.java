package org.algorithms.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numArray ={2,4,7,1,22,811};
        linearSearch(numArray,4);

    }
    public static void linearSearch(int[] arr,int target){
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Number "+arr[i]+" found at index "+i);
            }
        }
        if(!found)
            System.out.println("Number not found");
    }
}
