/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.analysis.messaging;

import java.io.Serializable;
import java.util.*;

/**
 * 
 * @author Michael A. Harris
 *
 */




public class ClassComparisonResult extends AnalysisResult implements Serializable {

	private static final long serialVersionUID = -1152528513884181284L;
	
	private List<ClassComparisonResultEntry> ccResultEntries;
	private SampleGroup group1;
	private SampleGroup baselineGroup;
	private boolean arePvaluesAdjusted = false;
	
	public ClassComparisonResult(String sessionId, String taskId) {
		super(sessionId, taskId);
	}
	
	public String toString() {
		  return "ClassComparisonAnalysisResult: sessionId=" + getSessionId() + " taskId=" + getTaskId() + " numResultEntries=" + getNumResultEntries();
    }
	
	public int getNumResultEntries() { 
	  if (ccResultEntries == null) {
	    return 0;
	  }
	  return ccResultEntries.size();
	}

	public List<ClassComparisonResultEntry> getResultEntries() {
		return ccResultEntries;
	}

	public void setResultEntries(List<ClassComparisonResultEntry> ccResultEntries) {
		this.ccResultEntries = ccResultEntries;
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

	/**
	 * 
	 * @return TRUE if the P-Values for this result are adjusted 
	 * FALSE if they are not adjusted
	 */
	public boolean arePvaluesAdjusted() {
	  return arePvaluesAdjusted;
	}
	
	/**
	 * Set to TRUE if the P-Values in the ClassComparisonResultEntries are 
	 * adjusted (using multi-group adjustment methods) FALSE if they are not adjusted.
	 * @param value
	 */
	public void setPvaluesAreAdjusted(boolean value) {
	  this.arePvaluesAdjusted = value;
	}

}
