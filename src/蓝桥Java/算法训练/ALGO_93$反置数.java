package ����Java.�㷨ѵ��;
/*
  �㷨ѵ�� ������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
��������
����һ�������ġ���������ָ���ǰѸ�������ÿһλ���ֵ�˳��ߵ��������õ�����һ�����������һ��������ĩβ����0��β����ô�����ķ��������У���Щ0�ͱ�ʡ�Ե��ˡ�����˵��1245�ķ�������5421����1200�ķ�������21�����дһ��������������������Ȼ����������������ķ�����֮��sum��Ȼ���ٰ�sum�ķ�������ӡ������Ҫ�������ڱ�������Ҫ���ȥ����һ�������ķ���������˱�����ⲿ�ִ������Ϊһ����������ʽ��
���������ʽ������ֻ��һ�У����������������м��ÿո������
���������ʽ�����ֻ��һ�У�����Ӧ�Ľ����
���������������
��������
435 754
�������
199

 */
import java.util.Scanner;

public class ALGO_93$������ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strA = scanner.next();
		String strB = scanner.next();
		System.out.println(reserve(String.valueOf(reserve(strA)+reserve(strB))));
		
	}
	
	private static int reserve(String str) {
		StringBuffer strBuff = new StringBuffer();
		for(int i=str.length()-1;i>=0;i--) {
			strBuff.append(str.charAt(i));
		}
		return Integer.valueOf(strBuff.toString());
	}
}
