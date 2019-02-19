
public class BuildingPlan {
	public int id;
	public int rows;
	public int columns;
	public char[][] map;
	
	
	public BuildingPlan(int id, int rows, int columns) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.rows = rows;
		this.columns = columns;
	}

	public void setMap(char[][] map) {
		this.map = map;
	}
	
	// TODO: test that current building plan is valid.
	public boolean validate() { return false; }
}
