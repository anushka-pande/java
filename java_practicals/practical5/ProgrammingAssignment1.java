class SY2022bit042 {
	public static void main(String[] args) {
		SY2022bit042 valid = new SY2022bit042();
		String[] registration1K = valid.registration1K();
		String[] registration5K = valid.registration5K();
		String[] registration20K = valid.registration20K();
		String[] registration50K = valid.registration50K();
		
		
		System.out.println("Approach " + " Array1K " + " Array5K " + " Array20K " + " Array50K ");
		System.out.println("Appr1  " + "\t"+ timerequired1(registration1K[0]) + "\t" + timerequired1(registration5K[0]) + "\t"+ timerequired1(registration20K[0]) + "\t"+ timerequired1(registration50K[0]));
		System.out.println("Appr2  " + "\t"+ timerequired2(registration1K[0]) + "\t" + timerequired2(registration5K[0]) + "\t"+ timerequired2(registration20K[0]) + "\t"+ timerequired2(registration50K[0]));
		System.out.println("Appr3  " + "\t"+ timerequired3(registration1K[0]) + "\t" + timerequired3(registration5K[0]) + "\t"+ timerequired3(registration20K[0]) + "\t"+ timerequired3(registration50K[0]));
		System.out.println("Appr4  " + "\t"+ timerequired4(registration1K[0]) + "\t" + timerequired4(registration5K[0]) + "\t"+ timerequired4(registration20K[0]) + "\t"+ timerequired4(registration50K[0]));
		System.out.println("Appr5  " + "\t"+ timerequired5(registration1K[0]) + "\t" + timerequired5(registration5K[0]) + "\t"+ timerequired5(registration20K[0]) + "\t"+ timerequired5(registration50K[0]));
	}
	
	public int getValidRegistrationsCount1(String registrationNo) {
		int count=0;
		if(registrationNo.length() == 10) {
			int year= Integer.parseInt(registrationNo.substring(0,4));
				
			if(year >= 2000 && year <= 2024) {
				String dept = registrationNo.substring(4,7);
					
				if((dept.equalsIgnoreCase("bit") || dept.equalsIgnoreCase("bcs") || dept.equalsIgnoreCase("bch") || dept.equalsIgnoreCase("bme")) && isValidSequence1(registrationNo)) {
					count = 1;
				}
				else {
					count = 0;
				}
			}
		}
		return count;
	}
	public int getValidRegistrationsCount2(String registrationNo) {
		int count=0;
		if(registrationNo.length() == 10) {
			int year= Integer.parseInt(registrationNo.substring(0,4));
				
			if(year >= 2000 && year <= 2024) {
				String dept = registrationNo.substring(4,7);
					
				if((dept.equalsIgnoreCase("bit") || dept.equalsIgnoreCase("bcs") || dept.equalsIgnoreCase("bch") || dept.equalsIgnoreCase("bme")) && isValidSequence2(registrationNo)) {
					count = 1;
				}
				else {
					count = 0;
				}
			}
		}
		return count;
	}
	public int getValidRegistrationsCount3(String registrationNo) {
		int count=0;
		if(registrationNo.length() == 10) {
			int year= Integer.parseInt(registrationNo.substring(0,4));
				
			if(year >= 2000 && year <= 2024) {
				String dept = registrationNo.substring(4,7);
					
				if((dept.equalsIgnoreCase("bit") || dept.equalsIgnoreCase("bcs") || dept.equalsIgnoreCase("bch") || dept.equalsIgnoreCase("bme")) && isValidSequence3(registrationNo)) {
					count = 1;
				}
				else {
					count = 0;
				}
			}
		}
		return count;
	}
	public int getValidRegistrationsCount4(String registrationNo) {
		int count=0;
		if(registrationNo.length() == 10) {
			int year= Integer.parseInt(registrationNo.substring(0,4));
				
			if(year >= 2000 && year <= 2024) {
				String dept = registrationNo.substring(4,7);
					
				if((dept.equalsIgnoreCase("bit") || dept.equalsIgnoreCase("bcs") || dept.equalsIgnoreCase("bch") || dept.equalsIgnoreCase("bme")) && isValidSequence4(registrationNo)) {
					count = 1;
				}
				else {
					count = 0;
				}
			}
		}
		return count;
	}
	public int getValidRegistrationsCount5(String registrationNo) {
		int count=0;
		if(registrationNo.length() == 10) {
			int year= Integer.parseInt(registrationNo.substring(0,4));
				
			if(year >= 2000 && year <= 2024) {
				String dept = registrationNo.substring(4,7);
					
				if((dept.equalsIgnoreCase("bit") || dept.equalsIgnoreCase("bcs") || dept.equalsIgnoreCase("bch") || dept.equalsIgnoreCase("bme")) && isValidSequence5(registrationNo)) {
					count = 1;
				}
				else {
					count = 0;
				}
			}
		}
		return count;
	}
	public boolean isValidSequence1(String S) {                        //approach 1
		int sequence = Integer.parseInt(S.substring(7,10));
		if(sequence >= 0 && sequence <= 50){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isValidSequence2(String S) {                           //approach 2
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
	}
	public boolean isValidSequence3(String S) {                           //approach 3
    		int sequence = Integer.parseInt(S.substring(7,10));
    		for(int i = 0; i <= 50; i++) {
    			if(sequence == i) {
    				return true;
    			}
    		}
    		return false;
	}
	public boolean isValidSequence4(String S) {                            //approach 4
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
	}
	public boolean isValidSequence5(String S) {                              //approach 5
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
	public static long timerequired1(String registrationNo) {
		long starttime = System.nanoTime();
		SY2022bit042 count = new SY2022bit042();
		int ValidCount = count.getValidRegistrationsCount1(registrationNo);
		long endtime = System.nanoTime();
		return endtime - starttime;
	}
        public static long timerequired2(String registrationNo) {
		long starttime = System.nanoTime();
		SY2022bit042 count = new SY2022bit042();
		int ValidCount = count.getValidRegistrationsCount2(registrationNo);
		long endtime = System.nanoTime();
		return endtime - starttime;
	}
        public static long timerequired3(String registrationNo) {
		long starttime = System.nanoTime();
		SY2022bit042 count = new SY2022bit042();
		int ValidCount = count.getValidRegistrationsCount3(registrationNo);
		long endtime = System.nanoTime();
		return endtime - starttime;
	}
        public static long timerequired4(String registrationNo) {
		long starttime = System.nanoTime();
		SY2022bit042 count = new SY2022bit042();
		int ValidCount = count.getValidRegistrationsCount4(registrationNo);
		long endtime = System.nanoTime();
		return endtime - starttime;
	}
	public static long timerequired5(String registrationNo) {
		long starttime = System.nanoTime();
		SY2022bit042 count = new SY2022bit042();
		int ValidCount = count.getValidRegistrationsCount5(registrationNo);
		long endtime = System.nanoTime();
		return endtime - starttime;
	}	
        public static String[] registration1K() {
        	String[] registrations = new String[1000];
        	for (int i = 0; i < 1000; i++) {
            		registrations[i] = generateRandomRegistration();
        	}
        	return registrations;
        }
        public static String[] registration5K() {
        	String[] registrations = new String[5000];
        	for (int i = 0; i < 5000; i++) {
            		registrations[i] = generateRandomRegistration();
        	}
        	return registrations;
        }
        public static String[] registration20K() {
        	String[] registrations = new String[20000];
        	for (int i = 0; i < 20000; i++) {
            		registrations[i] = generateRandomRegistration();
        	}
        	return registrations;
        }
        public static String[] registration50K() {
        	String[] registrations = new String[50000];
        	for (int i = 0; i < 50000; i++) {
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
