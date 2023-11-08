
public class Lab7 {

	public static void main(String[] args) {
		myFileReader fr;
		studentMatcher sm;
		TreeMap<String, TreeSet<String>> readResult = fr.readFileToTreeMap("Movies.csv");
		sm.findMatches(readResult);
	}

}
