package codechef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ingredients {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			int t = scanner.nextInt();
			
			while(t -- > 0) {				
				int n = scanner.nextInt();
				StringBuilder sb = new StringBuilder();
				for(int i=0; i<n; i++) {
					sb.append(scanner.next()+";");
				}
				String arr [] = sb.toString().split(";");
				List<Map<Character, Integer>> listOfMaps = new ArrayList<>();
				for(int i=0; i<arr.length; i++) {
					listOfMaps.add(getMap(arr[i]));
				}
				int count = 0;
				if(listOfMaps.size() == 1) {
					System.out.println(listOfMaps.get(0).size());
				}else {
					Map<Character, Integer> fMap = listOfMaps.get(0);
					for(Map.Entry<Character, Integer> m : fMap.entrySet()) {
						int counter = 1;
						for(int i=1; i<listOfMaps.size(); i++) {
							if(listOfMaps.get(i).containsKey(m.getKey())) {
								counter += 1;
							}
						}
						//System.out.println(counter);
						if(counter == listOfMaps.size()) {
							count += 1;
						}
					}
					System.out.println(count);
				}
				
				
			}
		}catch(Exception e) {
			
		}
		scanner.close();
		System.exit(0);
	}
	private static Map<Character, Integer> getMap(String s){
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}else {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		return map;
	}
}
