class Rectangle {
    float l;
    float w;

    Rectangle(float l, float w) {
        this.l = l;
        this.w = w;
    }

    void area() {
        System.out.println("Area = " + (l * w));
    }
}

public class RectangleTest {
    public static void main(String[] args) {

        float l = 10;
        float w = 5;

        Rectangle obj = new Rectangle(l, w);
        obj.area();
    }
}