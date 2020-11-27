package StudentDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,ArrayList<String>> multi=new HashMap<String,ArrayList<String>>();
		
		multi.put("Cs", new ArrayList<String>());
		multi.put("Ec", new ArrayList<String>());
		
		multi.get("Cs").add("Student 1");
		multi.get("Ec").add("Student 2");
		multi.get("Ec").add("Student 3");
		multi.get("Cs").add("Student 4");
		
		System.out.println(multi.get("Cs"));
		System.out.println(multi.get("Ec"));
		
		 }
		
		
		
	}

