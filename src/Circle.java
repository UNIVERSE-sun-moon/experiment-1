public class Circle extends Shape
{
    private double radio;
    public void setradio(double radio) {
        this.radio = radio;
    }
    public double getradio() {
        return radio;
    }
    //优化后，构造方法，完成对象的初始化
    Circle(double radio){
        this.radio=radio;
    }
    @Override
    public void CalculatePerimeter(){
        double Perimeter=2*Math.PI*radio;
        System.out.println("圆形的周长是："+Perimeter);
    }
    @Override
    public void CalculateArea(){
        double Area=Math.PI*radio*radio;
        System.out.println("圆形的面积是："+Area);
    }
}