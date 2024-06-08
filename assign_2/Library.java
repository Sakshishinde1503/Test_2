package assign_2;
import java.util.Scanner;

class Lib
{


	Scanner input=new Scanner(System.in);

	int b_no;
	Book obj1[]=new Book[50];
	void create()
	{
		System.out.println("Enter the number of books:");

		System.out.println("Mayuri Gadhave");

		b_no=input.nextInt();
		for(int i=0;i<b_no;i++)
		{
			obj1[i]=new Book();

			System.out.println("ENTER BOOK DETAILS!!");
			System.out.println("Enter book name:");
			obj1[i].b_name=input.next();

			System.out.println("Enter author name:");
			obj1[i].a_name=input.next();

			System.out.println("Enter ISBN NO of book:");
			obj1[i].isbn_no=input.nextInt();

		}

	}
	void display()
	{
		System.out.println("BOOK NAME\t\t\tAUTHOR NAME\t\t\tISBN NO");
		for(int i=0;i<b_no;i++)
		{
			System.out.println(obj1[i].b_name+"\t\t\t"+obj1[i].a_name+"\t\t\t"+obj1[i].isbn_no);
		}
	}
	void search_isbn()//BINARY SEARCH
	{
		System.out.println("Enter ISBN NO of the book  to be searched:");
		int i_sh=input.nextInt();
		
		int flag=0;
		int low=0;
		int high=b_no-1;
		int mid=0;
		
		for(int i=0;i<b_no;i++)
		{
			mid=(low+high)/2;
			
			if(i_sh==obj1[mid].isbn_no)
			{
				flag=1;
				System.out.println("Book Found");
				break;
			}
			else if(obj1[i].isbn_no<obj1[mid].isbn_no)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
				
		}
		if(flag==0)
		{
			System.out.println("Book Not Found!!");
		}

	}
	void search_author()//LINEAR SEARCH
	{
		int flag=0;
		System.out.println("Enter the author name of the book to be searched:");
		String a_sh=input.next();

		for(int i=0;i<b_no;i++)
		{
			if(obj1[i].a_name.equals(a_sh))
			{
				flag=1;
				System.out.println("BOOK FOUND");
				System.out.println("BOOK NAME: "+obj1[i].b_name);
				System.out.println("AUTHOR NAME: "+obj1[i].a_name);
				System.out.println("ISBN NO: "+obj1[i].isbn_no);
				break;
			}
			else
				flag=0;
		}
		if(flag==0)
			System.out.println("BOOK NOT FOUND!!");

	}
	void b_sort_books()//BUBBLE SORT
	{
		int temp=0;
		int flag=0;

		for(int j=0;j<b_no-1;j++)
		{
			for(int i=0;i<b_no-j-1;i++)
			{
				if(obj1[i].isbn_no>obj1[i+1].isbn_no)
				{
					temp=obj1[i].isbn_no;
					obj1[i].isbn_no=obj1[i+1].isbn_no;
					obj1[i+1].isbn_no=temp;
				}
				else
					flag=0;
			}
			
		}
		for(int i=0;i<b_no;i++)
		{
			System.out.println(obj1[i].b_name+"\t\t\t"+obj1[i].a_name+"\t\t\t"+obj1[i].isbn_no);
		}
	}
	void i_sort_book()//INSERTION SORT
	{
		int temp,j=0;
		for(int i=1;i<b_no-1;i++)
		{
			temp=obj1[i].isbn_no;
			j=i;
			while(j>0)
			{
				obj1[i].isbn_no=obj1[i-1].isbn_no;
				j--;
			}
			obj1[j].isbn_no=temp;
		}
		for(int i=0;i<b_no-1;i++)
		{
			System.out.println(obj1[i].isbn_no);
		}
	}
	void q_sort_book()//QUICK SORT
	{

	}
}
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lib obj2=new Lib();
		obj2.create();
		obj2.display();
		obj2.search_author();
		obj2.b_sort_books();
		//obj2.i_sort_book();
		obj2.search_isbn();
	}

}
