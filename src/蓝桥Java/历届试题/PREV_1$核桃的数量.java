package ����Java.��������;
import java.util.Scanner;
/*
  �������� ���ҵ�����  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������

С���������Ŀ����������3�������顣���ڽ������춼�ڼӰ��ء�Ϊ����ʿ����С�Ŵ����ÿ���鷢һ�����ң��ݴ����ܲ��ԣ�������Ҫ���ǣ�

1. ����ĺ�������������ͬ

2. �����ڱ�����ƽ�ֺ��ң���Ȼ�ǲ��ܴ���ģ�

3. �����ṩ����1,2��������С��������Լ�ָ����
�����ʽ
�����������������a, b, c����ʾÿ�������ڼӰ���������ÿո�ֿ���a,b,c<30��
�����ʽ
���һ������������ʾÿ�����ҵ�������
��������1
2 4 5
�������1
20
��������2
3 1 1
�������2
3

 */
public class PREV_1$���ҵ����� {
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	int start = Math.max(a, Math.max(b, c));
	while(true) {
	if(start%a==0&&start%b==0&&start%c==0) {
			break;
		}
		start++;
	}
	System.out.println(start);
	}
}
