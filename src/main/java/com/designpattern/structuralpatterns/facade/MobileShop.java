package com.designpattern.structuralpatterns.facade;

public class MobileShop {

	private Iphone iphone;
	private Huawei huawei;
	private Nokia nokia;

	public MobileShop() {
		iphone = new Iphone();
		huawei = new Huawei();
		nokia = new Nokia();
	}

	public void getIphone() {
		iphone.modelNo();
		iphone.price();
	}

	public void getHuawei() {
		huawei.modelNo();
		huawei.price();
	}

	public void getNokia() {
		nokia.modelNo();
		nokia.price();
	}
}