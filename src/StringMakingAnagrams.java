import java.util.Scanner;

public class StringMakingAnagrams {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		String firstString = inputScanner.nextLine();
		String secondString = inputScanner.nextLine();
		
		inputScanner.close();
		
		char[] firstCharSequence = firstString.toCharArray();
		char[] secondCharSequence = secondString.toCharArray();
		
		int initialAlphabetASCIndex = 97;
		int finalAlphabeticASCIndex = 122;
		
		int arrayLength = finalAlphabeticASCIndex - initialAlphabetASCIndex;
		
		int[] counterASCArrayToFirstString = new int[arrayLength+1];
		int[] counterASCArrayToSecondString = new int[arrayLength+1];
		
		int minimumDeletedCharacters = 0;
		
		for (char c : firstCharSequence) {
			counterASCArrayToFirstString[c-initialAlphabetASCIndex]++;
		}
		
		for (char c : secondCharSequence) {
			counterASCArrayToSecondString[c-initialAlphabetASCIndex]++;
		}
		
		for(int i = 0; i < counterASCArrayToFirstString.length; i++) {
			int diff = counterASCArrayToFirstString[i] - counterASCArrayToSecondString[i];
			if(diff < 0) {
				diff *= -1;
			}
			minimumDeletedCharacters += diff;
		}
		
		System.out.print(minimumDeletedCharacters);
		
	}
	
}
