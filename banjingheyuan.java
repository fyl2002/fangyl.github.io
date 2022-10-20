//定义circle类，包含double r
//findarea方法返回面积
//定义passobject类，定义方法printarea public void printarea(circle c ，int times)
//在printarea中打印1 - times之间所有的整数半径和对应面积
//main中调用printarea方法
//
public class banjingheyuan {
	public static void main(String[] args) {
		int time = 5;
		Circle way = new Circle(time);
		way.findarea();
		Passobject way1 = new Passobject();
		way1.printarea(way,time);
	}
}

class Circle {
	double r;
	public Circle(double r){
		this.r = r;
	}
	public double findarea(){
		return Math.PI * r * r;
	}
	public void setr(double r){
		this.r = r;
	}
}

class Passobject {
	public void printarea(Circle way, int times){
		System.out.println("r" + "     " + "area");
		for(double i = 1.0 ; i <=  times ; i++){
			//way.setr(i);
			System.out.println(i + "    " +way.findarea());

		}

	}
}