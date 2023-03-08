package Recursion;

import java.util.Scanner;

public class Checkarrsortedincreasingly {
          public static void check(int arr[],int i){
                    if(i==arr.length-1){
                              for (int element: arr) {
                                        System.out.print(element+" ");
                              }
                              System.out.println("Array is sorted increasingly");
                              return;
                    }
                    if(arr[i]<arr[i+1]){
                              check(arr, i+1);
                    }
                    else if(arr[i]>=arr[i+1]){
                              System.out.println("Array is not sorted increasingly");
                              return;
                    }
                    
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int arr[]=new int[n];
                    for(int i=0;i<n;i++){
                              arr[i]=sc.nextInt();
                    }
                    int i=0;
                    check(arr,i);
                    sc.close();
          }
}
