package ����Java.������ϰ;
import java.util.Scanner;
/*
  ������ϰ ��������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������

����һ������n�����������У�������a�������еĵ�һ�γ����ǵڼ�����
�����ʽ

��һ�а���һ������n��

�ڶ��а���n���Ǹ�������Ϊ���������У������е�ÿ������������10000��

�����а���һ������a��Ϊ�����ҵ�����
�����ʽ
���a�������г����ˣ��������һ�γ��ֵ�λ��(λ�ô�1��ʼ���)���������-1��
��������
6
1 9 4 8 3 9
9
�������
2
���ݹ�ģ��Լ��
1 <= n <= 1000��

 */
public class BASIC_5$�������� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int find = scanner.nextInt();
		scanner.close();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println("-1");
	}
}
