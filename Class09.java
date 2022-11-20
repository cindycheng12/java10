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
    public void display() {   //(a)加入display函數
        System.out.println("printed from Caaa class");
    }
}
class Cbbb extends Caaa   
{
    public Cbbb(int n) {  
        super(n);        
    }
    public void display() {   //(b)加入display函數，改寫父類別
        System.out.println("printed from Cbbb class");
    }
    public void show()
    {
        System.out.println("num="+get());
    }
}
public class Class09 {
public static void main(String[] args) 
{
    Caaa bb=new Cbbb(2);  
    bb.display();
}
    
}
