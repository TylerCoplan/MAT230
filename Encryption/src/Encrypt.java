public class Encrypt {

	public static void main(String[] args) {
		// enter message below using only capital letters and spaces
		String message = "THIS IS THE SONG THAT NEVER ENDS";
		
		char tempChar = ' ';
		String tempStr = "";
		String encodedMessage = "";
		
		// used in formula c = m^e % N
		double e = 3;
		int N = 33;
		double m = 0;
		int c = 0;
		
		// loop to encrypt message
		while (!message.equals("")) {
			
			// get first char and convert to string
			tempChar = message.charAt(0);
			tempStr = Character.toString(tempChar);
			
			// strip first char off message
			message = message.substring(1, message.length());

			switch (tempStr) {
				case "A":
					m = 1;
					break;
				case "B":
					m = 2;
					break;
				case "C":
					m = 3;
					break;
				case "D":
					m = 4;
					break;
				case "E":
					m = 5;
					break;
				case "F":
					m = 6;
					break;
				case "G":
					m = 7;
					break;
				case "H":
					m = 8;
					break;
				case "I":
					m = 9;
					break;
				case "J":
					m = 10;
					break;
				case "K":
					m = 11;
					break;
				case "L":
					m = 12;
					break;
				case "M":
					m = 13;
					break;
				case "N":
					m = 14;
					break;
				case "O":
					m = 15;
					break;
				case "P":
					m = 16;
					break;
				case "Q":
					m = 17;
					break;
				case "R":
					m = 18;
					break;
				case "S":
					m = 19;
					break;
				case "T":
					m = 20;
					break;
				case "U":
					m = 21;
					break;
				case "V":
					m = 22;
					break;
				case "W":
					m = 23;
					break;
				case "X":
					m = 24;
					break;
				case "Y":
					m = 25;
					break;
				case "Z":
					m = 26;
					break;
				case " ":
					m = 32;
					break;
			}
			
			// gives encoded number using public keys e and N in formula c = m^e % N
			c = (int)Math.pow(m, e) % N;
			
			// adds 0 if needed
			if (c < 10) {
				encodedMessage += "0";
			}
			
			// concatenates encoded character to the message
			encodedMessage += String.valueOf(c);
		}
		
		System.out.println(encodedMessage);
	}
}
