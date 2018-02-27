package 蓝桥Java.算法训练;


//算法训练 5-2求指数  
//时间限制：1.0s   内存限制：256.0MB
// 
//问题描述
//已知n和m，打印n^1，n^2，...，n^m。要求用静态变量实现。n^m表示n的m次方。已知n和m，打印n^1，n^2，...，n^m。要求用静态变量实现。n^m表示n的m次方。（每行显示5个数，每个数宽为12，右对齐）
//样例输入
//一个满足题目要求的输入范例。
//例：
//3 8
//样例输出
//与上面的样例输入对应的输出。
//例：
//数据规模和约定
//输入数据中每一个数的范围。
//例：n^m小于int 的表示范围。


import java.util.Scanner;

public class ALGO_149$5_2求指数 {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int n =scanner.nextInt();
		int m =scanner.nextInt();
		int count=0;
		for(int i=1;i<=m;i++) {
			int result=n;
			for(int j=1;j<i;j++) {
				result*=n;
			}
			System.out.printf("%12d",result);
			if(count==4) {
				count=0;
				System.out.println();
			}else {
				count++;
			}
		}
	}
}
