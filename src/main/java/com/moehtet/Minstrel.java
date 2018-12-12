package com.moehtet;

public class Minstrel {
	public void singBeforeQuest() {
		System.out.println("Fa la la; The knight is so brave!");
	}
	public void singAfterQuest() {
		System.out.println("Tee hee he; The brave knight did embark on a quest!");
	}
	public void beforeTestAop() {
		System.out.println("Before calling test aop ....");
	}
	public void afterTestAop() {
		System.out.println("After calling test aop ....");
	}
}
