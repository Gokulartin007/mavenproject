package javaConcepts;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedString {
	
	public static void ChatMostRepeated() {
		        String[] arr = {"apple", "banana", "apple", "orange", "banana", "apple"};

		        // Create a HashMap to store the frequency of each string
		        HashMap<String, Integer> map = new HashMap<>();

		        // Populate the map with frequencies
		        for (String str : arr) {
		            map.put(str, map.getOrDefault(str, 0) + 1);
		            System.out.println(map);
		        }

		        // Find the most repeated string
		        String mostRepeated = null;
		        int maxCount = 0;

		        for (Map.Entry<String, Integer> entry : map.entrySet()) {
		            if (entry.getValue() > maxCount) {
		                mostRepeated = entry.getKey();
		                maxCount = entry.getValue();
		            }
		        }
		        
		        System.out.println("Most repeated string: " + mostRepeated);
		        System.out.println("Count: " + maxCount);
	}

	public static void main(String[] args) {
		
		ChatMostRepeated();
		// TODO Auto-generated method stub
		String[] arr= {"aaa", "bbb","aaa", "bbb", "aaa", "ccc"};
		int count=0;
		String maxvar = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					maxvar=arr[j];
					break;
					
				}
			}
		}
		System.out.println(count);
		System.out.println(maxvar);
		
	}

}
