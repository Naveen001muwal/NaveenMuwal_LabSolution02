package com.gl.main;

import java.util.Scanner;

import com.gl.service.DenominationServices;
import com.gl.service.MergeSort;

public class Driver {

	public static void main(String[] args) {

		System.out.println("Enter the size of currency Denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];

		System.out.println("Enter the currency Denominations value ");

		for (int i = 1; i < size; i++) {
			notes[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(notes, 0, notes.length - 1);

		DenominationServices ds = new DenominationServices();
		ds.notesCountImplementation(notes, amount);
	}

}
