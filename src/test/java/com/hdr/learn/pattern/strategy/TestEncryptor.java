package com.hdr.learn.pattern.strategy;

import org.junit.Test;

/**
 * @author hdr
 */
public class TestEncryptor {

	@Test
	public void testEncrypt(){
		String text = "Hello world";
		Encryptor blowfishEncryptor = new Encryptor(new BlowfishEncryptionStrategy());
		Encryptor aesEncryptor = new Encryptor(new AesEncryptionStrategy());
		blowfishEncryptor.encrypt(text);
		aesEncryptor.encrypt(text);
	}
}
