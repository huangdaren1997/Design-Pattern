package com.hdr.learn.pattern.observer;

/**
 * @author hdr
 */
public class Main {

	public static void main(String[] args) {
		Reader john = new Reader("john");
		Reader tom = new Reader("tom");
		Reader jerry = new Reader("jerry");

		NewspaperOffice newspaperOffice = new NewspaperOffice();
		newspaperOffice.addObserver(john);
		newspaperOffice.addObserver(tom);
		newspaperOffice.addObserver(jerry);

		newspaperOffice.publicBook();
	}
}
