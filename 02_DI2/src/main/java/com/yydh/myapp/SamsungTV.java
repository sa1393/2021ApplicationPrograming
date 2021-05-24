package com.yydh.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class SamsungTV implements TV{
	
	@Autowired
	@Qualifier("apple")
	private Speaker speaker;
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("==> setSpeaker 호출");
		this.speaker = speaker;
	}


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
