package gov.nih.nci.caintegrator.analysis.messaging;

import java.util.Collections;
import java.util.List;

public class FtestResultEntry implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private List<Double> groupAve = Collections.emptyList();
	private double maximumFoldChange;
	private double pvalue;
	private String reporterId;
	
	public FtestResultEntry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Double> getGroupAve() {
		return groupAve;
	}

	public void setGroupAve(List<Double> groupAve) {
		this.groupAve = groupAve;
	}

	public double getMaximumFoldChange() {
		return maximumFoldChange;
	}

	public void setMaximumFoldChange(double maximumFoldChange) {
		this.maximumFoldChange = maximumFoldChange;
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
	 
}
