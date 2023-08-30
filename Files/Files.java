import java.io.*;
class Files{
	public static void main(String[] args){
		File f=new File("Doc.txt");
		System.out.println("Exists : "+f.exists());
		System.out.println("Read : "+f.canRead());
		System.out.println("Write : "+f.canWrite());
		System.out.println("lastModified : "+f.lastModified());
		System.out.println("Deleted "+f.Delete());
		
}
}