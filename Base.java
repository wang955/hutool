package com.rj.bd;

import cn.hutool.core.codec.Base62;

public class Base {

	public static void main(String[] args) {
		//Base62编码  64，32同下
		String a = "我是一个非常长的字符串";

		//对字符串a编码
		String encode = Base62.encode(a);
		System.out.println(encode);

		// 还原为a的字符串
		String decodeStr = Base62.decodeStr(encode);
		System.out.println(decodeStr);
		
	}

}
