package ����Java.�㷨���;
import java.util.Scanner;
/*
�㷨��� 7-1�ú���������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������
����ʹ�ú�ʵ�ּ�����������Ĺ��ܡ��û�����뾶��ϵͳ������������ʹ�ú�����pi=3.1415926,�����ȷ��С�������λ��
��������
һ��������ĿҪ������뷶����
����
1.0
�������
����������������Ӧ�������
����
���ݹ�ģ��Լ��
��������������ÿһ�����ķ�Χ��
�������ݱ�ʾ����double���͡�

 */
public class ADV_221$7_1�ú��������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();
		System.out.printf("%.5f", (4.0 / 3.0) * 3.1415926 * (r * r * r));
	}
}
