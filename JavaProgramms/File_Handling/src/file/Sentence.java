package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Sentence {
	public static void main(String[] args) throws Exception{
	    PrintWriter pw = new PrintWriter(new FileWriter(new File("Sentence.txt")));
	    System.out.println("Converting first letter of words in sentence into Upper Case :");
	    	try ( BufferedReader br = new BufferedReader(new FileReader(new File("TextFile.txt")));) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            char[] chars = line.toCharArray();
	            for (int r = 0; r < chars.length; r++) {
	                if (r == 0 || chars[r - 1] == ' ') {
	                    chars[r] = Character.toUpperCase(chars[r]);
	                }
	            }
	            System.out.println(new String(chars));
	            pw.write(chars);
	        }
	        }
	    pw.close();
	    
	    
	    
	    
	
}

}
