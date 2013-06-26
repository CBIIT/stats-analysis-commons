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




public enum SpecimenType implements Serializable{
	/** Lists all the possible Specimen Types used 
	 * 
	 */
	NONE { 
        public String toString() 
        { 
            return "";
        } }, 
	BLOOD { 
		public String toString() 
		{ 
			return "Blood";
		} },
	TISSUE_BRAIN {public String toString() 
		{ 
			return "Tissue (Brain)";
		} }

};
