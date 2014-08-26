import java.util.*;

public class CatAndRat {

	public double getTime(int R, int T, int Vrat, int Vcat) {
	    if(Vrat >= Vcat) return -1;
	    
	    // rat slower than cat, it MUST get caught eventually
	    
	    double C = 2*Math.PI*R;
	    double startRat = Math.min(C/2, T*Vrat);
	    
	    return startRat / (Vcat-Vrat);
	    
	}

}
