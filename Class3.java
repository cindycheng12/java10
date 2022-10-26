package test1026;
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
}
class Cbbb extends Caaa{     //sub class (呼叫富類別的建構元)
	public void set_num(int a,int b) {     
		num1=a;
		num2=b;
	}
	public void show() {
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}
}
public class Class3 {
	public static void main(String args[])
	{
		Cbbb bb=new Cbbb();
		bb.set_num(5,10);
		bb.show();
	}
}

