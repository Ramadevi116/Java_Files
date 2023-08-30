import java.io.*;
class Write{
	public static void main(String[] args) throws Exception{
		FileWriter f=new FileWriter("TextDoc.txt");
		f.write((int)'R');
		f.close();
    }
}