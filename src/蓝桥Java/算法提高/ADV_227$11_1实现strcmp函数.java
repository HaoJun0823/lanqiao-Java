package ����Java.�㷨���;



/*
  �㷨��� 11-1ʵ��strcmp����  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������
�����Լ�ʵ��һ���Ƚ��ַ�����С�ĺ�����Ҳ��ʵ��strcmp������������int myStrcmp(char *s1,char *s2) ����ASCII˳��Ƚ��ַ���s1��s2����s1��s2��ȷ���0��s1>s2����1��s1<s2����-1��������˵�������ַ���������������ַ���ȣ���ASCIIֵ��С��Ƚϣ���ֱ�����ֲ�ͬ���ַ�����'\0'Ϊֹ��ע��'\0'ֵΪ0��С������ASCII�ַ������磺
����"A"<"B"
����"a">"A"
����"computer">"compare"
����"hello"<"helloworld"
�������
���ݹ�ģ��Լ��
�����ַ�������<100��

 */
import java.util.Scanner;
public class ADV_227$11_1ʵ��strcmp���� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(myStrcmp(scanner.next(), scanner.next()));
	}

	public static int myStrcmp(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return 1;
		} else {
			if (s1.length() == s2.length()) {
				return 0;
			} else {
				return -1;
			}
		}
	}
}
