package chouxianggongchang;
//抽象工厂模式就是生产工厂的模式
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
