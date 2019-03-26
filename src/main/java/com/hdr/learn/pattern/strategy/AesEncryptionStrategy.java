package com.hdr.learn.pattern.strategy;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;

/**
 * @author hdr
 */
public class AesEncryptionStrategy implements EncryptionStrategy {

	@SuppressWarnings("Duplicates")
	@Override
	public void encryptData(String text) {
		System.out.println("-------Encrypting data using AES algorithm-------");
		try {
			KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
			keyGenerator.init(128);
			SecretKey secretKey = keyGenerator.generateKey();
			byte[] plaintTextByteArray = text.getBytes(StandardCharsets.UTF_8);

			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			byte[] cipherText = cipher.doFinal(plaintTextByteArray);

			System.out.println("Original data: " + text);
			System.out.print("Encrypted data: ");
			for (byte b : cipherText) {
				System.out.print(b + " ");
			}
			System.out.println();

		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}


}
