/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readfile;

/**
 *
 * @author rkaune
 */
//import java.util.Scanner;
 import java.io.*;
 
 public class ReadFile {

	public static void main(String[] args) {
		File textFile = new File("wonder.txt");
		FileReader in;
		BufferedReader readFile;
		String line;
                int rektgae = 999;
		
		try {
		      in = new FileReader(textFile);
			readFile = new BufferedReader(in);
    		while ((line = readFile.readLine()) != null ) {
    			System.out.println(line);
    		}
    		 readFile.close();
    		 in.close();
            } catch (FileNotFoundException e) {
		     System.out.println("File does not exist or could not be found.");
		     System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
		     System.out.println("Problem reading file.");
    	             System.err.println("IOException: " + e.getMessage());
    	}
	}	
 } 


