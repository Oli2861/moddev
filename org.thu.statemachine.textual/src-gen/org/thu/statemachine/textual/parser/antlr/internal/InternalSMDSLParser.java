package org.thu.statemachine.textual.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.thu.statemachine.textual.services.SMDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSMDSLParser extends AbstractInternalAntlrParser {
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

        public InternalSMDSLParser(TokenStream input, SMDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Entry";
       	}

       	@Override
       	protected SMDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEntry"
    // InternalSMDSL.g:64:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalSMDSL.g:64:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalSMDSL.g:65:2: iv_ruleEntry= ruleEntry EOF
            {
             newCompositeNode(grammarAccess.getEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntry=ruleEntry();

            state._fsp--;

             current =iv_ruleEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalSMDSL.g:71:1: ruleEntry returns [EObject current=null] : (this_State_0= ruleState | this_Transition_1= ruleTransition ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_Transition_1 = null;



        	enterRule();

        try {
            // InternalSMDSL.g:77:2: ( (this_State_0= ruleState | this_Transition_1= ruleTransition ) )
            // InternalSMDSL.g:78:2: (this_State_0= ruleState | this_Transition_1= ruleTransition )
            {
            // InternalSMDSL.g:78:2: (this_State_0= ruleState | this_Transition_1= ruleTransition )
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
                    // InternalSMDSL.g:79:3: this_State_0= ruleState
                    {

                    			newCompositeNode(grammarAccess.getEntryAccess().getStateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_State_0=ruleState();

                    state._fsp--;


                    			current = this_State_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSMDSL.g:88:3: this_Transition_1= ruleTransition
                    {

                    			newCompositeNode(grammarAccess.getEntryAccess().getTransitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Transition_1=ruleTransition();

                    state._fsp--;


                    			current = this_Transition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleState"
    // InternalSMDSL.g:100:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalSMDSL.g:100:46: (iv_ruleState= ruleState EOF )
            // InternalSMDSL.g:101:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalSMDSL.g:107:1: ruleState returns [EObject current=null] : (otherlv_0= 'S' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contents_3_0= ruleEntry ) )* otherlv_4= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_contents_3_0 = null;



        	enterRule();

        try {
            // InternalSMDSL.g:113:2: ( (otherlv_0= 'S' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contents_3_0= ruleEntry ) )* otherlv_4= '}' ) )
            // InternalSMDSL.g:114:2: (otherlv_0= 'S' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contents_3_0= ruleEntry ) )* otherlv_4= '}' )
            {
            // InternalSMDSL.g:114:2: (otherlv_0= 'S' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contents_3_0= ruleEntry ) )* otherlv_4= '}' )
            // InternalSMDSL.g:115:3: otherlv_0= 'S' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contents_3_0= ruleEntry ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getSKeyword_0());
            		
            // InternalSMDSL.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSMDSL.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSMDSL.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalSMDSL.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSMDSL.g:141:3: ( (lv_contents_3_0= ruleEntry ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSMDSL.g:142:4: (lv_contents_3_0= ruleEntry )
            	    {
            	    // InternalSMDSL.g:142:4: (lv_contents_3_0= ruleEntry )
            	    // InternalSMDSL.g:143:5: lv_contents_3_0= ruleEntry
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getContentsEntryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_contents_3_0=ruleEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contents",
            	    						lv_contents_3_0,
            	    						"org.thu.statemachine.textual.SMDSL.Entry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalSMDSL.g:168:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalSMDSL.g:168:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalSMDSL.g:169:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalSMDSL.g:175:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'T' otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSMDSL.g:181:2: ( (otherlv_0= 'T' otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalSMDSL.g:182:2: (otherlv_0= 'T' otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalSMDSL.g:182:2: (otherlv_0= 'T' otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            // InternalSMDSL.g:183:3: otherlv_0= 'T' otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalSMDSL.g:191:3: ( (otherlv_2= RULE_ID ) )
            // InternalSMDSL.g:192:4: (otherlv_2= RULE_ID )
            {
            // InternalSMDSL.g:192:4: (otherlv_2= RULE_ID )
            // InternalSMDSL.g:193:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToStateCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});

}