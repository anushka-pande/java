public class Anushka{
	public static int myfunction(int[] array){
		for(int i=0;i<array.length;i++){
                	System.out.println(array[i]);
                }
                	return 0;
        }
        public static int first(int[] array){
        	if(array.length > 0) {
        		return array[0];        	
        	}
        	else {
        		return -1;  //error to indicate array is empty
        	}
        }
        public static int last(int[] array){
        	if(array.length > 0) {
        		return array[2];        	
        	}
        	else {
        		return -1;  //error to indicate array is empty
        	}
        }
        public static int secondlast(int[] array){
        	if(array.length > 0) {
        		return array[1];        	
        	}
        	else {
        		return -1;  //error to indicate array is empty
        	}
        }
        public static int Sum(int[] array){
        	int sum=0;
                if(array.length > 0){
                	for(int i=0;i<array.length;i++){
				sum+=array[i];
                        }
                        return sum;
                }
                else{
                	return -1;
                }
        }
	public static void main(String[] args){
		System.out.println("Hello World!");
		int[] myarray={10,20,30};
		myfunction(myarray);
		int first = first(myarray);
		System.out.println(first);
	        int last = last(myarray);
		System.out.println(last);
	        int secondlast = secondlast(myarray);
		System.out.println(secondlast);
		int arraysum = Sum(myarray);
		System.out.println(arraysum);
        }
}
