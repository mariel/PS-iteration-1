package model;

public class Amenity {
	private String name;
	private String type;
	private int x;
	private int y;
	

	public Amenity(String name, String type) {
		this.setName(name);
		this.setType(type);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
