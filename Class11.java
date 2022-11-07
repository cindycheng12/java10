class CShape{    //父類別
    public double area()
    {
        return 0.0;
    }
    public void show() {
        System.out.println("area="+0.0);
    }
}
class CCircle extends CShape  //圓形子類別
{
    protected static double pi=3.14;
    protected double radius;
    public CCircle (double r){
        radius=r;
    }
    public void show() 
    {
        System.out.println("Circle area="+radius*radius*pi);
    }
}
class CSquare extends CShape  //正方形子類別
{
    protected double side;
    public CSquare(double s){
        side=s;
    }
    public void show() 
    {
        System.out.println("Square area="+side*side);
    }
}
class CTriangle extends CShape  //三角形子類別
{
    protected int weight;
    protected int height;
    public CTriangle(int w,int h){
        weight=w;
        height=h;
    }
    public void show() 
    {
        System.out.println("Triangle area="+(weight*height)/2);
    }
}
public class Class11 {
    public static void main(String[] args) {
        CCircle Circle=new CCircle(2.0);
        Circle.show();
        CSquare square =new CSquare(2.0);
        square.show();
        CTriangle triangle =new CTriangle(5, 4);
        triangle.show();
    }
}
//(e)在找尋最大值時，不知道要歸在哪個位置去做函數
