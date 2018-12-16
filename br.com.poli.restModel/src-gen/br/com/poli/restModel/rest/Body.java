/**
 * generated by Xtext 2.15.0
 */
package br.com.poli.restModel.rest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.com.poli.restModel.rest.Body#getElem <em>Elem</em>}</li>
 *   <li>{@link br.com.poli.restModel.rest.Body#getGlobAtrib <em>Glob Atrib</em>}</li>
 * </ul>
 *
 * @see br.com.poli.restModel.rest.RestPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject
{
  /**
   * Returns the value of the '<em><b>Elem</b></em>' containment reference list.
   * The list contents are of type {@link br.com.poli.restModel.rest.Elem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem</em>' containment reference list.
   * @see br.com.poli.restModel.rest.RestPackage#getBody_Elem()
   * @model containment="true"
   * @generated
   */
  EList<Elem> getElem();

  /**
   * Returns the value of the '<em><b>Glob Atrib</b></em>' containment reference list.
   * The list contents are of type {@link br.com.poli.restModel.rest.Atrib}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Glob Atrib</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Glob Atrib</em>' containment reference list.
   * @see br.com.poli.restModel.rest.RestPackage#getBody_GlobAtrib()
   * @model containment="true"
   * @generated
   */
  EList<Atrib> getGlobAtrib();

} // Body
