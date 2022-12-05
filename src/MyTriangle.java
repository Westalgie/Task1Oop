public class MyTriangle {
    private final float a;
    private final float b;
    private final float c;

    private final float n;

    public MyTriangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;

        float p = getSemiPerimeter(this.a, this.b, this.c);
        this. n = getHeightNumerator(p);
    }

    private float getSemiPerimeter(float a, float b, float c) {
        return (a + b + c) / 2;
    }

    private float getHeightNumerator(float p) {
        return 2 * (float)Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public float getHeightA() {
        return n/a;
    }

    public float getHeightB() {
        return n/b;
    }

    public float getHeightC() {
        return n/c;
    }
}
