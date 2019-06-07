package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	
	public static void main(String[] args) {
		
		try {
			
			
			String message = JOptionPane.showInputDialog("Enter a message to encrypt.");
			
			String encrypted = "";
			
			FileWriter fw = new FileWriter("src/encrypted_message.txt");
			
			for(int i = 0; i < message.length();i++) {
				int asciiCode = message.charAt(i);
				
				encrypted+=""+asciiCode+"\n";
				
				
				
			}
			
			fw.write(encrypted);
			
			/*
			NOTE: To append to a file that already exists, add true as a second parameter when calling the
			      FileWriter constructor.
			      (e.g. FileWriter fw = new FileWriter("src/_00_Intro_To_File_Input_and_Output/test2.txt", true);)
			*/
			
			
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	 
	}
	

}
