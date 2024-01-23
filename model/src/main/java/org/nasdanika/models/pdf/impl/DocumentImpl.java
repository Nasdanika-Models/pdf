/**
 */
package org.nasdanika.models.pdf.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.pdf.Document;
import org.nasdanika.models.pdf.Page;
import org.nasdanika.models.pdf.Paragraph;
import org.nasdanika.models.pdf.PdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.pdf.impl.DocumentImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link org.nasdanika.models.pdf.impl.DocumentImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.pdf.impl.DocumentImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.nasdanika.models.pdf.impl.DocumentImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.nasdanika.models.pdf.impl.DocumentImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.nasdanika.models.pdf.impl.DocumentImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.nasdanika.models.pdf.impl.DocumentImpl#getProducer <em>Producer</em>}</li>
 *   <li>{@link org.nasdanika.models.pdf.impl.DocumentImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.nasdanika.models.pdf.impl.DocumentImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends MinimalEObjectImpl.Container implements Document {
	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORDS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getProducer() <em>Producer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducer()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCER_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PdfPackage.Literals.DOCUMENT;
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
	public EList<Page> getPages() {
		return (EList<Page>)eDynamicGet(PdfPackage.DOCUMENT__PAGES, PdfPackage.Literals.DOCUMENT__PAGES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthor() {
		return (String)eDynamicGet(PdfPackage.DOCUMENT__AUTHOR, PdfPackage.Literals.DOCUMENT__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(String newAuthor) {
		eDynamicSet(PdfPackage.DOCUMENT__AUTHOR, PdfPackage.Literals.DOCUMENT__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreated() {
		return (Date)eDynamicGet(PdfPackage.DOCUMENT__CREATED, PdfPackage.Literals.DOCUMENT__CREATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreated(Date newCreated) {
		eDynamicSet(PdfPackage.DOCUMENT__CREATED, PdfPackage.Literals.DOCUMENT__CREATED, newCreated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreator() {
		return (String)eDynamicGet(PdfPackage.DOCUMENT__CREATOR, PdfPackage.Literals.DOCUMENT__CREATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreator(String newCreator) {
		eDynamicSet(PdfPackage.DOCUMENT__CREATOR, PdfPackage.Literals.DOCUMENT__CREATOR, newCreator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeywords() {
		return (String)eDynamicGet(PdfPackage.DOCUMENT__KEYWORDS, PdfPackage.Literals.DOCUMENT__KEYWORDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeywords(String newKeywords) {
		eDynamicSet(PdfPackage.DOCUMENT__KEYWORDS, PdfPackage.Literals.DOCUMENT__KEYWORDS, newKeywords);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getModified() {
		return (Date)eDynamicGet(PdfPackage.DOCUMENT__MODIFIED, PdfPackage.Literals.DOCUMENT__MODIFIED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModified(Date newModified) {
		eDynamicSet(PdfPackage.DOCUMENT__MODIFIED, PdfPackage.Literals.DOCUMENT__MODIFIED, newModified);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProducer() {
		return (String)eDynamicGet(PdfPackage.DOCUMENT__PRODUCER, PdfPackage.Literals.DOCUMENT__PRODUCER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProducer(String newProducer) {
		eDynamicSet(PdfPackage.DOCUMENT__PRODUCER, PdfPackage.Literals.DOCUMENT__PRODUCER, newProducer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubject() {
		return (String)eDynamicGet(PdfPackage.DOCUMENT__SUBJECT, PdfPackage.Literals.DOCUMENT__SUBJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(String newSubject) {
		eDynamicSet(PdfPackage.DOCUMENT__SUBJECT, PdfPackage.Literals.DOCUMENT__SUBJECT, newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(PdfPackage.DOCUMENT__TITLE, PdfPackage.Literals.DOCUMENT__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(PdfPackage.DOCUMENT__TITLE, PdfPackage.Literals.DOCUMENT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(String pageSeparator, String articleSeparator, String paragraphSeparator, String lineSeparator, String wordSeparator) {
		StringBuilder ret = new StringBuilder();
		for (Page p: getPages()) {
			if (!ret.isEmpty() && pageSeparator != null) {
				ret.append(pageSeparator);
			}
			ret.append(p.getText(articleSeparator, paragraphSeparator, lineSeparator, wordSeparator));
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
			case PdfPackage.DOCUMENT__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
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
			case PdfPackage.DOCUMENT__PAGES:
				return getPages();
			case PdfPackage.DOCUMENT__AUTHOR:
				return getAuthor();
			case PdfPackage.DOCUMENT__CREATED:
				return getCreated();
			case PdfPackage.DOCUMENT__CREATOR:
				return getCreator();
			case PdfPackage.DOCUMENT__KEYWORDS:
				return getKeywords();
			case PdfPackage.DOCUMENT__MODIFIED:
				return getModified();
			case PdfPackage.DOCUMENT__PRODUCER:
				return getProducer();
			case PdfPackage.DOCUMENT__SUBJECT:
				return getSubject();
			case PdfPackage.DOCUMENT__TITLE:
				return getTitle();
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
			case PdfPackage.DOCUMENT__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case PdfPackage.DOCUMENT__AUTHOR:
				setAuthor((String)newValue);
				return;
			case PdfPackage.DOCUMENT__CREATED:
				setCreated((Date)newValue);
				return;
			case PdfPackage.DOCUMENT__CREATOR:
				setCreator((String)newValue);
				return;
			case PdfPackage.DOCUMENT__KEYWORDS:
				setKeywords((String)newValue);
				return;
			case PdfPackage.DOCUMENT__MODIFIED:
				setModified((Date)newValue);
				return;
			case PdfPackage.DOCUMENT__PRODUCER:
				setProducer((String)newValue);
				return;
			case PdfPackage.DOCUMENT__SUBJECT:
				setSubject((String)newValue);
				return;
			case PdfPackage.DOCUMENT__TITLE:
				setTitle((String)newValue);
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
			case PdfPackage.DOCUMENT__PAGES:
				getPages().clear();
				return;
			case PdfPackage.DOCUMENT__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case PdfPackage.DOCUMENT__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case PdfPackage.DOCUMENT__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case PdfPackage.DOCUMENT__KEYWORDS:
				setKeywords(KEYWORDS_EDEFAULT);
				return;
			case PdfPackage.DOCUMENT__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case PdfPackage.DOCUMENT__PRODUCER:
				setProducer(PRODUCER_EDEFAULT);
				return;
			case PdfPackage.DOCUMENT__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case PdfPackage.DOCUMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case PdfPackage.DOCUMENT__PAGES:
				return !getPages().isEmpty();
			case PdfPackage.DOCUMENT__AUTHOR:
				return AUTHOR_EDEFAULT == null ? getAuthor() != null : !AUTHOR_EDEFAULT.equals(getAuthor());
			case PdfPackage.DOCUMENT__CREATED:
				return CREATED_EDEFAULT == null ? getCreated() != null : !CREATED_EDEFAULT.equals(getCreated());
			case PdfPackage.DOCUMENT__CREATOR:
				return CREATOR_EDEFAULT == null ? getCreator() != null : !CREATOR_EDEFAULT.equals(getCreator());
			case PdfPackage.DOCUMENT__KEYWORDS:
				return KEYWORDS_EDEFAULT == null ? getKeywords() != null : !KEYWORDS_EDEFAULT.equals(getKeywords());
			case PdfPackage.DOCUMENT__MODIFIED:
				return MODIFIED_EDEFAULT == null ? getModified() != null : !MODIFIED_EDEFAULT.equals(getModified());
			case PdfPackage.DOCUMENT__PRODUCER:
				return PRODUCER_EDEFAULT == null ? getProducer() != null : !PRODUCER_EDEFAULT.equals(getProducer());
			case PdfPackage.DOCUMENT__SUBJECT:
				return SUBJECT_EDEFAULT == null ? getSubject() != null : !SUBJECT_EDEFAULT.equals(getSubject());
			case PdfPackage.DOCUMENT__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
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
			case PdfPackage.DOCUMENT___GET_TEXT__STRING_STRING_STRING_STRING_STRING:
				return getText((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DocumentImpl
