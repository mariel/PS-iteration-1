package model;

public class Hydro {
	private String name;
	private int x;
	private int y;
		
	public Hydro(String name)
	{
		this.setName(name);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; 
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
}
