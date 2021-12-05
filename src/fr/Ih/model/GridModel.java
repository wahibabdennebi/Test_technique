package fr.Ih.model;

public class GridModel {

	private int height;
	private int width;
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public GridModel(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	public GridModel() {
		super();
	}
	@Override
	public String toString() {
		return "GridModel [height=" + height + ", width=" + width + "]";
	}
	 
	
}
