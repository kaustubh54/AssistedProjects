package fho;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) {
		String data = "this data is appended";
		try {
		
		FileWriter output = new FileWriter ("CWH_file1.txt",true);
		output.write(data);
		System.out.println("Data appended sucessfully.");
		output.close();
		}catch(IOException ex) {
			System.out.println("File append error......");
		}
		}

}
