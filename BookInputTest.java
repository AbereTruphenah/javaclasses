package classes;
import java.util.Scanner;
class Book{
	String title;
	String author;
	int numberOfPages;
}

public class BookInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Book b=new Book();
		System.out.println("Please enter the title of the book");
		b.title=input.next();
		System.out.println("Please enter the author name");
		b.author=input.next();
		System.out.println("Please enter the number of pages");
		b.numberOfPages=input.nextInt();
		System.out.println("The book title is: "+b.title);
		System.out.println("The book author is: "+b.author);
		System.out.println("The book has "+b.numberOfPages+" pages");

	}

}
