/**
 */
package org.nasdanika.models.pdf.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.pdf.Article;
import org.nasdanika.models.pdf.Page;
import org.nasdanika.models.pdf.Paragraph;
import org.nasdanika.models.pdf.PdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.pdf.impl.PageImpl#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PdfPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Article> getArticles() {
		return (EList<Article>)eDynamicGet(PdfPackage.PAGE__ARTICLES, PdfPackage.Literals.PAGE__ARTICLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(String articleSeparator, String paragraphSeparator, String lineSeparator, String wordSeparator) {
		StringBuilder ret = new StringBuilder();
		for (Article a: getArticles()) {
			if (!ret.isEmpty() && articleSeparator != null) {
				ret.append(articleSeparator);
			}
			ret.append(a.getText(paragraphSeparator, lineSeparator, wordSeparator));
		}
		
		return ret.toString();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PdfPackage.PAGE__ARTICLES:
				return ((InternalEList<?>)getArticles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PdfPackage.PAGE__ARTICLES:
				return getArticles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PdfPackage.PAGE__ARTICLES:
				getArticles().clear();
				getArticles().addAll((Collection<? extends Article>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PdfPackage.PAGE__ARTICLES:
				getArticles().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PdfPackage.PAGE__ARTICLES:
				return !getArticles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PdfPackage.PAGE___GET_TEXT__STRING_STRING_STRING_STRING:
				return getText((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PageImpl
