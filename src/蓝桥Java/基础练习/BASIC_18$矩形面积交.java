package 蓝桥Java.基础练习;
import java.util.Scanner;
/*
  基础练习 矩形面积交  
时间限制：1.0s   内存限制：512.0MB
   
问题描述
　　平面上有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。对于每个矩形，我们给出它的一对相对顶点的坐标，请你编程算出两个矩形的交的面积。
输入格式
　　输入仅包含两行，每行描述一个矩形。
　　在每行中，给出矩形的一对相对顶点的坐标，每个点的坐标都用两个绝对值不超过10^7的实数表示。
输出格式
　　输出仅包含一个实数，为交的面积，保留到小数后两位。
样例输入
1 1 3 3
2 2 4 4
样例输出
1.00

 */
public class BASIC_18$矩形面积交 {
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
