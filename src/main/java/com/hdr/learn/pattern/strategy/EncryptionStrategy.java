package com.hdr.learn.pattern.strategy;

/**
 * @author hdr
 */
public interface EncryptionStrategy {
	/**
	 * 对文本信息进行加密
	 * @param text 需要加密的数据
	 */
	void encryptData(String text);
}
