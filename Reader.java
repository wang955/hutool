package com.rj.bd;

import java.util.List;

import cn.hutool.core.io.file.FileReader;

public class Reader {

	public static void main(String[] args) {
		
		//读取文件内容
		FileReader fileReader = new FileReader("D:/hj.txt");//路径
		String result = fileReader.readString();
		//读取字节
		byte[] result1 =fileReader.readBytes();
		//读取长度存入list
		List<String> result2 = fileReader.readLines();
		
		System.out.println(result);
		System.out.println(result2);
		
		
		
	}

}
