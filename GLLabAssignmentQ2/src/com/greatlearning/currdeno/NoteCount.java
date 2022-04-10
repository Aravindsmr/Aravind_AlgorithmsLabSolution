/**
 * 
 */
package com.greatlearning.currdeno;

/**
 * @author aravind
 *
 */
public class NoteCount {

	public void noteCounterImplementation(int notes[], int amt) {

		int noteCounter[] = new int[notes.length]; // set new array with array size

		try {

			for (int i = 0; i < notes.length; i++) {

				if (amt >= notes[i]) {

					noteCounter[i] = amt / notes[i]; // get count of the note
					amt = amt - noteCounter[i] * notes[i];
				}
			}

			if (amt > 0) {

				System.out.println("\n Amount can't be given in highest denomination");

			} else {

				System.out.println("\n Your payment approach in order to give min no of notes will be: ");

				for (int i = 0; i < notes.length; i++) {

					if (noteCounter[i] != 0) {

						System.out.println(" " + notes[i] + " : " + noteCounter[i]);
					}
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
