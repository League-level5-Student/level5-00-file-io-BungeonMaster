package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
	
	public static void main(String[] args) {
		
		//Read from a file one line at a time
		
				String decrypted = "";
		
				try {
					BufferedReader br = new BufferedReader(new FileReader("src/encrypted_message.txt"));
					
					String line = br.readLine();
					while(line != null){
						
						int parsed = Integer.parseInt(line);
						
						decrypted += "" + (char)parsed;
						
						
						line = br.readLine();
					}
					
					br.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				JOptionPane.showMessageDialog(null, decrypted);
					
				
				
		
	}
}
