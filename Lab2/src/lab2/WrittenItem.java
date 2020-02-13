package lab2;

public abstract class WrittenItem extends Item {

	private String authorName[];
	
	public WrittenItem(int identificatioNumber[], int numberOfCopies[], String title[]) {
		super(identificatioNumber, numberOfCopies, title);
		// TODO Auto-generated constructor stub
	}

	
	public String[] getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String[] authorName) {
		this.authorName = authorName;
	}


	private boolean equal(int position)
	{
		if(getNumberOfCopies()[position] != 0)
		   return true;
		return false;
	}
	
	public void checkIn(String title)
	{
	System.out.println(title);	
		for(int i=0; i<getTitle().length; i++)
		{
		
			if (getTitle()[i].equals(title))
			{
				getNumberOfCopies() [i]++;
				System.out.println(getTitle()[i]+" Item has submitted");
				break;
			}
		
		}
		
	}
	
	 public void checkOut(String name)
	 {
	
		 
		 for(int i =0 ; i<getTitle().length; i++)
		 {
			
				if(getTitle()[i].equals(name))
				{
				  if(equal(i))
				  {
					  System.out.println("Item "+getTitle()[i]+" has checked out succesfully");
					  getNumberOfCopies()[i]--;
					  break;
				  }
				  else {
				 
					  System.out.println("being added in library");
					addItem(name);
				  }
			
				
			 }
				
				if(i == getTitle().length-1)
				{
					System.out.println("being added in library");
					addItem(name);
				}
		 
		 }
		 
	 }
}
	
	
