package ����Java.�㷨ѵ��;


/*
 * 
  �㷨ѵ�� �ַ�ɾ��  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   

��������
������дһ������������һ���ַ���str�����Ȳ�����20���������뵥����һ���ַ�ch��Ȼ��������ַ���str���г��ֵ����е�ch�ַ���ɾ�����Ӷ��õ�һ���µ��ַ���str2��Ȼ�������ַ�����ӡ������
���������ʽ�����������У���һ����һ���ַ������ڲ�û�пո񣩣��ڶ�����һ���ַ���
���������ʽ�����������Ժ���ַ�����
�����������
��������
123-45-678
-
�������
12345678

 */
import java.util.Scanner;

public class ALGO_89$�ַ�ɾ�� {
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
