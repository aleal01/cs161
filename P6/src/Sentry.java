import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sentry {
	
	public Sentry(Cipher cipher){
		this.cipher = cipher;
	}
	
	private Cipher cipher;
	
	//
	String line = null;
	
	public void encrypt(String inputFileName, String outputFileName) {
	// encrypts the contents of the file referred to by inputFileName, 
	// and produces an output file called outputFileName, which contains the encrypted text as described above. 
	// Catch all file processing related exceptions, and print the error message and exit in the catch block as shown below:
	//System.err.println(e);
	try{
		System.out.println("Print Error");
		}
	} catch(){
		System.out.println("To finish");
	}
	
	public void decrypt(String inputFileName, String outputFileName){
		try{
			System.out.println("Print Error");
			}
		} catch(){
			System.out.println("To finish");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "ABC";
		Cipher cipher = new PolyAlphabeticCipher(key);
	}

}
