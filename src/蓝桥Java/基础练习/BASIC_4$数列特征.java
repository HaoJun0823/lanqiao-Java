package ����Java.������ϰ;
import java.util.Scanner;
/*
  ������ϰ ��������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������

����n�������ҳ���n���������ֵ����Сֵ���͡�
�����ʽ

��һ��Ϊ����n����ʾ���ĸ�����

�ڶ�����n������Ϊ������n������ÿ�����ľ���ֵ��С��10000��
�����ʽ
������У�ÿ��һ����������һ�б�ʾ��Щ���е����ֵ���ڶ��б�ʾ��Щ���е���Сֵ�������б�ʾ��Щ���ĺ͡�
��������
5
1 3 -2 4 5
�������
5
-2
11
���ݹ�ģ��Լ��
1 <= n <= 10000��

 */
public class BASIC_4$�������� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		int max=arr[0],min=arr[0],sum=0;
		for(int i:arr) {
			max=max>i?max:i;
			min=min>i?i:min;
			sum+=i;
		}
		System.out.printf("%d\n%d\n%d\n", max,min,sum);
	}
}
