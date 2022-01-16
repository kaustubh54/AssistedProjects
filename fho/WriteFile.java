package fho;

	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	public class WriteFile {

	    public static void main(String[] args) {

	        File myFile = new File("CWH_file1.txt");
	        try {
	            FileWriter fileWriter = new FileWriter("CWH_file1.txt");
	            fileWriter.write("Kaustubh is learning file handling operation");
	            fileWriter.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
            System.out.println("file writen sucessfully");

	    }
	}

