/**
 * generated by Xtext 2.15.0
 */
package br.com.poli.restModel.rest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.com.poli.restModel.rest.Start#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see br.com.poli.restModel.rest.RestPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends EObject
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Body)
   * @see br.com.poli.restModel.rest.RestPackage#getStart_Body()
   * @model containment="true"
   * @generated
   */
  Body getBody();

  /**
   * Sets the value of the '{@link br.com.poli.restModel.rest.Start#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Body value);

} // Start