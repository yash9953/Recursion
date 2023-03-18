package Recursion;

import java.util.Scanner;

public class ReplacecharStr {
          // search char and replace that char from string
          public static String str2="";
          public static void replace(String str,char c,char c2,int idx){
                    if(idx==str.length()){
                              System.out.println(str2);
                              return;
                    }
                    if(str.charAt(idx)==c){
                              str2+=c2;
                    }
                    else{
                              str2+=str.charAt(idx);
                    }
                    replace(str, c, c2,idx+1);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    String str=sc.nextLine();
                    char c=sc.next().charAt(0);
                    char c2=sc.next().charAt(0);
                    replace(str,c,c2,0);
                    sc.close();
          }
}
