package 蓝桥Java.算法训练;
import java.util.Scanner;
/*
  算法训练 出现次数最多的整数  
时间限制：1.0s   内存限制：512.0MB
   
　　?问题描述
　　编写一个程序，读入一组整数，这组整数是按照从小到大的顺序排列的，它们的个数N也是由用户输入的，最多不会超过20。然后程序将对这个数组进行统计，把出现次数最多的那个数组元素值打印出来。如果有两个元素值出现的次数相同，即并列第一，那么只打印比较小的那个值。
　　输入格式：第一行是一个整数N，N? ￡? 20；接下来有N行，每一行表示一个整数，并且按照从小到大的顺序排列。
　　输出格式：输出只有一行，即出现次数最多的那个元素值。
输入输出样例
样例输入
5
100
150
150
200
250
样例输出
150

 */
public class ALGO_90$出现次数最多的整数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num<=0) {return ;}
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		int countA = 0, numA = 0;
		int countB = 1, numB = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == numB) {
				countB++;
			} else {
				if (countB > countA) {
					countA = countB;
					numA = numB;
				}
				countB = 1;
				numB = arr[i];
			}
		}
		if (countB > countA) {
			countA = countB;
			numA = numB;
		}
		System.out.println(numA);
	}
}
