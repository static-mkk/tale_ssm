package cn.kkcoder.domain;

import org.springframework.stereotype.Component;

@Component
public class Student {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
