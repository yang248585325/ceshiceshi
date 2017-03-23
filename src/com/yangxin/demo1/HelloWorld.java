package com.yangxin.demo1;

public class HelloWorld {
	public static void main(String[] args) throws InterruptedException {
		int i = 0;
		while(i < 100){
			Thread.currentThread().sleep(1000);
			System.out.println("hello world------------" + i );
			i ++;
		}
	}
}
