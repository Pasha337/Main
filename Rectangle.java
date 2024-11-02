class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;


    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    // Метод для расчета периметра прямоугольника (формула: 2 * (ширина + высота))
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Метод для расчета площади прямоугольника (формула: ширина * высота)
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}