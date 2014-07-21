import java.util.*;

public class LittleElephantAndBooks {

	public int getNumber(int[] pages, int number) {
		Arrays.sort(pages);
		int p = 0;
		for(int i = 0; i < number-1; i++){
			p += pages[i];
		}
		p += pages[number];
		return p;
	}

}
