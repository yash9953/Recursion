package Recursion;

import java.util.Scanner;

public class Fibonacci {
          static int fib(int n){
                    // 1->
                    // if(n==1){
                    //           return 0;
                    // }
                    // if(n==2){
                    //           // System.out.println(0);
                    //           return 1;
                    // }

                    // 2->
                    // if(n<=1){
                    //           return n;
                    // }
                    // int x=fib(n-1);
                    // int y=fib(n-2);
                    // int z=x+y;
                    // return z;

                    // 3->
                    if(n<=1){
                              return n;
                    }
                    return fib(n-1)+fib(n-2);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    // print series upto range n
                    for(int i=0;i<=n;i++){
                              System.out.print(fib(i)+" ");
                    }
                    sc.close();
          }
}
