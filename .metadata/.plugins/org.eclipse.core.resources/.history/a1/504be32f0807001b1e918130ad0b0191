package employee.file;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) throws IOException {

		int option;

		Scanner sc = new Scanner(System.in);
		NewEmpManage empManagement = new NewEmpManage();


		do {
			System.out.println("Enter your option \n 1.Add record \n 2.Print file \n 3.Display record \n 4.Search record by id \n 5.Edit record \n 6.Delete record \n 7.Read file \n 8.Exit"); 
			option  = sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter following details to add record");
				System.out.println("Enter ID :");
				int id = sc.nextInt();
				System.out.println("Enter Name :");
				String name = sc.next();
				System.out.println("Enter Department :");
				String department = sc.next();
				System.out.println("Enter Designation :");
				String designation = sc.next();
				System.out.println("Enter Salary :");
				int salary = sc.nextInt();
				empManagement.addRecord(new NewEmp(id, name, department,designation,salary));
				System.out.println("Record added.");
				break;
			case 2:
				PrintStream stream = new PrintStream(new FileOutputStream("C:\\Users\\pushpak.madhavan\\Employee records\\records.txt", true));
				PrintStream console = System.out;
				System.out.println("File written successfully.");
				System.setOut(stream);
				empManagement.displayRecords();
				System.setOut(console);
				break;

			case 3:
				empManagement.displayRecords();
				break;

			case 4: 
				System.out.println("Enter the Employee ID to search :");
				id = sc.nextInt();
				empManagement.search(id);
				break;

			case 5:
				System.out.println("Enter ID to edit.");
				id = sc.nextInt();
				empManagement.edit(id);
				System.out.println("Record has been edited.");
				break;

			case 6:
				System.out.println("Enter ID to delete record");
				id = sc.nextInt();
				empManagement.delete(id);
				System.out.println("Record has been deleted");
				break;
			case 7:
				empManagement.readfile();
				System.out.println("File read successfully.");
				break;

			case 8:
				System.out.println("Wrong choice!.Exit the program");
				break;

			default: 
				System.out.println("Wrong option.");
			}


		}while(option!=8);
		sc.close();
	}

}












































