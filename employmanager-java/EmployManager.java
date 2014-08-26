import java.util.*;

public class EmployManager {

	public int maximumEarnings(int[] value, String[] earning) {
		int ret = 0;
		int N = earning.length;
		for(int i = 0; i < N; i++){
		    for(int j = 0; j < i; j++){
		        ret -= earning[i].charAt(j)-'0';
		    }
		}
		
		for(int i = 0; i < N; i++){
		    int val = 0;
		    for(int j = 0; j < N; j++) val += earning[j].charAt(i)-'0';
		    if(val > value[i]){
		        ret += val - value[i];
		    }
		}
		
		
		return ret;
	}

}
