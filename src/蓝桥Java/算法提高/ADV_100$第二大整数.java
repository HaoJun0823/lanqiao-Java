package ����Java.�㷨���;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*

  �㷨��� �ڶ�������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
��������
������дһ�����򣬶���һ��������������20���������û�����0ʱ����ʾ���������Ȼ����򽫴����������У��ѵڶ�����Ǹ������ҳ�������������ӡ������˵������1��0��ʾ������������������������������С���2�������������У�����������Ҳ�����и�������3�����������ĸ���������2����
���������ʽ������ֻ��һ�У��������ɸ��������м��ÿո���������һ������Ϊ0��
���������ʽ������ڶ�����Ǹ�������
���������������
��������
5 8 -12 7 0
�������
7

 */
public class ADV_100$�ڶ������� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (true) {
			int num = scanner.nextInt();
			if (num == 0) {
				break;
			} else {
				list.add(num);
			}
		}
		Collections.sort(list);
		for (int i = list.size() - 1; i > 0; i--) {
			if (list.get(i) != list.get(i - 1)) {
				System.out.println(list.get(i - 1));
				return;
			}
		}
		System.out.println(list.get(0));
	}
}
