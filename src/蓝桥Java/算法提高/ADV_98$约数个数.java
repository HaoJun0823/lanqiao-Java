package 蓝桥Java.算法提高;
import java.util.Scanner;
/*
  算法提高 约数个数  
时间限制：1.0s   内存限制：512.0MB
   
　　输入一个正整数N (1
样例输入
12
样例输出
6
样例说明
　　12的约数包括：1,2,3,4,6,12。共6个

 */
public class ADV_98$约数个数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count=0;
		scanner.close();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
