package ����Java.������ϰ;
import java.util.Scanner;
/*
  ������ϰ �߾��ȼӷ�  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
��������
����������������a��b����������������ĺ͡�a��b��������100λ��
�㷨����
��������a��b���Ƚϴ����Բ���ֱ��ʹ�������еı�׼�����������洢�������������⣬һ��ʹ������������
��������һ������A��A[0]���ڴ洢a�ĸ�λ��A[1]���ڴ洢a��ʮλ���������ơ�ͬ��������һ������B���洢b��
��������c = a + b��ʱ�����Ƚ�A[0]��B[0]��ӣ�����н�λ��������ѽ�λ�����͵�ʮλ��������r���Ѻ͵ĸ�λ������C[0]����C[0]����(A[0]+B[0])%10��Ȼ�����A[1]��B[1]��ӣ���ʱ��Ӧ����λ��������ֵrҲ����������C[1]Ӧ����A[1]��B[1]��r�������ĺͣ�������н�λ���������Կɽ��µĽ�λ���뵽r�У��͵ĸ�λ�浽C[1]�С��������ƣ��������C������λ��
�������C������ɡ�
�����ʽ
��������������У���һ��Ϊһ���Ǹ�����a���ڶ���Ϊһ���Ǹ�����b������������������100λ�����������λ������0��
�����ʽ
�������һ�У���ʾa + b��ֵ��
��������
20100122201001221234567890
2010012220100122
�������
20100122203011233454668012

 */
public class BASIC_29$�߾��ȼӷ� {
	/*
	 * public static void main(String[] args) { Scanner scanner = new
	 * Scanner(System.in); String a = scanner.next(); String b = scanner.next();
	 * scanner.close(); System.out.println(new BigInteger(a).add(new
	 * BigInteger(b)).toString()); }
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.next();
		scanner.close();
		if (str2.length() > str1.length()) {
			String temp = str1;
			str1 = str2;
			str2 = temp;
		}
		int[] a = new int[str1.length() + 1];
		a[0] = 0;
		int[] b = new int[str2.length()];
		// System.err.println(a.length + " " + b.length);
		for (int i = 1; i <= str1.length(); i++) {
			a[i] = Integer.valueOf(String.valueOf(str1.charAt(i - 1)));
		}
		for (int i = 0; i < str2.length(); i++) {
			b[i] = Integer.valueOf(String.valueOf(str2.charAt(i)));
		}
		for (int x = b.length - 1, y = a.length - 1; x >= 0; x--, y--) {
			// System.err.println(a[y] + " " + b[x]);
			//System.err.println(Arrays.toString(a));
			if (a[y] + b[x] > 9) {
				a[y - 1] += 1;
				a[y] = (a[y] + b[x]) % 10;
			} else {
				a[y] += b[x];
			}
		}
		for (int i = 1; i < a.length; i++) {
			if (a[i] > 9) {
				//System.err.println(a[i]);
				a[i - 1] += 1;
				a[i] = a[i] % 10;
			}
		}
		//System.err.println(Arrays.toString(a));
		for (int start = a[0] == 0 ? 1 : 0; start < a.length; start++) {
			System.out.print(a[start]);
		}

	}
}
