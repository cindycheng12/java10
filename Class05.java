
class Caaa
{
    private int num;

    public Caaa(int n)
    {
        num=n;
    }
    public int get()
    {
        return num;
    }
}
class Cbbb extends Caaa   //此處為錯誤的地方
{
    public Cbbb(int n) {  //更改，並添加，使得26行能正常運行
        super(n);
        
    }

    public void show()
    {
        System.out.println("num="+get());
    }
}
public class Class05 {
public static void main(String[] args) 
{
    Cbbb bb=new Cbbb(2);  //更改後
    bb.show();
}
    
}
