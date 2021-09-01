package Phase1_Project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main_Class {

	public static void menu() {	//Method for Menu Options
		System.out.println(" ");

		System.out.println("What do you want to do:-");
		System.out.println("1- Want to see directory list");
		System.out.println("2- Add a file to the existing directory list");
		System.out.println("3- Delete a file from the existing directory list");
		System.out.println("4- Search a file from the main directory");
		System.out.println("5- Exit");
		System.out.println(" ");
	}

	public static void main(String[] args) { 

		boolean menuCheck = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("Hello, Welcome to the project..!!!");
		System.out.println(" ");
		System.out.println("Project Name:- Virtual Key for Your Repositories ");
		System.out.println("Developer Name:- Akash Sahu");
		System.out.println("Designation:- SDE Trainee");

		System.out.println(" ");


		do {
			File file = new File("C:\\Users\\akash\\eclipse-workspace\\CoreJava\\src\\CHECKING");
			String contents[] = file.list();//Storing files and folders name into a string array

			menu();	//menu method called

			int input = sc.nextInt();

			switch (input) {
			case 1:

				System.out.println("List of files and directories in the specified directory:");
				for (int i = 0; i < contents.length; i++)
					System.out.println(contents[i]);

				break;
			case 2://Adding a file
				System.out.println("Specify the file name with extension!");

				try {
					String s = sc.next();
					file = new File("C:\\Users\\akash\\eclipse-workspace\\CoreJava\\src\\CHECKING\\" + s);//path where you want to add a file

					if (file.createNewFile()) {//returns true , if file is created
						System.out.println("New File is created:" + file.getName());
					} else {
						if (file.exists()) {
							System.out.println("Its already exist");
						} else {
							System.out.println("File doesn't exists");
						}

					}
				} catch (IOException e) {
					e.printStackTrace();
				}

				break;

			case 3://To delete a file
					
				System.out.println("Specify the correct file name you want to delete");
				String str = sc.next();

				File file1 = new File("C:\\Users\\akash\\eclipse-workspace\\CoreJava\\src\\CHECKING\\" + str);

				int flag1 = 0;
				for (int i = 0; i < contents.length; i++) {
					Object check = contents[i];
					if (str.equals(check)) {
						flag1 = 1;//Flag triggered means, user specifiede name and file in directory got matched
						if (file1.delete())
							System.out.println("File deleted :" + file1.getName());
						else
							System.out.println("File NOT deleted successfully" + file1.getName());
						break;
					}
				}
				if (flag1 == 0)
					System.out.println("Such file doesn't exist");

				break;

			case 4://Searching a file
				System.out.println("Enter the file name you want to search:");
				String str1 = sc.next();

				String content1[] = file.list();
				boolean flag = false;

				for (int i = 0; i < content1.length; i++) {

					Object check1 = content1[i];
					if (str1.equals(check1)) {
						flag = true;
						break;
					}
				}

				if (flag == true)
					System.out.println("File is FOUND..!");
				else
					System.out.println("File NOT FOUND..!");

				break;

			case 5:
				System.out.println("The application has been closed, Thank you");
				menuCheck = true;
				sc.close();

				break;

			}

		} while (menuCheck == false);

	}

}
