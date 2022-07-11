package com.GreatLearning.serivce;

public class PayMoneyService {

	
	public void transaction(int[]Array , int target) {

		int i=0 ;
		int sum = 0;
		int n = Array.length ;
		while(sum<=target&& i<n) {
			
			sum = sum +Array[i];
			i++ ;
			
		}
		if(sum<target) {
		System.out.println("target value achieved after  "  +(i+1) +"transaction"  );
		
		}else {
			
			System.out.println("target value not achieved");
		}
			
		
	}
}
