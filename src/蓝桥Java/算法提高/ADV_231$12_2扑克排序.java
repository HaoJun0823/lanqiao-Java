package ����Java.�㷨���;
import java.util.Arrays;
import java.util.Scanner;
/*
  �㷨��� 12-2�˿�����  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������
�����˿������򣺹����˿������飬���˿��ƽ�����������ԭ�����£����ִ�С������2-10��J��Q��K��A����ɫ��С�����Ƿ��飨diamond����÷����club�������ң�heart�������ң�spade���������ƱȽ�ʱ�ȿ����֣�������ͬʱ����ɫ��Ҫ���������˿��ƽ��д�С��������
�������������ƣ���ʾ����2������3������3������A��÷��J���� 2 s 3 h 3 s A d J c
����������ӦΪ��2 s 3 h 3 s J c A d���鳤�ȹ̶�Ϊ5��
�������
����������������Ӧ�������
����
���ݹ�ģ��Լ��
��������������ÿһ�����ķ�Χ��

 */
public class ADV_231$12_2�˿����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String all = sc.nextLine();
		sc.close();
		String c = "dchs";
		String n = "23456789SJQKA";
		all = all.replaceAll("10", "S");
		// System.out.println(all);
		int[] array = new int[5];
		for (int i = 0, j = 0; i < array.length; i++, j += 2) {
			// System.out.println(i);
			array[i] = n.indexOf(all.charAt(j)) * 10 + c.indexOf(all.charAt(j + 1));
		}
		Arrays.sort(array);
		// System.out.println(Arrays.toString(array));
		all = "";
		for (int i = 0; i < array.length; i++) {
			int sz = array[i] / 10;
			int hs = array[i] % 10;
			all += n.charAt(sz) + "" + c.charAt(hs) + " ";
			// System.out.println(all);
		}
		// System.out.println(all);
		all = all.replaceAll("S", "10");
		System.out.print(all);
	}
}
