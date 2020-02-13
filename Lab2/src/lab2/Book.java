package lab2;

import java.util.Scanner;

public class Book extends WrittenItem {

	public Book(int identificatioNumber[], int numberOfCopies[], String title[]) {
		super(identificatioNumber, numberOfCopies, title);
		// TODO Auto-generated constructor stub
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
	public void checkIn(String title) {
		// TODO Auto-generated method stub
		super.checkIn(title);
	}

	@Override
	public void checkOut(String name) {
		// TODO Auto-generated method stub
		super.checkOut(name);
	}

	
}

