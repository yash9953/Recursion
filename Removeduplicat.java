package Recursion;

import java.util.Scanner;

public class Removeduplicat {
          public static boolean[] map=new boolean[26];
          public static void removeDuplicates(String str,int idx,String newString){
                    char currchar=str.charAt(idx);
                    if(idx==str.length()-1){
                              System.out.println(newString);
                              return;
                    }
                    // no need to compare as ==true it is default 
                    if(map[currchar-'a']==true){
                              removeDuplicates(str, idx+1, newString);
                    }
                    else{
                              newString+=currchar;
                              map[currchar-'a']=true;
                              removeDuplicates(str, idx+1, newString);
                    }
          }
          // static String newString(String str,String s,String s2,int i){
          //           if(i==str.length()){
          //                     return s;
          //           }
          //           s2=""+str.charAt(i);
          //           if(!s.contains(s2)){
          //                     s+=""+str.charAt(i);
          //           }
          //           return newString(str, s,s2, ++i);
          // }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    String str=sc.nextLine();
                    // System.out.println(newString(str,"","",0));
                    int idx=0;
                    String newString="";
                    removeDuplicates(str, idx,newString);
                    sc.close();
          }
}
