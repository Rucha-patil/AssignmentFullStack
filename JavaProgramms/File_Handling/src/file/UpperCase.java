package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class UpperCase {
	public static void main(String[] args) throws Exception{
		
		  BufferedReader br = new BufferedReader(new FileReader(new File("TextFile.txt")));
		    PrintWriter pw = new PrintWriter(new FileWriter(new File("UpperCase.txt")));
		    String line = null;
		    System.out.println("Converting texts into Upper Case");
		    while((line = br.readLine()) != null){
		        pw.write(line.toUpperCase());
		    }
		    pw.close();
		    br.close();
	}
}
