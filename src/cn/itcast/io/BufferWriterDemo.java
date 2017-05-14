package cn.itcast.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufr=new BufferedReader(new FileReader("C:\\Users\\ASUS\\Desktop\\demo.txt"));
		BufferedWriter bufw=new BufferedWriter(new FileWriter("d:\\demo1.txt"));
		String line=null;
		while((line=bufr.readLine())!=null){
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
		bufr.close();
	}

}
