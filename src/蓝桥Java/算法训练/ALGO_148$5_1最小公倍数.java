package ����Java.�㷨ѵ��;
import java.util.Scanner;
/*

  �㷨ѵ�� 5-1��С������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������
������дһ����lcm������������������С��������
��������
һ��������ĿҪ������뷶����
����

3 5
�������
����������������Ӧ�������
����
���ݹ�ģ��Լ��
��������������ÿһ�����ķ�Χ��
����������������С��65536��

 */
public class ALGO_148$5_1��С������ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(lcm(scanner.nextInt(),scanner.nextInt()));
	}
	
	private static int lcm(int a,int b) {
		if(a==b) {return a;}
		int max = Math.max(a, b);
		while(!(max%a==0&&max%b==0)) {
			max++;
		}
		return max;
	}
}
