public class Decrypt {

	public static void main(String[] args) {
		
		// enter encrypted string to decode below between the quotations
		String codedMessage = "";
		
		String encodedCharacter = "";
		String message = "";
		int tempInt = 0;
		
		// used in formula m = c^d % N
		double c;
		double m = 0;
		double d = 7; // our private key
		int n = 33; 
		
		// loop to decode message
		while (!codedMessage.equals("")) {
			
			// get 2 digit encoded character
			encodedCharacter = codedMessage.substring(0, 2);
			
			// remove encoded character
			if (codedMessage.length() > 2) {
				codedMessage = codedMessage.substring(2, codedMessage.length());
			}
			else {
				codedMessage = "";
			}
			
			// parse encoded character to int
			tempInt = Integer.parseInt(encodedCharacter);
			
			// parse int to double
			c = tempInt;
			
			// formula m = c^d % n
			m = Math.pow(c, d) % n;

			//get character from m derived from above forumla and concatenate to message
			switch ((int)m) {
			case 1:
				message += "A";
				break;
			case 2:
				message += "B";
				break;
			case 3:
				message += "C";
				break;
			case 4:
				message += "D";
				break;
			case 5:
				message += "E";
				break;
			case 6:
				message += "F";
				break;
			case 7:
				message += "G";
				break;
			case 8:
				message += "H";
				break;
			case 9:
				message += "I";
				break;
			case 10:
				message += "J";
				break;
			case 11:
				message += "K";
				break;
			case 12:
				message += "L";
				break;
			case 13:
				message += "M";
				break;
			case 14:
				message += "N";
				break;
			case 15:
				message += "O";
				break;
			case 16:
				message += "P";
				break;
			case 17:
				message += "Q";
				break;
			case 18:
				message += "R";
				break;
			case 19:
				message += "S";
				break;
			case 20:
				message += "T";
				break;
			case 21:
				message += "U";
				break;
			case 22:
				message += "V";
				break;
			case 23:
				message += "W";
				break;
			case 24:
				message += "X";
				break;
			case 25:
				message += "Y";
				break;
			case 26:
				message += "Z";
				break;
			case 32:
				message += " ";
				break;	
			default:
				return;
			}
		}
		
		// print message
		System.out.println(message);
	}

}
