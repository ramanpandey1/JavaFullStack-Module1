package lab2;

public class CDs extends WrittenItem {

	public CDs(int identificatioNumber[], int numberOfCopies[], String title[]) {
		super(identificatioNumber, numberOfCopies, title);
		// TODO Auto-generated constructor stub
	}
	
	private String directo;
	private String genre;
	private int yearReleased;
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Avaliable Media items are");
		
		System.out.println("Identification Number     number of copies     title of item");

				for(int i =0; i<getTitle().length; i++)
				{
					
					System.out.println(getIdentificatioNumber()[i]+"                           "
					+getNumberOfCopies()[i]+"                  "+getTitle()[i]);
				}
			}
			
		
	
	@Override
	public boolean equal() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void checkIn(String title) {
		// TODO Auto-generated method stub
		super.checkIn(title);
	}
	@Override
	public void checkOut(String title) {
		// TODO Auto-generated method stub
		
		super.checkOut(title);
	}
	
}
