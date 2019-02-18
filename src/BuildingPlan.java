
public class BuildingPlan {
	private int id;
	private int rows;
	private int columns;
	private char[][] map;
	
	
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
