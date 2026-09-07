class Square {
    float s;

    Square(float s) {
        this.s = s;
    }

    void area() {
        System.out.println("Area = " + (s * s));
    }
}

public class SquareTest {
    public static void main(String[] args) {

        float s = 5;

        Square obj = new Square(s);
        obj.area();
    }
}