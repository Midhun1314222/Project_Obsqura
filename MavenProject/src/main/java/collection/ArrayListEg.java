package collection;

import java.util.ArrayList;
public class ArrayListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> s=new ArrayList<String>();
s.add("Midhun");
s.add("Amal");
s.add("Akash");
s.add("Arjun");
System.out.println(s);
s.remove(2);
System.out.println(s);
int x=s.size();
System.out.println(x);
System.out.println(s.get(1));
System.out.println(s.contains("athul"));

ArrayList<String> r=new ArrayList<String>();
r.add("Vishnu");
r.add("Athul");
r.add("Nithin");
r.add("Ashwin");
System.out.println(r);
r.addAll(r);
System.out.println(r);


	}

}
