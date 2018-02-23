package 蓝桥Java.算法训练;
import java.util.Scanner;

/*

  算法训练 水仙花  
时间限制：1.0s   内存限制：256.0MB
   
　　水仙花数
问题描述
　　判断给定的三位数是否 水仙花 数。所谓 水仙花 数是指其值等于它本身 每位数字立方和的数。例 153 就是一个 水仙花 数。 153=13+53+33
输入格式
　　一个整数。
输出格式
　　是水仙花数,输出"YES",否则输出"NO"(不包括引号)
样例输入
123
样例输出
NO
数据规模和约定
　　一个三位的整数,否则输出"NO"

 */
public class ALGO_126$水仙花 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int a = num / 100;
		int b = num % 100 / 10;
		int c = num % 10;
		if(num==a*a*a+b*b*b+c*c*c) {
			System.out.println("YES");
			return ;
		}
		System.out.println("NO");
	}
}
