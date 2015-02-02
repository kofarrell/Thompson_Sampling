public class Point {
	public int x, y, number;
	public string objectName;
	public float probability;
	public Point(int x, int y, int n, float p) {
		this.x = x;
		this.y = y;
		this.number = n;
		this.probability = p;
	}

	public void setObjectName(String n) {
		this.objectName = n;
	}
}
