package ����Java.�㷨���;

import java.util.Arrays;
import java.util.Scanner;

/*

  �㷨��� ��������������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������
�����������������Ƚ����С�����Ӵ�С�����
�����ʽ
����һ������������
�����ʽ
����һ�������������Ӵ�С����
��������
33 88 77
�������
88 77 33

 */
public class ADV_175$�������������� {
	public static void main(String[] args) {
		int[] arr =new int[3];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			arr[i]=scanner.nextInt();
		}
		Arrays.sort(arr);
		for(int i=2;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
