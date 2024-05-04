import javax.swing.JOptionPane;
class FileExample2 {
	public static void main(String[] args) {
		System.out.println("Hello World !!!");
		java.util.Scanner s = new java.util.Scanner(System.in);
		java.io.File file = new java.io.File("xyz.txt");
		
		try {
			file.createNewFile();
			System.out.println("File Created Successfully");
			JOptionPane.showMessageDialog(null, "File is created", "demo", JOptionPane.WARNING_MESSAGE);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//System.out.println(file.setReadOnly());
		//System.out.println(file.isFile());
		//System.out.println(file.isDirectory());
		//System.out.println(file.getName());
		//System.out.println(file.exists());
		//System.out.println(file.length());
		//System.out.println(file.setWritable(true));
		//System.out.println(file.lastModified());
		//System.out.println(file.getAbsolutePath());
	}
}
