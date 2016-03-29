package ships;

public class Ship {
	private double capacity;
	private String name;
	
	
	public Ship(double capacity, String name) {
		super();
		this.capacity = capacity;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public void unload(double capacity) throws OutOfBoundCapacity{
		if (this.capacity < capacity){
			throw new OutOfBoundCapacity(this);
		}else{
			this.setCapacity(this.capacity - capacity);
			System.out.println(this);
		}
	}

	@Override
	public String toString() {
		return String.format("Ship [capacity=%s, name=%s]", capacity, name);
	}
	
	
}
