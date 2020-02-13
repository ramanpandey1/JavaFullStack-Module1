package lab2;


public abstract class Item {
	
	private int identificatioNumber[], numberOfCopies[];
	private String title[];
	
	private int tempId, tempNumCopies;
	private String tempTitle;
	
	//Constructor
	
	public Item(int identificatioNumber[], int numberOfCopies[], String title[]) {
		super();
		this.identificatioNumber = identificatioNumber;
		this.numberOfCopies = numberOfCopies;
		this.title = title;
	}

	
	public Item() {};
	//getter methods
	
	public int[] getIdentificatioNumber() {
		return identificatioNumber;
	}

	public int[] getNumberOfCopies() {
		return numberOfCopies;
	}

	public String[] getTitle() {
		return title;
	}

	//setter methods
	
	public void setIdentificatioNumber(int[] identificatioNumber) {
		this.identificatioNumber = identificatioNumber;
	}

	public void setNumberOfCopies(int[] numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	public void setTitle(String[] title) {
		this.title = title;
	}
	
	public void addItem(String name)
	{
		
		tempId = identificatioNumber[identificatioNumber.length-1]++;
		tempTitle = name;
		tempNumCopies=1;
	}
	
	
	abstract public void print();
	
	abstract public boolean equal();
	
	abstract public void checkIn(String name);
	
	abstract public void checkOut(String name);
	
	

}
