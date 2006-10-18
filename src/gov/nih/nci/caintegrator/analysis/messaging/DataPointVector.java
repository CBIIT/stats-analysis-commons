package gov.nih.nci.caintegrator.analysis.messaging;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This class holds a named list of data points. It is used to 
 * return expression values for a reporter.  The reporter name is set 
 * as the name of the vector and the DataPoint will contain the sample id
 * and the expression value. 
 * @author harrismic
 *
 */
public class DataPointVector implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private List<DataPoint> dataPoints = new ArrayList<DataPoint>();
	private String name;
	public List<DataPoint> getDataPoints() {
		return dataPoints;
	}
	
	public  DataPointVector(String name) {
	  this.name = name;
	}
	
	public void setDataPoints(List<DataPoint> dataPoints) {
		this.dataPoints = dataPoints;
	}
	public String getName() {
		return name;
	}
	
	public void addDataPoint(DataPoint point) {
	  dataPoints.add(point);
	}

}
