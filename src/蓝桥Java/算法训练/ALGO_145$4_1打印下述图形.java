package ����Java.�㷨ѵ��;
/*

  �㷨ѵ�� 4-1��ӡ����ͼ��  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������
����ʹ��ѭ���ṹ��ӡ����ͼ�Σ���ӡ����n���û����롣��ӡ�ո�ʱʹ��"%s"��ʽ����printf��������ֻ����һ�������ո���ַ���" ",��ͬ��
��������
һ��������ĿҪ������뷶����
����

5
�������
����������������Ӧ�������
����
���ݹ�ģ��Լ��
��������������ÿһ�����ķ�Χ��
��������0<n<20��

 */
import java.util.Scanner;

public class ALGO_145$4_1��ӡ����ͼ�� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int space = num-1;
		int star = 1;
		for (int i = 0; i < num; i++) {
			for(int k=space;k>0;k--) {
				System.out.print(' ');
			}
			for (int j = 0; j < star; j++) {
				System.out.print('*');
			}
			System.out.println();
			star += 2;
			space--;
		}
	}
}
