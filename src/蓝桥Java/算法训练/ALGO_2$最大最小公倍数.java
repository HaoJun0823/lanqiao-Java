package 蓝桥Java.算法训练;

import java.util.Scanner;

/*
  算法训练 最大最小公倍数  
时间限制：1.0s   内存限制：256.0MB
   
问题描述

已知一个正整数N，问从1~N中任选出三个数，他们的最小公倍数最大可以为多少。
输入格式

输入一个正整数N。
输出格式
输出一个整数，表示你找到的最小公倍数。
样例输入
9
样例输出
504
数据规模与约定
 */
public class ALGO_2$最大最小公倍数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		scanner.close();
		if(num<=2) {
			System.out.println(num);
			return ;
		}
		if (num % 2 == 1) {
			System.out.println(num*(num-1)*(num-2));
		}else {
			if(num%3==0) {
				System.out.println((num-1)*(num-2)*(num-3));
			}else {
				System.out.println(num*(num-1)*(num-3));
			}
		}
	}
}
