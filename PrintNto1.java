package Recursion;

import java.util.Scanner;

public class PrintNto1 {
          static void print(int n){
                    if(n==0){
                              return;
                    }
                    System.out.print(n+" ");
                    print(n-1);
          }
          static int fib(int n){
                    if(n<=1){
                              // System.out.println(n);
                              return n;
                    }
                    int sum=fib(n-1)+fib(n-2);
                    // System.out.println(sum);
                    return sum;
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    // print(n);
                    System.out.println(fib(n));
                    sc.close();
          }
}
