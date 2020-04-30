package model;

public class Places {
	private String name;
	private String type;
	private String workingHours;
	private int x;
	private int y;
	

	public Places(String name, String type,String workingHours) {
		this.setName(name);
		this.setType(type);
		this.setWorkingHours(workingHours);
	}
	public Places(String name, String type) {
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
	public String getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
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
