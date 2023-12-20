//Incorrect : not following ocp

class Rectangle{
    int width;
    int height;
}

class AreaCalculator{
    double calculateArea(Rectangle rectangle) {
        return rectangle.width * rectangle.height;
    }
}

// Correct:following OCP using interface

interface Shape{
    double calculatorArea();
}

class Rectangle implements Shape{
    int width;
    int height;

    public double calculatorArea(){
        return width * height;
    }
}

class Circle implements Shape {
    int radius;


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}