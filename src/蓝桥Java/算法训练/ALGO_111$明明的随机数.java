package ����Java.�㷨ѵ��;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/*

  �㷨ѵ�� �����������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������
������������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ������ü����������N��1��1000֮������������N��100�������������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С�������򣬰����źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
�����ʽ
����������2�У���1��Ϊ1������������ʾ�����ɵ�������ĸ�����
����N
������2����N���ÿո��������������Ϊ���������������
�����ʽ
�������Ҳ��2�У���1��Ϊ1��������M����ʾ����ͬ��������ĸ�������2��ΪM���ÿո��������������Ϊ��С�����ź���Ĳ���ͬ���������
��������
10
20 40 32 67 40 20 89 300 400 15
�������
8
15 20 32 40 67 89 300 400
��Ŀ��Դ
������13����ժ����NOIP06PJ01

 */
public class ALGO_111$����������� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < num; i++) {
			//set.add(new Random().nextInt(1000) + 1);
			set.add(scanner.nextInt());
		}
		scanner.close();
		System.out.println(set.size());
		for(Integer i:set) {
			System.out.print(i+" ");
		}
	}
}
