package ����Java.������ϰ;
import java.util.Scanner;
/*
  ������ϰ ʱ��ת��  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
��������
��������һ������Ϊ��λ��ʱ��t��Ҫ���á�<H>:<M>:<S>���ĸ�ʽ����ʾ���ʱ�䡣<H>��ʾʱ�䣬<M>��ʾ���ӣ���<S>��ʾ�룬���Ƕ���������û��ǰ���ġ�0�������磬��t=0����Ӧ����ǡ�0:0:0������t=3661���������1:1:1����
�����ʽ
��������ֻ��һ�У���һ������t��0<=t<=86399����
�����ʽ
�������ֻ��һ�У����ԡ�<H>:<M>:<S>���ĸ�ʽ����ʾ��ʱ�䣬���������š�
��������
0
�������
0:0:0
��������
5436
�������
1:30:36

 */
public class BASIC_14$ʱ��ת�� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		scanner.close();
		int hour = time / 3600;
		int minute = time % 3600/60;
		int second = time % 60;
		System.out.printf("%d:%d:%d", hour, minute, second);
	}
}
