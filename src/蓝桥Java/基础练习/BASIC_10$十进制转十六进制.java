package 蓝桥Java.基础练习;
import java.util.Scanner;
/*
  基础练习 十进制转十六进制  
时间限制：1.0s   内存限制：512.0MB
   
问题描述
　　十六进制数是在程序设计时经常要使用到的一种整数的表示方式。它有0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F共16个符号，分别表示十进制数的0至15。十六进制的计数方法是满16进1，所以十进制数16在十六进制中是10，而十进制的17在十六进制中是11，以此类推，十进制的30在十六进制中是1E。
　　给出一个非负整数，将它表示成十六进制的形式。
输入格式
　　输入包含一个非负整数a，表示要转换的数。0<=a<=2147483647
输出格式
　　输出这个整数的16进制表示
样例输入
30
样例输出
1E

 */
public class BASIC_10$十进制转十六进制 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dec = scanner.nextInt();
		scanner.close();
		System.out.println(binToHex(decToBin(dec)));
	}

	private static String decToBin(int dec) {
		StringBuffer result = new StringBuffer();
		if(dec<2) {return String.valueOf(dec);}
		int n=0;
		while(dec>=Math.pow(2, n)) {
			
			n++;
		}
		while(dec>=0&&n>=0) {
			if(dec-Math.pow(2, n)<0) {result.append('0');}else {result.append('1');dec-=(int)Math.pow(2, n);}
			n--;
		}
		return result.deleteCharAt(0).toString();
	}
	
	private static String binToHex(String str) {
		if(str.equals("0"))return "0";
		StringBuffer result = new StringBuffer();
		int start = 0, end = 0;
		if (str.length() % 4 == 1) {
			str = "000"+str;
		}
		if (str.length() % 4 == 2) {
			str = "00"+str;
		}
		if (str.length() % 4 == 3) {
			str = "0"+str;
		}
		if (str.substring(0, 4).equals("0000")) {
			start = 4;
			end = 8;
		}
		for (; end <= str.length(); start = end, end += 4) {
			String temp = str.substring(start,end);
			if(temp.equals("0000")) {result.append("0");continue;}
			if(temp.equals("0001")) {result.append("1");continue;}
			if(temp.equals("0010")) {result.append("2");continue;}
			if(temp.equals("0011")) {result.append("3");continue;}
			if(temp.equals("0100")) {result.append("4");continue;}
			if(temp.equals("0101")) {result.append("5");continue;}
			if(temp.equals("0110")) {result.append("6");continue;}
			if(temp.equals("0111")) {result.append("7");continue;}
			if(temp.equals("1000")) {result.append("8");continue;}
			if(temp.equals("1001")) {result.append("9");continue;}
			if(temp.equals("1010")) {result.append("A");continue;}
			if(temp.equals("1011")) {result.append("B");continue;}
			if(temp.equals("1100")) {result.append("C");continue;}
			if(temp.equals("1101")) {result.append("D");continue;}
			if(temp.equals("1110")) {result.append("E");continue;}
			if(temp.equals("1111")) {result.append("F");continue;}
		}
		return result.toString();
	}
	
}
