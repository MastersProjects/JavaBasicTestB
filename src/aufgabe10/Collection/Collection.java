package aufgabe10.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collection {
	protected Map<String, Double> map;
	protected Set<String> set;
	
	protected Collection(){
		map = new HashMap<String, Double>();
		set = new HashSet<String>();
	}

}
