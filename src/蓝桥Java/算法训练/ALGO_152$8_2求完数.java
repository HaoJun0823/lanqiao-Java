package 蓝桥Java.算法训练;
//算法训练 8-2求完数  
//时间限制：50.0s   内存限制：256.0MB
// 
//问题描述
//如果一个自然数的所有小于自身的因子之和等于该数，则称为完数。设计算法，打印1-9999之间的所有完数。
//样例输出
//与上面的样例输入对应的输出。
//例：
//数据规模和约定
//1-9999

public class ALGO_152$8_2求完数 {
	public static void main(String[] args) {
		for(int i=1;i<=9999;i++) {
				int count=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					count+=j;
				}
			}
			if(count==i) {
				System.out.println(i);
			}
		}
	}
}
