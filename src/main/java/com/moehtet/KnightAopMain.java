package com.moehtet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightAopMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("knight-aop.xml");
		Knight knight=(Knight)ctx.getBean("knight");
		knight.embarkOnQuest();
		knight.testAop();
	}
}
