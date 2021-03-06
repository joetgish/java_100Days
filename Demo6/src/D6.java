/**   
*  
* @author WJ Welch
*  Date: 28 Feb 2021
*  Description: CMIS 141 Assignment 6
*               Accepts students names, grades and outputs the highest, lowest and list
*  Notes, comments:
*
*/  
import java.util.Scanner;
public class D6 {
	
    public static void main(String[] args) {
		Scanner scanint = new Scanner(System.in);
		Scanner scanstr = new Scanner(System.in);
		
		int studentCount;
		
		System.out.println("How many students do you want to enter: ");
		studentCount = scanint.nextInt();
		
		String [] names = new String[studentCount];
		int [] scores = new int[studentCount];
		
		for (int ix = 0; ix < studentCount; ix++) {
			System.out.print("Student ");
			System.out.println(ix + 1);
			
			System.out.print("\tEnter student's name:");
			names[ix] = scanstr.nextLine();
			System.out.print("\tEnter student's score (0-100):");
			scores[ix] = scanstr.nextInt();
			scanstr.nextLine();			
		}//end for()
		
		printAry(names, scores);
		printHighest(names, scores);
		printLowest(names, scores);		
		
		scanint.close();
		scanstr.close();		
    }//end main    
    
    public static void printAry(String students[], int grades[]) {
		System.out.println("\n\nStudent grade roster:");
		
		for (int ix = 0; ix < students.length; ix++) {
			System.out.printf("%10s %4d\n", students[ix],grades[ix] );			
		}//end for		
	}//end printAry()
    
    public static void printHighest(String students[], int grades[]) {    	
    	String highestName = "";
    	int highestGrade = 0;
    	
    	for (int ix = 0; ix < students.length; ix++) {
			if (grades[ix] > highestGrade){
				highestGrade = grades[ix];
				highestName = students[ix];				
			}
			
		}//end for    	
    	System.out.printf("\n%10s has the highest score => %4d", highestName, highestGrade );    	
    }//end printHighest()
    
    public static void printLowest(String students[], int grades[]) {    	
    	String lowestName = "";
    	int lowestGrade = 110;
    	
    	for (int ix = 0; ix < students.length; ix++) {
			if (grades[ix] < lowestGrade){
				lowestGrade = grades[ix];
				lowestName = students[ix];				
			}			
		}//end for    	
    	System.out.printf("\n%10s has the lowest score => %4d\n", lowestName, lowestGrade );    	
    }//end printLowest()    
}//end class Demo6