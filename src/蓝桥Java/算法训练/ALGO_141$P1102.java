package ����Java.�㷨ѵ��;

//�㷨ѵ�� P1102  
//ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
// 
//����һ��ѧ���ṹ������student������4���ֶΣ��������Ա�����ͳɼ���Ȼ�����������ж���һ���ṹ�����飨���Ȳ�����1000����������ÿ��Ԫ�ص�ֵ������ʹ��ð�����򷨽�ѧ�����ճɼ���С�����˳������Ȼ���������Ľ����
//�����ʽ����һ����һ������N��N<1000������ʾԪ�ظ�����������N��ÿ������һ��Ԫ�أ��������Ա��ǳ��Ȳ�����20���ַ���������ͳɼ��������͡�
//�����ʽ�����ɼ���С�����������Ԫ�أ������ѧ���ɼ���ͬ��ɼ���ͬ��ͬѧ֮�䱣��ԭ��������˳��
//���룺
//3
//Alice female 18 98
//Bob male 19 90
//Miller male 17 92
//
//�����
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
			int y = x+1; //�ǳ�����ð�ݷ���
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
