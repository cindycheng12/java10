class CRectangle
{
    protected int length;
    protected int width;
    public CRectangle(int l,int w){   //(a)
        length=l;
        width=w;
    }
    public String toString()   //(c)
    {
        String str="length=xxx,width=yyy,area=zzz";
        return str;
        
    }
}
public class Class19 {
    public static void main(String[] args) {
       CRectangle rect=new CRectangle(2,6); //(b)
       System.out.println(rect.toString()); 
    }    
}
