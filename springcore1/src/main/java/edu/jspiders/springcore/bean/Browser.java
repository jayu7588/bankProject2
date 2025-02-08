package edu.jspiders.springcore.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component

public class Browser {
	
	@Value("chrome/brave")
	private String name;
	
	@Value("4.5.7")
	private String version;

	@Autowired
	private Internet internet;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Internet getInternet() {
		return internet;
	}

	public void setInternet(Internet internet) {
		this.internet = internet;
	}

    @Autowired
    public Browser(@Value("chrome/brave") String name, 
                   @Value("4.5.7") String version, 
                   Internet internet) {
        this.name = name;
        this.version = version;
        this.internet = internet;
    }

	@Override
	public String toString() {
		return "Browser [name=" + name + ", version=" + version + ", internet=" + internet + ", getName()=" + getName()
				+ ", getVersion()=" + getVersion() + ", getInternet()=" + getInternet() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}

}