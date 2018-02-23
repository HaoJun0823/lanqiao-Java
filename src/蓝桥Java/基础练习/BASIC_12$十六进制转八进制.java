package 蓝桥Java.基础练习;
import java.util.Scanner;
/*
  基础练习 十六进制转八进制  
时间限制：1.0s   内存限制：512.0MB
   
问题描述
　　给定n个十六进制正整数，输出它们对应的八进制数。

输入格式
　　输入的第一行为一个正整数n （1<=n<=10）。
　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。

输出格式
　　输出n行，每行为输入对应的八进制正整数。

　　【注意】
　　输入的十六进制数不会有前导0，比如012A。
　　输出的八进制数也不能有前导0。

样例输入
　　2
　　39
　　123ABC

样例输出
　　71
　　4435274

　　【提示】
　　先将十六进制数转换成某进制数，再由某进制数转换成八进制。

 */
public class BASIC_12$十六进制转八进制 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = new String[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.next();
		}
		scanner.close();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(binToOct(hexToBin(arr[i])));
		}
	}

	private static String hexToBin(String str) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case '0':
				result.append("0000");
				break;
			case '1':
				result.append("0001");
				break;
			case '2':
				result.append("0010");
				break;
			case '3':
				result.append("0011");
				break;
			case '4':
				result.append("0100");
				break;
			case '5':
				result.append("0101");
				break;
			case '6':
				result.append("0110");
				break;
			case '7':
				result.append("0111");
				break;
			case '8':
				result.append("1000");
				break;
			case '9':
				result.append("1001");
				break;
			case 'A':
				result.append("1010");
				break;
			case 'B':
				result.append("1011");
				break;
			case 'C':
				result.append("1100");
				break;
			case 'D':
				result.append("1101");
				break;
			case 'E':
				result.append("1110");
				break;
			case 'F':
				result.append("1111");
				break;
			default:
				break;
			}
		}
		return result.toString();
	}

	private static String binToOct(String str) {

		StringBuffer result = new StringBuffer();
		int start = 0, end = 0;
		if (str.length() % 3 == 1) {
			str = "00"+str;
		}
		if (str.length() % 3 == 2) {
			str = "0"+str;
		}
		if (str.substring(0, 3).equals("000")) {
			start = 3;
			end = 6;
		}
		for (; end <= str.length(); start = end, end += 3) {
			String temp = str.substring(start,end);
			if(temp.equals("000")) {result.append("0");continue;}
			if(temp.equals("001")) {result.append("1");continue;}
			if(temp.equals("010")) {result.append("2");continue;}
			if(temp.equals("011")) {result.append("3");continue;}
			if(temp.equals("100")) {result.append("4");continue;}
			if(temp.equals("101")) {result.append("5");continue;}
			if(temp.equals("110")) {result.append("6");continue;}
			if(temp.equals("111")) {result.append("7");continue;}
		}
		return result.toString();
	}

}
