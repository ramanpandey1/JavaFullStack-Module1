package lab2;

public class JournalPaper extends WrittenItem {

	public JournalPaper(int identificatioNumber[], int numberOfCopies[], String title[]) {
		super(identificatioNumber, numberOfCopies, title);
		// TODO Auto-generated constructor stub
	}

	
	private int yearPublished;


	public int getYearPublished() {
		return yearPublished;
	}


	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		
	}


	@Override
	public boolean equal() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void checkIn(String name) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void checkOut(String name) {
		// TODO Auto-generated method stub
		
	}
	
	

}
