package ����Java.�㷨ѵ��;
import java.util.Scanner;

/*

  �㷨ѵ�� ˮ�ɻ�  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
����ˮ�ɻ���
��������
�����жϸ�������λ���Ƿ� ˮ�ɻ� ������ν ˮ�ɻ� ����ָ��ֵ���������� ÿλ���������͵������� 153 ����һ�� ˮ�ɻ� ���� 153=13+53+33
�����ʽ
����һ��������
�����ʽ
������ˮ�ɻ���,���"YES",�������"NO"(����������)
��������
123
�������
NO
���ݹ�ģ��Լ��
����һ����λ������,�������"NO"

 */
public class ALGO_126$ˮ�ɻ� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int a = num / 100;
		int b = num % 100 / 10;
		int c = num % 10;
		if(num==a*a*a+b*b*b+c*c*c) {
			System.out.println("YES");
			return ;
		}
		System.out.println("NO");
	}
}
