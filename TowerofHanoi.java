package Recursion;

import java.util.Scanner;

public class TowerofHanoi {
          // using stack we able to do iterative method
          public static void swaptower(int n,String S,String H,String D){
                    if(n==1){
                              System.out.println(n+" Tower shifted from "+S+" To "+D);
                              return;
                    }
                    // n-1 tower shifted from source to helper tower
                    swaptower(n-1, S, D, H);
                    // 1 tower shifted from source to destination tower
                    swaptower(1, S, H, D);
                    // n-1 tower is shifted from helper to destination tower
                    swaptower(n-1, H, S, D);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    swaptower(n,"S","H","D");
                    sc.close();
          }
}
