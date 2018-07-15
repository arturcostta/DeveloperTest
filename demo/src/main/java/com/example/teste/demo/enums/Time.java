package com.example.teste.demo.enums;

public enum Time {
	MORNING("eggs","toast","coffee",null),NIGHT("steak","potato","wine","cake");
	
	private String ref1;
	private String ref2;
	private String ref3;
	private String ref4;
	
	Time(String pref,String pref2,String pref3,String pref4) {
		this.ref1 = pref;
		this.ref2 = pref2;
		this.ref3 = pref3;
		if(pref4 != null) {
			this.ref4 = pref4;
		}
	}
	public String getRef1() {
		return ref1;
	}
	public void setRef1(String ref1) {
		this.ref1 = ref1;
	}
	public String getRef2() {
		return ref2;
	}
	public void setRef2(String ref2) {
		this.ref2 = ref2;
	}
	public String getRef3() {
		return ref3;
	}
	public void setRef3(String ref3) {
		this.ref3 = ref3;
	}
	public String getRef4() {
		return ref4;
	}
	public void setRef4(String ref4) {
		this.ref4 = ref4;
	}
	
}
