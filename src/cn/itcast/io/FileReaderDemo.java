package cn.itcast.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	private static FileReader fr;

	public static void main(String[] args) throws IOException {
		fr = new FileReader("C:\\Users\\ASUS\\Desktop\\demo.txt");
		char[] buf=new char[15];
		int len=0;
		while((len=fr.read(buf))!=-1){
			String text=new String(buf,0,len);
			System.out.println(text);
		}
		fr.close();

	}

}
