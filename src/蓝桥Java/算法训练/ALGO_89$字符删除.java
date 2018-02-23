package 蓝桥Java.算法训练;


/*
 * 
  算法训练 字符删除  
时间限制：1.0s   内存限制：512.0MB
   

问题描述
　　编写一个程序，先输入一个字符串str（长度不超过20），再输入单独的一个字符ch，然后程序会把字符串str当中出现的所有的ch字符都删掉，从而得到一个新的字符串str2，然后把这个字符串打印出来。
　　输入格式：输入有两行，第一行是一个字符串（内部没有空格），第二行是一个字符。
　　输出格式：经过处理以后的字符串。
输入输出样例
样例输入
123-45-678
-
样例输出
12345678

 */
import java.util.Scanner;

public class ALGO_89$字符删除 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer strBuff = new StringBuffer("");
		while(scanner.hasNext()) {
		strBuff = new StringBuffer(scanner.nextLine());
		char ch = scanner.nextLine().charAt(0);
		for(int i=0;i<strBuff.length();i++) {
			if(strBuff.charAt(i)==ch) {
				strBuff.deleteCharAt(i);
				i--;
			}
		}
		}
		System.out.println(strBuff);
	}
}
