/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.analysis.messaging;

import gov.nih.nci.caintegrator.enumeration.*;

/**
 * The class comparison request contains one or more SampleGroups. 
 * These groups will be used by the class comparison algorithm to compute
 * the group statistics.
 * (For TTest there will be one or 2 sample groups)
 * 
 * @author Michael A. Harris
 *
 */






public class ClassComparisonRequest extends AnalysisRequest implements java.io.Serializable {

	private static final long serialVersionUID = 3585836220854093162L;

	private double foldChangeThreshold = Double.NEGATIVE_INFINITY;
	
	private double pValueThreshold = Double.POSITIVE_INFINITY;
	
	private ArrayPlatformType arrayPlatform = ArrayPlatformType.AFFY_OLIGO_PLATFORM;
	
	private MultiGroupComparisonAdjustmentType multiGrpComparisonAdjType = MultiGroupComparisonAdjustmentType.NONE;
	
	private StatisticalMethodType statisticalMethod = StatisticalMethodType.TTest;
	
	private SampleGroup group1 = null;
	
	private SampleGroup baselineGroup = null;
	
	public ClassComparisonRequest(String sessionid, String taskId) {
		super(sessionid, taskId);
	}
	
	public String toString() {
	
	  int blGroupSize = -1;
	  if (baselineGroup!=null) {
	    blGroupSize = baselineGroup.size();
	  }
	  
	  int group1Size = -1;
	  if (group1 !=null) {
	    group1Size = group1.size();
	  }
		
	  String retStr = "ClassComparisonAnalysisRequest: sessionId=" + getSessionId() + " taskId=" + getTaskId() + " blGroupSize=" + blGroupSize + " group1Szie=" + group1Size;
	  
	  if (group1 != null) { 
	    retStr += " GRP1=" + group1.getGroupName();
	  }
	  
	  if (baselineGroup != null) {
	    retStr += " baselineGroup=" + baselineGroup.getGroupName();
	  }
	  
	  return retStr;
	}

	public StatisticalMethodType getStatisticalMethod() {
		return statisticalMethod;
	}

	public void setStatisticalMethod(StatisticalMethodType statisticalMethod) {
		this.statisticalMethod = statisticalMethod;
	}

	public ArrayPlatformType getArrayPlatform() {
		return arrayPlatform;
	}

	public void setArrayPlatform(ArrayPlatformType arrayPlatform) {
		this.arrayPlatform = arrayPlatform;
	}

	
	public MultiGroupComparisonAdjustmentType getMultiGroupComparisonAdjustmentType() {
		return multiGrpComparisonAdjType;
	}

	public void setMultiGroupComparisonAdjustmentType(
			MultiGroupComparisonAdjustmentType mgCompAdjType) {
		this.multiGrpComparisonAdjType = mgCompAdjType;
	}

	public double getFoldChangeThreshold() {
		return foldChangeThreshold;
	}

	public void setFoldChangeThreshold(double thresholdValue) {
		this.foldChangeThreshold = thresholdValue;
	}

	public double getPvalueThreshold() {
		return pValueThreshold;
	}

	public void setPvalueThreshold(double thresholdValue) {
		this.pValueThreshold = thresholdValue;
	}

	public SampleGroup getGroup1() {
		return group1;
	}

	public void setGroup1(SampleGroup group1) {
		this.group1 = group1;
	}

	public SampleGroup getBaselineGroup() {
		return baselineGroup;
	}

	public void setBaselineGroup(SampleGroup baselineGroup) {
		this.baselineGroup = baselineGroup;
	}

}
