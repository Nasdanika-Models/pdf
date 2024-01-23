/**
 */
package org.nasdanika.models.pdf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.pdf.Paragraph#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.pdf.PdfPackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.pdf.Line}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see org.nasdanika.models.pdf.PdfPackage#getParagraph_Lines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Line> getLines();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getText(String lineSeparator, String wordSeparator);

} // Paragraph
