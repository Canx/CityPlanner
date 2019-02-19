import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityPlan {
	private int rows;
	private int columns;
	private int max_wd; // maximum walking distance
	
	int map[][];
	
	List<BuildingPlan> buildingPlans;
	
	public CityPlan(int rows, int columns, int max_wd) {
		this.rows = rows;
		this.columns = columns;
		this.max_wd = max_wd;
		
		map = new int[rows][columns];
	}

	// Set building to city plan position. 
	// Returns false if another building collides with the wanted position.
	public boolean set(int x, int y, BuildingPlan b) {
		// check if building plan can be placed.
		if (b.rows > (this.rows - x) || b.columns > (this.columns - y)) {
			return false;
		}
		
		// TODO: check if collides with current buildings
		
		for(int row = x; row < b.rows; row++) {
			for (int column = y; column < b.columns; column++) {
				if (b.map[row-x][column-y] == '#') {
					map[row][column] = b.id;
				}
			}
		}
		return true;
	}

	public void add(BuildingPlan bp) {
		buildingPlans.add(bp);
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		
		for(int row = 0; row < this.rows; row++) {
			for (int column = 0; column < this.columns; column++) {
				output.append(" " + this.map[row][column]);
			}
			output.append('\n');
		}
		return output.toString();
	}
	
}
