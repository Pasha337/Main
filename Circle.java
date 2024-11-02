class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    // Конструктор для создания круга с радиусом, цветом заливки и границы
    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    // Метод для расчета периметра круга (формула: 2 * пи * радиус)
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Метод для расчета площади круга (формула: пи * радиус^2)
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Метод для получения цвета заливки
    @Override
    public String getFillColor() {
        return fillColor;
    }

    // Метод для получения цвета границы
    @Override
    public String getBorderColor() {
        return borderColor;
    }
}