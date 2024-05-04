//import java.io.File;
//import java.util.Scanner;

//package packageExamples;

class FileExample {
	public static void main(String[] args) throws Exception{
		System.out.println("Hello World !!!");
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		java.io.File file = new java.io.File("xyz.txt");
		file.createNewFile();
		//System.out.println(file.setReadOnly());
		//System.out.println(file.isFile());
		//System.out.println(file.isDirectory());
		//System.out.println(file.getName());
		//System.out.println(file.exists());
		//System.out.println(file.length());
		System.out.println(file.setWritable(true));
		//System.out.println(file.lastModified());
		System.out.println(file.getAbsolutePath());
	}
}
