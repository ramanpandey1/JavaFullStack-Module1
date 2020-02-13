package lab6Exercise6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CountingLinesWordsCharacters {
public int countingLines(String fileName) {
	BufferedReader reader;
	int count=0;
	try {
		reader=new BufferedReader(new FileReader(fileName+".txt"));
		String line=reader.readLine();
		while(line!=null) {
			count=count+1;
			line=reader.readLine();
		}
		reader.close();
		return count;
	}
	catch(IOException e) {
		System.out.println("File not found");
	}
	
	return 1;
	
}



public int countingCharacters(String fileName) {
	int countch=0;
	try {
		FileInputStream fileObject;
		fileObject=new FileInputStream(fileName+".txt");
		int character=fileObject.read();
		while(character!=-1) {
			countch++;
			character=fileObject.read();
		}
		fileObject.close();
		return countch;
	}
	catch(IOException e) {
		System.out.println("File not found");
	}
	
	return 1;
}

public int countingWords(String fileName) {
	BufferedReader reader;
	int count=0;
	try {
		reader=new BufferedReader(new FileReader(fileName+".txt"));
		StringBuilder stringBuilderObj= new StringBuilder();
		String line=reader.readLine(); 
		while(line!=null) {
			stringBuilderObj=stringBuilderObj.append(line);
			stringBuilderObj=stringBuilderObj.append(" ");
			line=reader.readLine();
			
		}
		
		String str=new String(stringBuilderObj);
		StringTokenizer tokenObj=new StringTokenizer(str," ");
		while(tokenObj.hasMoreTokens()) {
			tokenObj.nextToken();
			count++;
		}
		reader.close();
		
		return count;
		
	}
		catch(IOException e) {
		System.out.println("File not found.");
	}
	return 1;
}

}
