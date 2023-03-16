package Recursion;

import java.util.Scanner;

public class IntegerReverse {
          public static int a=0;
          public static void count(int n,int c,int copy){
                    if(n==0){
                              rev(copy,c-1);
                              return ;
                    }
                    n=n/10;
                    c++; 
                    count(n, c, copy);          
          }
          public static void rev(int copy,int c){
                    if(copy==0){
                              System.out.println(a);
                              return;
                    }
                    a+=(copy%10)*Math.pow(10, c);
                    c--;
                    rev(copy/10, c);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    count(n, 0, n);
                    sc.close();
          }
}
