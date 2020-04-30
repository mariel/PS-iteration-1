package controller;

import model.Amenity;
import view.AmenityGui;

public class AmenityController {

	private Amenity modelAmenity;
	private AmenityGui viewAmenity;
	
	public AmenityController(Amenity ma, AmenityGui va)
	{
		modelAmenity = ma;
		viewAmenity = va;
	}
	
	public void initController() {
		viewAmenity.getadd().addActionListener(e -> createAmenity());
		viewAmenity.getdelete().addActionListener(e -> deleteAmenity());
		viewAmenity.getupdate().addActionListener(e -> updateAmenity());
	}
	
	public void createAmenity()
	{
		modelAmenity.setName(viewAmenity.getnameAdd().getText());
	}
	
	public void deleteAmenity()
	{
		
	}
	
	public void updateAmenity()
	{
		
	}
}
