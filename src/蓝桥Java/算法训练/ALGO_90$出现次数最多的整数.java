package ����Java.�㷨ѵ��;
import java.util.Scanner;
/*
  �㷨ѵ�� ���ִ�����������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
����?��������
������дһ�����򣬶���һ�����������������ǰ��մ�С�����˳�����еģ����ǵĸ���NҲ�����û�����ģ���಻�ᳬ��20��Ȼ����򽫶�����������ͳ�ƣ��ѳ��ִ��������Ǹ�����Ԫ��ֵ��ӡ���������������Ԫ��ֵ���ֵĴ�����ͬ�������е�һ����ôֻ��ӡ�Ƚ�С���Ǹ�ֵ��
���������ʽ����һ����һ������N��N? ��? 20����������N�У�ÿһ�б�ʾһ�����������Ұ��մ�С�����˳�����С�
���������ʽ�����ֻ��һ�У������ִ��������Ǹ�Ԫ��ֵ��
�����������
��������
5
100
150
150
200
250
�������
150

 */
public class ALGO_90$���ִ����������� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num<=0) {return ;}
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		int countA = 0, numA = 0;
		int countB = 1, numB = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == numB) {
				countB++;
			} else {
				if (countB > countA) {
					countA = countB;
					numA = numB;
				}
				countB = 1;
				numB = arr[i];
			}
		}
		if (countB > countA) {
			countA = countB;
			numA = numB;
		}
		System.out.println(numA);
	}
}
