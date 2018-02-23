package 蓝桥Java.基础练习;
import java.util.Scanner;
/*

  基础练习 十六进制转十进制  
时间限制：1.0s   内存限制：512.0MB
   
问题描述
　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
样例输入
FFFF
样例输出
65535

 */
public class BASIC_11$十六进制转十进制 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String hex = scanner.next();
		scanner.close();
		System.out.println(binToDec(hexToBin(hex)));
	}

	private static String hexToBin(String str) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case '0':
				result.append("0000");
				break;
			case '1':
				result.append("0001");
				break;
			case '2':
				result.append("0010");
				break;
			case '3':
				result.append("0011");
				break;
			case '4':
				result.append("0100");
				break;
			case '5':
				result.append("0101");
				break;
			case '6':
				result.append("0110");
				break;
			case '7':
				result.append("0111");
				break;
			case '8':
				result.append("1000");
				break;
			case '9':
				result.append("1001");
				break;
			case 'A':
				result.append("1010");
				break;
			case 'B':
				result.append("1011");
				break;
			case 'C':
				result.append("1100");
				break;
			case 'D':
				result.append("1101");
				break;
			case 'E':
				result.append("1110");
				break;
			case 'F':
				result.append("1111");
				break;
			default:
				break;
			}
		}
		return result.toString();
	}

	private static String binToDec(String str) {

		Long result = new Long(0);
		int i = str.length() - 1;
		int n = 0;

		while (i >= 0) {
			if (str.charAt(i) == '1') {
				result += (long) Math.pow(2, n);
			}
			i--;
			n++;
		}
		return result.toString();
	}

}
