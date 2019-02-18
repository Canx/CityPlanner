
public class Residential extends BuildingPlan {
	private int capacity;
	
	public Residential(int id, int rows, int columns,  int capacity) {
		super(id, rows, columns);
		this.capacity = capacity;
	}

	
}
