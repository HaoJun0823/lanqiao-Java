package ����Java.�㷨ѵ��;

//�㷨ѵ�� ��Сдת��  
//ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
// 
//��������
//��дһ����������һ���ַ��������Ȳ�����20����Ȼ�������ַ����ڵ�ÿһ���ַ����д�Сд�任��������д��ĸ���Сд��Сд��ĸ��ɴ�д��Ȼ�������µ��ַ��������
//�����ʽ������һ���ַ�������������ַ�������ֻ����Ӣ����ĸ���������������͵��ַ���Ҳû�пո�
//�����ʽ���������ת������ַ�����
//�����������
//��������
//AeDb
//�������
//aEdB

import java.util.Scanner;

public class ALGO_84$��Сдת�� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] arr = scanner.next().toCharArray();
		for(char c:arr) {
			if(Character.isUpperCase(c)) {
				System.out.print(Character.toLowerCase(c));
			}else {
				System.out.print(Character.toUpperCase(c));
			}
		}
	}
}
