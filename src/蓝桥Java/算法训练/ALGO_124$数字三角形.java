package ����Java.�㷨ѵ��;
//�㷨ѵ�� ����������  
//ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
// 
//��������
//��ͼ��.��������ʾ����һ�����������Ρ� ���һ���������Ӷ����׵�ĳ����һ��·
//����ʹ��·�������������ֵ��ܺ����
//��ÿһ��������б�����»���б�������ߣ�
//��1��������������100��
//���������е�����Ϊ����0��1����99��
//
//
//.
//��ͼ��.��������
//�����ʽ
//�ļ������ȶ������������ε�������
//
//��������������������
//�����ʽ
//����ܺͣ�������
//��������
//5
//7
//3 8
//8 1 0
//2 7 4 4
//4 5 2 6 5
//�������
//30

import java.util.Scanner;

public class ALGO_124$���������� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n + 2][n + 2];
		for (int x = 1; x <= n; x++) {
			for (int y = 1; y <= x; y++) {
				arr[x][y] = scanner.nextInt();
			}
		}
		for (int x = n; x > 0; x--) {
			for (int y = 1; y <= x; y++) {
				arr[x-1][y]+=Math.max(arr[x][y], arr[x][y+1]);
			}
		}		
		System.out.println(arr[1][1]);
		
//		 for(int x=1;x<=n;x++) {
//		 for(int y=1;y<=x;y++) {
//		 System.out.print(arr[x][y]+" ");
//		 }
//		 System.out.println();
//		 }
	}
}
