class CShape{   //父類別
	private double area;
	private String ID;
	public CShape(String id){
		ID=id;
	}
	protected void setArea(double area){
		this.area=area;
	}
 
	public static void largest(CShape shape[]){   //父類別的陣列變數
		double max=0 ; int fg=0;
		for(int i=0;i<shape.length;i++){
			if(shape[i].area >max){
				max=shape[i].area;
				fg=i;
			}
		} 
		System.out.println(shape[fg].ID+" has the largest area= "+shape[fg].area);
	}
 
}
class CCircle extends CShape{     //Circle子類別
	public CCircle(double radius){
		super("Circle");
		setArea(radius*radius*3.14);
	}
 
}
class CSquare extends CShape        //Square子類別
	public CSquare(double side){
		super("Square");
		setArea(side*side);
	}
 
}
class CTriangle extends CShape{  	
	public CTriangle (double weight,double height){
		super("Triangle");
		setArea((weight*height)/2);
	}
 
}

public class Class12 {

	public static void main(String[] args) {
		CShape shp[]=new CShape[3];
		shp[0]=new CCircle(12.0);
		shp[1]=new CSquare(15);
		shp[2]=new CTriangle(3,18); 
		CShape.largest(shp);

	}

}

