package edu.jspiders.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Internet {
	
	{
		System.out.println("this is non static part of the internet class");
	}
	
	@Value("100 mbps")
	private String speed;

	public Internet(String speed) {
		super();
		this.speed = speed;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Internet [speed=" + speed + "]";
	}

}
