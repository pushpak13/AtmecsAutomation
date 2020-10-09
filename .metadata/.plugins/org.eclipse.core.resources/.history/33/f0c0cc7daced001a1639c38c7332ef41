package calculation;

import java.util.Scanner;

public class MenuDrivenForNnumbers  {



	public static void main(String[] args) throws InvalidInputException {
		int option,exit;
		do
		{



			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice from the following menu:");
			System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Evaluation 6.Exit");
			option = sc.nextInt();



			switch(option)
			{
			case 1:
				AdditionOfNnumbers add = new AdditionOfNnumbers();
				add.getResult();

				break;
			case 2:
				SubtractNnumbers sub = new SubtractNnumbers();
				sub.getResult();
				break;
			case 3:
				MultiplyNnumbers mul = new MultiplyNnumbers();
				mul.getResult();
				break;
			case 4:


				DivisionNnumbers div = new DivisionNnumbers();
				div.getResult();
				break;
			case 5:
				ExpressionEvaluation evl = new ExpressionEvaluation();
				evl.getResult();
				break;
			case 6:
				break;
			default:
				throw new InvalidInputException("Invalid Choice...!!");
			}
			System.out.println("Do you want to continue?1.Yes 2.No");
			exit = sc.nextInt();
		}while(exit==1);
	}

       
}





















