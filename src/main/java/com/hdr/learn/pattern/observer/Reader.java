package com.hdr.learn.pattern.observer;

/**
 * @author hdr
 */
public class Reader implements Observer {

	private String name;

	public Reader(String name) {
		this.name = name;
	}

	public Reader() {
	}

	@Override
	public void update(String content) {
		System.out.println(name + " read " + content);
	}
}
