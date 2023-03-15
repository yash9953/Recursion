package Recursion;

import java.util.Scanner;

public class FirstLastoccur {
          // to print first,last occurence of an i/p character in the i/p String
          public static int first=-1;
          public static int last=-1;
          public static void check(String str,int i,char input){
                    if(i==str.length()){
                              System.out.println("First occurence of "+input+" is at index "+first);
                              System.out.println("Last occurence of "+input+" is at index "+last);
                              return ;
                    }
                    char st=str.charAt(i);
                    if(st==input&&first==-1){
                              first=i;
                              check(str, i+1, input);
                    }
                    else if(st==input&&first!=-1){
                              last=i;
                              check(str, i+1, input);
                    }
                    else{
                              check(str, i+1, input);
                    }
          }

          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    String str=sc.nextLine();
                    char input=sc.next().charAt(0);
                    int i=0;
                    check(str,i,input); 
                    sc.close();
          }
}
