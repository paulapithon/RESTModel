/**
 * generated by Xtext 2.15.0
 */
package br.com.poli.restModel.rest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glob Atrib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.com.poli.restModel.rest.GlobAtrib#getAtribName <em>Atrib Name</em>}</li>
 *   <li>{@link br.com.poli.restModel.rest.GlobAtrib#getTipo <em>Tipo</em>}</li>
 *   <li>{@link br.com.poli.restModel.rest.GlobAtrib#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see br.com.poli.restModel.rest.RestPackage#getGlobAtrib()
 * @model
 * @generated
 */
public interface GlobAtrib extends EObject
{
  /**
   * Returns the value of the '<em><b>Atrib Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atrib Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atrib Name</em>' attribute.
   * @see #setAtribName(String)
   * @see br.com.poli.restModel.rest.RestPackage#getGlobAtrib_AtribName()
   * @model
   * @generated
   */
  String getAtribName();

  /**
   * Sets the value of the '{@link br.com.poli.restModel.rest.GlobAtrib#getAtribName <em>Atrib Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atrib Name</em>' attribute.
   * @see #getAtribName()
   * @generated
   */
  void setAtribName(String value);

  /**
   * Returns the value of the '<em><b>Tipo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' attribute.
   * @see #setTipo(String)
   * @see br.com.poli.restModel.rest.RestPackage#getGlobAtrib_Tipo()
   * @model
   * @generated
   */
  String getTipo();

  /**
   * Sets the value of the '{@link br.com.poli.restModel.rest.GlobAtrib#getTipo <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' attribute.
   * @see #getTipo()
   * @generated
   */
  void setTipo(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Values)
   * @see br.com.poli.restModel.rest.RestPackage#getGlobAtrib_Value()
   * @model containment="true"
   * @generated
   */
  Values getValue();

  /**
   * Sets the value of the '{@link br.com.poli.restModel.rest.GlobAtrib#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Values value);

} // GlobAtrib
