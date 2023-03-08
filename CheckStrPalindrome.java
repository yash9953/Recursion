package Recursion;

import java.util.Scanner;

public class CheckStrPalindrome {
          public static void revstring(String str,String revstr,String cpystr,int idx){
                    // to do reverse of original string
                    if(idx==str.length()){
                              checkPalindrome(revstr,cpystr);
                              return;
                    }
                    revstr+=str.charAt(str.length()-1-idx);
                    revstring(str, revstr,cpystr,idx+1);
          }
          public static void checkPalindrome(String revstr,String cpystr){
                    // to check reverse of string is similar to original
                    if(revstr.equals(cpystr)){
                              System.out.println("Input String is Palindrome");
                              return;
                    }
                    System.out.println("Input String is not Palindrome");
                    return;
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    String str=sc.nextLine();
                    String cpystr=str;
                    revstring(str,"",cpystr,0);
                    sc.close();
          }
}
