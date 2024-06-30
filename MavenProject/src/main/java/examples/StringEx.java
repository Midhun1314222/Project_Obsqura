package examples;

public class StringEx {
	String s="Myname";
	public StringEx(String s) {
		this.s=s;
	}
	public void display() {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringEx obj=new StringEx("s");
		obj.display();

	}

}
