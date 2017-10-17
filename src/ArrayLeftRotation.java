import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        
        int a[] = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        in.close();
        
        if(n == k) {
        	System.out.println(
        		Arrays.toString(a).replace("[", "").replace("]", "").replace(",", "")
    		);
        }
        else {
        	int b[] = new int[n];
        	int init = 0;
        	int i = k;
        	while(i < n) {
        		b[init] = a[i];
        		i++;
        		init++;
        	}
        	int l = 0;
        	while(init < n) {
        		b[init] = a[l];
        		init++;
        		l++;
        	}
        	System.out.println(
        		Arrays.toString(b).replace("[", "").replace("]", "").replace(",", "")
    		);
        }
        
    }
	
}