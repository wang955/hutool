package com.rj.bd;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdcardUtil;

public class Idtest {
	public static void main(String[] args) {
		
	//身份证id
	String ID="130722200004123456";
	
	//id是否合法
	boolean valid = IdcardUtil.isValidCard(ID);
	System.out.println(valid);
	
	//id转换
	//String convert18To15 = IdcardUtil.convert15To18(ID);
	//System.out.println(convert18To15);
	
	//年龄
	DateTime date = DateUtil.parse("2021-02-20");
	        
	int age = IdcardUtil.getAgeByIdCard(ID, date);
	System.out.println(age);
	
	//生日
	String birth = IdcardUtil.getBirthByIdCard(ID);
	System.out.println(birth);
	
	//省份
	String province = IdcardUtil.getProvinceByIdCard(ID);
	System.out.println(province);
  }
}
