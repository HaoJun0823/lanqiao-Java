package ����Java.�㷨ѵ��;
//�㷨ѵ�� ����  
//ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
// 
//��������
//��дһ����������3��������Ȼ����򽫶��������������մӴ�С�������С�
//�����ʽ������ֻ��һ�У��������������м��ÿո������
//�����ʽ�����ֻ��һ�У��������Ľ����
//�����������
//��������
//9 2 30
//�������
//30 9 2

import java.util.Arrays;
import java.util.Scanner;

public class ALGO_97$���� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();

		}
		Arrays.sort(arr);
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
