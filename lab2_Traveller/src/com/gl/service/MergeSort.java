package com.gl.service;

public class MergeSort {

	
	public void mergeSort(int[]array , int left , int right ) {
		if(left<right) {
			int mid= (left+right)/2 ;
			mergeSort(array,left,mid);
			mergeSort(array,mid+1,right);
			
			merging(array,left,right,mid);
		}
		
	}

	private void merging(int[] array, int left, int right, int mid) {
		// TODO Auto-generated method stub
		
		int i=left ;
		int j= mid+1;
		int k = left ;
		
		int[] temp = new int[array.length];
		while(i<=mid && j<=right) {
			if(array[i]>=array[j]) {
				
				temp[k] = array[i];
				i++ ;
			}else{
				temp[k]= array[j] ;
				j++ ;
			}
			k++ ;
		}
		if(i>mid) {
			while(j<=right) {
				temp[k]=array[j];
				j++ ;
				k++ ;
				
			}
		}
		if(j>right) {
			while(j<=mid) {
				temp[k] = array[i];
				i++ ;
				k++ ;
			}
		}
		
		for(int copy = left ;copy<=right;copy++) {
			array[copy]= temp[copy];
		}
	}
		
		
	
}
