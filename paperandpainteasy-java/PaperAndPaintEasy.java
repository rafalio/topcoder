import java.util.*;

public class PaperAndPaintEasy {
	
//	public static void main(String[] args) {
//		System.out.println(new PaperAndPaintEasy().computeArea(202780277, 318110070, 40044318, 9, 1144186, 10474356, 2849401, 25512278));
//	}

	// took a long time due to a simple bug
	
	public long computeArea(int width, int height, int xfold, int cnt, int x1, int y1, int x2, int y2) {
		long squares = (long)width * (long)height;
		
		if(xfold*2 > width){
			xfold = width-xfold;
		}
		long paintedW = 0L;
		long paintedH = (y2-y1)*(cnt+1);
		
		paintedW += x2-x1;
		paintedW += Math.max(0,Math.min(x2,xfold)-x1);
		
		return squares-(paintedW*paintedH);
	}
	
	//{202780277, 318110070, 40044318, 9, 1144186, 10474356, 2849401, 25512278}
	//
	// 63993590307824790

}
