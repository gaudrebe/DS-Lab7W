import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Student Matcher class for Lab 7.
 * @author Ben Gaudreau
 * @version Nov. 8, 2023
 */
public class studentsMatcher {
	
	public studentMatcher() {
		
	}
	
	/**
	 * Returns a TreeMap 
	 */
	public TreeMap<String, String> static findMatches(TreeMap<String, TreeSet<String>> input) {
		TreeMap<String, String> result = new TreeMap<String, String>;
		for (Map.Entry<String, TreeSet<String>> currEntry : input.entrySet()) {
			String currStudent = currEntry.getKey();
			
			String bestStudent;
			int maxScore = 0;
			for (String otherStudent : input.keySet()) {
				int movieScore = 0;
				
				if (currStudent.equals(otherStudent))) {
					movieScore = 0;
				}
				if (movieScore > maxScore) {
					bestStudent = otherStudent;
				}
			}
			result.put(currStudent, bestStudent);
		}
		return result;
	}
}
