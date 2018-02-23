package 蓝桥Java.算法训练;
import java.util.Scanner;
/*

  算法训练 删除数组零元素  
时间限制：1.0s   内存限制：512.0MB
   

从键盘读入n个整数放入数组中，编写函数CompactIntegers，删除数组中所有值为0的元素，其后元素向数组首端移动。注意，CompactIntegers函数需要接受数组及其元素个数作为参数，函数返回值应为删除操作执行后数组的新元素个数。输出删除后数组中元素的个数并依次输出数组元素。

样例输入: （输入格式说明：5为输入数据的个数，3 4 0 0 2 是以空格隔开的5个整数）
5 
3 4 0 0 2
样例输出:（输出格式说明：3为非零数据的个数，3 4 2 是以空格隔开的3个非零整数）
3
3 4 2

样例输入: 
7
0 0 7 0 0 9 0
样例输出:
2
7 9

样例输入: 
3
0 0 0
样例输出:
0


 */
public class ALGO_79$删除数组零元素 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		CompactIntegers(arr, arr.length);

	}

	private static int CompactIntegers(int[] arr, int length) {
		int width = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				width++;
			}
		}
		if(width==0) {System.out.println(0);return width;}
		int arr2[] = new int[width];
		int point = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr2[point]=arr[i];
				point++;
			}
		}
		System.out.println(width);
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		return width;
	}

}
