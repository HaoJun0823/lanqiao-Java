package 蓝桥Java.算法提高;
import java.util.Scanner;
/*
  算法提高 十进制数转八进制数  
时间限制：1.0s   内存限制：512.0MB
   

编写函数，其功能为把一个十进制数转换为其对应的八进制数。程序读入一个十进制数，调用该函数实现数制转换后，输出对应的八进制数。

 样例输入
 9274
 样例输出
 22072
样例输入
 18
 样例输出
 22


 */
public class ADV_97$十进制数转八进制数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dec = scanner.nextInt();
		scanner.close();
		System.out.println(binToOct(decToBin(dec)));
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
