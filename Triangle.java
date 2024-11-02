class Triangle implements Shape {
    private double sideA, sideB, sideC;
    private String fillColor;
    private String borderColor;

    // Конструктор для создания треугольника
    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    // Метод для расчета периметра треугольника (сумма сторон)
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    // Метод для расчета площади треугольника (формула Герона)
    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;  // полупериметр
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
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