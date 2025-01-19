public class Main1 {
    public static void main(String[] args) {
        int x, y;
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        x = 5;
        y = 2 * x;

        area = (B + b) / (2.0 * h);

        System.out.println("Value of y: " + y);
        System.out.println("Area: " + area); // esse + é para nao precisar colcoar o %f
    }
}
