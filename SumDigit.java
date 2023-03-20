package Recursion;

import java.util.Scanner;

public class SumDigit {
          public static int a=0;
          public static void sumdigit(int n){
                    if(n==0){
                              System.out.println(a);
                              return;
                    }
                    a+=n%10;
                    sumdigit(n/10);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    sumdigit(n);
                    sc.close();
          }
}
