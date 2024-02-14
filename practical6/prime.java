import java.util.Random;
class Prime {
	int countPrime;
	int countNonPrime;
	public static void main(String[] args) {
		String[] myarray = new String[100000];
		Prime prime = new Prime();
		
		String randomNum = generateRandomNum();
        	System.out.println(randomNum);
        	
        	for (int i = 0; i < myarray.length; i++) {
            		myarray[i] = randomNum;
        	}
		int[] counts = prime.checkPrimeNum(myarray);

        	//System.out.println("Count of Prime Numbers: " + counts[0]);
        	//System.out.println("Count of Non-Prime Numbers: " + counts[1]);
	}
	public int[] checkPrimeNum(String[] array ) {
		for(int i = 0;i < array.length; i++) {
			if(isPrime(Integer.parseInt(array[i]))) {
				countPrime++;
			}
			else {
				countNonPrime++;
			}
		}
		return new int[]{countPrime, countNonPrime};
	}
	public boolean isPrime(int num) {
		if (num < 2) {
            		return false;
        	}

        	for (int i = 2; i <= Math.sqrt(num); i++) {
            		if (num % i == 0) {
                		return false;
            		}
        	}
       		return true;
    	}
    	public static String generateRandomNum() {
    		Random random = new Random();
        	int randomNum = random.nextInt(1000000);
        	return String.valueOf(randomNum);
    	}
}
