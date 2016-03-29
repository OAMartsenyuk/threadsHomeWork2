package ships;

import java.util.Arrays;

public class OutOfBoundCapacity extends Exception{
	private Ship ship;

	public OutOfBoundCapacity(Ship ship) {
		super();
		this.ship = ship;
	}

	@Override
	public String toString() {
		return String.format("OutOfBoundCapacity [ship=%s, getStackTrace()=%s]", ship,
				Arrays.toString(getStackTrace()));
	}
		
}
