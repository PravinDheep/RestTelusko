package com.works.RestTelusko;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author PravinDheep
 *
 */
@XmlRootElement
public class Plant {
	
	private String plantName;
	private int plantCode;
	private String plantType;
	
	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public int getPlantCode() {
		return plantCode;
	}

	public void setPlantCode(int plantCode) {
		this.plantCode = plantCode;
	}

	public String getPlantType() {
		return plantType;
	}

	public void setPlantType(String plantType) {
		this.plantType = plantType;
	}

	@Override
	public String toString() {
		return "Plant [plantName=" + plantName + ", plantCode=" + plantCode + ", plantType=" + plantType + "]";
	}
	
}
