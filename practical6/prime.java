import java.util.Random;
class Prime {
	int countPrime;
	int countNonPrime;
	public static void main(String[] args) {
		String[] myarray = new String[100000];
		Prime prime = new Prime();
		
		String randomNum = generateRandomNum(prime);
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
	public static boolean isPrime(int num) {
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
    	public static String generateRandomNum(Prime prime) {
    		Random random = new Random();
        	int randomNum;
        	do {
        		randomNum =  1000000 + random.nextInt(9000000);
        	} while(!prime.isPrime(randomNum));
        	return String.valueOf(randomNum);
    	}
}
