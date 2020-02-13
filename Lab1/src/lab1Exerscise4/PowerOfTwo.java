package lab1Exerscise4;

public class PowerOfTwo {
public boolean chechNumber(int n) {
	if((n&(n-1))==0) {
		return true;
	}
	else {
		return false;
	}
}
}
