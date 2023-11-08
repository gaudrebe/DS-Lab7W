import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class movieRatings {
	
	public static List<String> rankMovies(TreeMap<String, TreeSet<String>> map) {
		
		HashMap<String, Integer> tempMap = new HashMap<String, Integer>();
		
		for(Map.Entry<String, TreeSet<String>> entry : map.entrySet( )) {
			TreeSet<String> set = entry.getValue();
			for(String movie: set) {
				
				if(tempMap.containsKey(movie)) {
					tempMap.put(movie, tempMap.get(movie) + 1);
				}
				else {
					tempMap.put(movie, 1);

				}
			}
		}
		
		List<String> result = new ArrayList<String>();
		
		for(Map.Entry<String, Integer> entry : tempMap.entrySet()) {
			if(result.isEmpty())
				result.add(entry.getKey());
			else {
				for(int i = 0; i < result.size(); i++) {
					if(tempMap.get(result.get(i)) <= entry.getValue() ){
						result.add(i, entry.getKey());
					}
				}
				
			}
			
		}
		
		return result;
	}
}

