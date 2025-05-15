package com.javaex.ex03;

public class Person {
	// 필드
	private String name;
	private String hp;
	private String com;

	// 생성자
	public Person() {
	}

	public Person(String name, String hp, String com) {
		this.name = name;
		this.hp = hp;
		this.com = com;
	}

	// 메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + ", com=" + com + "]";
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("핸드폰: " + hp);
		System.out.println("회사: " + com);
		System.out.println("");
	}

}
