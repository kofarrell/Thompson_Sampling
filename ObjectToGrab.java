public class ObjectToGrasp {
	int numPoints;
	String name;
	Point[] points;
	public ObjectToGrasp(String name, int n) {
		this.numPoints = n;
		this.points = new Point[n]();
		this.name = n;
	}

	public int getNumPoints() {
		return this.numPoints;
	}

	public void addGraspPoints(int[] p) {
		for (int i = 0; i < this.numPoints; i++) {
			this.points[i] = p[i];
		}
	}

	public void addGraspPoint(int x, int y, int num, float p) {
		Point toAdd = new Point(x, y, num, p);
		this.points[num] = toAdd;
	}

	public void addGraspPoint(Point p, int num) {
		this.points[num] = p;
	}

}
