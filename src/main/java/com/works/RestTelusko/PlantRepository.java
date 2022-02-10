package com.works.RestTelusko;

import java.util.ArrayList;
import java.util.List;

public class PlantRepository {
	
	List<Plant> plants;
	
	public PlantRepository() {
		plants = new ArrayList();
		
		Plant p1 = new Plant();
		p1.setPlantName("JavaFern");
		p1.setPlantCode(123);
		p1.setPlantType("Submersible");
		
		Plant p2 = new Plant();
		p2.setPlantName("MaryGold");
		p2.setPlantCode(111);
		p2.setPlantType("GroundLevel");
		
		plants.add(p1);
		plants.add(p2);
	}
	
	public List<Plant> getPlants(){
		return plants;
	}
	
	public Plant getPlant(int plantCode) {
		for(Plant pl : plants) {
			if(pl.getPlantCode() == plantCode) {
				return pl;
			}
		}
		return null;
	}

	public void create(Plant pl) {
		plants.add(pl);
	}
}
