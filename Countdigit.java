package Recursion;
public class Countdigit {
          static void count(int n,int c){
                    // Termination case
                    if(n==0){
                              System.out.println(c);
                              return ;
                    }
                    // small problem
                    n=n/10;
                    c++; 
                    // recursive call         
                    count(n, c);          
                              
          }
          public static void main(String[] args) {
                    count(12345,0);
          }
}
