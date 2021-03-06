package 蓝桥Java.算法训练;
import java.math.BigInteger;
import java.util.Scanner;
/*
  算法训练 Torry的困惑(基本型)  
时间限制：1.0s   内存限制：512.0MB
   
问题描述
　　Torry从小喜爱数学。一天，老师告诉他，像2、3、5、7……这样的数叫做质数。Torry突然想到一个问题，前10、100、1000、10000……个质数的乘积是多少呢？他把这个问题告诉老师。老师愣住了，一时回答不出来。于是Torry求助于会编程的你，请你算出前n个质数的乘积。不过，考虑到你才接触编程不久，Torry只要你算出这个数模上50000的值。
输入格式
　　仅包含一个正整数n，其中n<=100000。
输出格式
　　输出一行，即前n个质数的乘积模50000的值。
样例输入

1


样例输出

2
 */
public class ALGO_51$Torry的困惑基本型 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		BigInteger bi = new BigInteger("1");
		scanner.close();
		int count=2;
		
		while(num>0) {
			for(int i=2;i<count;i++) {
				if(count%i==0) {
					count++;i=2;continue;
				}
			}
			bi = bi.multiply(new BigInteger(String.valueOf(count)));
			count++;
			num--;
			
		}
		System.out.println(bi.mod(new BigInteger("50000")));
	}
}
