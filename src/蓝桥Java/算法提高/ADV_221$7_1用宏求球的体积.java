package 蓝桥Java.算法提高;
import java.util.Scanner;
/*
算法提高 7-1用宏求球的体积  
时间限制：1.0s   内存限制：256.0MB
   
问题描述
　　使用宏实现计算球体体积的功能。用户输入半径，系统输出体积。不能使用函数，pi=3.1415926,结果精确到小数点后五位。
样例输入
一个满足题目要求的输入范例。
例：
1.0
样例输出
与上面的样例输入对应的输出。
例：
数据规模和约定
　　输入数据中每一个数的范围。
　　数据表示采用double类型。

 */
public class ADV_221$7_1用宏求球的体积 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();
		System.out.printf("%.5f", (4.0 / 3.0) * 3.1415926 * (r * r * r));
	}
}
