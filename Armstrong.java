package Recursion;

import java.util.Scanner;

public class Armstrong {
          public static void printarm(int n,int j){
                    if(j>n){
                              return;
                    }
                    int a=count(j,0);
                    int b=armno(j,0,a);
                    if(b==j){
                              System.out.print(b+" ");
                              printarm(n, ++j);
                    }
                    else{
                              printarm(n, ++j);
                    }
          }
          public static int count(int copy,int digit){
                    if(copy==0){
                              return digit;
                    }
                    digit++;
                    return count(copy/10, digit);
          }
          public static int armno(int copy,int b,int a){
                    if(copy==0){
                              return b;
                    }
                    b+=Math.pow(copy%10, a);
                    return armno(copy/10, b, a);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int range=sc.nextInt();
                    printarm(range,0);
                    sc.close();
          }
}
