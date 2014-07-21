import java.util.Arrays;

public class MonochromaticBoard {

	public int theMin(String[] board) {
		int H = board.length;
		int W = board[0].length();
		int cnt = 0;
		char[] bW = new char[W];
		char[] bH = new char[H];
		Arrays.fill(bW, 'B');
		Arrays.fill(bH, 'B');
		
		String bWs = new String(bW);
		String bHs = new String(bH);
		for(String s : board){
			if(s.equals(bWs)) cnt++;
		}
		for(int i = 0; i < W; i++){
			String aa = "";
			for(int j = 0; j < H; j++){
				aa += board[j].charAt(i)+"";
			}
			if(aa.equals(bHs)) cnt++;
		}
		
		if(cnt == H+W) return Math.min(H,W);
		return cnt;
	}

}
