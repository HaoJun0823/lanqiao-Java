package ����Java.�㷨���;
import java.util.Scanner;
/*
  �㷨��� 9-2 �ı�����  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������
�����ȱ�д����EncryptChar,�����������򽫸������ַ�cת�������ܣ�Ϊ�µ��ַ���"A"ת��"B"��"B"ת��Ϊ"C"��... ..."Z"ת��Ϊ"a"��"a"ת��Ϊ"b",... ..., "z"ת��Ϊ"A"�������ַ������ܡ���д���򣬼��ܸ����ַ�����
�������
����������������Ӧ�������
����
���ݹ�ģ��Լ��
��������������ÿһ�����ķ�Χ��
��������50���ַ������޿ո��ַ�����
*/
public class ADV_225$9_2�ı����� {
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
