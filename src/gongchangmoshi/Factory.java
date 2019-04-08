package gongchangmoshi;


public class Factory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }else if ("circle".equals(shapeType)){
            return new Circle();
        }else if("rectangle".equals(shapeType)){
            return new Rectangle();
        }else if("square".equals(shapeType)){
            return new Square();
        }
        return null;
    }
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("you draw a circle");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("you draw a rectangle");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("you draw a Square ");
    }
}