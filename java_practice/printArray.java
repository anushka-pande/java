class printArray {
	public static void main(String[] args) {
		int myarray[] = {00,10,20,30,40,50,60,70,80,90,100};
		
		printArray A = new printArray();
		A.myfunction(myarray);
	}
	public int myfunction(int[] array){
		for(int i=0;i<array.length;i++){
                	System.out.print(array[i] + " ");
                }
                	return 0;
        }
}
