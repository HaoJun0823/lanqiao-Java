package ����Java.�㷨ѵ��;
//�㷨ѵ�� Ѱ�����������ֵ  
//ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
// 
//��������
//���ڸ�����������a[],Ѱ���������ֵ���������±ꡣ
//�����ʽ
//��������a[],����Ԫ�ظ���С��1����100��������ݷ������У���һ��ֻ��һ��������ʾ����Ԫ�ظ������ڶ���Ϊ����ĸ���Ԫ�ء�
//�����ʽ
//������ֵ�������±�
//��������
//
//3
//3 2 1
//
//
//�������
//
//3 0
import java.util.Scanner;
public class ALGO_49$Ѱ�����������ֵ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[scanner.nextInt()];
		arr[0]=scanner.nextInt();
		int p=0;
		for(int i=1;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
			if(arr[i]>arr[p]) {
				p=i;
			}
		}
		System.out.print(arr[p]+" "+p);
	}
}
