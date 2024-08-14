package codsoft;

import java.util.Scanner;

public class Markscalculator {
   public static void main(String[] args) {
	   try (Scanner scanner = new Scanner(System.in)) {
 
	  System.out.println("Enter marks for 5 subjects out of 100:");
	  int subject1 = scanner.nextInt();
	  int subject2 = scanner.nextInt();
	  int subject3 = scanner.nextInt();
	  int subject4 = scanner.nextInt();
	  int subject5 = scanner.nextInt();
	  
	  int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
	  double averagePercentage = (double) totalMarks / 5;
	  
	  char grade;
	  if (averagePercentage >= 90) {
		  grade = 'A';
	  } else if (averagePercentage >= 80) {
		  grade = 'B';
	  } else if (averagePercentage >= 70) {
		  grade = 'C';
	  }else if (averagePercentage >= 60) {
		  grade = 'D';
	  }else {
		  grade = 'F';
	  }
	  
	  System.out.println("Total Marks: "+ totalMarks);
	  System.out.println("Average Percentage: " + averagePercentage + "%");
	  System.out.println("Grade: " + grade);
	  }
   
}
}