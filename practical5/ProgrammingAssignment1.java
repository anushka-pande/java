class SY2022bit042 {
	public static void main(String[] args) {
		long starttime = System.nanoTime();
		String[] registrations= generateRandomRegistrations(50000);
		int validRegCount = 0;
		SY2022bit042 valid = new SY2022bit042();
		for(String registrationNo : registrations) {
			validRegCount += valid.getValidRegistrationsCount(registrationNo);
		}
		System.out.println(validRegCount);
    		long endtime = System.nanoTime();
    		long timerequired = endtime - starttime;
    		System.out.println(timerequired);
	}
	public int getValidRegistrationsCount(String registrationNo) {
		int count=0;
			if(registrationNo.length() == 10) {
				int year= Integer.parseInt(registrationNo.substring(0,4));
				
				if(year >= 2000 && year <= 2024) {
					String dept = registrationNo.substring(4,7);
					
					if((dept.equalsIgnoreCase("bit") || dept.equalsIgnoreCase("bcs") || dept.equalsIgnoreCase("bch") || dept.equalsIgnoreCase("bme")) && isValidSequence(registrationNo)) {
						count = 1;
					}
					else {
						count = 0;
					}
				}
			}
		return count;
	}
	/*public boolean isValidSequence(String S) {                        //approach 1
		int sequence = Integer.parseInt(S.substring(7,10));
		if(sequence >= 0 && sequence <= 50){
			return true;
		}
		else {
			return false;
		}
	}*/
	/*public boolean isValidSequence(String S) {                           //approach 2
    		char s1 = S.charAt(7);
    		char s2 = S.charAt(8);
    		char s3 = S.charAt(9);
    		
    		boolean isDigit = Character.isDigit(s1) && Character.isDigit(s2) && Character.isDigit(s3);
    		int sequence = (s1 - '0') * 100 + (s2 - '0') * 10 + (s3 - '0');
    		
    		if (isDigit && sequence >= 0 && sequence <= 50) {
        		return true;
    		} 
    		else {
        		return false;
   	 	}
	}*/
	/*public boolean isValidSequence(String S) {                           //approach 3
    		int sequence = Integer.parseInt(S.substring(7,10));
    		for(int i = 0; i <= 50; i++) {
    			if(sequence == i) {
    				return true;
    			}
    		}
    		return false;
	}*/
	/*public boolean isValidSequence(String S) {                            //approach 4
		int sequence = 0;
		for (int i = 7; i <= 9; i++) {
        		char digit = S.charAt(i);
        		if (digit < '0' || digit > '9') {
            			return false;
        		}	
        		int digitValue = digit - '0';
        		sequence = sequence * 10 + digitValue;
    		}
		return sequence >= 0 && sequence <= 50;
	}*/
	public boolean isValidSequence(String S) {                              //approach 5
    		for (int i = 7; i <= 9; i++) {
        		char digit = S.charAt(i);
        		switch (digit) {
            			case '0': case '1': case '2': case '3': case '4':
            			case '5': case '6': case '7': case '8': case '9':
                			break;
            			default:
                			return false;
        		}
    		}
    		int sequence = Integer.parseInt(S.substring(7, 10));
    		return sequence >= 0 && sequence <= 50;
	}
	public static String[] generateRandomRegistrations(int size) {
        	String[] registrations = new String[size];
        	for (int i = 0; i < size; i++) {
            		registrations[i] = generateRandomRegistration();
        	}
        	return registrations;
        }
        public static String generateRandomRegistration() {
        	int a = ((int) (System.nanoTime()) % 10);
        	String y1 = Integer.toString(a);
        	
        	int b = ((int) (System.nanoTime()) % 10);
        	String y2 = Integer.toString(b);
        	
        	int c = ((int) (System.nanoTime()) % 10);
        	String y3 = Integer.toString(c);
        	
        	int d = ((int) (System.nanoTime()) % 10);
        	String y4 = Integer.toString(d);
        	
        	String year = y1 + y2 + y3 + y4;
        	
        	a = ((int) (System.nanoTime()) % 25);
        	a = 97 + a;
        	char d1 = (char) a;
        	
        	b = ((int) (System.nanoTime()) % 25);
        	b = 97 + b;
        	char d2 = (char) b;
        	
        	c = ((int) (System.nanoTime()) % 25);
        	c = 97 + c;
        	char d3 = (char) c;
        	String dept = String.valueOf(d1) + String.valueOf(d2) + String.valueOf(d3);
        	
        	a = ((int) (System.nanoTime()) % 10);
        	String s1 = Integer.toString(a);
        	
        	b = ((int) (System.nanoTime()) % 10);
        	String s2 = Integer.toString(b);
        	
        	c = ((int) (System.nanoTime()) % 10);
        	String s3 = Integer.toString(c);
        	
        	String sequence = s1 + s2 + s3;	
        	
        	String RegNo = year + dept + sequence;
        	return RegNo;
        }
}
