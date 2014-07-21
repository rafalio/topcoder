public class FormatAmt {

	public String amount(int dollars, int cents) {
		String out = "";
		if(dollars == 0) out += "0";
		else{
			String d = Integer.toString(dollars);
			
			int N = d.length();
			for(int i = N-1; i >= 0; i-=3){
				boolean comma = (i-1 >= 0 && i-2 >= 0);
				out = d.charAt(i) + out;
				if(i-1 >= 0) out = d.charAt(i-1) + out;
				if(i-2 >= 0) out = d.charAt(i-2) + out;

				if(comma && i-2 != 0) out = ","+out;
			}
		}
		out = "$" + out;
		out += '.';
		if(cents <= 9) out += "0"+cents;
		else out+= Integer.toString(cents);
		
		return out;
		
		
		
		
	}

}
