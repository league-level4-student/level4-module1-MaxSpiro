package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public void displayHoroscope(Zodiac z) {
		
		switch(z) {
		case ARIES:
				System.out.println();
		case TAURUS:
			System.out.println();
		case GEMINI:
			System.out.println();
		case CANCER:
			System.out.println();
		case LEO:
			System.out.println();
		case VIRGO:
			System.out.println();
		case LIBRA:
			System.out.println();
		case SCORPIO:
			System.out.println();
		case SAGITTARIUS:
			System.out.println();
		case CAPRICORN:
			System.out.println();
		case AQUARIUS:
			System.out.println();
		case PISCES:
			System.out.println();
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		
	}
}
//ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, 
//LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS, PISCES