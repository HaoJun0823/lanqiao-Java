package ����Java.������ϰ;
import java.util.Scanner;
/*

  ������ϰ �ַ����Ա�  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
��������
���������������ɴ�д��ĸ��Сд��ĸ��ɵ��ַ���(���Ƚ���1��10֮��)������֮��Ĺ�ϵ������4�����֮һ��
����1�������ַ������Ȳ��ȡ����� Beijing �� Hebei
����2�������ַ�������������ȣ�������Ӧλ���ϵ��ַ���ȫһ��(���ִ�Сд)������ Beijing �� Beijing
����3�������ַ���������ȣ���Ӧλ���ϵ��ַ����ڲ����ִ�Сд��ǰ���²��ܴﵽ��ȫһ�£�Ҳ����˵���������������2�������� beijing �� BEIjing
����4�������ַ���������ȣ����Ǽ�ʹ�ǲ����ִ�СдҲ����ʹ�������ַ���һ�¡����� Beijing �� Nanjing
��������ж�����������ַ���֮��Ĺ�ϵ�����������е���һ�࣬������������ı�š�
�����ʽ
�����������У�ÿ�ж���һ���ַ���
�����ʽ
��������һ�����֣������������ַ����Ĺ�ϵ���
��������
BEIjing

beiJing 

�������
3

 */
public class BASIC_15$�ַ����Ա� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.next();
		System.out.println(check(str1,str2));
	}
	
	private static int check(String str1,String str2) {
		if(str1.length()!=str2.length()) {return 1;}
		boolean not2=false;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==str2.charAt(i)) {
			}else {
				if(Character.toUpperCase(str1.charAt(i))==str2.charAt(i)||Character.toLowerCase(str1.charAt(i))==str2.charAt(i)) {
					not2=true;
				}else {
					return 4;
				}
				
			}
		}
		
		return not2?3:2;
	}
	
}
