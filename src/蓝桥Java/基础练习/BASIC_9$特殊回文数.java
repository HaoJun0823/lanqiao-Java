package 蓝桥Java.基础练习;
import java.util.Scanner;
/*

  基础练习 特殊回文数  
时间限制：1.0s   内存限制：512.0MB
   
问题描述
　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
输入格式
　　输入一行，包含一个正整数n。
输出格式
　　按从小到大的顺序输出满足条件的整数，每个整数占一行。
样例输入
52
样例输出
899998
989989
998899
数据规模和约定
　　1<=n<=54。

 */
public class BASIC_9$特殊回文数 {
	public static void main(String[] args) {
		int a,b,c,d,e,f;
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		for(int i=10000;i<=99999;i++) {
			a=i/10000;
			b=i%10000/1000;
			c=i%1000/100;
			d=i%100/10;
			e=i%10;
			if(a==e&&b==d) {
				if(a+b+c+d+e==x) {
					System.out.println(i);
				}
			}
		}
		for(int i=100000;i<=999999;i++) {
			a=i/100000;
			b=i%100000/10000;
			c=i%10000/1000;
			d=i%1000/100;
			e=i%100/10;
			f=i%10;
			if(a==f&&b==e&&c==d) {
				if(a+b+c+d+e+f==x) {
					System.out.println(i);
				}
			}
		}
	}
}
