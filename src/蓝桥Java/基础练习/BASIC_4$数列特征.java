package 蓝桥Java.基础练习;
import java.util.Scanner;
/*
  基础练习 数列特征  
时间限制：1.0s   内存限制：256.0MB
   
问题描述

给出n个数，找出这n个数的最大值，最小值，和。
输入格式

第一行为整数n，表示数的个数。

第二行有n个数，为给定的n个数，每个数的绝对值都小于10000。
输出格式
输出三行，每行一个整数。第一行表示这些数中的最大值，第二行表示这些数中的最小值，第三行表示这些数的和。
样例输入
5
1 3 -2 4 5
样例输出
5
-2
11
数据规模与约定
1 <= n <= 10000。

 */
public class BASIC_4$数列特征 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		int max=arr[0],min=arr[0],sum=0;
		for(int i:arr) {
			max=max>i?max:i;
			min=min>i?i:min;
			sum+=i;
		}
		System.out.printf("%d\n%d\n%d\n", max,min,sum);
	}
}
