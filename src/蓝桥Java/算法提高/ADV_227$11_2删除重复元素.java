package ����Java.�㷨���;
import java.util.Scanner;
/*

  �㷨��� 11-2ɾ���ظ�Ԫ��  
ʱ�����ƣ�10.0s   �ڴ����ƣ�256.0MB
   
��������
����Ϊ������º���DelPack��ɾ�������ַ��������е��ظ�Ԫ�ء����������ظ�Ԫ��ҲҪɾ����
����Ҫ��д�ɺ����������ڲ�ʹ��ָ�������
��������
1223445667889
�������
13579
��������
else
�������
ls
���ݹ�ģ��Լ��
�����ַ���������󳤶�Ϊ100��

 */
public class ADV_227$11_2ɾ���ظ�Ԫ�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int temp[] = new int[1000];
		for (int i = 0; i < str.length(); i++) {
			temp[str.charAt(i)]++;
		}
		for (int i = 0; i < str.length(); i++) {
			if (temp[str.charAt(i)] == 1) {
				System.out.print(str.charAt(i));
			}
		}
	}
}
