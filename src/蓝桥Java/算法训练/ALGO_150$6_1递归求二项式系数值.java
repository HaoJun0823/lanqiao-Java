package 蓝桥Java.算法训练;
import java.util.Scanner;
/*

  算法训练 6-1 递归求二项式系数值  
时间限制：10.0s   内存限制：256.0MB
   
问题描述
样例输入
一个满足题目要求的输入范例。
3 10
样例输出
与上面的样例输入对应的输出。
数据规模和约定
　　输入数据中每一个数的范围。
　　例：结果在int表示时不会溢出。

 */
public class ALGO_150$6_1递归求二项式系数值 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(calc(k, n));
	}

	private static int calc(int k, int n) {
		if (k == 0 || k == n) {
			return 1;
		} else {
			return calc(k, n - 1) + calc(k - 1, n - 1);
		}
	}
}
