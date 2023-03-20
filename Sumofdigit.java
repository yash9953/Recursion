package Recursion;

import java.util.Scanner;

public class Sumofdigit {
          public static int ans=0;
          public static int sumdigit(int n){
                    if(n==0){
                              // System.out.println(ans);
                              return ans;
                    }
                    ans+=n%10;
                    return sumdigit(n/10);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    System.out.println(sumdigit(n)); 
                    sc.close();
          }
}
