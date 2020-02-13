package Lab6Exercise3;

public class MirrorString {
public void printMirror(String input) {
	StringBuilder builderObject=new StringBuilder(input);
	builderObject.reverse();
	System.out.println(input+" | "+builderObject);
}

}
