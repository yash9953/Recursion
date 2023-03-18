package Recursion;

import java.util.Scanner;

public class ReplacePI {
          // replace pi to 3.14 from the i/p string
          static String repPI(String s,int i,String str){
                    if(i==s.length()-1){
                              return str;
                    }
                    if(s.charAt(i)=='p'&&s.charAt(i+1)=='i'){
                              str+="3.14";
                              if(i<s.length()-2){
                                  ++i;      
                              }
                    }
                    else{
                              str+=""+s.charAt(i);
                    }
                    return repPI(s, ++i, str);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    String s=sc.nextLine();
                    System.out.println(repPI(s,0,""));
                    sc.close();
          }
}
