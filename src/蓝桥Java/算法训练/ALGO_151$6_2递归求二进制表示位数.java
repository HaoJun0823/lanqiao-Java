package 蓝桥Java.算法训练;


//算法训练 6-2递归求二进制表示位数  
//时间限制：10.0s   内存限制：256.0MB
// 
//问题描述
//给定一个十进制整数，返回其对应的二进制数的位数。例如，输入十进制数9，其对应的二进制数是1001，因此位数是4。
//样例输入
//一个满足题目要求的输入范例。
//9
//样例输出
//与上面的样例输入对应的输出。
//数据规模和约定
//输入数据中每一个数的范围。
//例：输入在int表示范围内。
import java.util.Scanner;

public class ALGO_151$6_2递归求二进制表示位数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dec = scanner.nextInt();
		String bin =  decToBin(dec);
		System.out.println(bin.length());
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
}
