import java.io.*;
class FileRead{
	public static void main(String[] args) throws Exception{
		FileReader f=new FileReader("Doc.txt");
		int n;
		while((n=f.read())!=-1){
			System.out.print((char)n);
	}	
    }
}