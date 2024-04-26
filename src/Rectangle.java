public class Rectangle extends Shape
{
    private double length;
    private double width;
    public void setlength(double length){
        this.length=length;
    }
    public double getlength(){
        return length;
    }
    public void setwidth(double width){
        this.width=width;
    }
    public double width(){
        return width;
    }
    //优化后，构造方法，完成对象的初始化
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public void CalculatePerimeter(){
        double Perimeter=2*(length+width);
        System.out.println("矩形的周长是："+Perimeter);
    }
    @Override
    public void CalculateArea(){
        double Area=length*width;
        System.out.println("矩形的面积是："+Area);
    }
}
