/**
 * generated by Xtext 2.15.0
 */
package br.com.poli.rESTModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.com.poli.rESTModel.Elem#getClassName <em>Class Name</em>}</li>
 *   <li>{@link br.com.poli.rESTModel.Elem#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see br.com.poli.rESTModel.RESTModelPackage#getElem()
 * @model
 * @generated
 */
public interface Elem extends EObject
{
  /**
   * Returns the value of the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' attribute.
   * @see #setClassName(String)
   * @see br.com.poli.rESTModel.RESTModelPackage#getElem_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link br.com.poli.rESTModel.Elem#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Field</b></em>' containment reference list.
   * The list contents are of type {@link br.com.poli.rESTModel.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' containment reference list.
   * @see br.com.poli.rESTModel.RESTModelPackage#getElem_Field()
   * @model containment="true"
   * @generated
   */
  EList<Field> getField();

} // Elem
