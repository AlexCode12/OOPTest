public class Rectangle {
    float length;
    float width;

    public Rectangle () {
        length = 1.5f;
        width = 1.0f;
    }
    public Rectangle (float l, float w) {
        length = l;
        width = w;
    }
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea () {
        return length*width;
    }
    public double getPerimeter () {
        return length*2 + width*2;
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        System.out.println(rc.getArea());
        System.out.println(rc.getPerimeter());
    }
}
