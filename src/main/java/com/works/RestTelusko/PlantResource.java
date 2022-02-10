package com.works.RestTelusko;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/plants")
public class PlantResource {
	
	PlantRepository prepo = new PlantRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_XML) //@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Plant> getPlants() {
		System.out.println("Get Plants");
		
		return prepo.getPlants();
	}
	
	@GET
	@Path("plant/{code}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML}) // This is called content negotiation, client
	// and server can request for any format.
	public Plant getPlant(@PathParam("code") int id) {
		System.out.println("Get Plant");
		
		return prepo.getPlant(id); 
	}
	
	
	@POST
	@Path("cplant")
	public Plant createPlant(Plant pl) {
		prepo.create(pl);
		return pl;
	}
	
	/*
	 * 404 - Not Found
	 * 405 - Method Not Allowed
	 * 406 - Not Acceptable
	 * 415 - Unsupported Media Type
	 *
	 * 
	 * 500 - Internal Server Error
	 *
	 * 
	 * 200 - OK
	 * 201 - Created
	 * 204 - No Content
	 */
}
