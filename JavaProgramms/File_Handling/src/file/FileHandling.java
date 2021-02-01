package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileHandling {
	public static void main(String[] args) throws Exception{
		
		File file = new File("TextFile.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          int ch;
        String line; 
        int countWord = 0;  
        int characterCount = 0; 
        while((line = reader.readLine()) != null) 
        { 
            if(line.equals(" ")) 
            { 
                
            } else { 
                characterCount += line.length(); 
                String[] wordList = line.split("\\s+"); 
                countWord += wordList.length; 
            
            } 
        } 
       
          
        System.out.println("Total word count in the file : " + countWord);
        System.out.println("Total number of characters present in the file : " + characterCount); 
       
	}




}
