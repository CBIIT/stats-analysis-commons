package gov.nih.nci.caintegrator.analysis.messaging;

import java.io.Serializable;

public class GeneralizedLinearModelResultEntry implements ReporterEntry, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * reporter id shown on the class comparison report
	 */ 
	private String reporterId;
	
	/*
	 * the first group value in "Group Avg" shown on the class comparison report page
	 */
	
	private double meanGrp1;
	
	/*
	 * the first group value in "Group Avg" shown on the class comparison report page
	 */
	
	private double meanBaselineGrp;
	
	/*
	 * is used to calculate the if absoluteFoldChange is "+" or "-"
	 */
	
	private double meanDiff;
	
	
	/*
	 * Fold change on the class comparison report page
	 */
	
	private double absoluteFoldChange;
	
	/*
	 *  p-value on the class comparison report page
	 */
	
	private double pvalue;
	
	
	/*
	 *  adjusted p-value on the class comparison report page
	 */
	
	private double adjustedPvalue;
	
	/*
	 *  (non-Javadoc)
	 * @see gov.nih.nci.caintegrator.analysis.messaging.ReporterEntry#getReporterId()
	 */

	public String getReporterId() {
		return reporterId;		
	}
	
	public GeneralizedLinearModelResultEntry() {
		super();
	}

	public double getAbsoluteFoldChange() {
		if (meanDiff < 0) {
			  return -absoluteFoldChange;
		 }
		return absoluteFoldChange;
	}

	public void setAbsoluteFoldChange(double absoluteFoldChange) {
		this.absoluteFoldChange = absoluteFoldChange;
	}

	public double getAdjustedPvalue() {
		return adjustedPvalue;
	}

	public void setAdjustedPvalue(double adjustedPvalue) {
		this.adjustedPvalue = adjustedPvalue;
	}

	public double getMeanBaselineGrp() {
		return meanBaselineGrp;
	}

	public void setMeanBaselineGrp(double meanBaselineGrp) {
		this.meanBaselineGrp = meanBaselineGrp;
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

	public double getPvalue() {
		return pvalue;
	}

	public void setPvalue(double pvalue) {
		this.pvalue = pvalue;
	}

	public void setReporterId(String reporterId) {
		this.reporterId = reporterId;
	}
	
	

}
