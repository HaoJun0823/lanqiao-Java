package 蓝桥Java.算法训练;
import java.util.Scanner;
/*
  算法训练 P0103  
时间限制：1.0s   内存限制：256.0MB
   
　　﻿
　　从键盘输入一个大写字母，要求改用小写字母输出。
输入
　　A
输出
　　a

 */
public class ALGO_161$P0103 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println(Character.toLowerCase(scanner.next().charAt(0)));
	}
}
