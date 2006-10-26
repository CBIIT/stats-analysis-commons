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
	
	public int size() {
	  return dataPoints.size();
	}
	
	/**
	 * Get a list of Doubles corresponding to the X values.
	 * @return
	 */
	public List<Double> getXValues() {
	  List<Double> xValues = new ArrayList<Double>();
	  for (DataPoint point : dataPoints) {
		 if (point != null) {
	       xValues.add(point.getX());
		 }
		 else {
		   xValues.add(null);
		 }
	  }
	  return xValues;
	}
	
	/**
	 * Get a list of Doubles corresponding to the Y values.
	 * @return
	 */
	public List<Double> getYValues() {
	  List<Double> yValues = new ArrayList<Double>();
	  for (DataPoint point : dataPoints) {
		 if (point != null) {
	       yValues.add(point.getY());
		 }
		 else {
		   yValues.add(null);
		 }
	  }
	  return yValues;
	}
	
	/**
	 * Get a list of Doubles corresponding to the Z values.
	 * @return
	 */
	public List<Double> getZValues() {
	  List<Double> zValues = new ArrayList<Double>();
	  for (DataPoint point : dataPoints) {
		 if (point != null) {
	       zValues.add(point.getZ());
		 }
		 else {
		   zValues.add(null);
		 }
	  }
	  return zValues;
	}

}
