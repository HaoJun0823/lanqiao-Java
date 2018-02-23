package 蓝桥Java.算法训练;
/*

  算法训练 4-2找公倍数  
时间限制：1.0s   内存限制：256.0MB
   
问题描述
　　这里写问题描述。
　　打印出1-1000所有11和17的公倍数。
样例输入
一个满足题目要求的输入范例。
例：
无
样例输出
与上面的样例输入对应的输出。
例：

 */
public class ALGO_146$4_2找公倍数 {
	public static void main(String[] args) {
		for(int i=18;i<=1000;i++) {
			if(i%17==0&&i%11==0) {
				System.out.println(i);
			}
		}
	}
}
