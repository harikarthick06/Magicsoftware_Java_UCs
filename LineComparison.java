public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Line line1 = new Line(new Point(1, 2), new Point(4, 6));
        Line line2 = new Line(new Point(2, 3), new Point(5, 7));

        System.out.println("Length of line1 = " + line1.getLength());
        System.out.println("Length of line2 = " + line2.getLength());

        if (line1.equals(line2)) {
            System.out.println("Both lines are equal.");
        } else {
            System.out.println("Both lines are not equal.");
        }
    }
}