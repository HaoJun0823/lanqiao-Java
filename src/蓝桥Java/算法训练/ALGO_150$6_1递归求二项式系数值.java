package ����Java.�㷨ѵ��;
import java.util.Scanner;
/*

  �㷨ѵ�� 6-1 �ݹ������ʽϵ��ֵ  
ʱ�����ƣ�10.0s   �ڴ����ƣ�256.0MB
   
��������
��������
һ��������ĿҪ������뷶����
3 10
�������
����������������Ӧ�������
���ݹ�ģ��Լ��
��������������ÿһ�����ķ�Χ��
�������������int��ʾʱ���������

 */
public class ALGO_150$6_1�ݹ������ʽϵ��ֵ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(calc(k, n));
	}

	private static int calc(int k, int n) {
		if (k == 0 || k == n) {
			return 1;
		} else {
			return calc(k, n - 1) + calc(k - 1, n - 1);
		}
	}
}
