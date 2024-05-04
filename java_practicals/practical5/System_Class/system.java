class SystemExample {
	public static void main(String[] args) {
		SystemExample s = new SystemExample();
		System.gc();
		int[] myarray={10,20,30};
		long timeRequired = s.countTime(myarray);
		System.out.println(timeRequired + " nanoseconds");
	}
	public long countTime(int[] array) {
		long startTime = System.nanoTime();
		myfunction(array); 
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
	public void myfunction(int[] array){
		for(int i=0;i<array.length;i++){
                	System.out.println(array[i]);
                }
        }
}
