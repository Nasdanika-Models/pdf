/**
 */
package org.nasdanika.models.pdf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.pdf.Line#getWords <em>Words</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.pdf.PdfPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>Words</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.pdf.Word}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Words</em>' containment reference list.
	 * @see org.nasdanika.models.pdf.PdfPackage#getLine_Words()
	 * @model containment="true"
	 * @generated
	 */
	EList<Word> getWords();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getText(String wordSeparator);

} // Line
