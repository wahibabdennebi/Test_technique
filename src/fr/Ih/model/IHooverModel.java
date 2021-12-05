
package fr.Ih.model;



public class IHooverModel {
	private int x;
	private int y;
	private OrientationEnum compass;
	private int direction;

	/**
	* 
	*/
	public IHooverModel() {
		super();
	}

	
	public IHooverModel(int x, int y, OrientationEnum compass) {
		super();
		this.x = x;
		this.y = y;
		this.compass = compass;
		// set the direction
		switch (compass) {
		case N:
			this.direction = 0;
			break;
		case E:
			this.direction = 1;
			break;
		case S:
			this.direction = 2;
			break;
		case W:
			this.direction = 3;
			break;
		}

	}

	
	public int getX() {
		return x;
	}

	
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	
	public void setY(int y) {
		this.y = y;
	}

	
	public int getDirection() {
		return direction;
	}

	
	public void setDirection(int direction) {
		this.direction = direction;

	}

	public void setDirectionAndCompass(int direction) {
		this.direction = direction % 4;
		switch (this.direction) {
		case 0:
			this.compass = OrientationEnum.N;
			break;
		case 1:
			this.compass = OrientationEnum.E;
			break;
		case 2:
			this.compass = OrientationEnum.S;
			break;
		case 3:
			this.compass = OrientationEnum.W;
			break;
		}

	}
	
	
	public OrientationEnum getCompass() {
		return compass;
	}

	
	public void setCompass(OrientationEnum compass) {
		this.compass = compass;
	}

	
	@Override
	public String toString() {
		return "IHooverModel [x=" + x + ", y=" + y + ", direction=" + direction + ", compass=" + compass + "]";
	}
}
