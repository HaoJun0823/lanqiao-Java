package ����Java.������ϰ;


//������ϰ ����ȡ��  
//ʱ�����ƣ�1.0s   �ڴ����ƣ�512.0MB
// 
//��������
//����ȡ�������ؾ���ı�ȡ��������ǰ������������ȡ���Ѿ�ȡ��������ת90�ȡ�һ��ʼλ�ھ������Ͻǣ��������¡�
//�����ʽ
//�����һ��������������200��������m, n����ʾ������к��С�������m��ÿ��n����������ʾ�������
//�����ʽ
//���ֻ��һ�У���mn������Ϊ����������ȡ���õ��Ľ������֮����һ���ո�ָ�����ĩ��Ҫ�ж���Ŀո�
//��������
//3 3
//1 2 3
//4 5 6
//7 8 9
//�������
//1 4 7 8 9 6 3 2 5
//��������
//3 2
//1 2
//3 4
//5 6
//�������
//1 3 5 6 4 2
//


import java.util.Scanner;

public class BASIC_25$����ȡ�� {

	static int[][] arr;
	static int count;
	static int gX = 0, gY = 0;

	public static void main(String[] args) {
		// �ݹ�̫��ᱬը���ش�������
		// ̫ī���˿�ʼ�������롣
		// ���ǲ��У������Ż���
		Scanner scanner = new Scanner(System.in);
		arr = new int[scanner.nextInt()][scanner.nextInt()];
		count = arr.length * arr[0].length;
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				arr[x][y] = scanner.nextInt();
			}
		}
		int t1, t2;
		while (true) {
			t1 = gX;
			t2 = gY;
			down(gX, gY);
			if (count <= 0) {
				System.exit(0);
			}
			arr[t1][t2] = -1;
			t1 = gX;
			t2 = gY;
			right(gX, gY);
			if (count <= 0) {
				System.exit(0);
			}
			arr[t1][t2] = -1;
			t1 = gX;
			t2 = gY;
			up(gX, gY);
			if (count <= 0) {
				System.exit(0);
			}
			arr[t1][t2] = -1;
			t1 = gX;
			t2 = gY;
			left(gX, gY);
			if (count <= 0) {
				System.exit(0);
			}
			arr[t1][t2] = -1;
		}
	}

	public static void down(int x, int y) {

		System.out.print(arr[x][y] + " ");
		count--;

		// arr[x][y] = -1;
		if (x + 1 >= arr.length || arr[x + 1][y] == -1) {
			gX = x;
			gY = y + 1;
			return;
		}
		down(x + 1, y);
	}

	public static void up(int x, int y) {

		System.out.print(arr[x][y] + " ");
		count--;

		// arr[x][y] = -1;
		if (x - 1 < 0 || arr[x - 1][y] == -1) {
			gX = x;
			gY = y - 1;
			return;
		}
		up(x - 1, y);
	}

	public static void right(int x, int y) {

		System.out.print(arr[x][y] + " ");
		count--;

		// arr[x][y] = -1;
		if (y + 1 >= arr[x].length || arr[x][y + 1] == -1) {
			gX = x - 1;
			gY = y;
			return;
		}
		right(x, y + 1);
	}

	public static void left(int x, int y) {

		System.out.print(arr[x][y] + " ");
		count--;

		// arr[x][y] = -1;
		if (y - 1 < 0 || arr[x][y - 1] == -1) {
			gX = x + 1;
			gY = y;
			return;
		}
		left(x, y - 1);
	}

}

