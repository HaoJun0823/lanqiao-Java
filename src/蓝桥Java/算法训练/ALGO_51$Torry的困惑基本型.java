package ����Java.�㷨ѵ��;
import java.math.BigInteger;
import java.util.Scanner;
/*
  �㷨ѵ�� Torry������(������)  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
��������
����Torry��Сϲ����ѧ��һ�죬��ʦ����������2��3��5��7����������������������TorryͻȻ�뵽һ�����⣬ǰ10��100��1000��10000�����������ĳ˻��Ƕ����أ�����������������ʦ����ʦ�ס�ˣ�һʱ�ش𲻳���������Torry�����ڻ��̵��㣬�������ǰn�������ĳ˻������������ǵ���ŽӴ���̲��ã�TorryֻҪ����������ģ��50000��ֵ��
�����ʽ
����������һ��������n������n<=100000��
�����ʽ
�������һ�У���ǰn�������ĳ˻�ģ50000��ֵ��
��������

1


�������

2
 */
public class ALGO_51$Torry����������� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		BigInteger bi = new BigInteger("1");
		scanner.close();
		int count=2;
		
		while(num>0) {
			for(int i=2;i<count;i++) {
				if(count%i==0) {
					count++;i=2;continue;
				}
			}
			bi = bi.multiply(new BigInteger(String.valueOf(count)));
			count++;
			num--;
			
		}
		System.out.println(bi.mod(new BigInteger("50000")));
	}
}
