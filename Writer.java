package com.rj.bd;

import cn.hutool.core.io.file.FileWriter;

public class Writer {

	public static void main(String[] args) {
		//文件写入添加
		
		FileWriter writer = new FileWriter("D:/hy/0.txt");
		writer.append("王嘉杰");
		System.out.println("写入成功");
		//文件覆盖append
		FileWriter writer1 = new FileWriter("D:/hy/0.txt");
		writer1.write("test文件覆盖");
		System.out.println("覆盖完成");
	}

}
