package ����Java.�㷨���;
/*

  �㷨��� �½�Microsoft Word�ĵ�  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������
����L���ڳ��⣬�½���һ��word�ĵ����벻��ȡʲô���֣�����һ�˾��ʣ����������Ŀ�С��½�Microsoft Word�ĵ����𣿡���L��ϲ��һ�����ӣ�˵�����ã��ͽ���������ˡ���
������ϸ�۲죬�����½�һ��word�ĵ�ʱ����õ�һ����Ϊ���½� Microsoft Word �ĵ�.doc�����ļ������½�һ��������Ϊ���½� Microsoft Word �ĵ�(2).doc�������½������ǡ��½� Microsoft Word �ĵ�(3).doc���������½�����Ų��ϵ����������������½��������ĵ���Ȼ��ɾ���ˡ��½� Microsoft Word �ĵ�(2).doc�������½����ֻ�õ�һ�����½� Microsoft Word �ĵ�(2).doc����

�����ϸ�˵��Windows��ÿ���½��ĵ�ʱ������ѡȡһ���������ļ���Ų��ظ�����С��������Ϊ���ĵ��ı�š�

��������ģ�����Ϲ��̣�֧���������ֲ���
����New���½�һ��word�ĵ��������½����ĵ��ı��
����Delete id��ɾ��һ�����Ϊid��word�ĵ�������ɾ���Ƿ�ɹ�
������ʼʱһ���ļ���û�У����½� Microsoft Word �ĵ�.doc���ı������1��
�����ʽ
������һ��һ��������n��ʾ����������������n�У�ÿ�б�ʾһ��������������Ϊ��New�������ʾ�½���Ϊ��Delete id�����ʾҪɾ�����Ϊid���ĵ�������idΪһ��������������������˳�����ν��С�
�����ʽ
�������������ÿһ�У�����䷴������������½�����������½����ĵ��ı�ţ�����ɾ������������ɾ���Ƿ�ɹ������ɾ�����ļ����ڣ���ɾ���ɹ��������Successful�������������Failed����
��������
12
New
New
New
Delete 2
New
Delete 4
Delete 3
Delete 1
New
New
New
Delete 4
�������
1
2
3
Successful
2
Failed
Successful
Successful
1
3
4
Successful
���ݹ�ģ��Լ��
���������������������������������1481
����ɾ����ŵ���ֵ������2012

 */
import java.util.ArrayList;
import java.util.Scanner;

public class ADV_158$�½�MicrosoftWord�ĵ� {
	private static ArrayList<Boolean> list = new ArrayList<Boolean>();

	public static void main(String[] args) {
		list.add(false);
		Scanner scanner = new Scanner(System.in);
		String[] str = new String[scanner.nextInt()];
		for (int i = 0; i < str.length; i++) {
			String temp = scanner.next();
			switch (temp.charAt(0)) {
			case 'N':
				boolean flag = false;
				for (int ii = 0; ii < list.size(); ii++) {
					if (!list.get(ii)) {
						list.set(ii, true);
						str[i] = String.valueOf(ii + 1);
						flag = true;
						break;
					}
				}
				if (flag) {
					break;
				}
				list.add(true);
				str[i] = String.valueOf(list.size());
				break;
			case 'D':
				int n = scanner.nextInt();
				try {
				if(list.get(n-1)) {
					list.set(n-1, false);
					str[i]="Successful";
				}else {
					str[i]="Failed";
				}
				}catch(IndexOutOfBoundsException e) {
					str[i]="Failed";
				}
				break;
			}
		}
		for(String s:str) {
			System.out.println(s);
		}
	}
}
