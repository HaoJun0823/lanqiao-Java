package ����Java.������ϰ;
import java.util.Scanner;
/*
  ������ϰ ���������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������

����������ֳ�Pascal�����Σ����ĵ�i+1����(a+b)i��չ��ʽ��ϵ����
����

����һ����Ҫ�����ǣ��������е�ÿ�����ֵ����������ϵ�������ӡ�
����

�����������������ε�ǰ4�У�
����

   1
����

  1 1
����

 1 2 1
����

1 3 3 1
����

����n���������ǰn�С�
�����ʽ

�������һ����n��
�����ʽ
�����������ε�ǰn�С�ÿһ�д���һ�еĵ�һ������ʼ����������м�ʹ��һ���ո�ָ����벻Ҫ��ǰ���������Ŀո�
��������
4
�������
1
1 1
1 2 1
1 3 3 1
���ݹ�ģ��Լ��
1 <= n <= 34��

 */
public class BASIC_6$��������� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[scanner.nextInt()][];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];
			
		}
		arr[0][0]=1;
		arr[1][0]=1;
		arr[1][1]=1;
		for(int row=2;row<arr.length;row++) {
			for(int column=0;column<arr[row].length;column++) {
				if(column==0||column==arr[row].length-1) {
					arr[row][column]=1;
				}else {
					arr[row][column]=arr[row-1][column-1]+arr[row-1][column];
				}
			}
		}
		
		for(int row=0;row<arr.length;row++) {
			for(int column=0;column<arr[row].length;column++) {
				System.out.print(arr[row][column]+" ");
			}
			System.out.println();
		}
	}
}
