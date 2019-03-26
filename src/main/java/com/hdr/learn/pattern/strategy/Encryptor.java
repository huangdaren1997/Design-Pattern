package com.hdr.learn.pattern.strategy;

/**
 * @author hdr
 */
public class Encryptor {
	private EncryptionStrategy strategy;

	public Encryptor(EncryptionStrategy strategy) {
		this.strategy = strategy;
	}

	public void encrypt(String text) {
		strategy.encryptData(text);
	}



	// getter and setter

	public EncryptionStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(EncryptionStrategy strategy) {
		this.strategy = strategy;
	}



	public static void main(String[] args) {
		String text = "Hello world";
		Encryptor blowfishEncryptor = new Encryptor(new BlowfishEncryptionStrategy());
		Encryptor aesEncryptor = new Encryptor(new AesEncryptionStrategy());
		blowfishEncryptor.encrypt(text);
		aesEncryptor.encrypt(text);
	}
}
