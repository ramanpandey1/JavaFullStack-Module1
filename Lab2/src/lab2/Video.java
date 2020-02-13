package lab2;

public class Video extends MediaItem {

	public Video(int identificatioNumber[], int numberOfCopies[], String title[]) {
		super(identificatioNumber, numberOfCopies, title);
		// TODO Auto-generated constructor stub
	}
	
	private String directorName[];
	private String gener[]; 
	private int yearPublished[];
	
	public Video() {};
	
	
	public String[] getDirectorName() {
		return directorName;
	}
	public String[] getGener() {
		return gener;
	}
	public int[] getYearPublished() {
		return yearPublished;
	}
	public void setDirectorName(String[] directorName) {
		this.directorName = directorName;
	}
	public void setGener(String[] gener) {
		this.gener = gener;
	}
	public void setYearPublished(int[] yearPublished) {
		this.yearPublished = yearPublished;
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
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
System.out.println("Avaliable Media items are");
		
System.out.println("Identification Number     number of copies     title of item      director         year released");

		for(int i =0; i<getTitle().length; i++)
		{
			
			System.out.println(getIdentificatioNumber()[i]+"                           "
			+getNumberOfCopies()[i]+"                  "+getTitle()[i]+"            "
			+getDirectorName()[i]+"             "+getYearPublished()[i]);
		}
	}
	
	
}
