/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.analysis.messaging;

import java.util.ArrayList;

public class IdList extends ArrayList<String> {
	
	private static final long serialVersionUID = 1L;
	private String name;
	
	public IdList(String name) {
		super();
		this.name = name;
	}
	
	public String getName() { return name; }
	
}
