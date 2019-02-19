import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CityPlanBuilder {
	
	
	
	public static void main(String args[]) throws Exception {
		BufferedReader br;
		int rows, columns, max_wd, total_bp;
		
		br = new BufferedReader(new FileReader("data/a_example.in"));
		
		String lines = br.readLine();
		
		String[] strs = lines.trim().split("\\s+");
		
		rows = Integer.parseInt(strs[0]);
		columns = Integer.parseInt(strs[1]);
		max_wd = Integer.parseInt(strs[2]);
		total_bp = Integer.parseInt(strs[3]);
		
		System.out.println("Filas:" + rows);
		System.out.println("Columnas:" + columns);
		System.out.println("Distancia máxima:" + max_wd);
		System.out.println("Planes de edificios:" + total_bp);
		
		CityPlan cityplan;
		cityplan = new CityPlan(rows, columns, max_wd);
		
		List<BuildingPlan> bp = new ArrayList<>();
		for (int curr_bp = 1; curr_bp <= total_bp; curr_bp++) {
			bp.add(BuildingPlanBuilder(curr_bp, br));
		}
		
		br.close();
		
		// Print before
		System.out.println(cityplan);
		
		// Set building plan
		cityplan.set(0,0,bp.get(0));
		
		// Print after
	    System.out.println(cityplan);
				
		
		
	}
	
	public static BuildingPlan BuildingPlanBuilder(int id, BufferedReader br) throws Exception {
		BuildingPlan buildingplan = null;
		String lines;
		String[] strs;
		char bp_type;
		int rows, columns, capacity, type;
		
		lines = br.readLine();
		strs = lines.trim().split("\\s+");
		bp_type = strs[0].charAt(0);
		rows = Integer.parseInt(strs[1]);
		columns = Integer.parseInt(strs[2]);
		if (bp_type == 'R') {
			capacity = Integer.parseInt(strs[3]);
			buildingplan = new Residential(id, rows, columns, capacity);
		}
		else if (bp_type == 'U') {
			type = Integer.parseInt(strs[3]);
			buildingplan = new Utility(id, rows, columns, type);
		}
		else {
			throw new Exception("Error leyendo building plan!");
		}
		
		char[][] map = new char[rows][];
		
		// Leemos el buildingplan
		for(int r = 0; r < rows; r++) {
			lines = br.readLine();
			map[r] = lines.toCharArray();
		}
		buildingplan.setMap(map);
		
		return buildingplan;
	}
}
