package ����Java.�㷨ѵ��;
//�㷨ѵ�� P1101  
//ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
// 
//
//��һ�����������������Ŀ�У���Ʒ����MC�������ۣ�DJ����������SL��������һ���ṹ��prut�����Ա��������������ݡ����������ж���һ��prut���͵Ľṹ�����飬����ÿ��Ԫ�ص�ֵ�����㲢�����������ܽ�
//�����ʽ����һ�������������N(N<100)��������ÿһ����һ���������Ʒ���ǳ��Ȳ�����100���ַ���������Ϊdouble���ͣ�����Ϊ���͡�
//�����ʽ��double���͵��ܽ�
//���룺
//4
//book 12.5 3
//pen 2.5 10
//computer 3200 1
//flower 47 5
//
//�����
//3497.500000
import java.util.Scanner;
public class ALGO_140$P1101 {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			prut[] list = new prut[scanner.nextInt()];
			for(int i=0;i<list.length;i++) {
				list[i]=new prut(scanner.next(),scanner.nextDouble(),scanner.nextInt());
			}
			
			System.out.printf("%.6f\n",prut.count); //��������
	}
}

class prut{
	public String MC;
	public static double count=0;
	public double DJ;
	public int SL;
	public prut(String MC,double DJ,int SL) {
		this.MC=MC;
		this.DJ=DJ;
		this.SL=SL;
		count+=DJ*SL;
	}

}