/*
 * public static void main(String[] args) { Scanner scanner = new
 * Scanner(System.in); int[][] arr = new
 * int[scanner.nextInt()][scanner.nextInt()]; int count =
 * arr.length*arr[0].length; for (int x = 0; x < arr.length; x++) { for (int y =
 * 0; y < arr[0].length; y++) { arr[x][y] = scanner.nextInt(); } } Point a = new
 * Point(0,0); Point b = new Point(arr.length,0); Point c = new
 * Point(0,arr[0].length); Point d = new Point(arr.length,arr[0].length);
 * 
 * while (count!=0) {
 * System.err.printf("start(%d,%d)|end(%d,%d)\n",a.x,a.y,b.x,b.y); for(int
 * i=a.x;i<b.x;i++) { System.out.printf("(%d,%d)%d ",i,a.y,arr[i][a.y]);
 * count--; } if(count==0) {break;}
 * System.err.printf("start(%d,%d)|end(%d,%d)\n",b.x,b.y,d.x,d.y); for(int
 * i=b.y+1;i<d.y;i++) { System.out.printf("(%d,%d)%d ",b.x-1,i,arr[b.x-1][i]);
 * count--; } if(count==0) {break;}
 * System.err.printf("start(%d,%d)|end(%d,%d)\n",d.x,d.y,c.x,c.y); for(int
 * i=d.x-1;i>c.x;i--) {
 * System.out.printf("(%d,%d)%d ",i-1,d.y-1,arr[i-1][d.y-1]); count--; }
 * if(count==0) {break;}
 * System.err.printf("start(%d,%d)|end(%d,%d)\n",c.x,c.y,a.x,a.y); for(int
 * i=c.y-2;i>a.y;i--) { System.out.printf("(%d,%d)%d ",c.x,i,arr[c.x][i]);
 * count--; }
 * 
 * a.x++;a.y++; b.x--;b.y++; c.x--;c.y--; d.x++;d.y--; } }
 * 
 * }
 * 
 * class Point { public int x; public int y;
 * 
 * public Point(int x, int y) { this.x=x; this.y=y; } }
 */

// int x = 0, y = 0;
// System.out.print(arr[x][y]);
// while (true) {
// while (x + 1 < arr.length && arr[x + 1][y] != -1) {
// x++;
// System.out.print(" " + arr[x][y]);
// arr[x-1][y] = -1;
// count--;
// }
// if (count <= 0) {
// break;
// }
// while (y + 1 < arr.length && arr[x][y + 1] != -1) {
// y++;
// System.out.print(" " + arr[x][y]);
// arr[x][y-1] = -1;
// count--;
// }
// if (count <= 0) {
// break;
// }
// while (x - 1 >= 0 && arr[x - 1][y] != -1) {
// x--;
// System.out.print(" " + arr[x][y]);
// arr[x+1][y] = -1;
// count--;
// }
// if (count <= 0) {
// break;
// }
// while (y - 1 >= 0 && arr[x][y - 1] != -1) {
// y--;
// System.out.print(" " + arr[x][y]);
// arr[x][y+1] = -1;
// count--;
// }
// if (count <= 0) {
// break;
// }
// }
//
// }
// }
// down(0,0);

// public static void down(int x, int y) {
// if (count != 0) {
// System.out.print(arr[x][y] + " ");
// count--;
// } else {
// System.exit(0);
// }
// arr[x][y] = -1;
// if (x + 1 >= arr.length || arr[x + 1][y] == -1) {
// right(x, y + 1);
// }
// down(x + 1, y);
// }
//
// public static void up(int x, int y) {
// if (count != 0) {
// System.out.print(arr[x][y] + " ");
// count--;
// } else {
// System.exit(0);
// }
// arr[x][y] = -1;
// if (x - 1 < 0 || arr[x - 1][y] == -1) {
// left(x, y - 1);
// }
// up(x - 1, y);
// }
//
// public static void right(int x, int y) {
// if (count != 0) {
// System.out.print(arr[x][y] + " ");
// count--;
// } else {
// System.exit(0);
// }
// arr[x][y] = -1;
// if (y + 1 >= arr[x].length || arr[x][y + 1] == -1) {
// up(x - 1, y);
// }
// right(x, y + 1);
// }
//
// public static void left(int x, int y) {
// if (count != 0) {
// System.out.print(arr[x][y] + " ");
// count--;
// } else {
// System.exit(0);
// }
// arr[x][y] = -1;
// if (y - 1 < 0 || arr[x][y - 1] == -1) {
// down(x + 1, y);
// }
// left(x, y - 1);
// }
