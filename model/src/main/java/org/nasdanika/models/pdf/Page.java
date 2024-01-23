/**
 */
package org.nasdanika.models.pdf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.pdf.Page#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.pdf.PdfPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Articles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.pdf.Article}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articles</em>' containment reference list.
	 * @see org.nasdanika.models.pdf.PdfPackage#getPage_Articles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Article> getArticles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getText(String articleSeparator, String paragraphSeparator, String lineSeparator, String wordSeparator);

} // Page
