package inheritanceReview;

public class MultilevelChild1 extends MultilevelChild {
    public void multiplication() {
        int e = a * b;
        System.out.println(e);
    }

    public static void main(String[] args) {
        MultilevelChild1 obj = new MultilevelChild1();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
    }
}