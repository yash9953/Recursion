package Recursion;

import java.util.Scanner;

public class Sumofevenoddplacesdigit {
          public static void countdigit(int n,int digit,int copy){
                    if(n==0){
                              // System.out.println(digit);
                              ans(digit, copy, 0, 0);
                              return;
                    }
                    countdigit(n/10, digit+1, copy);
          }
          public static void ans(int digit,int copy,int even,int odd){
                    if(digit==0){
                              System.out.println("Even digit sum="+even);
                              System.out.println("Odd digit sum="+odd);
                              return;
                    }
                    if(digit%2==0){
                              even+=copy%10;
                              ans(digit-1, copy/10, even, odd);
                    }
                    else if(digit%2!=0){
                              odd+=copy%10;
                              ans(digit-1, copy/10, even, odd);
                    }
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int copy=n;
                    int digit=0;
                    countdigit(n,digit,copy); 
                    sc.close();
          }
}
