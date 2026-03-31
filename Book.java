package p1;
import java.util.*;
class AvailableBooks{
	int BId,top;
	String Title,Author,Subject;
	AvailableBooks(int BookId,String Tle,String Aut,String Sub){
		BId=BookId;
		Title=Tle;
		Author=Aut;
		Subject=Sub;
	}
	void DisplayBookDetails() {
		System.out.println("Book Id:"+BId);
		System.out.println("Book Title:"+Title);
		System.out.println("Book Author:"+Author);
		System.out.println("Category:"+Subject);
		System.out.println("-----------------------");
	}
	
}
public class Book {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=========== Library Management Console ===========");
		
		System.out.println("\nEnter No of Books");
		int size=sc.nextInt();
		String s;
		AvailableBooks[] AB=new AvailableBooks[size ];
		do
		{
		System.out.println("1.Add books details\n2.Display books\n3.Search books\n4.Sort Books\n5.Student Borrow Record\n6.Manage Student Membership\n7.Book Id Allotment");
	System.out.println("Enter your option");
	int opt=sc.nextInt();
	switch(opt) {
	case 1:
		System.out.println("Enter Following Book Details for "+size+" Books");
		for(int i=0;i<AB.length;i++) {
			System.out.println("Book Id\nBookName\nAuthor\nSubject");
			AB[i] =new AvailableBooks(sc.nextInt(),sc.next(),sc.next(),sc.next());
				}
		break;
	case 2:  
		for(int i=0;i<AB.length;i++) {
		AB[i].DisplayBookDetails();
	}
		break;
	case 3:
		System.out.println("Enter Book Name to Search");
			 String Name=sc.next();
			 boolean found = false;
			 for(int i=0;i<AB.length;i++) {
				 if(Name.equals(AB[i].Title)) {
					 found = true;
					break;
				 }
				 
			 }
			 if(found) {
				 System.out.println("The book is found");
			 }
			 else {
				 System.out.println("The book is not found");
			 }
	break; 
	case 4:
		System.out.println("1.Sort by ID");
		int c=sc.nextInt();
		if(c==1) {
			for(int r=1;r<AB.length;r++) {
				for(int i=0;i<AB.length-r;i++) {
					if(AB[i].BId>AB[i+1].BId) {
						 AvailableBooks temp=AB[i];
						 AB[i]=AB[i+1];
						 AB[i+1]=temp;
						
					}
				}
			}
			for(int i=0;i<AB.length;i++) {
				AB[i].DisplayBookDetails();
			}
			break;
		}
		//else if(c==2) {
			//for(int i=0;i<AB.length;i++) {
				//int j=i+1;
				//AvailableBooks key=AB[j];
				//while(j>=0 && key.Title.compareTo(AB[j-1].Title)<0) {
					//AB[j]=AB[j-1];
					//j--;
				//}
				//AB[j]=key;
			//}
			//for(int i=0;i<AB.length;i++) {
				//AB[i].DisplayBookDetails();
			//}
			//break;
		//}//
		break;
	case 5:
		RegOpp  R=new RegOpp();
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
		 break;
	case 6:
		BookManagment Bm=new BookManagment();
		String C;
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
		C=sc.next();
		}while(C.equals("Yes")||C.equals("YES")||C.equals("yes"));
		break;
	case 7:
		int n,key,index,length;
		System.out.println("Enter Book Allotment length");
		length=sc.nextInt();
		int[] HT=new int[length];
		System.out.println("Enter count of Book Id's");
		n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.println("Enter Book Id at index"+i);
			key=sc.nextInt();
			index=key%length;
			if(HT[index]==0) {
				HT[index]=key;
			}
			else{
				while(index<length && HT[index]!=0)
					index++;
				if(index<0)
					System.out.println("Invalid!");
				else
					HT[index]=key;
			}
		}
		System.out.println("Elements in hash table are:");
		for(int i=0;i<length;i++) {
			if(HT[i]==0)
				System.out.println("No Book ID Elloted at "+i+" is"+HT[i]);
			else
				System.out.println("Book ID Alloted at "+i+" is"+HT[i]);
		}

		break;
	}
	System.out.println("Enter Yes to continue and No to Exit");
	s=sc.next();
		}while(s.equals("Yes")||s.equals("YES")||s.equals("yes"));
	System.out.println("Exiting from the page...........");
	System.out.println("Exited from the page");
	}
}
