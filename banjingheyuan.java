//����circle�࣬����double r
//findarea�����������
//����passobject�࣬���巽��printarea public void printarea(circle c ��int times)
//��printarea�д�ӡ1 - times֮�����е������뾶�Ͷ�Ӧ���
//main�е���printarea����
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