import java.io.*;
class BufferedWrite{
	public static void main(String[] args) throws Exception{
		FileWriter f=new FileWriter("TextDoc.txt");
		BufferedWriter br=new BufferedWriter(f);
		char[] ch={'r','a','m','a','d','e','v','i'};
		br.write(ch);
		br.close();
		f.close();
}
}