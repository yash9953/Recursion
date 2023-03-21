package Recursion;

import java.util.Scanner;

public class TraversearrtoCubes {
          public static int idx=0;
          public static void traverse(int arr[],int arr2[],int idx){
                    if(idx>arr.length-1){
                              for (int element: arr2) {
                                        System.out.print(element+" ");
                              }
                              return;
                    }
                    if(idx<=arr.length-1){
                             arr2[idx]=arr[idx]*arr[idx]*arr[idx];
                             traverse(arr, arr2,idx+1); 
                    }

          }
          public static void getinput(int arr[],int arr2[]){
                    if(idx>arr.length-1){
                              // traverse arr element only if you want to store 
                              // cube of element in another array
                              // traverse(arr,arr2,0);
                              for(int element:arr){
                                        System.out.print(element+" ");
                              }
                              return;
                    }
                    if(idx<=arr.length-1){
                              Scanner sc=new Scanner(System.in);
                              arr[idx]=sc.nextInt();
                              arr[idx]=(int) Math.pow(arr[idx], 3);
                              idx++;
                              getinput(arr,arr2);
                              sc.close();
                    }
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int arr[]=new int[n];
                    // either cube element in same array itself
                    int arr2[]=new int[n];
                    // or to store cube of element of arr in another array(arr2)
                    getinput(arr,arr2);
                    sc.close();
          }
}
