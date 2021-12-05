package codechef;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FootballMatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int t = scanner.nextInt();
			
			while(t-- > 0) {
				Map<String, Integer> map = new HashMap<>();
				
				int n = scanner.nextInt();
				
				for(int i=0; i<n; i++) {
					String a = scanner.next();					
					if(map.containsKey(a)) {
						map.put(a, map.get(a)+1);
					}else {
						map.put(a, 1);
					}													
				}			
				int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
				String aStr = null, bStr = null;
				for(Map.Entry<String, Integer> m : map.entrySet()) {
					if(a == Integer.MAX_VALUE) {
						a = m.getValue();
						aStr = m.getKey();
					}else {
						b = m.getValue();
						bStr = m.getKey();
					}					
				}
				
				if(a == b) {
					System.out.println("Draw");
				}else if(a == Integer.MAX_VALUE) {
					System.out.println(b);
				}else if(b == Integer.MAX_VALUE) {
					System.out.println(b);
				}else if(a > b) {
					System.out.println(aStr);
				}else {
					System.out.println(bStr);
				}				
			}
		}catch(Exception e) {
			System.out.println(e);
			;
		}
		scanner.close();
		System.exit(0);
	}
}
