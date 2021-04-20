
public class Decrypt {

	public static void main(String[] args) {
		
		String c = "14172624263203283205093214240103123217262426";
		String temp = "";
		String message = "";
		int tempInt = 0;
		double tempDbl;
		double m = 0;
		double d = 7;
		int n = 33;
		
		while (c != "") {
			temp = c.substring(0, 2);
			if (c.length() > 2) {
				c = c.substring(2, c.length());
			}
			else {
				c = "";
			}
			
			tempInt = Integer.parseInt(temp);
			tempDbl = tempInt;
			m = Math.pow(tempDbl, d) % n;
			tempInt = (int)m;
			switch (tempInt) {
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

		System.out.println(message);
	}

}
