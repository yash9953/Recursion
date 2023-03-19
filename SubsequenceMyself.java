package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceMyself {
          public static ArrayList<String> subsequence(String str,int i,String newString){
                    if(i==str.length()-1){
                              ArrayList<String> newlist=new ArrayList<>();
                              return newlist;
                    }
                    ArrayList<String> list=new ArrayList<>();
                    list.add(newString+str.charAt(i));
                    ArrayList<String> list2=subsequence2(str, i,i+1, "");
                    ArrayList<String> list3=subsequence3(str, i,i+1,i+2, "");
                    return subsequence(str, ++i, newString);

          }
          public static ArrayList<String> subsequence2(String str,int i,int j,String newString){
                    if(j==str.length()-1){
                              ArrayList<String> newlist=new ArrayList<>();
                              return newlist;
                    }
                    ArrayList<String> list=new ArrayList<>();
                    list.add(newString+str.charAt(i)+str.charAt(j));
                    return subsequence2(str, i, ++j, newString);
                    
          }
          public static ArrayList<String> subsequence3(String str,int i,int j,int k,String newString){
                    if(k==str.length()-1){
                              ArrayList<String> newlist=new ArrayList<>();
                              return newlist;
                    }
                    ArrayList<String> list=new ArrayList<>();
                    list.add(newString+str.charAt(i)+str.charAt(j)+str.charAt(k));
                    return subsequence3(str, i, j, ++k, newString);
                    
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    String str=sc.nextLine();
                    ArrayList<String> list=subsequence(str, 0, "");
                    list.add("");
                    list.add(str);

                    // for(int i=0;i<str.length();i++){
                    //           list.add(""+str.charAt(i));
                    //           for(int j=i+1;j<str.length();j++){
                    //                     list.add(""+str.charAt(i)+str.charAt(j));
                    //                     for(int k=j+1;k<str.length();k++){
                    //                               list.add(""+str.charAt(i)+str.charAt(j)+str.charAt(k));
                    //                     }
                    //           }
                    // }
                    System.out.println(list); 
                    sc.close();
          }
}
