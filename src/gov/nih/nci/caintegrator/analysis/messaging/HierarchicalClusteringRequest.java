/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.analysis.messaging;

import gov.nih.nci.caintegrator.enumeration.*;

/**
 * 
 * @author Michael A. Harris
 *
 */




public class HierarchicalClusteringRequest extends AnalysisRequest implements java.io.Serializable {

	private static final long serialVersionUID = 1142074172476509433L;
	
	private DistanceMatrixType distanceMatrix = DistanceMatrixType.Correlation;
	private ClusterByType clusterBy = ClusterByType.Samples;
	private LinkageMethodType linkageMethod = LinkageMethodType.Average;
	private ArrayPlatformType arrayPlatform = ArrayPlatformType.AFFY_OLIGO_PLATFORM;
	private double varianceFilterValue = 0.9;
	private ReporterGroup reporterGroup;
	private SampleGroup sampleGroup;        
	
	
	public HierarchicalClusteringRequest(String sessionId, String taskId) {
		super(sessionId, taskId);
		
	}
	
	public String toString() {
	  int reporterGroupSize = -1;
	  if (reporterGroup!= null) {
	    reporterGroupSize = reporterGroup.size();
	  }
	  
	  int sampleGroupSize = -1;
	  if (sampleGroup!=null) {
	    sampleGroupSize = sampleGroup.size();
	  }
		
	  return "HierarchicalClusteringAnalysisRequest: sessionId=" + getSessionId() + " taskId=" + getTaskId() + " reporterGroupSize=" + reporterGroupSize + " sampleGroupSize=" + sampleGroupSize;
	}

	public ArrayPlatformType getArrayPlatform() {
		return arrayPlatform;
	}

	public void setArrayPlatform(ArrayPlatformType arrayPlatform) {
		this.arrayPlatform = arrayPlatform;
	}

	public ClusterByType getClusterBy() {
		return clusterBy;
	}

	public void setClusterBy(ClusterByType clusterBy) {
		this.clusterBy = clusterBy;
	}

	public DistanceMatrixType getDistanceMatrix() {
		return distanceMatrix;
	}

	public void setDistanceMatrix(DistanceMatrixType distanceMatrix) {
		this.distanceMatrix = distanceMatrix;
	}

	public double getVarianceFilterValue() {
		return varianceFilterValue;
	}

	public void setVarianceFilterValue(double varianceFilterValue) {
		this.varianceFilterValue = varianceFilterValue;
	}

	public LinkageMethodType getLinkageMethod() {
		return linkageMethod;
	}

	public void setLinkageMethod(LinkageMethodType linkageMethod) {
		this.linkageMethod = linkageMethod;
	}

	public ReporterGroup getReporterGroup() {
		return reporterGroup;
	}

	public void setReporterGroup(ReporterGroup reporterGroup) {
		this.reporterGroup = reporterGroup;
	}

	public SampleGroup getSampleGroup() {
		return sampleGroup;
	}

	public void setSampleGroup(SampleGroup sampleGroup) {
		this.sampleGroup = sampleGroup;
	}

}
