class LargestNumber {
	public static void main(String[] args) {
		int myarray[] = {00,10,20,30,40,50,60,70,80,90,100};
		
		LargestNumber largest = new LargestNumber();
		largest.myfunction(myarray);
	}
	public int myfunction(int[] array){
		for(int i=0;i<array.length;i++){
                	if(array[0] < array[i]) {
                		array[0] = array[i];
                	}
                }
                System.out.println("Largest number is = " + array[0]);
                return 0;
        }
}
