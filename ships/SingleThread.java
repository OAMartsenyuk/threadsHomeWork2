package ships;

public class SingleThread implements Runnable{
	private Ship ship;

	
	public SingleThread(Ship ship) {
		super();
		this.ship = ship;
	}

	public Ship getShip() {
		return ship;
	}

	public double getCapacity(){
		return this.getShip().getCapacity();
	}
	
	@Override
	public void run() {
		while (this.getCapacity() > 0.5){
			
			try {
				ship.unload(0.5);
			} catch (OutOfBoundCapacity e) {
				System.out.println(e);
			}
		}		
	}	
}
