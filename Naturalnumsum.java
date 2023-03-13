package Recursion;

public class Naturalnumsum {
          static void sum(int n,int s){
                    if(n==0){
                              System.out.println(s);
                              return;
                              
                    }
                    s=s+n;
                    sum(n-1,s);
                    // System.out.println(s);
          }
          public static void main(String[] args) {
                    int n=4;
                    int s=0;
                    sum(n,s);
          }
}
