/*
 * generated by Xtext 2.30.0
 */
package org.thu.statemachine.textual.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSMDSLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.thu.statemachine.textual.sMDSL.SMDSLPackage.eINSTANCE);
		return result;
	}
}
