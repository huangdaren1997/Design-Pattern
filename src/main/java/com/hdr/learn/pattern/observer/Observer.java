package com.hdr.learn.pattern.observer;

/**
 * @author hdr
 */
public interface Observer {
	/**
	 * This method is called whenever the Subject object is changed.
	 * @param content 需要更新的内容
	 */
	void update(String content);
}
