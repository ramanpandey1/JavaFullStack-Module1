package lab6Exercise2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByBufferedReader {
public void readFile(String fileName) {
	BufferedReader reader;
	int number=1;
	try {
		reader = new BufferedReader(new FileReader(fileName+".txt"));
		String line=reader.readLine();
		while(line!=null) {
			System.out.println(number+" "+line);
			number++;
			line=reader.readLine();
		}	
		reader.close();
	}
	catch (IOException e) {
		System.out.println("File cannot be found");;
	}
}
}
