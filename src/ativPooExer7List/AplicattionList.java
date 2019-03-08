package ativPooExer7List;
import java.util.ArrayList;
import java.util.Scanner;

public class AplicattionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees wil be registered? ");
		Integer qtdeLoop = sc.nextInt();
		
		ArrayList<EmployeerList> empl = new ArrayList<>();
		
		for(int i =0;i<qtdeLoop;i++) {
			System.out.println();
			System.out.println("=======================================================");
			System.out.println("Employee #"+(i+1)+":");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			empl.add(i,new EmployeerList(id,name,salary));
		}
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		Integer id = sc.nextInt();
		
		//Syntax is wrong
        EmployeerList em = empl.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        
        if(em == null) {
        	System.out.println();
			System.out.println("This id does not exist!");
        }else {
        	System.out.println();
        	System.out.println("Enter the percentage: ");
    		Double perc = sc.nextDouble();
			em.increaseSalary(perc);
        }
        //Syntax is wrong
        System.out.println();
        System.out.println("==================================================");
        System.out.println("List of Employeers: ");
        for(EmployeerList x : empl) {
        	System.out.println(x.getId()+", "+x.getName()+", "+x.getSalary());
        }
		/*
		for(int i = 0;i<empl.size();i++) {
			if(empl.isEmpty()) {
				System.out.println("This id does not exist!");
			}
		}
		*/
		/*
		=======TEST========
				3

				333
				Maria Brown
				4000.00

				536
				Alex Grey 
				3000.00

				772
				Bob Green
				5000.00

		Enter the employee id that will have salary increase : 536 
		Enter the percentage: 10.0
		
		List of employees: 
		333, Maria Brown, 4000.00 536, Alex Grey, 3300.00 772, Bob Green, 5000.00

		=======TEST2=======
				2

				333
				Maria Brown
				4000.00

				536
				Alex Grey
				3000.00
				
				Enter the employee id that will have salary increase: 776 
				This id does not exist!
				
				List of employees:
				 333, Maria Brown, 4000.00 536, Alex Grey, 3000.0

				*/
		
		sc.close();
		
	}

}
