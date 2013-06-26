/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.enumeration;

import java.io.Serializable;

/**
 * @author sahnih
 *
 */




public enum AnalysisType implements Serializable{
	/** Lists all the possible Analysis Types used 
	 * 
	 */
	PAIRED { 
        public String toString() 
        { 
            return "Paired Tissue Samples (Tissue vs. Blood paired samples)";
        } }, 
	UNPAIRED { 
		public String toString() 
		{ 
			return "Unpaired Tissue Samples (Tissue vs. Reference samples)";
		} },
	NORMAL {public String toString() 
		{ 
			return "Normal Samples (Blood vs. reference samples)";
		} }

};
