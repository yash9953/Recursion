package Recursion;

import java.util.Scanner;

public class FirstLastOccurArray {
          // to print first,last occured index element in the array
          public static int f=-1;
          public static int l=-1;
          static void check(int a[],int i,int k,int n){
                    if(i==n){
                              System.out.print(l);
                              return;
                    }
                    if(a[i]==k){
                              if(f==-1){
                                    System.out.print(i+" ");
                                    f=0;
                              }
                              l=i;
                    }
                    check(a, ++i, k,n);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int a[]=new int[n];
                    for(int i=0;i<n;i++){
                              a[i]=sc.nextInt();
                    }
                    System.out.println("Enter element to find first,last occur index");
                    int k=sc.nextInt();
                    check(a,0,k,n);
                    sc.close();
          }
}
