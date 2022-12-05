import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a = getTriangleSide("a");
        float b = getTriangleSide("b");
        float c = getTriangleSide("c");

        MyTriangle triangle = new MyTriangle(a, b, c);

        printResult("a", triangle.getHeightA());
        printResult("b", triangle.getHeightB());
        printResult("c", triangle.getHeightC());

    }

    private static float getTriangleSide(String sideName) {
        System.out.printf("Введите сторону %s треугольника: ", sideName);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    private static void printResult(String sideName, float height) {
        System.out.printf("Высота к стороне %s треугольника: %.3f\n", sideName, height);
    }
}