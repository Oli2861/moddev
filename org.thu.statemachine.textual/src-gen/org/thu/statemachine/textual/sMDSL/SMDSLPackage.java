/**
 * generated by Xtext 2.30.0
 */
package org.thu.statemachine.textual.sMDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.thu.statemachine.textual.sMDSL.SMDSLFactory
 * @model kind="package"
 * @generated
 */
public interface SMDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sMDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.thu.org/statemachine/textual/SMDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sMDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SMDSLPackage eINSTANCE = org.thu.statemachine.textual.sMDSL.impl.SMDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.thu.statemachine.textual.sMDSL.impl.EntryImpl <em>Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thu.statemachine.textual.sMDSL.impl.EntryImpl
   * @see org.thu.statemachine.textual.sMDSL.impl.SMDSLPackageImpl#getEntry()
   * @generated
   */
  int ENTRY = 0;

  /**
   * The number of structural features of the '<em>Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.thu.statemachine.textual.sMDSL.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thu.statemachine.textual.sMDSL.impl.StateImpl
   * @see org.thu.statemachine.textual.sMDSL.impl.SMDSLPackageImpl#getState()
   * @generated
   */
  int STATE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = ENTRY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__CONTENTS = ENTRY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thu.statemachine.textual.sMDSL.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thu.statemachine.textual.sMDSL.impl.TransitionImpl
   * @see org.thu.statemachine.textual.sMDSL.impl.SMDSLPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 2;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TO = ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.thu.statemachine.textual.sMDSL.Entry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry</em>'.
   * @see org.thu.statemachine.textual.sMDSL.Entry
   * @generated
   */
  EClass getEntry();

  /**
   * Returns the meta object for class '{@link org.thu.statemachine.textual.sMDSL.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.thu.statemachine.textual.sMDSL.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link org.thu.statemachine.textual.sMDSL.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.thu.statemachine.textual.sMDSL.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.thu.statemachine.textual.sMDSL.State#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.thu.statemachine.textual.sMDSL.State#getContents()
   * @see #getState()
   * @generated
   */
  EReference getState_Contents();

  /**
   * Returns the meta object for class '{@link org.thu.statemachine.textual.sMDSL.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.thu.statemachine.textual.sMDSL.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link org.thu.statemachine.textual.sMDSL.Transition#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see org.thu.statemachine.textual.sMDSL.Transition#getTo()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_To();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SMDSLFactory getSMDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.thu.statemachine.textual.sMDSL.impl.EntryImpl <em>Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.thu.statemachine.textual.sMDSL.impl.EntryImpl
     * @see org.thu.statemachine.textual.sMDSL.impl.SMDSLPackageImpl#getEntry()
     * @generated
     */
    EClass ENTRY = eINSTANCE.getEntry();

    /**
     * The meta object literal for the '{@link org.thu.statemachine.textual.sMDSL.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.thu.statemachine.textual.sMDSL.impl.StateImpl
     * @see org.thu.statemachine.textual.sMDSL.impl.SMDSLPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__CONTENTS = eINSTANCE.getState_Contents();

    /**
     * The meta object literal for the '{@link org.thu.statemachine.textual.sMDSL.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.thu.statemachine.textual.sMDSL.impl.TransitionImpl
     * @see org.thu.statemachine.textual.sMDSL.impl.SMDSLPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TO = eINSTANCE.getTransition_To();

  }

} //SMDSLPackage
