package 蓝桥Java.算法训练;
/*

算法训练 4-3水仙花数  
时间限制：1.0s   内存限制：256.0MB
 
问题描述
打印所有100至999之间的水仙花数。所谓水仙花数是指满足其各位数字立方和为该数字本身的整数，例如 153=1^3+5^3+3^3。
样例输入
一个满足题目要求的输入范例。
例：
无
样例输出
153
xxx
xxx

*/
public class ALGO_147$4_3水仙花数 {
	public static void main(String[] args) {
		for (int num = 100; num <= 999; num++) {
			int a = num / 100;
			int b = num % 100 / 10;
			int c = num % 10;
			if (num == a * a * a + b * b * b + c * c * c) {
				System.out.println(num);
			}
		}

	}
}
