import java.util.*;

public class FoxSequence {

	public String isValid(int[] seq) {
		int N = seq.length;
		
		if(N < 4) return "NO";
		
		int ptr = 1;
		
		int aDiff = seq[1]-seq[0];
		
		int old = ptr;
		
		while(seq[ptr] > seq[ptr-1]){
			if(seq[ptr] - seq[ptr-1] != aDiff) return "NO";
			ptr++;
			if(ptr == N) return "NO";
		}
		if(ptr == N || ptr == old) return "NO";
		int bDiff = seq[ptr] - seq[ptr-1];
		
		old = ptr;
		while(seq[ptr] < seq[ptr-1]){
			if(seq[ptr] - seq[ptr-1] != bDiff) return "NO";
			ptr++;
			if(ptr == N) return "NO";
		}
		if(ptr == N || old == ptr) return "NO";
		
		old = ptr;
		while(seq[ptr] == seq[ptr-1]){
			ptr++;
			if(ptr == N) return "NO";
		}
		if(ptr == N) return "NO";
		
		old = ptr;
		int cDiff = seq[ptr] - seq[ptr-1];
		while(seq[ptr] > seq[ptr-1]){
			if(seq[ptr] - seq[ptr-1] != cDiff) return "NO";
			ptr++;
			if(ptr == N) return "NO";
		}
		if(ptr == N || old == ptr) return "NO";
		int dDiff = seq[ptr] - seq[ptr-1];
		old = ptr;
		
		while(ptr < N && seq[ptr] < seq[ptr-1]){
			if(seq[ptr] - seq[ptr-1] != dDiff) return "NO";
			ptr++;
		}
		if(ptr == N) return "YES";
		return "NO";
	}

}
