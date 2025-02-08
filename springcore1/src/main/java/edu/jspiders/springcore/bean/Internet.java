package edu.jspiders.springcore.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Internet {
	
	@Value("100 mbps")
	private String speed;

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Internet [speed=" + speed + ", getSpeed()=" + getSpeed() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Internet(String speed) {
		super();
		this.speed = speed;
	}

	public Internet() {
		super();
	}
	
	
	

}
