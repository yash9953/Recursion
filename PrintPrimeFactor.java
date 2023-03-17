package Recursion;

import java.util.Scanner;

public class PrintPrimeFactor {
          static boolean CheckPrime(int n,int i){
                  if(n%i==0&&i!=n){
                        return false;
                  }
                  else if(n%i==0&&i==n){
                        return true;
                  }
                  return CheckPrime(n, ++i);
          }
          static void printfactor(int n,int i,int a){
                  if(i==n){
                        return ;
                  }
                  if(n%i==0){
                        a=i;
                        if(a==1){
                              System.out.print(a+" ");
                        }
                        if(a!=1&&CheckPrime(a, 2)){
                            System.out.print(a+" ");
                        }
                  }
                  printfactor(n, ++i,a);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    if(CheckPrime(n,2)){
                              System.out.println(1);
                              System.out.println(n);
                    }else{
                              printfactor(n, 1,1); 
                    }
                    sc.close();
          }
}
