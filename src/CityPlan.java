import java.util.List;

public class CityPlan {
	private int rows;
	private int columns;
	private int max_wd; // maximum walking distance
	
	List<BuildingPlan> buildingPlans;
	
	public CityPlan(int rows, int columns, int max_wd) {
		this.rows = rows;
		this.columns = columns;
		this.max_wd = max_wd;
	}

	// Add building to city plan. Throws exception if another building 
	// collides with the wanted position.
	public void set(int x, int y, BuildingPlan b) {
		
	}

	public void add(BuildingPlan bp) {
		buildingPlans.add(bp);
	}
}
