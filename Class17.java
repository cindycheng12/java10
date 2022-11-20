class Car
{
    protected String owner;
    protected String id;
    public void CRectangle(String own,String s){    //(a)
        owner=own;
        id=s;
    }
    final void show()
    {
        System.out.println("車主姓名:"+owner);
        System.out.println("車牌號碼:"+id);
    }
}
class CColor extends Car{   //(b)
    protected String color;  //紀錄車子的顏色
    public  CColor(String own,String s){    //(c)

    }
    public void show() {      //(d)    //錯誤，改寫父類別的show()method
        System.out.println("車主姓名:"+owner);
        System.out.println("車牌號碼:"+id);
        System.out.println("車身顏色+color");
    }

}
public class Class17 {
    public static void main(String[] args) {
        CColor a= new CColor(null, null);
        a.show();

    }
}

//(e)//錯誤，改寫父類別的show()method
