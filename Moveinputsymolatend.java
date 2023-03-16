package Recursion;

import java.util.Scanner;

public class Moveinputsymolatend {
          public static String str1="";
          public static String str2="";
          public static void move(String str,char in,int i){
                    if(i==str.length()-1){
                              System.out.println("Resultant String is "+str1+str2);
                              return;
                    }
                    char st=str.charAt(i);
                    if(st==in){
                              str2+=in;
                              move(str, in, i+1);
                    }
                    else{
                              str1+=st;
                              move(str, in, i+1);
                    }
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    String str=sc.nextLine();
                    char input=sc.next().charAt(0);
                    int i=0;
                    move(str,input,i);
                    sc.close();
          }
}
