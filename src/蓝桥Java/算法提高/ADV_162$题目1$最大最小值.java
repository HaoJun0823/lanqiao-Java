package ����Java.�㷨���;
/*

  �㷨��� ��Ŀ1 �����Сֵ  
ʱ�����ƣ�1.0s   �ڴ����ƣ�1.0GB
   
��������
�������� N �������������ҳ��� N �����������Ǹ�����С���Ǹ���
�����ʽ
������һ�а���һ�������� N ��(1 �� N �� 10000)��
�����ڶ���Ϊ N ���ÿո����������,ÿ�����ľ���ֵ������ 1000000��
�����ʽ
���������һ��,������������ x,y��x ��ʾ N �����е����ֵ��y ��ʾ N �����е���Сֵ��x,y ֮����һ���ո������
��������
4
2 0 1 2
�������
2 0

 */
import java.util.Scanner;

public class ADV_162$��Ŀ1$�����Сֵ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int loop = scanner.nextInt();
		int temp=scanner.nextInt();
		int max=temp,min=temp;
		for(int i=1;i<loop;i++) {
			max=Math.max(max, temp);
			min=Math.min(min, temp);
			temp=scanner.nextInt();
		}
		System.out.println(max+" "+min);
		
	}
}
