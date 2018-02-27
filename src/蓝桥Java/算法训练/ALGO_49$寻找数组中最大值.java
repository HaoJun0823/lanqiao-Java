package 蓝桥Java.算法训练;
//算法训练 寻找数组中最大值  
//时间限制：1.0s   内存限制：512.0MB
// 
//问题描述
//对于给定整数数组a[],寻找其中最大值，并返回下标。
//输入格式
//整数数组a[],数组元素个数小于1等于100。输出数据分作两行：第一行只有一个数，表示数组元素个数；第二行为数组的各个元素。
//输出格式
//输出最大值，及其下标
//样例输入
//
//3
//3 2 1
//
//
//样例输出
//
//3 0
import java.util.Scanner;
public class ALGO_49$寻找数组中最大值 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[scanner.nextInt()];
		arr[0]=scanner.nextInt();
		int p=0;
		for(int i=1;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
			if(arr[i]>arr[p]) {
				p=i;
			}
		}
		System.out.print(arr[p]+" "+p);
	}
}
