class Prime {
	int countPrime;
	int countNonPrime;
	public static void main(String[] args) {
		Prime prime = new Prime();
		int[] numbers = prime.generateRandomNumArray(1000000);
	
		int i = 1;
		while(i<=5) {
			System.out.println("Iteration No: " + i);
			
			long startTime = System.nanoTime();
			int[] counts = prime.checkPrime(numbers);
			long endTime = System.nanoTime();
        		System.out.println("Time required for appr 1: "+ (endTime - startTime) + " nanoSeconds");
        		
        		startTime = System.nanoTime();
			int[] inverted_counts = prime.checkNonPrime(numbers);
			endTime = System.nanoTime();
        		System.out.println("Time required for appr 2: "+ (endTime - startTime) + " nanoSeconds");
        		i++;
        		System.out.println();
		}
	}
	public int[] generateRandomNumArray(int size) {
    		int[] numbers = new int[size];
    		for(int i = 0; i < size; i++) {
    			numbers[i] = generaterandomNumber();
    		}
    		return numbers;
    	}
    	public int generaterandomNumber() {
    		int n = generaterandomDigit();
    		int num = n;
    		for(int i = 0; i < 6; i++) {
    			int digit = generaterandomDigit();
    			num = num * 10 + digit;
    		}
    		return num;
    	}
    	public int generaterandomDigit() {
    		int t = (int) System.nanoTime();
    		int digit = t % 10;
    		return digit;
    	}
	public int[] checkPrime(int[] numbers) {
		for(int number : numbers) {
			if(isPrime(number)) {
				countPrime++;
			}
			else {
				countNonPrime++;
			}
		}
		return new int[]{countPrime, countNonPrime};
	}
	public int[] checkNonPrime(int[] numbers) {
		for(int number : numbers) {
			if(!isPrime(number)) {
				countNonPrime++;
			}
			else {
				countPrime++;
			}
		} 
		return new int[]{countNonPrime,countPrime};
	}
	public static boolean isPrime(int number) {
		if (number < 2) {
            		return false;
        	}

        	for (int i = 2; i * i <= number; i++) {
            		if (number % i == 0) {
                		return false;
            		}
        	}
       		return true;
    	}
}
