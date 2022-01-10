/**  (Begins the comment)
*  
* @author WJ Welch
*  Date: 26 Aug 2021
*  Course/Section CMIS 141
*  Description: More practice!
*
*/  

import java.util.Scanner;

public class Practice_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary;
		double taxRate = .15;
		double tax;
		double netSalary;
		double netMonthly;
		
		for (salary = 10000; salary <= 60000; salary = salary + 2000)
		{			
			tax = salary * taxRate;
			netSalary = salary - tax;
			netMonthly = netSalary / 12;
			
			System.out.printf("Yearly net salary: $  %7.2f \n", netSalary);
			System.out.printf("Monthly net salary:$  %7.2f \n", netMonthly);
			
			if (salary >= 40000 ) {
				System.out.println("Nice salary - seek additional responsibilities!");
			}
			else if (salary >= 25000 ){
				System.out.println("Build skills, transfer jobs");
			}
			else {
				System.out.println("Let's talk!");
			}
			
			System.out.printf("\n");
		}// end for


		
		
		sc.close();
		 

	}// end main()

}// end class
