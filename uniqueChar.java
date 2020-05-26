
public class uniqueChar {
	// This takes in a string and returns true or false on whether there are duplicate letters or not in the string. 
	public boolean uniqueChar(String stringIn) {
		for(int i=0; i < stringIn.length(); i++) {
			for(int j = i+1; j < stringIn.length(); j++) {
				if(stringIn.charAt(i)== stringIn.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}
