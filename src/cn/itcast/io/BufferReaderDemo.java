package cn.itcast.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufr=new BufferedReader(new FileReader("C:\\Users\\ASUS\\Desktop\\demo.txt"));
		String content=null;
		while((content=bufr.readLine())!=null){
			System.out.println(content);
			
		}
		bufr.close();
	}

}
