package com.GreatLearning.main;
import java.util.Scanner ;

import com.GreatLearning.serivce.PayMoneyService;
public class Driver {

	public static void main(String[]args) {
	 
		PayMoneyService pms = new PayMoneyService();
		
	System.out.println("Enter the size of the transaction array") ;
	Scanner sc = new Scanner(System.in) ;
	int size= sc.nextInt();
	
	int Arr[]= new int[size];
	
	System.out.println("Enter the value of array");
	for(int i=0;i<size;i++) {
		Arr[i]=sc.nextInt();	
		}
	for(int i=0;i<size;i++) {
		
		System.out.println(Arr[i] + " ");
	}
	
	
	System.out.println("Enter the total number of targets thats need to be achieved");
	int targetNo = sc.nextInt();
	  System.out.println("Enter the value of target");
	    int target = sc.nextInt() ;
	for(int i=0;i<targetNo;i++) {
  

	pms.transaction ( Arr, target);
	
	}
}
}