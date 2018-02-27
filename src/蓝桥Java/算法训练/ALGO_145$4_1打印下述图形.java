package 蓝桥Java.算法训练;
/*

  算法训练 4-1打印下述图形  
时间限制：1.0s   内存限制：256.0MB
   
问题描述
　　使用循环结构打印下述图形，打印行数n由用户输入。打印空格时使用"%s"格式，向printf函数传递只包含一个或多个空格的字符串" ",下同。
样例输入
一个满足题目要求的输入范例。
例：

5
样例输出
与上面的样例输入对应的输出。
例：
数据规模和约定
　　输入数据中每一个数的范围。
　　例：0<n<20。

 */
import java.util.Scanner;

public class ALGO_145$4_1打印下述图形 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int space = num-1;
		int star = 1;
		for (int i = 0; i < num; i++) {
			for(int k=space;k>0;k--) {
				System.out.print(' ');
			}
			for (int j = 0; j < star; j++) {
				System.out.print('*');
			}
			System.out.println();
			star += 2;
			space--;
		}
	}
}
