package ����Java.����ѵ��;
import java.util.Scanner;
/*
  ����ѵ�� Fibonacci����  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������

Fibonacci���еĵ��ƹ�ʽΪ��Fn=Fn-1+Fn-2������F1=F2=1��

��n�Ƚϴ�ʱ��FnҲ�ǳ�������������֪����Fn����10007�������Ƕ��١�
�����ʽ
�������һ������n��
�����ʽ
���һ�У�����һ����������ʾFn����10007��������

˵�����ڱ����У�����Ҫ��Fn����10007���������������ֻҪ���������������ɣ�������Ҫ�ȼ����Fn��׼ȷֵ���ٽ�����Ľ������10007ȡ������ֱ�Ӽ������������������ԭ����ȡ��򵥡�
��������
10
�������
55
��������
22
�������
7704
���ݹ�ģ��Լ��
1 <= n <= 1,000,000��

 */
public class BEGIN_4$Fibonacci���� {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.close();
		int temp,f1=1,f2=1;
		for(int i=3;i<=n;i++) {
			temp = f2;
			f2 = (f1+f2) % 10007;
			f1 = temp;
		}
		System.out.print(f2);
	}
}
