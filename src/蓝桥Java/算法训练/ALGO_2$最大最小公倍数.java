package ����Java.�㷨ѵ��;

import java.util.Scanner;

/*
  �㷨ѵ�� �����С������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������

��֪һ��������N���ʴ�1~N����ѡ�������������ǵ���С������������Ϊ���١�
�����ʽ

����һ��������N��
�����ʽ
���һ����������ʾ���ҵ�����С��������
��������
9
�������
504
���ݹ�ģ��Լ��
 */
public class ALGO_2$�����С������ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		scanner.close();
		if(num<=2) {
			System.out.println(num);
			return ;
		}
		if (num % 2 == 1) {
			System.out.println(num*(num-1)*(num-2));
		}else {
			if(num%3==0) {
				System.out.println((num-1)*(num-2)*(num-3));
			}else {
				System.out.println(num*(num-1)*(num-3));
			}
		}
	}
}
