package ����Java.������ϰ;
import java.util.Scanner;
/*
  ������ϰ ʮ����תʮ������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
��������
����ʮ�����������ڳ������ʱ����Ҫʹ�õ���һ�������ı�ʾ��ʽ������0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F��16�����ţ��ֱ��ʾʮ��������0��15��ʮ�����Ƶļ�����������16��1������ʮ������16��ʮ����������10����ʮ���Ƶ�17��ʮ����������11���Դ����ƣ�ʮ���Ƶ�30��ʮ����������1E��
��������һ���Ǹ�������������ʾ��ʮ�����Ƶ���ʽ��
�����ʽ
�����������һ���Ǹ�����a����ʾҪת��������0<=a<=2147483647
�����ʽ
����������������16���Ʊ�ʾ
��������
30
�������
1E

 */
public class BASIC_10$ʮ����תʮ������ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dec = scanner.nextInt();
		scanner.close();
		System.out.println(binToHex(decToBin(dec)));
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
	
	private static String binToHex(String str) {
		if(str.equals("0"))return "0";
		StringBuffer result = new StringBuffer();
		int start = 0, end = 0;
		if (str.length() % 4 == 1) {
			str = "000"+str;
		}
		if (str.length() % 4 == 2) {
			str = "00"+str;
		}
		if (str.length() % 4 == 3) {
			str = "0"+str;
		}
		if (str.substring(0, 4).equals("0000")) {
			start = 4;
			end = 8;
		}
		for (; end <= str.length(); start = end, end += 4) {
			String temp = str.substring(start,end);
			if(temp.equals("0000")) {result.append("0");continue;}
			if(temp.equals("0001")) {result.append("1");continue;}
			if(temp.equals("0010")) {result.append("2");continue;}
			if(temp.equals("0011")) {result.append("3");continue;}
			if(temp.equals("0100")) {result.append("4");continue;}
			if(temp.equals("0101")) {result.append("5");continue;}
			if(temp.equals("0110")) {result.append("6");continue;}
			if(temp.equals("0111")) {result.append("7");continue;}
			if(temp.equals("1000")) {result.append("8");continue;}
			if(temp.equals("1001")) {result.append("9");continue;}
			if(temp.equals("1010")) {result.append("A");continue;}
			if(temp.equals("1011")) {result.append("B");continue;}
			if(temp.equals("1100")) {result.append("C");continue;}
			if(temp.equals("1101")) {result.append("D");continue;}
			if(temp.equals("1110")) {result.append("E");continue;}
			if(temp.equals("1111")) {result.append("F");continue;}
		}
		return result.toString();
	}
	
}
