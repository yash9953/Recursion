package Recursion;

import java.util.Scanner;
// Branch Recursion
public class BranchRec {
          static void fun(int n){
                    if(n<=0){
                              return;
                    }
                    System.out.println(n);
                    fun(n-1);
                    fun(n-2);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    fun(n);
                    sc.close();
          }
}
