package ch.ifage.blockchain;

import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;

import com.google.gson.GsonBuilder;

public class StringUtil {
	
	//Applies Sha256 to a string and returns the result. 
	public static String applySha256(String input){
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        
			//Applies sha256 to our input, 
			byte[] hash = digest.digest(input.getBytes("UTF-8"));
	        
			StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	//Short hand helper to turn Object into a json string
	public static String getJson(Object o) {
		return new GsonBuilder().setPrettyPrinting().create().toJson(o);
	}
	
	//Returns difficulty string target, to compare to hash. eg difficulty of 5 will return "00000"  
	public static String getDificultyString(int difficulty) {
		return new String(new char[difficulty]).replace('\0', '0');
	}

	public static String getStringFromKey(PublicKey reciepient) {
		// TODO Auto-generated method stub
		return null;
	}

	public static byte[] applyECDSASig(PrivateKey privateKey, String data) {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean verifyECDSASig(PublicKey sender, String data, byte[] signature) {
		// TODO Auto-generated method stub
		return false;
	}

	public static String getMerkleRoot(ArrayList<Transaction> transactions) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}