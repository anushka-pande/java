class Sample {
	int x;
	Sample(int x) {
		this.x = x;
	}
	public static void main(String ...args) {
		try {
			Thread.sleep(4000);
			System.out.println("Inside Try 1");
			Thread.sleep(4000);
			System.out.println("Inside Try 2");
			System.out.println(args[0]);
			Thread.sleep(4000);
			System.out.println("Inside Try 3");
			Sample s = new Sample(5);
			//System.exit(42);
			//s = new Sample(5);
			//Thread.sleep(10000);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurred in main at exception.java line number 8");
			/*
			//System.out.println(e.Throwable());
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
			System.out.println(e.initCause(e));
			//System.out.println(e.setCause(e));                        - not public in Throwable , cannot be accessed from outside package
			System.out.println(e.fillInStackTrace());
			//System.out.println(e.addSuppressed(e));
			System.out.println(e.toString());
			System.out.println(e.fillInStackTrace());
			*/
		}
		catch(InterruptedException i) {
			System.out.println("Inside InterruptedException Catch");
			//System.out.println(i.getMessage());
		}
		finally{
			System.out.println("End of Sample");
		}
	}
}
