class Sample {
	public static void main(String ...args) {
		try {
			System.out.println(args[0]);
		}
		catch(Exception e) {
			/*
			System.out.println("ArrayIndexOutOfBoundsException occurred in main at exception.java line number 4");
			//System.out.println(e.Throwable());
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
			System.out.println(e.initCause(e));
			//System.out.println(e.setCause(e));     - not public in Throwable , cannot be accessed from outside package
			System.out.println(e.fillInStackTrace());
			//System.out.println(e.addSuppressed(e));
			System.out.println(e.toString());
			*/
			System.out.println(e.fillInStackTrace());
		}
	}
}
