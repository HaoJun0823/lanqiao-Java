package 蓝桥Java.基础练习;
/*

  基础练习 回文数  
时间限制：1.0s   内存限制：512.0MB
   
问题描述
　　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
输出格式
　　按从小到大的顺序输出满足条件的四位十进制数。

 */
public class BASIC_8$回文数 {
	public static void main(String[] args) {
		for (int i = 1000; i <= 9999; i++) {
			if (i / 1000 == i % 10) {
				if (i % 1000 / 100 == i % 100 / 10) {
					System.out.println(i);
				}
			}
		}
	}
}
