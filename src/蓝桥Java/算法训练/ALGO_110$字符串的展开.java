package 蓝桥Java.算法训练;
import java.util.Scanner;
/*
  算法训练 字符串的展开  
时间限制：1.0s   内存限制：256.0MB
   
　　在初赛普及组的“阅读程序写结果”的问题中，我们曾给出一个字符串展开的例子：如果在输入的字符串中，含有类似于“d-h”或者“4-8”的字串，我们就把它当作一种简写，输出时，用连续递增的字母获数字串替代其中的减号，即，将上面两个子串分别输出为“defgh”和“45678”。在本题中，我们通过增加一些参数的设置，使字符串的展开更为灵活。具体约定如下：
　　(1) 遇到下面的情况需要做字符串的展开：在输入的字符串中，出现了减号“-”，减号两侧同为小写字母或同为数字，且按照ASCII码的顺序，减号右边的字符严格大于左边的字符。
　　(2) 参数p1：展开方式。p1=1时，对于字母子串，填充小写字母；p1=2时，对于字母子串，填充大写字母。这两种情况下数字子串的填充方式相同。p1=3时，不论是字母子串还是数字字串，都用与要填充的字母个数相同的星号“*”来填充。
　　(3) 参数p2：填充字符的重复个数。p2=k表示同一个字符要连续填充k个。例如，当p2=3时，子串“d-h”应扩展为“deeefffgggh”。减号两边的字符不变。
　　(4) 参数p3：是否改为逆序：p3=1表示维持原来顺序，p3=2表示采用逆序输出，注意这时候仍然不包括减号两端的字符。例如当p1=1、p2=2、p3=2时，子串“d-h”应扩展为“dggffeeh”。
　　(5) 如果减号右边的字符恰好是左边字符的后继，只删除中间的减号，例如：“d-e”应输出为“de”，“3-4”应输出为“34”。如果减号右边的字符按照ASCII码的顺序小于或等于左边字符，输出时，要保留中间的减号，例如：“d-d”应输出为“d-d”，“3-1”应输出为“3-1”。
输入格式
　　输入包括两行：
　　第1行为用空格隔开的3个正整数，一次表示参数p1，p2，p3。
　　第2行为一行字符串，仅由数字、小写字母和减号“-”组成。行首和行末均无空格。
输出格式
　　输出只有一行，为展开后的字符串。
输入输出样例1
输入
	输出
1 2 1
abcs-w1234-9s-4zz
	abcsttuuvvw1234556677889s-4zz
输入输出样例2
输入
	输出
2 3 2
a-d-d
	aCCCBBBd-d
输入输出样例3
输入
	输出
3 4 2
di-jkstra2-6
	dijkstra2************6
数据规模和约定
　　40%的数据满足：字符串长度不超过5
　　100%的数据满足：1<=p1<=3，1<=p2<=8，1<=p3<=2。字符串长度不超过100

 */
public class ALGO_110$字符串的展开 {
	static int p1, p2, p3;
	static String original;
	static StringBuffer changed = new StringBuffer();
	static String letter = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		p1 = scanner.nextInt();
		p2 = scanner.nextInt();
		p3 = scanner.nextInt();
		original = scanner.next();
		for (int i = 0; i < original.length(); i++) {
			if (original.charAt(i) == '-' && i > 0 && i < original.length() - 1) {
				check(original.charAt(i - 1), original.charAt(i + 1));
			} else {
				changed.append(original.charAt(i));
			}
			// System.err.println(changed);
		}
		System.out.println(changed);
	}

	private static void check(char start, char end) {
		int startNum = getNum(start);
		int endNum = getNum(end);
		if (endNum <= startNum || (getStatus(startNum) != getStatus(endNum))) {
			changed.append("-");
			return;
		}
		if (p3 == 1) {
			for (int i = startNum + 1; i <= endNum - 1; i++) {
				for (int loop = 0; loop < p2; loop++) {
					switch (p1) {

					case 1:
						changed.append(Character.toLowerCase(letter.charAt(i)));
						break;
					case 2:
						changed.append(Character.toUpperCase(letter.charAt(i)));
						break;
					case 3:
						changed.append('*');
						break;
					default:
						changed.append(letter.charAt(i));
						break;
					}
				}
			}
		} else {
			for (int i = endNum - 1; i >= startNum + 1; i--) {
				for (int loop = 0; loop < p2; loop++) {
					switch (p1) {

					case 1:
						changed.append(Character.toLowerCase(letter.charAt(i)));
						break;
					case 2:
						changed.append(Character.toUpperCase(letter.charAt(i)));
						break;
					case 3:
						changed.append('*');
						break;
					default:
						changed.append(letter.charAt(i));
						break;
					}
				}
			}
		}

	}

	private static int getNum(char c) {
		for (int i = 0; i < letter.length(); i++) {
			if (letter.charAt(i) == c) {
				return i;
			}
		}
		return 0;
	}

	private static char getStatus(int num) {
		if (num <= 9) {
			return 'N';
		}
		if (num >= 10 && num <= 35) {
			return 'U';
		}
		if (num >= 36) {
			return 'L';
		}
		return '0';
	}

}
