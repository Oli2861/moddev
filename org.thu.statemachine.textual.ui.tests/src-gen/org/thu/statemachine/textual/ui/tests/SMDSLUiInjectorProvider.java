/*
 * generated by Xtext 2.30.0
 */
package org.thu.statemachine.textual.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.thu.statemachine.textual.ui.internal.TextualActivator;

public class SMDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TextualActivator.getInstance().getInjector("org.thu.statemachine.textual.SMDSL");
	}

}
