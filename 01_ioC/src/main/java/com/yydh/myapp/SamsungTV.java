package com.yydh.myapp;

public class SamsungTV implements TV{
	
	public SamsungTV() {
		System.out.println("겍체 생성");
	}
	
	@Override
	public void powerOff() {
		System.out.println("SamsungTV---전원을 끈다");
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV---전원을 킨다");
	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungTV---소리를 줄인다");
	}

	@Override
	public void volumeUp() {
		System.out.println("SamsungTV---소리를 높인다");
	}

	public void initMethod() {
		System.out.println("객체 초기화 작업처리..");
	}
	
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직");
	}
}
