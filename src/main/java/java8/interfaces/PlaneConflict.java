package java8.interfaces;

public class PlaneConflict implements Flying, Landing{

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showName() {
		// TODO Auto-generated method stub
		Flying.super.showName();
	}

}
