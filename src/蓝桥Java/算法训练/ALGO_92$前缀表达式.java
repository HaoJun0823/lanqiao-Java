package ����Java.�㷨ѵ��;
import java.util.Scanner;
/*
  �㷨ѵ�� ǰ׺���ʽ  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
��������
������дһ���������ַ�����ʽ����һ��ǰ׺���ʽ��Ȼ���������ֵ�������ʽΪ��������� ����1 ����2�������У������Ϊ��+�����ӷ�������-��������������*�����˷�����/�������������������Ϊ������10������������֮����һ���ո������Ҫ�󣺶��ڼӡ������ˡ������������㣬�ֱ������Ӧ�ĺ�����ʵ�֡�
���������ʽ������ֻ��һ�У���һ��ǰ׺���ʽ�ַ�����
���������ʽ�������Ӧ�ļ�����������ǳ�����ֱ�Ӳ���c���Եġ�/������������Ϊ��������
���������������
��������
+ 5 2
�������
7

 */
public class ALGO_92$ǰ׺���ʽ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char c  = scanner.next().charAt(0);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(check(c,a,b));
	}
	private static Object check(char c,int a,int b) {
		switch(c) {
		case '+':
			return add(a,b);
		case '-':
			return sub(a,b);
		case '*':
			return mul(a,b);
		case '/':
			return div(a,b);
		default:
			return "0";
		}
	}
	
	private static int add(int a,int b) {
		return a+b;
	}
	private static int sub(int a,int b){
		return a-b;
	}
	
	private static int mul(int a,int b) {
		return a*b;
	}
	
	private static int div(int a,int b) {
		return a/b;
	}
}
