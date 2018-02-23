package 蓝桥Java.基础练习;
/*
  基础练习 01字串  
时间限制：1.0s   内存限制：256.0MB
   
问题描述

对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：

00000

00001

00010

00011

00100

请按从小到大的顺序输出这32种01串。
输入格式
本试题没有输入。
输出格式
输出32行，按从小到大的顺序每行一个长度为5的01串。
样例输出
00000
00001
00010
00011
<以下部分省略>

 */
public class BASIC_2$01字串 {
	public static void main(String[] args) {

		for (int i = 0; i < 32; i++) {
			String str = Integer.toBinaryString(i);
			switch (str.length()) {
			case 1:
				str = "0000" + str;
				break;
			case 2:
				str = "000" + str;
				break;
			case 3:
				str = "00" + str;
				break;
			case 4:
				str = "0" + str;
				break;
			default:
				break;
			}
			System.out.println(str);
		}
	}
}
