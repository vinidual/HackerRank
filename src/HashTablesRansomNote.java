
import java.util.ArrayList;
import java.util.Scanner;

public class HashTablesRansomNote {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		scanner.nextLine();
		
		String firstLineWords = scanner.nextLine();
		String secondLineWords = scanner.nextLine();
		
		scanner.close();
		
		if( (firstLineWords.split(" ").length != m) || (secondLineWords.split(" ").length != n) ) {
			System.out.println("No");
			return;	
		}
		
		ArrayList<String> firstLineWordsArray = new ArrayList<String>();
		ArrayList<String> secondLineWordsArray = new ArrayList<String>();
		
		for(String word : firstLineWords.split(" ")) {
			if( word.length() > 5 || word.length() < 1 ) {
				System.out.println("No");
				return;	
			}
			firstLineWordsArray.add(word);
		}
		
		for(String word : secondLineWords.split(" ")) {
			if( word.length() > 5 || word.length() < 1) {
				System.out.println("No");
				return;	
			}
			secondLineWordsArray.add(word);
		}
		
		for(String word : secondLineWordsArray) {
			if( !firstLineWordsArray.contains(word) ) {
				System.out.println("No");
				return;	
			}
			firstLineWordsArray.remove(word);
		}
		
		System.out.println("Yes");
		
	}

}
