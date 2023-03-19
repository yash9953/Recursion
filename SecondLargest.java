package Recursion;

import java.util.Scanner;

public class SecondLargest {
          // i/p=   6
          //        12 35 1 10 34 1
          public static int idx=2;
          public static void printsecondlargest(int arr[],int slarge,int large){
                    if(idx==arr.length){
                              System.out.println(slarge);
                              return;
                    }
                    if(large<arr[idx]){
                              slarge=large;
                              large=arr[idx];
                              ++idx;
                              printsecondlargest(arr, slarge, large);
                    }
                    if(slarge<arr[idx]){
                              slarge=arr[idx];
                    }
                    ++idx;
                    printsecondlargest(arr, slarge, large);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int arr[]=new int[n];
                    for(int i=0;i<n;i++){
                              arr[i]=sc.nextInt();
                    }
                    int slarge=0,large=0;
                    if(arr[1]>arr[0]){
                              slarge=arr[0];
                              large=arr[1];
                    }
                    else{
                              slarge=arr[1];
                              large=arr[0];
                    }
                    printsecondlargest(arr,slarge,large);
                    sc.close();
          }
}
