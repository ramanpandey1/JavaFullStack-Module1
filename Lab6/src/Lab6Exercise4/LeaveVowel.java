package Lab6Exercise4;


import java.util.StringTokenizer;

public class LeaveVowel {
public String nextConsonant (String input) {
String newWord="";
for(int index=0;index<input.length();index++) {
	char ch=input.charAt(index);
	if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
	}
	else {
		ch=(char)(ch+1);
	}
	newWord=newWord+ch;
}
return newWord;
}
}
