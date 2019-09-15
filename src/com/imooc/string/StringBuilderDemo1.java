package com.imooc.string;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		//定义一个字符串"你好"
		StringBuilder str = new StringBuilder("你好");
		//在"你好"后面添加内容，将字符串变为"你好，imooc"
		System.out.println("str = " + str.append(',').append("imooc!"));
		//将字符串变成"你好，iMOOC！"
		//两种方式
		//1、使用delete方法删除mooc,然后再插入MOOC
		System.out.println("替换后:" + str.delete(4, 8).insert(4, "MOOC"));
		//2、使用replace方法直接替换
		StringBuilder str1 = str;
		System.out.println("替换后：" + str1.replace(4, 8, "MOOC"));
		//再字符串"你好，iMOOC"中取出"你好"并输出
		System.out.println(str.substring(0,2));
	}
}
