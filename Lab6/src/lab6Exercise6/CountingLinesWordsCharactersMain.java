package lab6Exercise6;

public class CountingLinesWordsCharactersMain {

	public static void main(String[] args) {
	CountingLinesWordsCharacters object=new CountingLinesWordsCharacters();
	System.out.println("The number of lines are: "+object.countingLines("myfile"));
	System.out.println("The numbet of characters are: "+object.countingCharacters("myfile"));
	System.out.println("The number of words are:"+object.countingWords("myfile"));
	}
}
