package ����Java.�㷨ѵ��;
/*

  �㷨ѵ�� ͼ����ʾ  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
��������
������дһ��������������һ������������5��Ȼ������Ļ����ʾ���µ�ͼ�Σ�5��ʾ��������
����* * * * *
����* * * *
����* * *
����* *
����*

 */
import java.util.Scanner;

public class ALGO_101$ͼ����ʾ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=num;i>0;i--) {
			for(int j=0;j<i-1;j++) {
				System.out.print("* ");
			}
			System.out.println('*');
		}
	}
}
