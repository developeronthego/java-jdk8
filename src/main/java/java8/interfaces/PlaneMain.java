package java8.interfaces;

public class PlaneMain {

	public static void main(String[] args) {
		Plane plane = new Plane();
		plane.fly();
		plane.showName();

		PlaneConflict planeConflict = new PlaneConflict();
		planeConflict.showName();
	}

}
