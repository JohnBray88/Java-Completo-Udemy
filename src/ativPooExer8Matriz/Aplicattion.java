package ativPooExer8Matriz;
import java.util.Scanner;
public class Aplicattion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] mat = new int[r][c];
		for(int i =0;i<mat.length;i++) {
			for(int j =0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Enter the value of x: ");
		int x = sc.nextInt();
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j] == x) {
					System.out.println();
					System.out.println("Position: "+i+","+j);
					if(j>0) {
						System.out.println("Left: "+mat[i][j-1]);
					}
					if(j < mat[i].length-1) {
						System.out.println("Right: "+mat[i][j+1]);
					}
					if(i < mat.length-1 ) {
						System.out.println("Down: "+mat[i+1][j]);
					}
					if(i > 0) {
						System.out.println("Up: "+mat[i-1][j]);
					}
				}
			}
		}
		/*
		 * ========TEST========
			3 4
			10 8 15 12
			21 11 23 8
			14 5 13 19

			X=8

			Position 0,1:
			Left: 10
			Right: 15
			Down: 11

			Position:1,3
			Left: 23
			Up: 12
			Down:19
		 * 
		 */
		sc.close();
	}
}
