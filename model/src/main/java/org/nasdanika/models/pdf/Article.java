/**
 */
package org.nasdanika.models.pdf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.pdf.Article#getParagraphs <em>Paragraphs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.pdf.PdfPackage#getArticle()
 * @model
 * @generated
 */
public interface Article extends EObject {
	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.pdf.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphs</em>' containment reference list.
	 * @see org.nasdanika.models.pdf.PdfPackage#getArticle_Paragraphs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paragraph> getParagraphs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getText(String paragraphSeparator, String lineSeparator, String wordSeparator);

} // Article
