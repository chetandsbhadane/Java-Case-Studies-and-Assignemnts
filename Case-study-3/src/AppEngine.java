import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class AppEngine implements UserInterface {
	static Scanner sc=new Scanner(System.in);
	List<Course> cObj = new ArrayList<Course>();
	List<Student> sObj = new ArrayList<Student>();
	List<Enroll> eObj = new ArrayList<Enroll>();
//	List<studentLogin> sLogin = new ArrayList<studentLogin>();
//	List<studentRegistartion> sReg = new ArrayList<studentRegistartion>();
	private  int co,eo;
	private  int lo=co=eo=0;
	Date d1=new Date();

	@Override
	public void showFirstScreen() {
		System.out.println("Welcome to SMS(Student Mgmt. System) v1.0");
		System.out.println("Tell us who you are : \n1. Student\n2. Admin");
		System.out.println("Enter your choice ( 1 or 2 ) : ");
		int op = sc.nextInt();
		switch(op) {
		case 1:
			showStudentScreen();
			break;
		case 2:
			showAdminScreen();
			break;
		}
	}


	@Override
	public void showStudentScreen() {
		int ch;
		do {
			System.out.println("1-Register\n2-login\n3-Show Student Info");
			System.out.println("Enter your choice..");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("enter student name and password..");
				register();
				//				sLogin.add(new studentLogin(sc.next(), sc.nextInt()));
				System.out.println("Registration is done..");
				break;

			case 2:
				System.out.println("enter student name");
				String fname = sc.next();
				System.out.println("enter student name");
				int pass = sc.nextInt();
				for(Student slogin:sObj) {
					if(slogin.getPass() == pass) {
						System.out.println("conneted");
						break;
					}
					else {
						System.out.println("You've to Register first..");
						break;
					}
				}
				
				break;

			case 3:
				for(Student student : sObj) {
					lo++;
					if(student==null)
					{
						break;
					}
					else
						showStudentRegistrationScreen(student);
				}
				break;
			}

		}while(sc.next().equals("yes"));

	}


	public Student Acceptdata()
	{ int id=104;
	//	Student s = new Student();
	System.out.println("\t----------- Enter Student Data-------");
	System.out.println("Enter Id\tEnter name\tEnter MoNo\tEnter DOB\tEnter Password");
	sObj.add(new Student(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextInt()));
	return null;

	}

	public void register()
	{
		Student s=Acceptdata();
		sObj.add(s); 
	}


	public void showStudentRegistrationScreen(Student sObj) {
		System.out.println("hiii");
		System.out.println(sObj.getStudId() + sObj.getStudName());

	}

	@Override
	public void showAdminScreen() {
		// TODO Auto-generated method stub

	}
	@Override
	public void showAllStudentsScreen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void introduceNewCourseScreen() {
		// TODO Auto-generated method stub

	}
	@Override
	public void showAllCoursesScreen() {
		// TODO Auto-generated method stub

	}


	//	@Override
	//	public void showStudentRegistrationScreen() {
	//		// TODO Auto-generated method stub
	//		
	//	}

	//
	//	@Override
	//	public void showStudentRegistrationScreen() {
	//		// TODO Auto-generated method stub
	//		
	//	}


}
