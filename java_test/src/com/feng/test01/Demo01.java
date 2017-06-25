package com.feng.test01;

public class Demo01 {
	public static void main(String[] args) {
		byte b = (byte)2;
		String str = "abcd";

		switch (str) {
		case "abcd":
			System.out.println("OK");
			break;

		default:
			System.out.println("不OK");
			break;
		}
	}
}
