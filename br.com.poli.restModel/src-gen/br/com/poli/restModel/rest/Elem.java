/**
 * generated by Xtext 2.15.0
 */
package br.com.poli.restModel.rest;

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
 *   <li>{@link br.com.poli.restModel.rest.Elem#getClassName <em>Class Name</em>}</li>
 *   <li>{@link br.com.poli.restModel.rest.Elem#getPackage <em>Package</em>}</li>
 *   <li>{@link br.com.poli.restModel.rest.Elem#getAtrib <em>Atrib</em>}</li>
 * </ul>
 *
 * @see br.com.poli.restModel.rest.RestPackage#getElem()
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
   * @see br.com.poli.restModel.rest.RestPackage#getElem_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link br.com.poli.restModel.rest.Elem#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' attribute.
   * @see #setPackage(String)
   * @see br.com.poli.restModel.rest.RestPackage#getElem_Package()
   * @model
   * @generated
   */
  String getPackage();

  /**
   * Sets the value of the '{@link br.com.poli.restModel.rest.Elem#getPackage <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' attribute.
   * @see #getPackage()
   * @generated
   */
  void setPackage(String value);

  /**
   * Returns the value of the '<em><b>Atrib</b></em>' containment reference list.
   * The list contents are of type {@link br.com.poli.restModel.rest.Atrib}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atrib</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atrib</em>' containment reference list.
   * @see br.com.poli.restModel.rest.RestPackage#getElem_Atrib()
   * @model containment="true"
   * @generated
   */
  EList<Atrib> getAtrib();

} // Elem
