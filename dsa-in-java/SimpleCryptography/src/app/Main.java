package app;

import crypto.CeaserCipher;

public class Main {
	public static void main(String[] args) {
		CeaserCipher c = new CeaserCipher(3);
		System.out.println("Encryption code: " + new String(c.getEncoder()));
		System.out.println("Decryption code: " + new String(c.getDecoder()));
		
		String message = "DIOGO MARTINS DE ASSIS";
		
		String coded = c.encrypt(message);
		System.out.println("Secret: " + coded);
		String answer = c.decrypt(coded);
		System.out.println("Original: " + answer);
	}
}
