import java.util.Scanner;
import java.util.Stack;

public class StacksBalancedBrackets {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Stack stackOfBrackets = new Stack();
		
		int numberOfStrings = scanner.nextInt();
		
		scanner.nextLine();
		
		String[] responseOfStrings = new String[numberOfStrings];
		
		for(int i = 0; i < numberOfStrings; i++) {
			
			String line = scanner.nextLine();
			
			for(char c : line.toCharArray()) {
				
				if(c == '}' || c == ']' || c == ')') {
					
					if(stackOfBrackets.isEmpty()) {
						responseOfStrings[i] = "NO";
						break;
					}
					
					char last = (char) stackOfBrackets.pop();
					
					if( (c == '}' && last != '{') || (c == ']' && last != '[') || (c == ')' && last != '(')) {
						responseOfStrings[i] = "NO";
						break;
					}
					
				}
				else {
					stackOfBrackets.push(c);
				}
				
			}
			
			if(stackOfBrackets.isEmpty() && responseOfStrings[i] != "NO") {
				responseOfStrings[i] = "YES";
			}
			else {
				responseOfStrings[i] = "NO";
			}
			
			stackOfBrackets.clear();
			
		}
		
		for(String s : responseOfStrings) {
			System.out.println(s);
		}
		
	}
	
}
