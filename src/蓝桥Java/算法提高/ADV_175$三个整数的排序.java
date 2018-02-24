package 蓝桥Java.算法提高;

import java.util.Arrays;
import java.util.Scanner;

/*

  算法提高 三个整数的排序  
时间限制：1.0s   内存限制：256.0MB
   
问题描述
　　输入三个数，比较其大小，并从大到小输出。
输入格式
　　一行三个整数。
输出格式
　　一行三个整数，从大到小排序。
样例输入
33 88 77
样例输出
88 77 33

 */
public class ADV_175$三个整数的排序 {
	public static void main(String[] args) {
		int[] arr =new int[3];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			arr[i]=scanner.nextInt();
		}
		Arrays.sort(arr);
		for(int i=2;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
