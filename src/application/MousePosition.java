package application;

public class MousePosition {
	private double x;
	private double y;
	
	public MousePosition() {
	}
	
	public MousePosition(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		StringBuilder retorno = new StringBuilder();
		retorno.append(x);
		retorno.append(";");
		retorno.append(y);
		return retorno.toString();
	}
	
}
