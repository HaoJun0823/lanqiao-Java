package ����Java.�㷨���;
import java.util.Scanner;
/*
  �㷨��� Լ������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
��������һ��������N (1
��������
12
�������
6
����˵��
����12��Լ��������1,2,3,4,6,12����6��

 */
public class ADV_98$Լ������ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count=0;
		scanner.close();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
