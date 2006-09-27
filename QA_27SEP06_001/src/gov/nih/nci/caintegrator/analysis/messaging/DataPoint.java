package gov.nih.nci.caintegrator.analysis.messaging;

/**
 * General purpose data point class. Used by the correlation result.
 * @author harrismic
 *
 */
public class DataPoint implements java.io.Serializable {
    private String id;
    private double x;
    private double y;
    private double z;
  
    public DataPoint(String id) {
      this.id = id;
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
	
	public double getZ() {
		return z;
	}
	
	public void setZ(double z) {
		this.z = z;
	}

public String getId() {
	return id;
}
  
  
  
}
