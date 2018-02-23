package 蓝桥Java.基础练习;
import java.util.Scanner;
/*
  基础练习 杨辉三角形  
时间限制：1.0s   内存限制：256.0MB
   
问题描述

杨辉三角形又称Pascal三角形，它的第i+1行是(a+b)i的展开式的系数。
　　

它的一个重要性质是：三角形中的每个数字等于它两肩上的数字相加。
　　

下面给出了杨辉三角形的前4行：
　　

   1
　　

  1 1
　　

 1 2 1
　　

1 3 3 1
　　

给出n，输出它的前n行。
输入格式

输入包含一个数n。
输出格式
输出杨辉三角形的前n行。每一行从这一行的第一个数开始依次输出，中间使用一个空格分隔。请不要在前面输出多余的空格。
样例输入
4
样例输出
1
1 1
1 2 1
1 3 3 1
数据规模与约定
1 <= n <= 34。

 */
public class BASIC_6$杨辉三角形 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[scanner.nextInt()][];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];
			
		}
		arr[0][0]=1;
		arr[1][0]=1;
		arr[1][1]=1;
		for(int row=2;row<arr.length;row++) {
			for(int column=0;column<arr[row].length;column++) {
				if(column==0||column==arr[row].length-1) {
					arr[row][column]=1;
				}else {
					arr[row][column]=arr[row-1][column-1]+arr[row-1][column];
				}
			}
		}
		
		for(int row=0;row<arr.length;row++) {
			for(int column=0;column<arr[row].length;column++) {
				System.out.print(arr[row][column]+" ");
			}
			System.out.println();
		}
	}
}
