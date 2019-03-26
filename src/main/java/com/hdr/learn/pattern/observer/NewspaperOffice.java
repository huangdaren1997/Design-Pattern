package com.hdr.learn.pattern.observer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author hdr
 */
public class NewspaperOffice implements Subject {
	private Set<Observer> observers;

	{
		observers = new HashSet<>();
	}


	public NewspaperOffice() {

	}

	@Override
	public boolean addObserver(Observer observer) {
		return observers.add(observer);
	}

	@Override
	public boolean removeObserver(Observer observer) {
		return observers.remove(observer);
	}


	@Override
	public void notifyObservers(String content) {
		for (Observer o : observers) {
			o.update(content);
		}
	}


	public void publicBook() {
		Scanner scanner = new Scanner(System.in);
		String book;
		while (scanner.hasNextLine()) {
			book = scanner.nextLine();
			notifyObservers(book);
		}
	}

}
