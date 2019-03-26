package com.hdr.learn.pattern.observer;

/**
 * @author hdr
 */
public interface Subject {
	boolean addObserver(Observer observer);

	boolean removeObserver(Observer observer);

	void notifyObservers(String content);



}
