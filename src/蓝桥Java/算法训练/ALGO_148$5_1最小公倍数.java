package 蓝桥Java.算法训练;
import java.util.Scanner;
/*

  算法训练 5-1最小公倍数  
时间限制：1.0s   内存限制：256.0MB
   
问题描述
　　编写一函数lcm，求两个正整数的最小公倍数。
样例输入
一个满足题目要求的输入范例。
例：

3 5
样例输出
与上面的样例输入对应的输出。
例：
数据规模和约定
　　输入数据中每一个数的范围。
　　例：两个数都小于65536。

 */
public class ALGO_148$5_1最小公倍数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(lcm(scanner.nextInt(),scanner.nextInt()));
	}
	
	private static int lcm(int a,int b) {
		if(a==b) {return a;}
		int max = Math.max(a, b);
		while(!(max%a==0&&max%b==0)) {
			max++;
		}
		return max;
	}
}
