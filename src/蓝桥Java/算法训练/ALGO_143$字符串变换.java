package ����Java.�㷨ѵ��;
//�㷨ѵ�� �ַ����任  
//ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
// 
//��������
//���ž������ѧ�ڵı��ѵ������Ҷ����ַ����Ĳ����Ѿ����յ��൱�����ˡ����죬����ʦ�����һ�´�Ҷ����ַ����������������������ʦ�Լ�������1,2,3,4,5��5�������ֱ�ָ����ͬ��5���ַ�������������Ҫ���ݴ���Ĳ�������������ʦ�Ĺ涨���������ַ������и�ʽת����
//����ʦָ���Ĳ������£�
//1 ��ʾȫ��ת��Ϊ��д��ĸ�������abC ��� ABC
//2 ��ʾȫ��ת��ΪСд��ĸ�������abC���abc
//3 ��ʾ���ַ������������������ abc ��� cba
//4 ��ʾ���ַ����ж�Ӧ�Ĵ�д��ĸת��ΪСд��ĸ���������е�Сд��ĸת��Ϊ��д��ĸ������� abC���ABc
//5��ʾ��ȫ��ת��ΪСд��ĸ�������������е������Ӵ�ת��Ϊ��Ӧ����д��ʽ���������abcD ת��Ϊa-d����Σ�-���ٴ���1����ĸ���������ab������Ҫת��Ϊ��д��ʽ��
//�����ʽ
//һ��һ�У��ֱ���ָ����Ӧ���������ֺ��ַ����������Կո�ָ����ַ���ȫ����Ӣ����ĸ���
//�����ʽ
//���������������ת�����Ӧ���ַ���
//��������
//5 ABcdEE
//�������
//a-ee
//���ݹ�ģ��Լ��
//�����ַ��������Ϊ200��

import java.util.Scanner;

public class ALGO_143$�ַ����任 {
	static char[] str;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		str = scanner.next().toCharArray();
		switch(num) {
		case 1:
			for(char c:str) {
				System.out.print(Character.toUpperCase(c));
			}
			break;
		case 2:
			for(char c:str) {
				System.out.print(Character.toLowerCase(c));
			}
			break;
		case 3:
			for(int i=str.length-1;i>=0;i--) {
				System.out.print(str[i]);
			}
			break;
		case 4:
			for(char c:str) {
				if(Character.isUpperCase(c)) {
					System.out.print(Character.toLowerCase(c));
				}else {
					System.out.print(Character.toUpperCase(c));
				}
			}
			break;
		case 5:
			for(int i=0;i<str.length;i++) {
					System.out.print(Character.toLowerCase(str[i]));
					int j=1;
					int count=0;
					while(j+i<str.length) {
						if(Character.toLowerCase(str[i+j])==Character.toLowerCase(str[i]+j)) {
							count++;
							j++;
						}else {
							break;
						}
					}
					switch(count) {
					case 0:
						break;
					case 1:
						break;
					default:
						i+=j-1;
						System.out.print("-"+Character.toLowerCase(str[i]));
						break;
					}
			}
			break;
		}
	}
	


}
