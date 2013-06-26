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
 * This enum describes various operators that
 * are used through out the caIntegrator to formulate criteria.
 *
 */




public enum Operator implements Serializable{
	GT, //greater than
	LT, //less than
	EQ{ 
        public String toString() 
        { 
            return "=";
        } }, //equals
	NE, //not equal to
	GE { 
        public String toString() 
        { 
            return ">=";
        } }, //greater than or equal to
	LE{ 
        public String toString() 
        { 
            return "<=";                                                                                                                           
        } }, //less than or equal to
    AND,// Intersection 
    OR ,//Union
    NOT //Difference
}
