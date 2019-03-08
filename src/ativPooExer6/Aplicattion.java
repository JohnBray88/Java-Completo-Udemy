package ativPooExer6;

import java.util.Scanner;

public class Aplicattion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rooms will be rented: ");
		Integer qtdeRent = sc.nextInt();
		
		Rent[] r = new Rent[qtdeRent];
		
		for(int i = 0; i <  r.length; i++) {
			System.out.println();
			System.out.println("====================================================");
			System.out.println("Rent #"+(i+1)+":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			Integer room = sc.nextInt();
			
			r[i] = new Rent(name,email,room);
		}
		System.out.println();
		System.out.println("====================================================");
		System.out.println("BUSY ROOMS: ");
		for(int i=0;i <= r.length;i++) {
			if(r[i] != null) {
			System.out.println(r[i].getRoom()+": "+ r[i].getName()+", "+r[i].getEmail());
			}
		}
		sc.close();
		
		/*======TEST=========
		 *Maria Green 
		 *maria@gmail.com
		  5
 		
 		  João Pessoa
 		  joao@gmail.com
 		  1
 		  
 		  Alex Brown
 		  alex@gmail.com
 		  8
		 */
	}

}
