package ����Java.�㷨ѵ��;


//�㷨ѵ�� 6-2�ݹ�������Ʊ�ʾλ��  
//ʱ�����ƣ�10.0s   �ڴ����ƣ�256.0MB
// 
//��������
//����һ��ʮ�����������������Ӧ�Ķ���������λ�������磬����ʮ������9�����Ӧ�Ķ���������1001�����λ����4��
//��������
//һ��������ĿҪ������뷶����
//9
//�������
//����������������Ӧ�������
//���ݹ�ģ��Լ��
//����������ÿһ�����ķ�Χ��
//����������int��ʾ��Χ�ڡ�
import java.util.Scanner;

public class ALGO_151$6_2�ݹ�������Ʊ�ʾλ�� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dec = scanner.nextInt();
		String bin =  decToBin(dec);
		System.out.println(bin.length());
	}
	
	private static String decToBin(int dec) {
		StringBuffer result = new StringBuffer();
		if(dec<2) {return String.valueOf(dec);}
		int n=0;
		while(dec>=Math.pow(2, n)) {
			
			n++;
		}
		while(dec>=0&&n>=0) {
			if(dec-Math.pow(2, n)<0) {result.append('0');}else {result.append('1');dec-=(int)Math.pow(2, n);}
			n--;
		}
		return result.deleteCharAt(0).toString();
	}
}
