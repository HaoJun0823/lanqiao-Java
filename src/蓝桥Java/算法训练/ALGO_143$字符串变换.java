package 蓝桥Java.算法训练;
//算法训练 字符串变换  
//时间限制：1.0s   内存限制：256.0MB
// 
//问题描述
//相信经过这个学期的编程训练，大家对于字符串的操作已经掌握的相当熟练了。今天，徐老师想测试一下大家对于字符串操作的掌握情况。徐老师自己定义了1,2,3,4,5这5个参数分别指代不同的5种字符串操作，你需要根据传入的参数，按照徐老师的规定，对输入字符串进行格式转化。
//徐老师指定的操作如下：
//1 表示全部转化为大写字母输出，如abC 变成 ABC
//2 表示全部转换为小写字母输出，如abC变成abc
//3 表示将字符串整个逆序输出，如 abc 变成 cba
//4 表示将字符串中对应的大写字母转换为小写字母，而将其中的小写字母转化为大写字母输出，如 abC变成ABc
//5表示将全部转换为小写字母，并将其中所有的连续子串转换为对应的缩写形式输出，比如abcD 转换为a-d，其次，-至少代表1个字母，既如果是ab，则不需要转换为缩写形式。
//输入格式
//一共一行，分别是指代对应操作的数字和字符串，两者以空格分隔，字符串全部由英文字母组成
//输出格式
//输出根据上述规则转换后对应的字符串
//样例输入
//5 ABcdEE
//样例输出
//a-ee
//数据规模和约定
//输入字符串长度最长为200。

import java.util.Scanner;

public class ALGO_143$字符串变换 {
	static char[] str;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		str = scanner.next().toCharArray();
		switch(num) {
		case 1:
			for(char c:str) {
				System.out.print(Character.toUpperCase(c));
			}
			break;
		case 2:
			for(char c:str) {
				System.out.print(Character.toLowerCase(c));
			}
			break;
		case 3:
			for(int i=str.length-1;i>=0;i--) {
				System.out.print(str[i]);
			}
			break;
		case 4:
			for(char c:str) {
				if(Character.isUpperCase(c)) {
					System.out.print(Character.toLowerCase(c));
				}else {
					System.out.print(Character.toUpperCase(c));
				}
			}
			break;
		case 5:
			for(int i=0;i<str.length;i++) {
					System.out.print(Character.toLowerCase(str[i]));
					int j=1;
					int count=0;
					while(j+i<str.length) {
						if(Character.toLowerCase(str[i+j])==Character.toLowerCase(str[i]+j)) {
							count++;
							j++;
						}else {
							break;
						}
					}
					switch(count) {
					case 0:
						break;
					case 1:
						break;
					default:
						i+=j-1;
						System.out.print("-"+Character.toLowerCase(str[i]));
						break;
					}
			}
			break;
		}
	}
	


}
