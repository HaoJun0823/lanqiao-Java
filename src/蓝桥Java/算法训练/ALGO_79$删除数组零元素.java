package ����Java.�㷨ѵ��;
import java.util.Scanner;
/*

  �㷨ѵ�� ɾ��������Ԫ��  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   

�Ӽ��̶���n���������������У���д����CompactIntegers��ɾ������������ֵΪ0��Ԫ�أ����Ԫ���������׶��ƶ���ע�⣬CompactIntegers������Ҫ�������鼰��Ԫ�ظ�����Ϊ��������������ֵӦΪɾ������ִ�к��������Ԫ�ظ��������ɾ����������Ԫ�صĸ����������������Ԫ�ء�

��������: �������ʽ˵����5Ϊ�������ݵĸ�����3 4 0 0 2 ���Կո������5��������
5 
3 4 0 0 2
�������:�������ʽ˵����3Ϊ�������ݵĸ�����3 4 2 ���Կո������3������������
3
3 4 2

��������: 
7
0 0 7 0 0 9 0
�������:
2
7 9

��������: 
3
0 0 0
�������:
0


 */
public class ALGO_79$ɾ��������Ԫ�� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		CompactIntegers(arr, arr.length);

	}

	private static int CompactIntegers(int[] arr, int length) {
		int width = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				width++;
			}
		}
		if(width==0) {System.out.println(0);return width;}
		int arr2[] = new int[width];
		int point = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr2[point]=arr[i];
				point++;
			}
		}
		System.out.println(width);
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		return width;
	}

}
