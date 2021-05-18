package com.yydh.myapp;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("==> setSpeaker 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("==> setPrice 호출");
		this.price = price;
	}

	public SamsungTV() {
		System.out.println("겍체 생성");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("겍체 생성2");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("겍체 생성3");
		this.speaker = speaker;
		this.price = price;
	}
	
	@Override
	public void powerOff() {
		System.out.println("SamsungTV---전원을 끈다");
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV---전원을 킨다(가격 : " + price+")");
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	public void initMethod() {
		System.out.println("객체 초기화 작업처리..");
	}
	
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직");
	}
}
