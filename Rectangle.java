class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calculateArea();
        calculatePerimeter();
    }

    private void calculateArea() {
        area = length * width;
    }

    private void calculatePerimeter() {
        perimeter = 2 * (length + width);
    }
}
