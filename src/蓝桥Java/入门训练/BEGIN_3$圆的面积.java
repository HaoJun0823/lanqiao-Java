package ����Java.����ѵ��;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
/*
  ����ѵ�� Բ�����  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������
����Բ�İ뾶r����Բ�������
�����ʽ
�������һ������r����ʾԲ�İ뾶��
�����ʽ
���һ�У�����һ��ʵ�����������뱣��С�����7λ����ʾԲ�������

˵�����ڱ����У�������һ�����������������һ��ʵ����

����ʵ����������⣬��һ�������ʵ�������Ҫ�󣬱��籾����Ҫ����С�����7λ������ĳ�������ϸ�����7λС�������������߹��ٵ�С��λ�����ǲ��еģ����ᱻ��Ϊ����

ʵ��������������û���ر�˵�������붼�ǰ�����������С�
��������
4
�������
50.2654825
���ݹ�ģ��Լ��
1 <= r <= 10000��
��ʾ
����Ծ���Ҫ��ϸߣ���ע��е�ֵӦ��ȡ�Ͼ�ȷ��ֵ�������ʹ�ó�������ʾ�У�����PI=3.14159265358979323��Ҳ����ʹ����ѧ��ʽ����У�����PI=atan(1.0)*4��

 */
public class BEGIN_3$Բ����� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		scanner.close();
		BigDecimal b = new BigDecimal(r * r * Math.PI);
		DecimalFormat df = new DecimalFormat("#.0000000");
		System.out.print(df.format(b.setScale(7, RoundingMode.HALF_UP).doubleValue()));
	}
}
