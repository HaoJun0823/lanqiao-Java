package 蓝桥Java.算法提高;
import java.util.Scanner;
/*

  算法提高 11-2删除重复元素  
时间限制：10.0s   内存限制：256.0MB
   
问题描述
　　为库设计新函数DelPack，删除输入字符串中所有的重复元素。不连续的重复元素也要删除。
　　要求写成函数，函数内部使用指针操作。
样例输入
1223445667889
样例输出
13579
样例输入
else
样例输出
ls
数据规模和约定
　　字符串数组最大长度为100。

 */
public class ADV_227$11_2删除重复元素 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int temp[] = new int[1000];
		for (int i = 0; i < str.length(); i++) {
			temp[str.charAt(i)]++;
		}
		for (int i = 0; i < str.length(); i++) {
			if (temp[str.charAt(i)] == 1) {
				System.out.print(str.charAt(i));
			}
		}
	}
}
