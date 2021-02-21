package com.rj.bd;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Month;
import cn.hutool.core.io.file.FileReader;

/**
 * 时间工具类
 */
public class Date 
{
    public static void main( String[] args )
    {

    	//计算年龄
    	int ages =DateUtil.ageOfNow("2000-04-12");
    	System.out.println(ages+"岁");
    	
    	//计算属相
    	String chineseZodiac = DateUtil.getChineseZodiac(1999);
    	System.out.println(chineseZodiac);
    	
    	//计算星座
    	String zodiac = DateUtil.getZodiac(Month.OCTOBER.getValue(), 05);
    	System.out.println(zodiac);

    }
    
}
