import java.util.Scanner;
import java.util.StringTokenizer;


public class Translator {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		if(isBin(input))
			System.out.println(getText(input));
		else
			System.out.println(getBin(input));
	}
	
	private static String getText(String input){
		String output = "";
		
		StringTokenizer st = new StringTokenizer(input);
		while(st.hasMoreTokens()){
			output += (char)(Integer.parseInt(st.nextToken(),2));
		}
		
		return output;
	}
	
	private static String getBin(String input){
		String output = "";
		
		for(int i=0; i<input.length(); i++){
			output += Integer.toBinaryString((int)input.charAt(i)) + " ";
		}
		
		return output.trim();
	}
	
	private static boolean isBin(String s){
		for(int i=0; i<s.length(); i++)
			if(s.charAt(i)!='0'  &&  s.charAt(i)!='1'  &&  s.charAt(i)!=' ')
				return false;
		return true;
	}
	
}
