package lab4Excersie1;

public class SumOfCubes {
public int sumOfCubes(int number) {
	int digit=0,sum=0;
	while(number>0) {
		digit=number%10;
		int digitCube=digit*digit*digit;
		sum=sum+digitCube;
		number=number/10;
	}
	return sum;
}
}
