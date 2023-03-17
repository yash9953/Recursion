package Recursion;

import java.util.Scanner;

public class PrintPrime {
          public static void check(int n,int i){
                    if(n==0||n==1){
                              return;
                    }
                    if(n%i==0&&i!=n){
                              System.out.print(n+" ");
                              check(n-1,2);
                    }
                    else if(n%i==0&&i==n){
                              check(n, i+1);
                    }
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int i=2;
                    check(n, i);
                    sc.close();
          }
}
