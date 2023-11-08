import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class movieRatings {
	
	public static List<String> rankMovies(TreeMap<String, TreeSet<String>> map) {
		
		HashMap<String, Integer> tempMap = new HashMap<String, Integer>(); // make a map that will store an integer value for each movie
		
		for(Map.Entry<String, TreeSet<String>> entry : map.entrySet( )) {
			TreeSet<String> set = entry.getValue();
			for(String movie: set) { //for every movie, for every student, either update the number or give it a number
				
				if(tempMap.containsKey(movie)) {
					tempMap.put(movie, tempMap.get(movie) + 1); //update number
				}
				else {
					tempMap.put(movie, 1); //first time we see a movie

				}
			}
		}
		
		List<String> result = new ArrayList<String>(); //the list to store our results
		
		for(Map.Entry<String, Integer> entry : tempMap.entrySet()) {
			if(result.isEmpty()) //add the first value
				result.add(entry.getKey());
			else {
				for(int i = 0; i <= result.size(); i++) { 
					if(i == result.size()) { //if we have reached the end of the list, add the number
						result.add(entry.getKey());
					}
					else if(tempMap.get(result.get(i)) <= entry.getValue() ){ //if we encounter a number smaller than ours, add it in at that point, shifting everything down.
						result.add(i, entry.getKey());
					}
				}
				
			}
			
		}
		
		return result;
	}
}

