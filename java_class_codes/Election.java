interface Voter {
	void castVote();
}
interface EC {
	void checkValidityOfVoter();
}
class ECIndia implements Voter, EC {
	final int minAge;
	ECIndia(int minAge) {
		this.minAge = minAge;
	}
	public void castVote() {
		int arr[] = [1, 2, 3];
		try {
			System.out.println("In castVote: ECIndia" + arr[3]);
		}
		catch(Exception ex) {
			System.out.println(ex);
			for(StackTraceElement element : ex.getStackTrace()) {
				System.out.println(element);
				System.out.println(element.getClassName());
			}
		}
	}
}
