/*
 * generated by Xtext 2.30.0
 */
package org.thu.statemachine.textual.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SMDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/thu/statemachine/textual/parser/antlr/internal/InternalSMDSL.tokens");
	}
}
