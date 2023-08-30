import java.io.*;
class BufferedRead{
	public static void main(String[] args) throws Exception{
		FileReader f=new FileReader("Doc.txt");
		BufferedReader br=new BufferedReader(f);
		String s;
		while((s=br.readLine())!=null){
			System.out.println(s);
	}	
    }
}