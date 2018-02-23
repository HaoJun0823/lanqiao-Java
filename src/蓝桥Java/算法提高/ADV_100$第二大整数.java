package 蓝桥Java.算法提高;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*

  算法提高 第二大整数  
时间限制：1.0s   内存限制：512.0MB
   
问题描述
　　编写一个程序，读入一组整数（不超过20个），当用户输入0时，表示输入结束。然后程序将从这组整数中，把第二大的那个整数找出来，并把它打印出来。说明：（1）0表示输入结束，它本身并不计入这组整数中。（2）在这组整数中，既有正数，也可能有负数。（3）这组整数的个数不少于2个。
　　输入格式：输入只有一行，包括若干个整数，中间用空格隔开，最后一个整数为0。
　　输出格式：输出第二大的那个整数。
　　输入输出样例
样例输入
5 8 -12 7 0
样例输出
7

 */
public class ADV_100$第二大整数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (true) {
			int num = scanner.nextInt();
			if (num == 0) {
				break;
			} else {
				list.add(num);
			}
		}
		Collections.sort(list);
		for (int i = list.size() - 1; i > 0; i--) {
			if (list.get(i) != list.get(i - 1)) {
				System.out.println(list.get(i - 1));
				return;
			}
		}
		System.out.println(list.get(0));
	}
}
