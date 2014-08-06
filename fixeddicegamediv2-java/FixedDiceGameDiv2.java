import java.util.*;

public class FixedDiceGameDiv2 {

	public double getExpectation(int a, int b) {
		double sum = 0;
		double div = 0;
		for(int i=1; i <= a; i++){
			if(i > b){
				sum += i*b;
				div += b; 
			} else{
				sum += i*(i-1);
				div += i-1;
			}
		}
		
		
		return sum/div;
	}

}
