package 蓝桥Java.算法训练;
//算法训练 数字三角形  
//时间限制：1.0s   内存限制：256.0MB
// 
//问题描述
//（图３.１－１）示出了一个数字三角形。 请编一个程序计算从顶至底的某处的一条路
//径，使该路径所经过的数字的总和最大。
//●每一步可沿左斜线向下或右斜线向下走；
//●1＜三角形行数≤100；
//●三角形中的数字为整数0，1，…99；
//
//
//.
//（图３.１－１）
//输入格式
//文件中首先读到的是三角形的行数。
//
//接下来描述整个三角形
//输出格式
//最大总和（整数）
//样例输入
//5
//7
//3 8
//8 1 0
//2 7 4 4
//4 5 2 6 5
//样例输出
//30

import java.util.Scanner;

public class ALGO_124$数字三角形 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n + 2][n + 2];
		for (int x = 1; x <= n; x++) {
			for (int y = 1; y <= x; y++) {
				arr[x][y] = scanner.nextInt();
			}
		}
		for (int x = n; x > 0; x--) {
			for (int y = 1; y <= x; y++) {
				arr[x-1][y]+=Math.max(arr[x][y], arr[x][y+1]);
			}
		}		
		System.out.println(arr[1][1]);
		
//		 for(int x=1;x<=n;x++) {
//		 for(int y=1;y<=x;y++) {
//		 System.out.print(arr[x][y]+" ");
//		 }
//		 System.out.println();
//		 }
	}
}
