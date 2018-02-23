package ����Java.������ϰ;
import java.util.Scanner;
/*
  ������ϰ ʮ������ת�˽���  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
��������
��������n��ʮ��������������������Ƕ�Ӧ�İ˽�������

�����ʽ
��������ĵ�һ��Ϊһ��������n ��1<=n<=10����
����������n�У�ÿ��һ����0~9����д��ĸA~F��ɵ��ַ�������ʾҪת����ʮ��������������ÿ��ʮ�����������Ȳ�����100000��

�����ʽ
�������n�У�ÿ��Ϊ�����Ӧ�İ˽�����������

������ע�⡿
���������ʮ��������������ǰ��0������012A��
��������İ˽�����Ҳ������ǰ��0��

��������
����2
����39
����123ABC

�������
����71
����4435274

��������ʾ��
�����Ƚ�ʮ��������ת����ĳ������������ĳ������ת���ɰ˽��ơ�

 */
public class BASIC_12$ʮ������ת�˽��� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = new String[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.next();
		}
		scanner.close();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(binToOct(hexToBin(arr[i])));
		}
	}

	private static String hexToBin(String str) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case '0':
				result.append("0000");
				break;
			case '1':
				result.append("0001");
				break;
			case '2':
				result.append("0010");
				break;
			case '3':
				result.append("0011");
				break;
			case '4':
				result.append("0100");
				break;
			case '5':
				result.append("0101");
				break;
			case '6':
				result.append("0110");
				break;
			case '7':
				result.append("0111");
				break;
			case '8':
				result.append("1000");
				break;
			case '9':
				result.append("1001");
				break;
			case 'A':
				result.append("1010");
				break;
			case 'B':
				result.append("1011");
				break;
			case 'C':
				result.append("1100");
				break;
			case 'D':
				result.append("1101");
				break;
			case 'E':
				result.append("1110");
				break;
			case 'F':
				result.append("1111");
				break;
			default:
				break;
			}
		}
		return result.toString();
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
