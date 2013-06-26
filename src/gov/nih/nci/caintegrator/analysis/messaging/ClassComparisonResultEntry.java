/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.analysis.messaging;


/**
 * An array of ClassComparisonResultEntries is returned in a ClassComparisonAnalysisResult object
 * @author Michael A. Harris
 *
 */




public class ClassComparisonResultEntry implements ReporterEntry,  java.io.Serializable {

	private static final long serialVersionUID = 1502121870957007356L;
	
	private String reporterId;
	private double meanGrp1;
	private double meanBaselineGrp;
	private double meanDiff;
	private double absoluteFoldChange;
	private double pvalue;
	private double stdBaselineGrp;
	private double stdGrp1;
	
	public ClassComparisonResultEntry() {
		super();
	}

	public double getFoldChange() {
		if (meanDiff < 0) {
		  return -absoluteFoldChange;
		}
		return absoluteFoldChange;
	}
	
	public double getAbsoluteFoldChange() {
	  return absoluteFoldChange;
	}

	public void setAbsoluteFoldChange(double absoluteFoldChange) {
		this.absoluteFoldChange = absoluteFoldChange;
	}

	public double getMeanDiff() {
		return meanDiff;
	}

	public void setMeanDiff(double meanDiff) {
		this.meanDiff = meanDiff;
	}

	public double getMeanGrp1() {
		return meanGrp1;
	}

	public void setMeanGrp1(double meanGrp1) {
		this.meanGrp1 = meanGrp1;
	}

	public double getMeanBaselineGrp() {
		return meanBaselineGrp;
	}

	public void setMeanBaselineGrp(double meanBaselineGrp) {
		this.meanBaselineGrp = meanBaselineGrp;
	}

	public double getPvalue() {
		return pvalue;
	}

	public void setPvalue(double pvalue) {
		this.pvalue = pvalue;
	}

	public String getReporterId() {
		return reporterId;
	}

	public void setReporterId(String reporterId) {
		this.reporterId = reporterId;
	}

	public double getStdBaselineGrp() {
		return stdBaselineGrp;
	}

	public void setStdBaselineGrp(double stdBaselineGrp) {
		this.stdBaselineGrp = stdBaselineGrp;
	}

	public double getStdGrp1() {
		return stdGrp1;
	}

	public void setStdGrp1(double stdGrp1) {
		this.stdGrp1 = stdGrp1;
	}

}
