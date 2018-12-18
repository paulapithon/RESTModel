/**
 * generated by Xtext 2.15.0
 */
package br.com.poli.restModel.rest;

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
   * Returns the value of the '<em><b>Elem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem</em>' containment reference.
   * @see #setElem(Elem)
   * @see br.com.poli.restModel.rest.RestPackage#getBody_Elem()
   * @model containment="true"
   * @generated
   */
  Elem getElem();

  /**
   * Sets the value of the '{@link br.com.poli.restModel.rest.Body#getElem <em>Elem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem</em>' containment reference.
   * @see #getElem()
   * @generated
   */
  void setElem(Elem value);

  /**
   * Returns the value of the '<em><b>Glob Atrib</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Glob Atrib</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Glob Atrib</em>' containment reference.
   * @see #setGlobAtrib(GlobAtrib)
   * @see br.com.poli.restModel.rest.RestPackage#getBody_GlobAtrib()
   * @model containment="true"
   * @generated
   */
  GlobAtrib getGlobAtrib();

  /**
   * Sets the value of the '{@link br.com.poli.restModel.rest.Body#getGlobAtrib <em>Glob Atrib</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Glob Atrib</em>' containment reference.
   * @see #getGlobAtrib()
   * @generated
   */
  void setGlobAtrib(GlobAtrib value);

} // Body
