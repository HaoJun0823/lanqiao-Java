package ����Java.�㷨ѵ��;
/*

�㷨ѵ�� 4-3ˮ�ɻ���  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
 
��������
��ӡ����100��999֮���ˮ�ɻ�������νˮ�ɻ�����ָ�������λ����������Ϊ�����ֱ�������������� 153=1^3+5^3+3^3��
��������
һ��������ĿҪ������뷶����
����
��
�������
153
xxx
xxx

*/
public class ALGO_147$4_3ˮ�ɻ��� {
	public static void main(String[] args) {
		for (int num = 100; num <= 999; num++) {
			int a = num / 100;
			int b = num % 100 / 10;
			int c = num % 10;
			if (num == a * a * a + b * b * b + c * c * c) {
				System.out.println(num);
			}
		}

	}
}
