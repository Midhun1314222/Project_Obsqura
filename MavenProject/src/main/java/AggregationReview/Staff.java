package AggregationReview;

public class Staff {
	String staffName;
	int staffId;
	String staffAddress;
	
	Company c;
	
	public Staff(String staffName,int staffId,String staffAddress,Company c) {
		this.staffName=staffName;
		this.staffId=staffId;
		this.staffAddress=staffAddress;
		this.c=c;
		
	}
	public void display() {
		System.out.println("Staff Name is :"+staffName);
		System.out.println("Staff Name is :"+staffId);
		System.out.println("Staff Name is :"+staffAddress);

	}
	public void display2() {
		System.out.println("Staff Name is :"+c.companyName);
		System.out.println("Staff Name is :"+c.companyId);
		System.out.println("Staff Name is :"+c.companyAddress);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Company obj1 = new Company("rayblaze",33,"gsgd");
Staff obj = new Staff("Midhun",13,"gugdwud",obj1);

obj.display();
obj.display2();

	}

}
