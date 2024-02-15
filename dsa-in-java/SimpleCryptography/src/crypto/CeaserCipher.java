package crypto;

public class CeaserCipher {
	protected char[] encoder = new char[26]; // Encryption array
	protected char[] decoder = new char[26]; // Decryption array

	/**
	 * Constructor that initializes the encryption and decryption arrays.
	 * */
	public CeaserCipher(int rotation) {
		for(int k = 0; k < 26; k++) {
			encoder[k] = (char) ('A' + (k + rotation) % 26);
			decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
		}
	}
	
	/**
	 * Encoder array getter.
	 * 
	 * @return Return a char array.
	 * */
	public char[] getEncoder() {
		return encoder;
	}
	
	/**
	 * Decoder array getter.
	 * 
	 * @return Return a char array.
	 * */
	public char[] getDecoder() {
		return decoder;
	}
	
	/**
	 * Returns string representing encrypted message.
	 * 
	 * @param message Message that will be encrypted.
	 * 
	 * @return String encrypted message.
	 * */
	public String encrypt(String message) {
		return transform(message, encoder);
	}
	
	/**
	 * Returns string representing decrypted message.
	 * 
	 * @param message Message that will be decrypted.
	 * 
	 * @return String decrypted message.
	 * */
	public String decrypt(String secret) {
		return transform(secret, decoder);
	}
	
	/**
	 * Returns transformation of original String using given code.
	 * 
	 * @param original Represents the original string.
	 * @param Represents the char array to encode or decode.
	 * 
	 * @return Returns the final string.
	 * */
	private String transform(String original, char[] code) {
		char[] msg = original.toCharArray();
		for(int k = 0; k < msg.length; k++) {
			if(Character.isUpperCase(msg[k])) {
				msg[k] = code[msg[k] - 'A'];
			}
		}
		return new String(msg);
	}
}
