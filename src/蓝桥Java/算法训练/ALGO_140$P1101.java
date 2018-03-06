package 蓝桥Java.算法训练;
//算法训练 P1101  
//时间限制：1.0s   内存限制：256.0MB
// 
//
//有一份提货单，其数据项目有：商品名（MC）、单价（DJ）、数量（SL）。定义一个结构体prut，其成员是上面的三项数据。在主函数中定义一个prut类型的结构体数组，输入每个元素的值，计算并输出提货单的总金额。
//输入格式：第一行是数据项个数N(N<100)，接下来每一行是一个数据项。商品名是长度不超过100的字符串，单价为double类型，数量为整型。
//输出格式：double类型的总金额。
//输入：
//4
//book 12.5 3
//pen 2.5 10
//computer 3200 1
//flower 47 5
//
//输出：
//3497.500000
import java.util.Scanner;
public class ALGO_140$P1101 {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			prut[] list = new prut[scanner.nextInt()];
			for(int i=0;i<list.length;i++) {
				list[i]=new prut(scanner.next(),scanner.nextDouble(),scanner.nextInt());
			}
			
			System.out.printf("%.6f\n",prut.count); //宛如智障
	}
}

class prut{
	public String MC;
	public static double count=0;
	public double DJ;
	public int SL;
	public prut(String MC,double DJ,int SL) {
		this.MC=MC;
		this.DJ=DJ;
		this.SL=SL;
		count+=DJ*SL;
	}

}
