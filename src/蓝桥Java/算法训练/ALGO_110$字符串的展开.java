package ����Java.�㷨ѵ��;
import java.util.Scanner;
/*
  �㷨ѵ�� �ַ�����չ��  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
�����ڳ����ռ���ġ��Ķ�����д������������У�����������һ���ַ���չ�������ӣ������������ַ����У����������ڡ�d-h�����ߡ�4-8�����ִ������ǾͰ�������һ�ּ�д�����ʱ����������������ĸ�����ִ�������еļ��ţ����������������Ӵ��ֱ����Ϊ��defgh���͡�45678�����ڱ����У�����ͨ������һЩ���������ã�ʹ�ַ�����չ����Ϊ������Լ�����£�
����(1) ��������������Ҫ���ַ�����չ������������ַ����У������˼��š�-������������ͬΪСд��ĸ��ͬΪ���֣��Ұ���ASCII���˳�򣬼����ұߵ��ַ��ϸ������ߵ��ַ���
����(2) ����p1��չ����ʽ��p1=1ʱ��������ĸ�Ӵ������Сд��ĸ��p1=2ʱ��������ĸ�Ӵ�������д��ĸ������������������Ӵ�����䷽ʽ��ͬ��p1=3ʱ����������ĸ�Ӵ����������ִ���������Ҫ������ĸ������ͬ���Ǻš�*������䡣
����(3) ����p2������ַ����ظ�������p2=k��ʾͬһ���ַ�Ҫ�������k�������磬��p2=3ʱ���Ӵ���d-h��Ӧ��չΪ��deeefffgggh�����������ߵ��ַ����䡣
����(4) ����p3���Ƿ��Ϊ����p3=1��ʾά��ԭ��˳��p3=2��ʾ�������������ע����ʱ����Ȼ�������������˵��ַ������統p1=1��p2=2��p3=2ʱ���Ӵ���d-h��Ӧ��չΪ��dggffeeh����
����(5) ��������ұߵ��ַ�ǡ��������ַ��ĺ�̣�ֻɾ���м�ļ��ţ����磺��d-e��Ӧ���Ϊ��de������3-4��Ӧ���Ϊ��34������������ұߵ��ַ�����ASCII���˳��С�ڻ��������ַ������ʱ��Ҫ�����м�ļ��ţ����磺��d-d��Ӧ���Ϊ��d-d������3-1��Ӧ���Ϊ��3-1����
�����ʽ
��������������У�
������1��Ϊ�ÿո������3����������һ�α�ʾ����p1��p2��p3��
������2��Ϊһ���ַ������������֡�Сд��ĸ�ͼ��š�-����ɡ����׺���ĩ���޿ո�
�����ʽ
�������ֻ��һ�У�Ϊչ������ַ�����
�����������1
����
	���
1 2 1
abcs-w1234-9s-4zz
	abcsttuuvvw1234556677889s-4zz
�����������2
����
	���
2 3 2
a-d-d
	aCCCBBBd-d
�����������3
����
	���
3 4 2
di-jkstra2-6
	dijkstra2************6
���ݹ�ģ��Լ��
����40%���������㣺�ַ������Ȳ�����5
����100%���������㣺1<=p1<=3��1<=p2<=8��1<=p3<=2���ַ������Ȳ�����100

 */
public class ALGO_110$�ַ�����չ�� {
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
