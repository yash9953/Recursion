package Recursion;
import java.util.Scanner;

public class DeciToBina {
          static void binequ(int n){
                    if(n==0){
                              return;
                    }
                    binequ(n/2);
                    System.out.print(n%2+" ");
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter Decimal Number:");
                    int n=sc.nextInt();
                    // int rem=0,i=0;
                    // while(n!=0){
                    //           rem=(int) (rem+(n%2)*Math.pow(10, i));
                    //           n=n/2;
                    //           i++;
                    // }
                    // System.out.println("In binary="+rem);

                    // recursive solution O(log-base2(n))
                    binequ(n);
                    sc.close();
          }
}
