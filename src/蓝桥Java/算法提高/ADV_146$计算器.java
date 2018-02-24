package 蓝桥Java.算法提高;
/*
  算法提高 计算器  
时间限制：1.0s   内存限制：256.0MB
   
【问题描述】
　　王小二的计算器上面的LED显示屏坏掉了，于是他找到了在计算器维修与应用系学习的你来为他修计算器。
　　屏幕上可以显示0~9的数字，其中每个数字由7个小二极管组成，各个数字对应的表示方式如图所示：

　　。

　　为了排除电路故障，现在你需要计算，将数字A变为数字B需要经过多少次变换？
　　注意：现在将其中每段小二极管的开和关都定义为一次变换。例如数字1变为2是5次操作。

【输入格式】
　　第一行为一个正整数L，表示数码的长度。
　　接下来两行是两个长度为L的数字A和B，表示要把数字A变成数字B（数字可以以0开头）。
【输出格式】
　　一行一个整数，表示这些小二极管一共要变换多少次。
【样例输入1】

　　3
　　101
　　025
【样例输出1】
　　12
【样例输入2】

　　8
　　19920513
　　20111211
【样例输出2】
　　27

【数据范围】
　　L<=100

 */
import java.util.Scanner;

public class ADV_146$计算器 {
	static String[] image = {
			"1111110",
			"0011000",
			"0110111",
			"0111101",
			"1011001",
			"1101101",
			"1101111",
			"0111000",
			"1111111",
			"1111101"
	};

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		scanner.nextInt();
		int count = 0;
		String s1 = scanner.next();
		String s2 = scanner.next();
		for(int i=0;i<s1.length();i++) {
			int n1 = Integer.parseInt(String.valueOf(s1.charAt(i)));
			int n2 = Integer.parseInt(String.valueOf(s2.charAt(i)));
			for(int j=0;j<7;j++) {
				if(image[n1].charAt(j)!=image[n2].charAt(j)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
