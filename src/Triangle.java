public class Triangle extends Shape{
    private double length1;
    private double length2;
    private double length3;
    public void setlength1(double length1){
        this.length1=length1;
    }
    public double getlength1(){
        return length1;
    }
    public void setlength2(double length1){
        this.length1=length2;
    }
    public double getlength2(){
        return length2;
    }
    public void setlength3(double length1){
        this.length1=length1;
    }
    public double getlength3(){
        return length3;
    }
    //优化后，构造方法，完成对象的初始化
    Triangle(double length1,double length2,double length3){
        this.length1=length1;
        this.length2=length2;
        this.length3=length3;
    }
    @Override
    public void CalculatePerimeter(){
        double Perimeter=length1+length2+length3;
        System.out.println("三角形的周长是："+Perimeter);
    }
    @Override
    public void CalculateArea(){
        double Area=Math.sqrt(0.5*(length1+length2+length3)*(0.5*(length1+length2+length3)-length1)*(0.5*(length1+length2+length3)-length2)*(0.5*(length1+length2+length3)-length3));
        System.out.println("三角形的面积是："+Area);
    }
}
