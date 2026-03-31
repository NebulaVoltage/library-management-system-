package p1;
import java.util.Scanner;
class BookManagment{
	int size,top;
	String[] BP;
	BookManagment(){
		size=5;top=-1;
		BP=new String[size];
	}
	void push(String E) {
		BP[++top]=E;
	}
	String pop() {
		return BP[top--]=null;
	}
	void Display() {
		for(int i=0;i<=top;i++) {
			System.out.println(BP[i]);
		}
	}
}
public class StudentAccount {

	public static void main(String[] args) {
		BookManagment Bm=new BookManagment();
		Scanner sc=new Scanner(System.in);
		String c;
		do {
		System.out.println("1.Add a Student\n2.Delete a Student\n3.Display student membership");
		int n=sc.nextInt();
		if(n==1) {
			Bm.push(sc.next());
			System.out.println("Student is Added");
		}
		else if(n==2) {
			Bm.pop();
			System.out.println("Student is removed");
		}
		else if(n==3) {
			Bm.Display();
		}
		System.out.println("Enter Yes to continue");
		c=sc.next();
		}while(c.equals("Yes"));
	}


}
