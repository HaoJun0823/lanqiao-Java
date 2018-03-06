package 蓝桥Java.算法训练;

//算法训练 P1102  
//时间限制：1.0s   内存限制：256.0MB
// 
//定义一个学生结构体类型student，包括4个字段，姓名、性别、年龄和成绩。然后在主函数中定义一个结构体数组（长度不超过1000），并输入每个元素的值，程序使用冒泡排序法将学生按照成绩从小到大的顺序排序，然后输出排序的结果。
//输入格式：第一行是一个整数N（N<1000），表示元素个数；接下来N行每行描述一个元素，姓名、性别都是长度不超过20的字符串，年龄和成绩都是整型。
//输出格式：按成绩从小到大输出所有元素，若多个学生成绩相同则成绩相同的同学之间保留原来的输入顺序。
//输入：
//3
//Alice female 18 98
//Bob male 19 90
//Miller male 17 92
//
//输出：
//Bob male 19 90
//Miller male 17 92
//Alice female 18 98
import java.util.Scanner;

public class ALGO_141$P1102 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		stud[] list = new stud[scanner.nextInt()];
		for (int i = 0; i < list.length; i++) {
			list[i] = new stud(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt());
		}
		for (int x = 0; x < list.length- 1; x++) {
			int y = x+1; //非常见的冒泡法？
				if (list[x].score >
				list[y].score) {
					stud temp = list[x];
					list[x] = list[y];
					list[y] = temp;
					x=-1;
				
			}
		}
		
		for(stud i:list) {
			i.infPrint();
		}

	}

}

class stud {
	public String name;
	public String sex;
	public int age;
	public int score;

	public stud(String name, String sex, int age, int score) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.score = score;
	}

	public void infPrint() {
		System.out.printf("%s %s %d %d\n", this.name, this.sex, this.age, this.score);
	}
}
