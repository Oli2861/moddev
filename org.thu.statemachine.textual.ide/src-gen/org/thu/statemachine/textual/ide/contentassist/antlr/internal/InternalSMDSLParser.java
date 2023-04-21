package org.thu.statemachine.textual.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.thu.statemachine.textual.services.SMDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSMDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'S'", "'{'", "'}'", "'T'", "'->'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSMDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSMDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSMDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSMDSL.g"; }


    	private SMDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(SMDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleEntry"
    // InternalSMDSL.g:53:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // InternalSMDSL.g:54:1: ( ruleEntry EOF )
            // InternalSMDSL.g:55:1: ruleEntry EOF
            {
             before(grammarAccess.getEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalSMDSL.g:62:1: ruleEntry : ( ( rule__Entry__Alternatives ) ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:66:2: ( ( ( rule__Entry__Alternatives ) ) )
            // InternalSMDSL.g:67:2: ( ( rule__Entry__Alternatives ) )
            {
            // InternalSMDSL.g:67:2: ( ( rule__Entry__Alternatives ) )
            // InternalSMDSL.g:68:3: ( rule__Entry__Alternatives )
            {
             before(grammarAccess.getEntryAccess().getAlternatives()); 
            // InternalSMDSL.g:69:3: ( rule__Entry__Alternatives )
            // InternalSMDSL.g:69:4: rule__Entry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleState"
    // InternalSMDSL.g:78:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalSMDSL.g:79:1: ( ruleState EOF )
            // InternalSMDSL.g:80:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalSMDSL.g:87:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:91:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalSMDSL.g:92:2: ( ( rule__State__Group__0 ) )
            {
            // InternalSMDSL.g:92:2: ( ( rule__State__Group__0 ) )
            // InternalSMDSL.g:93:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalSMDSL.g:94:3: ( rule__State__Group__0 )
            // InternalSMDSL.g:94:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalSMDSL.g:103:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalSMDSL.g:104:1: ( ruleTransition EOF )
            // InternalSMDSL.g:105:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalSMDSL.g:112:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:116:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalSMDSL.g:117:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalSMDSL.g:117:2: ( ( rule__Transition__Group__0 ) )
            // InternalSMDSL.g:118:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalSMDSL.g:119:3: ( rule__Transition__Group__0 )
            // InternalSMDSL.g:119:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "rule__Entry__Alternatives"
    // InternalSMDSL.g:127:1: rule__Entry__Alternatives : ( ( ruleState ) | ( ruleTransition ) );
    public final void rule__Entry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:131:1: ( ( ruleState ) | ( ruleTransition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSMDSL.g:132:2: ( ruleState )
                    {
                    // InternalSMDSL.g:132:2: ( ruleState )
                    // InternalSMDSL.g:133:3: ruleState
                    {
                     before(grammarAccess.getEntryAccess().getStateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getEntryAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSMDSL.g:138:2: ( ruleTransition )
                    {
                    // InternalSMDSL.g:138:2: ( ruleTransition )
                    // InternalSMDSL.g:139:3: ruleTransition
                    {
                     before(grammarAccess.getEntryAccess().getTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTransition();

                    state._fsp--;

                     after(grammarAccess.getEntryAccess().getTransitionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Alternatives"


    // $ANTLR start "rule__State__Group__0"
    // InternalSMDSL.g:148:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:152:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalSMDSL.g:153:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalSMDSL.g:160:1: rule__State__Group__0__Impl : ( 'S' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:164:1: ( ( 'S' ) )
            // InternalSMDSL.g:165:1: ( 'S' )
            {
            // InternalSMDSL.g:165:1: ( 'S' )
            // InternalSMDSL.g:166:2: 'S'
            {
             before(grammarAccess.getStateAccess().getSKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalSMDSL.g:175:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:179:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalSMDSL.g:180:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalSMDSL.g:187:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:191:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalSMDSL.g:192:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalSMDSL.g:192:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalSMDSL.g:193:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalSMDSL.g:194:2: ( rule__State__NameAssignment_1 )
            // InternalSMDSL.g:194:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalSMDSL.g:202:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:206:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalSMDSL.g:207:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalSMDSL.g:214:1: rule__State__Group__2__Impl : ( '{' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:218:1: ( ( '{' ) )
            // InternalSMDSL.g:219:1: ( '{' )
            {
            // InternalSMDSL.g:219:1: ( '{' )
            // InternalSMDSL.g:220:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalSMDSL.g:229:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:233:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalSMDSL.g:234:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalSMDSL.g:241:1: rule__State__Group__3__Impl : ( ( rule__State__ContentsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:245:1: ( ( ( rule__State__ContentsAssignment_3 )* ) )
            // InternalSMDSL.g:246:1: ( ( rule__State__ContentsAssignment_3 )* )
            {
            // InternalSMDSL.g:246:1: ( ( rule__State__ContentsAssignment_3 )* )
            // InternalSMDSL.g:247:2: ( rule__State__ContentsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getContentsAssignment_3()); 
            // InternalSMDSL.g:248:2: ( rule__State__ContentsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSMDSL.g:248:3: rule__State__ContentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__State__ContentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getContentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalSMDSL.g:256:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:260:1: ( rule__State__Group__4__Impl )
            // InternalSMDSL.g:261:2: rule__State__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalSMDSL.g:267:1: rule__State__Group__4__Impl : ( '}' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:271:1: ( ( '}' ) )
            // InternalSMDSL.g:272:1: ( '}' )
            {
            // InternalSMDSL.g:272:1: ( '}' )
            // InternalSMDSL.g:273:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalSMDSL.g:283:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:287:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalSMDSL.g:288:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalSMDSL.g:295:1: rule__Transition__Group__0__Impl : ( 'T' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:299:1: ( ( 'T' ) )
            // InternalSMDSL.g:300:1: ( 'T' )
            {
            // InternalSMDSL.g:300:1: ( 'T' )
            // InternalSMDSL.g:301:2: 'T'
            {
             before(grammarAccess.getTransitionAccess().getTKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalSMDSL.g:310:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:314:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalSMDSL.g:315:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalSMDSL.g:322:1: rule__Transition__Group__1__Impl : ( '->' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:326:1: ( ( '->' ) )
            // InternalSMDSL.g:327:1: ( '->' )
            {
            // InternalSMDSL.g:327:1: ( '->' )
            // InternalSMDSL.g:328:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalSMDSL.g:337:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:341:1: ( rule__Transition__Group__2__Impl )
            // InternalSMDSL.g:342:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalSMDSL.g:348:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__ToAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:352:1: ( ( ( rule__Transition__ToAssignment_2 ) ) )
            // InternalSMDSL.g:353:1: ( ( rule__Transition__ToAssignment_2 ) )
            {
            // InternalSMDSL.g:353:1: ( ( rule__Transition__ToAssignment_2 ) )
            // InternalSMDSL.g:354:2: ( rule__Transition__ToAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getToAssignment_2()); 
            // InternalSMDSL.g:355:2: ( rule__Transition__ToAssignment_2 )
            // InternalSMDSL.g:355:3: rule__Transition__ToAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ToAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalSMDSL.g:364:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:368:1: ( ( RULE_ID ) )
            // InternalSMDSL.g:369:2: ( RULE_ID )
            {
            // InternalSMDSL.g:369:2: ( RULE_ID )
            // InternalSMDSL.g:370:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__ContentsAssignment_3"
    // InternalSMDSL.g:379:1: rule__State__ContentsAssignment_3 : ( ruleEntry ) ;
    public final void rule__State__ContentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:383:1: ( ( ruleEntry ) )
            // InternalSMDSL.g:384:2: ( ruleEntry )
            {
            // InternalSMDSL.g:384:2: ( ruleEntry )
            // InternalSMDSL.g:385:3: ruleEntry
            {
             before(grammarAccess.getStateAccess().getContentsEntryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getStateAccess().getContentsEntryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ContentsAssignment_3"


    // $ANTLR start "rule__Transition__ToAssignment_2"
    // InternalSMDSL.g:394:1: rule__Transition__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSMDSL.g:398:1: ( ( ( RULE_ID ) ) )
            // InternalSMDSL.g:399:2: ( ( RULE_ID ) )
            {
            // InternalSMDSL.g:399:2: ( ( RULE_ID ) )
            // InternalSMDSL.g:400:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getToStateCrossReference_2_0()); 
            // InternalSMDSL.g:401:3: ( RULE_ID )
            // InternalSMDSL.g:402:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getToStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getToStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getToStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ToAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});

}