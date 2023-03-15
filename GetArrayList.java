package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

// get arraylist element
// add element from one arraylist to another

public class GetArrayList {
          static ArrayList<Integer> reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		// add element of one arraylist to another arraylist
                    ArrayList<Integer> b=new ArrayList<>();
		for(int i = k-1; i>=0; i--){
                              // function to add element
			b.add(arr.get(i)); 
		}
		for(int i=n-1;i>=k;i--){
			b.add(arr.get(i));
		}
                    arr.addAll(0, b);
                    // to remove element from a particular index
                    //arr.remove(Integer.valueOf(i));

                    // to remove fromindex toIndex+1 
                    arr.subList(n, n+n).clear();
		return arr;
	}
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    // n=size of arraylist arr
		int n=sc.nextInt();
                    // k=from what partition,reverse of arraylist element to be done
		int k=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<n;i++){
                              // getting elements in arraylist
			arr.add(sc.nextInt());
		}
		System.out.println(reverseInGroups(arr, n, k)); 
                    sc.close();
          }
}
