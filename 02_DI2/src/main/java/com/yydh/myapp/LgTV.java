package com.yydh.myapp;

public class LgTV implements TV {
	@Override
	public void powerOff() {
		System.out.println("LgTV---전원을 끈다");
	}

	@Override
	public void powerOn() {
		System.out.println("LgTV---전원을 킨다");
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV---소리를 줄인다");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV---소리를 높인다");
	}
}
