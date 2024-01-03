package bridgelabz_Practise_programs;
import java.util.Scanner;

public class Array_average_of_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number of elements/numbers");
	      int num = sc.nextInt();

	      //Creating an array
	      int[] myArray = new int[num];

	      //Read numbers from user and store it in an array
	      System.out.println("Enter the numbers one by one : ");
	    //  System.out.println("Press Enter button after each number : ");

	      for(int i =0; i<num; i++){
	         myArray[i] = sc.nextInt();
	      }

	      //Calculate the average
	      double average = 0;
	      for(int i =0; i<num; i++){
	         average = average + myArray[i];
	      }

	      average = average/num;
	      System.out.println("Average of given numbers :: "+average);
	   }
	}
	
