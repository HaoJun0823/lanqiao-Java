package ����Java.������ϰ;
import java.util.Scanner;
/*
  ������ϰ ���������  
ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
   
��������
����ƽ�������������Σ����ǵı�ƽ����ֱ������ϵ��X���Y�ᡣ����ÿ�����Σ����Ǹ�������һ����Զ�������꣬����������������εĽ��������
�����ʽ
����������������У�ÿ������һ�����Ρ�
������ÿ���У��������ε�һ����Զ�������꣬ÿ��������궼����������ֵ������10^7��ʵ����ʾ��
�����ʽ
�������������һ��ʵ����Ϊ���������������С������λ��
��������
1 1 3 3
2 2 4 4
�������
1.00

 */
public class BASIC_18$��������� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x1 = scanner.nextDouble(), y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble(), y2 = scanner.nextDouble();
		double x3 = scanner.nextDouble(), y3 = scanner.nextDouble();
		double x4 = scanner.nextDouble(), y4 = scanner.nextDouble();
		double aX = Math.max(Math.min(x1, x2), Math.min(x3, x4));
		double bX = Math.min(Math.max(x1, x2), Math.max(x3, x4));
		double aY = Math.max(Math.min(y1, y2), Math.min(y3, y4));
		double bY = Math.min(Math.max(y1, y2), Math.max(y3, y4));
		if (bY > aY && bX > aX) {
			System.out.printf("%.2f", (bY - aY) * (bX - aX));
		} else {
			System.out.println("0.00");
		}
	}
}
