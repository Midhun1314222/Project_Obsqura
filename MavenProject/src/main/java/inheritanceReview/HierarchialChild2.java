package inheritanceReview;

public class HierarchialChild2 extends HierarchialParent{
	public void division() {
		int f=a/b;
		System.out.println(f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChild2 obj = new HierarchialChild2();
	        obj.addition();       // Addition result: 30
	        HierarchialChild childObj = new HierarchialChild();
	        childObj.subraction();    // Subtraction result: -10
	        HierarchialChild1 child1Obj = new HierarchialChild1();
	        child1Obj.multiplication(); // Multiplication result: 200
	        obj.division();       // Division result: 0

	}

}
