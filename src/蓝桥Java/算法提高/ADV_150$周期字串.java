package ����Java.�㷨���;
import java.util.Scanner;
/*
  �㷨��� �����ִ�  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������
��������ϲ�������£��������ҵ��������ǽ�һЩ����ǰ����ɽ��ɽ�������������и��Ϻ��и�С���н����£�����ʲô�أ���ǰ����ɽ����������ѭ���Ĺ������������ҡ�
�������Ƕ��壬���һ���ַ�������һ������һ�����ϵĳ���Ϊk���ظ��ַ��������ӳɵģ���ô����ַ����ͽ�������Ϊk�Ĵ���
��������:
�����ַ�����abcabcabcabc������Ϊ3����Ϊ������4��ѭ����abc����ɵġ���ͬ������6Ϊ���ڣ������ظ��ġ�abcabc��������12Ϊ���ڣ�һ��ѭ����abcabcabcabc������
����������������������Ѵ����ת�����轲�Ĺ��£������дһ�����򣬿��Բⶨһ���ַ�������С���ڡ�
�����ʽ
����һ����󳤶�Ϊ100���޿ո���ַ�����
�����ʽ
����һ����������ʾ������ַ�������С���ڡ�
��������
HaHaHa
�������
2
��������
Return0
�������
7

 */
public class ADV_150$�����ִ� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		if(str.length()==1) {
			System.out.println(str.length());
			return ;
		}
		StringBuffer strChild = null;

		scanner.close();
		for (int i = 1; i < str.length(); i++) {
			boolean bool = true;
			strChild = new StringBuffer(str.substring(0, i));
			for (int x = 0; x < str.length(); x += strChild.length()) {
				try {
					if (!strChild.toString().equals(str.substring(x, x + strChild.length()))) {
						// System.err.println(strChild + "|" + str.substring(x, x + strChild.length()));
						bool = false;
						break;
					}
				} catch (StringIndexOutOfBoundsException e) {
					bool = false;
					break;
				}

			}
			if (bool) {
				System.out.println(strChild.length());
				return;
			}
		}
		System.out.println(strChild.length()+1);
	}
}
