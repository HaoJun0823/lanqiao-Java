package ����Java.�㷨���;
import java.util.Scanner;
import java.util.Vector;
/*

  �㷨��� ��������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
��������
������дһ�����򣬶���һ��������������20�������������Ǳ�����һ�����������С����û�����0ʱ����ʾ���������Ȼ����򽫰���������е�ֵ���������´�ţ�����ӡ���������磺�����û�������һ�����ݣ�7 19 -5 6 2 0����ô���򽫻��ǰ�����Ч���ݱ�����һ�������У���7 19 -5 6 2��Ȼ�����������е�ֵ���������´�ţ��������2 6 -5 19 7��Ȼ������Ǵ�ӡ������
���������ʽ������ֻ��һ�У������ɸ�������ɣ��м��ÿո��������ĩβ������Ϊ0��
���������ʽ�����Ҳֻ��һ�У����������к���������м��ÿո������ĩβû�пո�
���������������
��������
7 19 -5 6 2 0
�������
2 6 -5 19 7

 */
public class ADV_103$�������� {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while(num!=0) {
			vector.add(num);
			num = scanner.nextInt();
		}
		scanner.close();
		for(int i=vector.size()-1;i>=0;i--) {
			System.out.print(vector.get(i)+" ");
		}
	}
}
