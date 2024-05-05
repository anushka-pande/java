import java.io.File;
class FileFolderExample {
	int fileCount;
	int folderCount;
	public void setNumberOfFileFolder(String path) {
		File file = new File(path);
		/*
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.listFiles());
		*/
		if(!file.exists()) {
			System.out.println("Provided path does not exist.");
			return;
		}
		if(file.isFile()) {
			System.out.println("Provided path is a file.");
			return;
		}
		int javaCount = 0;
		int classCount = 0;
		int cCount = 0;
		int pngCount = 0;
		int jpgCount = 0;
		int jpegCount = 0;
		
		File[] files = file.listFiles();
		
		for(File f : files) {
			if(f.isDirectory()) {
				folderCount++;
			}
			else if(f.isFile()) {
				fileCount++;
				String fileName = f.getName();
				if(fileName.endsWith(".java")) {
					javaCount++;
				}
				else if(fileName.endsWith(".class")) {
					classCount++;
				}
				else if(fileName.endsWith(".c")) {
					cCount++;
				}
				else if(fileName.endsWith(".png")) {
					pngCount++;
				}
				else if(fileName.endsWith(".jpg")) {
					jpgCount++;
				}
				else if(fileName.endsWith(".jpeg")) {
					jpegCount++;
				}
			}
		}
		int imageCount = pngCount + jpgCount + jpegCount;
		
		System.out.println("Total Files: " + fileCount);
		System.out.println("Total Folders: " + folderCount);
		System.out.println("Java Files: " + javaCount);
		System.out.println("Class Files: " + classCount);
		System.out.println("C Files: " + cCount);
		System.out.println("PNG Files: " + pngCount);
		System.out.println("JPG Files: " + jpgCount);
		System.out.println("JPEG Files: " + jpegCount);
		System.out.println("Total Image Files: " + imageCount);
	}
	public static void main(String args[]) {
		FileFolderExample ffe = new FileFolderExample();
		//ffe.setNumberOfFileFolder("xyz.txt");
		ffe.setNumberOfFileFolder("./file_folders_example");
		//ffe.setNumberOfFileFolder("xyz.c");
	}
}
