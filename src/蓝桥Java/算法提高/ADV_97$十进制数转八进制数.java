package ����Java.�㷨���;
import java.util.Scanner;
/*
  �㷨��� ʮ������ת�˽�����  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   

��д�������书��Ϊ��һ��ʮ������ת��Ϊ���Ӧ�İ˽��������������һ��ʮ�����������øú���ʵ������ת���������Ӧ�İ˽�������

 ��������
 9274
 �������
 22072
��������
 18
 �������
 22


 */
public class ADV_97$ʮ������ת�˽����� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dec = scanner.nextInt();
		scanner.close();
		System.out.println(binToOct(decToBin(dec)));
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
	
	private static String binToOct(String str) {

		StringBuffer result = new StringBuffer();
		int start = 0, end = 0;
		if (str.length() % 3 == 1) {
			str = "00"+str;
		}
		if (str.length() % 3 == 2) {
			str = "0"+str;
		}
		if (str.substring(0, 3).equals("000")) {
			start = 3;
			end = 6;
		}
		for (; end <= str.length(); start = end, end += 3) {
			String temp = str.substring(start,end);
			if(temp.equals("000")) {result.append("0");continue;}
			if(temp.equals("001")) {result.append("1");continue;}
			if(temp.equals("010")) {result.append("2");continue;}
			if(temp.equals("011")) {result.append("3");continue;}
			if(temp.equals("100")) {result.append("4");continue;}
			if(temp.equals("101")) {result.append("5");continue;}
			if(temp.equals("110")) {result.append("6");continue;}
			if(temp.equals("111")) {result.append("7");continue;}
		}
		return result.toString();
	}
	
	
}
