package Recursion;

import java.util.Scanner;

public class CheckPrime {
          public static boolean check(int n,int i){
                    if(n==0||n==1){
                              return false;
                    }
                    if(n%i==0&&i!=n){
                              return false;
                    }
                    else if(n%i==0&&i==n){
                              check(n, i+1);
                    }
                    return true;
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int i=2;
                    if(check(n,i)){
                              System.out.println("Yes");
                    }
                    else{
                              System.out.println("No");
                    }
                    sc.close();
          }
}
