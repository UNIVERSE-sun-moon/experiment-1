import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);//read

    public static void main(String[] args) {
        Menu();
    }

    private static void Menu() {
        System.out.println("欢迎使用形状计算系统");
        System.out.println("1.计算形状的周长");
        System.out.println("2.计算形状的面积");
        System.out.println("3.比较大小");
        System.out.println("4.退出系统");
        System.out.println("————————————————————");
        Option();
    }

    private static void Option() {
        while (true) {
            System.out.println("————————————————————");
            System.out.println("请输入您的选择：");
            int charge = sc.nextInt();//read
            switch (charge) {
                case 1:
                    CountCirclePerimeter();
                    CountRectanglePerimeter();
                    CountTrianglePerimeter();
                    break ;
                case 2:
                    CountCircleArea();
                    CountRectangleArea();
                    CountTriangleArea();
                    break ;
                case 3:
                    System.out.println("1.比较三角形和矩形");
                    System.out.println("2.比较三角形和圆形");
                    System.out.println("3.比较矩形和圆形");
                    Compare();
                    break;
                case 4:
                    System.out.println("感谢您的使用!");
                    System.exit(0);
                default:
                    System.out.println("请输入正确的选择！");
                    break ;
            }
        }
    }
    private static void CountCirclePerimeter() {
        System.out.println("请输入圆形的半径：");
        double radio=sc.nextDouble();
        Circle circle=new Circle(radio);
        ShapeCalculate.CalculatePerimeter(circle);
        ShapeCalculate.CalculateArea(circle);
    }
    private static void CountCircleArea(){
        System.out.println("请输入圆形的半径：");
        double radio=sc.nextDouble();
        Circle circle=new Circle(radio);
        ShapeCalculate.CalculateArea(circle);
    }
    private static void CountRectanglePerimeter(){
        System.out.println("请输入矩形的长：");
        double length=sc.nextDouble();
        System.out.println("请输入矩形的宽：");
        double width=sc.nextDouble();
        Rectangle rectangle=new Rectangle(length,width);
        ShapeCalculate.CalculatePerimeter(rectangle);
    }
    private static void CountRectangleArea(){
        System.out.println("请输入矩形的长：");
        double length=sc.nextDouble();
        System.out.println("请输入矩形的宽：");
        double width=sc.nextDouble();
        Rectangle rectangle=new Rectangle(length,width);
        ShapeCalculate.CalculateArea(rectangle);
    }
    private static void CountTrianglePerimeter() {
        System.out.println("请输入三角形的一边长：");
        double length1 = sc.nextDouble();
        System.out.println("请输入三角形的另一边长：");
        double length2 = sc.nextDouble();
        System.out.println("请输入三角形的最后一边长：");
        double length3 = sc.nextDouble();
        Triangle triangle = new Triangle(length1, length2, length3);
        ShapeCalculate.CalculatePerimeter(triangle);
    }
    private static void CountTriangleArea(){
        System.out.println("请输入三角形的一边长：");
        double length1=sc.nextDouble();
        System.out.println("请输入三角形的另一边长：");
        double length2=sc.nextDouble();
        System.out.println("请输入三角形的最后一边长：");
        double length3=sc.nextDouble();
        Triangle triangle=new Triangle(length1,length2,length3);
            ShapeCalculate.CalculateArea(triangle);
        }
    public static void Compare(){
        System.out.println("请选择比较哪两个形状：");
        int option = sc.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("请输入三角形的数据：");
                double a=sc.nextDouble();
                System.out.println("请输入矩形的数据：");
                double b=sc.nextDouble();
                if(a>b){
                    System.out.println("大于");
                }
                if(a<b){
                    System.out.println("小于");
                }
                if(a==b){
                    System.out.println("等于");
                }
                break;
            case 2:
                System.out.println("请输入三角形的数据：");
                double c=sc.nextDouble();
                System.out.println("请输入圆形的数据：");
                double d=sc.nextDouble();
                if(c>d){
                    System.out.println("大于");
                }
                if(c<d){
                    System.out.println("小于");
                }
                if(c==d){
                    System.out.println("等于");
                }
                break;
            case 3:
                System.out.println("请输入矩形的数据：");
                double e=sc.nextDouble();
                System.out.println("请输入圆形的数据：");
                double f=sc.nextDouble();
                if(e>f){
                    System.out.println("大于");
                }
                if(e<f){
                    System.out.println("小于");
                }
                if(e==f){
                    System.out.println("等于");
                }
                break;
        }
    }
}
