package com.sxc.fukuoka.zhihu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App {
	
	public static void main(String[] args) {
		if(SimulateLogin.dataPreparation())
			SimulateLogin.login();
		else
			System.err.println("登陆数据准备失败");
//		FileInputStream file = null;
//		try {
//			file = new FileInputStream("E:\\Projects\\Fukuoka\\src\\main\\resources\\zhihu.properties");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
	}
}
