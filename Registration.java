package p1;
import java.util.*;
class RegNode{
	String Data1,Data4,Data5;
	int Data2,Data3;
	RegNode Next;
}
class RegOpp{
	RegNode NewNode,CNode,Head;
	void create() {
		NewNode=new RegNode();
		NewNode.Data1="Ramayan";
		NewNode.Data2=111;
		NewNode.Data3=101;
		NewNode.Data4="Mar 11th 2026";
		NewNode.Data5="Mar 21th 2026";
		if(Head==null) {
			Head=NewNode;
		}
		else {
			CNode=Head;
			while(CNode.Next!=null) {
				CNode=CNode.Next;
			}
			CNode.Next=NewNode;
		}
		NewNode.Next=null;
	}
	void Display() {
		CNode=Head;
		while(CNode!=null) {
			System.out.println("Book Name:"+CNode.Data1);
			System.out.println("Book Id:"+CNode.Data2);
			System.out.println("Student id:"+CNode.Data3);
			System.out.println("Book Borrowed:"+CNode.Data4);
			System.out.println("Book Return:"+CNode.Data5);
			CNode=CNode.Next;
		}
	}
	void AddLast() {
		Scanner sc=new Scanner(System.in);
		NewNode=new RegNode();
		NewNode.Data1=sc.next();
		NewNode.Data2=sc.nextInt();
		NewNode.Data3=sc.nextInt();
		NewNode.Data4=sc.next();
		NewNode.Data5=sc.next();
		if(Head==null) {
			Head=NewNode;
		}
		else {
			CNode=Head;
			while(CNode.Next!=null) {
				CNode=CNode.Next;
			}
			CNode.Next=NewNode;
		}
		NewNode.Next=null;
	}
}
public class Registration {

	public static void main(String[] args) {
		RegOpp  R=new RegOpp();
		Scanner sc=new Scanner(System.in);
		 String choice;
		 R.create();
		 do {
		System.out.println("1.Display Student Book Borrow Data\n2.Add Student Borrowing Book");
 System.out.println("Enter Your Choice:");
 int p=sc.nextInt();
 if(p==1) {
	 R.Display();
 }
 else if(p==2) {
             R.AddLast(); 
             System.out.println("Data Added!");
 }
	         System.out.println("Enter Yes to continue");
	         choice=sc.next();
}
while(choice.equals("Yes"));
	}

}
