package lab2;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		//initalizing variable of written Item in library
		
		 int idBook[] = {1,2,3,4,5};
		 int noCopiesBook[] = {1,2,4,0,1};
		 String titleBook[] = {"Statistics", "Basic_mathemetics", "Fundamental_of_Physics", "Probability", 
				"C_programing"};
		 String authorBook[] = {"KL Mittal", "Rk jain", "Ravi Shankar", "Rj mukharji", "KN Pandey"};
		 
		 
		 int idJournal[] = {1,2,3,4,5};
		 int numCopiesJournal[] = {1,5,10,1,3};
		 
		 String [] titleJournal = {"Nature", "Nature_Communications", "Science_Advances", "PLOS_ONE",
				 "Proceedings_of_the_Royal_Society_A"};
		 String authorJournal[] = {"Kane Watson", "Rojar", "Raman", "Rajesh Khurana", "RD Sharma"};
		 
		 int yearPublished[] = {1987, 1994, 1879, 1956, 1945};
		
		 //initializing variables of Media Item in Library
		 
		 int idVideo[] = {10,11,12};
		 int noOfCopiesVideo[] = {1, 1,1};
		 String nameVideo[] = {"Media1", "Media2", "Media3"};
		 
		 String director[] = {"Anurag Kashayap", "Rohit Shetty", "Prakash Jha"};
		 int yearReleased[] = {1999, 2010, 2007};
		 
		 int idCd[] = {1,2,3};
		 int numCopiesCd[] = {1,10,1};
		 String []titleCd = {"Cd1", "Cd2", "Cd3"};
		 
		Scanner s = new Scanner(System.in);
		
		//Creating object for  classes
		
		Book b = new Book(idBook, noCopiesBook, titleBook);
		b.setAuthorName(authorBook);
		
		JournalPaper journal = new JournalPaper(idJournal, numCopiesJournal, titleJournal);
		journal.setAuthorName(authorJournal);
		
		Video v = new Video(idVideo, noOfCopiesVideo, nameVideo);
		v.setDirectorName(director);
		v.setYearPublished(yearReleased);
		
		CDs cd = new CDs(idCd, numCopiesCd, titleCd);
		
		
		boolean q = true;
		while(q) {
			
			System.out.println("\n\nEnter 1 for books checkIn");
			System.out.println("Enter 2 for books checkOut");
			System.out.println("Enter 3 for Journal Paper checkIn");
			System.out.println("Enter 4 for Journal Paper checkOut");
			System.out.println("Enter 5 to print Videos avaliable");
			System.out.println("Enter 6 to print Cds avaliable");
			
		int choice1 = s.nextInt();
		switch(choice1)
		{
		case 1:
			System.out.println("Enter book name");
			String name = s.next();
			b.checkIn(name);
			break;
			
		case 2:
			System.out.println("Enter book name");
			String title1 =s.next();
			b.checkOut(title1);
			break;
			
		case 3:
			System.out.println("Enter Journal Paper name");
			String title2 =s.next();
			b.checkIn(title2);
			break;
			
		case 4:
			System.out.println("Enter Journal Paper name");
			String title3 =s.next();
			b.checkIn(title3);
			break;
			
		case 5:
			v.print();
			break;
			
		case 6:
			cd.print();
			break;
			
		default :
			q = false;
		}
		
		}
		
	
		

	}

}
