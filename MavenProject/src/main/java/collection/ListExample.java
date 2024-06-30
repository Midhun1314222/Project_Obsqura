package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Midhun");
		list.add("Amal");
		list.add("Vishnu");
		list.add(null);
		System.out.println(list);
		for(String s:list) {
			System.out.println(s);
			
		}
Iterator i=list.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
	}

}
