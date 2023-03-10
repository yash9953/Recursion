package Recursion;

import java.util.Scanner;

public class Factorial {
          static void fact(int n,int f){
                    if(n==0||n==1){
                              System.out.println(1);
                              return;
                    }
                    if(n==2){
                              System.out.println(f*n);
                              return;
                    }
                    f=f*n;
                    fact(n-1,f);
          }
          // public static int fact(int n){
          //           if(n==0||n==1){
          //                     return 1;
          //           }
                    
          //           int n1=fact(n-1);
          //           int n2=n*n1;
          //           return n2;

          // }
          // static int fact(int n){
          //           if(n==0||n==1){
          //                     return 1;
          //           }
          //           return n*fact(n-1);
          // }
          // works upto n=31 else overflow
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int f=1;  
                    fact(n,f);
                    // System.out.println(fact(n));
                    sc.close();
          }
}
