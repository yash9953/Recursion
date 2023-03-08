package Recursion;

import java.util.Scanner;

public class Countinputchar {
          public static int idx=0,count=0;
          public static void countchar(String str,char c){
                    if(idx==str.length()){
                              System.out.println(count);
                              return;
                    }
                    if(str.charAt(idx)==c){
                              count++;
                    }idx++;
                    countchar(str, c);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    String str=sc.nextLine();
                    char c=sc.next().charAt(0);
                    countchar(str,c);
                    sc.close();
          }
}
