package com.gl.service;

public class DenominationServices {
	public void notesCountImplementation(int notes[], int amount) {
		int[] notesCounter = new int[notes.length];

		try {
			if (amount < notes[notes.length - 1])

			{

				System.out.println("amount cannot be paid by available denomination");
			}

			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {

					int count = amount / notes[i];
					System.out.println(count + "notes of" + notes[i] + "required");
					amount = amount - count * notes[i];

				}

			}

		} catch (ArithmeticException e) {
			System.out.println(e + "--dont enter zero in notes--");
		}

	}
}
