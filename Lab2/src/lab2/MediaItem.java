package lab2;


public abstract class MediaItem extends Item {

	public MediaItem(int identificatioNumber[], int numberOfCopies[], String title[]) {
		super(identificatioNumber, numberOfCopies, title);
		// TODO Auto-generated constructor stub
	}

	public MediaItem() {};
	
	@Override
	abstract public void print();

	@Override
	abstract public void checkIn(String name);

	@Override
	abstract public void checkOut(String name); 

}
