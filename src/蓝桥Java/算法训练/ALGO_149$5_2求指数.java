package ����Java.�㷨ѵ��;


//�㷨ѵ�� 5-2��ָ��  
//ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
// 
//��������
//��֪n��m����ӡn^1��n^2��...��n^m��Ҫ���þ�̬����ʵ�֡�n^m��ʾn��m�η�����֪n��m����ӡn^1��n^2��...��n^m��Ҫ���þ�̬����ʵ�֡�n^m��ʾn��m�η�����ÿ����ʾ5������ÿ������Ϊ12���Ҷ��룩
//��������
//һ��������ĿҪ������뷶����
//����
//3 8
//�������
//����������������Ӧ�������
//����
//���ݹ�ģ��Լ��
//����������ÿһ�����ķ�Χ��
//����n^mС��int �ı�ʾ��Χ��


import java.util.Scanner;

public class ALGO_149$5_2��ָ�� {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int n =scanner.nextInt();
		int m =scanner.nextInt();
		int count=0;
		for(int i=1;i<=m;i++) {
			int result=n;
			for(int j=1;j<i;j++) {
				result*=n;
			}
			System.out.printf("%12d",result);
			if(count==4) {
				count=0;
				System.out.println();
			}else {
				count++;
			}
		}
	}
}
