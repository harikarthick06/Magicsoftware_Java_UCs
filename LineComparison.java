public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Point p1 = new Point(2, 3);
        Point p2 = new Point(6, 7);

        Line line1 = new Line(p1, p2);

        System.out.println("Length of line1 = " + line1.getLength());
    }
}