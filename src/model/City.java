package model;

import model.Amenity;
import model.Hydro;
import model.Land;
import model.Places;

public class City {
	private String name;
	private Object[][] map;
	private Object[][] map0;
	private Object[][] map1;
	private Object[][] map2;
	private Object[][] map3;
	private int rows;
	private int cols;

	private void begin() {
		for(int i=0; i<this.getRows();i++)
		{
			for(int j=0;j<this.getCols();j++) 
			{
				map[i][j] = new Land();
			}
		}
	}

	public City(String name, int rows,int cols) {
		this.setName(name);
		this.setRows(rows);
		this.setCols(cols);
		this.setMap(new Object[rows][cols]);
		this.setMap0(new Land[rows][cols]);
		this.setMap1(new Hydro[rows][cols]);
		this.setMap2(new Places[rows][cols]);
		this.setMap3(new Amenity[rows][cols]);
		begin(); 
	}


	public void updateMap() {
		for(int i =0;i<this.getRows(); i++)
		{
			for(int j= 0; j<this.getCols(); j++)
			{
				if(map3[i][j] instanceof Amenity)
				{
					map[i][j] = map3[i][j];
				}
				else if(map2[i][j] instanceof Places)
				{
					map[i][j] = map2[i][j];
				}
				else if (map1[i][j] instanceof Hydro)
				{
					map[i][j] = map1[i][j];
				}
				else if(map0[i][j] instanceof Land)
				{
					map[i][j] = map0[i][j];
				}
			}
		}
		showCity();
	}

	public void showCity() {
		for(int i = 0; i < this.getRows(); i++ )
		{
			for(int j = 0; j < this.getCols(); j++)
			{
				if(map[i][j] instanceof Land)
				{
					System.out.print("L ");
				}
				if(map[i][j] instanceof Hydro)
				{
					System.out.print("H ");
				}
				if(map[i][j] instanceof Places)
				{
					System.out.print("P ");
				}
				if(map[i][j] instanceof Amenity)
				{
					System.out.print("A ");
				}
					
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}


	public void addHydro(String name,int i, int j) {
		if((i>0 && i<this.getRows()) && (j>0 && j<this.getCols()))
		{
			Hydro h = new Hydro(name);
			Hydro[][] mapaux = (Hydro[][]) getMap1();
			mapaux[i][j] = h;
			this.setMap1(mapaux);
			updateMap();
		}
		else
		{
			System.out.println("Coordonatele introduse nu sunt bune");
		}
	}

	public void addPlaces(String name, String type, int i, int j) {
		if((i>0 && i<this.getRows()) && (j>0 && j<this.getCols()))
		{
			Places p = new Places(name, type);
			Places[][] mapaux = (Places[][]) getMap2();
			mapaux[i][j] = p;
			this.setMap2(mapaux);
			updateMap();
		}
		else
		{
			System.out.println("Coordonatele introduse nu sunt bune");
		}
	}

	public void addAmenity(String name, String type, int i, int j) {
		if((i>0 && i<this.getRows()) && (j>0 && j<this.getCols()))
		{
			Amenity a = new Amenity(name, type);
			Amenity[][] mapaux = (Amenity[][]) getMap3();
			mapaux[i][j] = a;
			this.setMap3(mapaux);
			updateMap();
		}
		else
		{
			System.out.println("Coordonatele introduse nu sunt bune");
		}
	};


	public void removeHydro(String name) {
		//Hydro[][] mapaux = (Hydro[][]) getMap1();
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Object[][] getMap() {
		return map;
	}


	public void setMap(Object[][] map) {
		this.map = map;
	}


	public int getRows() {
		return rows;
	}


	public void setRows(int rows) {
		this.rows = rows;
	}


	public int getCols() {
		return cols;
	}


	public void setCols(int cols) {
		this.cols = cols;
	}


	public Object[][] getMap0() {
		return map0;
	}


	public void setMap0(Land[][] map0) {
		this.map0 = map0;
	}


	public Object[][] getMap1() {
		return map1;
	}


	public void setMap1(Hydro[][] map1) {
		this.map1 = map1;
	}


	public Object[][] getMap2() {
		return map2;
	}


	public void setMap2(Places[][] map2) {
		this.map2 = map2;
	}


	public Object[][] getMap3() {
		return map3;
	}


	public void setMap3(Amenity[][] map3) {
		this.map3 = map3;
	}
}
