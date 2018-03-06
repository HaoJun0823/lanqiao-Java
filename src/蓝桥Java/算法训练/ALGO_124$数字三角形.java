package 蓝桥Java.算法训练;

import java.util.Scanner;

public class ALGO_124$数字三角形 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n + 2][n + 2];
		for (int x = 1; x <= n; x++) {
			for (int y = 1; y <= x; y++) {
				arr[x][y] = scanner.nextInt();
			}
		}
		for (int x = n; x > 0; x--) {
			for (int y = 1; y <= x; y++) {
				arr[x-1][y]+=Math.max(arr[x][y], arr[x][y+1]);
			}
		}		
		System.out.println(arr[1][1]);
		
//		 for(int x=1;x<=n;x++) {
//		 for(int y=1;y<=x;y++) {
//		 System.out.print(arr[x][y]+" ");
//		 }
//		 System.out.println();
//		 }
	}
}
