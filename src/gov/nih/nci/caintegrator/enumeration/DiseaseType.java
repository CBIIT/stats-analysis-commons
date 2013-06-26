/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.enumeration;

import java.awt.Color;


/**
 * Disease enumeration
 * 
 * @author harrismic
 *
 */




public enum DiseaseType {
	ASTROCYTOMA { public Color  getColor() {return Color.BLUE; }},
	GBM { public Color getColor() {return Color.GREEN; }},
	MIXED { public Color getColor() {return Color.MAGENTA; }},
	NON_TUMOR {public Color getColor() {return Color.YELLOW; }},
	OLIGODENDROGLIOMA {public Color getColor() {return Color.CYAN; }},
	UNCLASSIFIED {public Color getColor() {return Color.GRAY; }},
	UNKNOWN {public Color getColor() {return Color.DARK_GRAY; }},
	CELL_LINE {public Color getColor() {return Color.ORANGE; }};
	
	public abstract Color getColor();
}


