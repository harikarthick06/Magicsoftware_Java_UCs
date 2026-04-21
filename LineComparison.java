
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Line line1 = new Line(new Point(1, 2), new Point(4, 6));
        Line line2 = new Line(new Point(1, 1), new Point(7, 8));

        System.out.println("Length of line1 = " + line1.getLength());
        System.out.println("Length of line2 = " + line2.getLength());

        if (line1.equals(line2)) {
            System.out.println("Both lines are equal.");
        } else {
            System.out.println("Both lines are not equal.");
        }

        int result = line1.compareTo(line2);

        if (result == 0) {
            System.out.println("Both lines are equal in length.");
        } else if (result > 0) {
            System.out.println("Line1 is greater than Line2.");
        } else {
            System.out.println("Line1 is less than Line2.");
        }
    }
}