package 蓝桥Java.算法提高;
import java.util.Scanner;
/*
  算法提高 9-2 文本加密  
时间限制：1.0s   内存限制：256.0MB
   
问题描述
　　先编写函数EncryptChar,按照下述规则将给定的字符c转化（加密）为新的字符："A"转化"B"，"B"转化为"C"，... ..."Z"转化为"a"，"a"转化为"b",... ..., "z"转化为"A"，其它字符不加密。编写程序，加密给定字符串。
样例输出
与上面的样例输入对应的输出。
例：
数据规模和约定
　　输入数据中每一个数的范围。
　　例：50个字符以内无空格字符串。
*/
public class ADV_225$9_2文本加密 {
	static String lib = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(EncryptChar(scanner.next()));

	}

	private static String EncryptChar(String str) {
		StringBuffer strBuff = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			boolean not = true;
			if (str.charAt(i) == 'z') {
				strBuff.append('A');
				continue;
			} else {
				for (int x = 0; x < lib.length(); x++) {
					if (str.charAt(i) == lib.charAt(x)) {
						strBuff.append(lib.charAt(x + 1));
						not = false;
						break;
					}

				}
				
				
			}
			if(not) {strBuff.append(str.charAt(i));not=false;}
		}
		return strBuff.toString();
	}

}
