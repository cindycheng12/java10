class Caaa   //super class
{
	public int num1;
	public int num2;
	public Caaa() {    //(a)
		num1=1;
		num2=1;
	}
	public Caaa(int a,int b) {    //(b)
		num1=a;
		num2=b;
	}
    public void show() {
        System.out.println("Caaa_num1="+num1);
        System.out.println("Caaa_num2="+num2);
    }
}
class Cbbb extends Caaa{     //sub class (呼叫富類別的建構元)
    int num1=10;
    int num2=20;
	public void show() {
        super.num1=30;
        super.num2=40;
        System.out.println("Cbbb_num1="+num1);
        System.out.println("Cbbb_num2="+num2);
        super.show();
	}
}
public class Class13 {
	public static void main(String args[])
	{
		Cbbb bb=new Cbbb();
		bb.show();
	}
}
