package ����Java.������ϰ;
import java.util.Scanner;
/*

  ������ϰ ���������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
��������
����123321��һ���ǳ����������������߶��ʹ��ұ߶���һ���ġ�
��������һ��������n�� �����������������λ����λʮ�������������λ����֮�͵���n ��
�����ʽ
��������һ�У�����һ��������n��
�����ʽ
��������С�����˳���������������������ÿ������ռһ�С�
��������
52
�������
899998
989989
998899
���ݹ�ģ��Լ��
����1<=n<=54��

 */
public class BASIC_9$��������� {
	public static void main(String[] args) {
		int a,b,c,d,e,f;
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		for(int i=10000;i<=99999;i++) {
			a=i/10000;
			b=i%10000/1000;
			c=i%1000/100;
			d=i%100/10;
			e=i%10;
			if(a==e&&b==d) {
				if(a+b+c+d+e==x) {
					System.out.println(i);
				}
			}
		}
		for(int i=100000;i<=999999;i++) {
			a=i/100000;
			b=i%100000/10000;
			c=i%10000/1000;
			d=i%1000/100;
			e=i%100/10;
			f=i%10;
			if(a==f&&b==e&&c==d) {
				if(a+b+c+d+e+f==x) {
					System.out.println(i);
				}
			}
		}
	}
}
