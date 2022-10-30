class CTriangle
{
    protected int base;
    protected int height;
    protected void show()
    {
        System.out.println("base="+base+",height="+height);
    }
}
class CData extends CTriangle
{
    public double area;
    public int area()
    {
        return((height*base)/2);
    }
    public CData(int base,int height)
    {
        System.out.println("base="+base+",height="+height);
    }
    public void show() {
        System.out.println("area="+((base*height)%2));
    }
     
}

public class Class06 {
    public static void main(String[] args) {
        CData obj=new CData(3,8);
        obj.show();
        obj.area=12.0;
    }
}
