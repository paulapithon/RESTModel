package br.com.poli.restModel.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.com.poli.restModel.services.RestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ALMOST__ANY__THING", "RULE_INT_TYPES", "RULE_INT", "RULE_BOOL", "RULE_FLOAT_TYPES", "RULE_FLOAT", "RULE_STRING", "RULE_CHAR", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'Request'", "'{'", "'}'", "'('", "')'", "':'", "'boolean'", "'String'", "'char'", "'<'", "','", "'>'"
    };
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_INT_TYPES=6;
    public static final int RULE_CHAR=12;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=13;
    public static final int RULE_FLOAT_TYPES=9;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_BOOL=8;
    public static final int RULE_ALMOST__ANY__THING=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int RULE_FLOAT=10;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRestParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRest.g"; }



     	private RestGrammarAccess grammarAccess;

        public InternalRestParser(TokenStream input, RestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRest.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRest.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalRest.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRest.g:71:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Request' otherlv_2= '{' ( (lv_body_3_0= ruleBody ) )* otherlv_4= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalRest.g:77:2: ( ( () otherlv_1= 'Request' otherlv_2= '{' ( (lv_body_3_0= ruleBody ) )* otherlv_4= '}' ) )
            // InternalRest.g:78:2: ( () otherlv_1= 'Request' otherlv_2= '{' ( (lv_body_3_0= ruleBody ) )* otherlv_4= '}' )
            {
            // InternalRest.g:78:2: ( () otherlv_1= 'Request' otherlv_2= '{' ( (lv_body_3_0= ruleBody ) )* otherlv_4= '}' )
            // InternalRest.g:79:3: () otherlv_1= 'Request' otherlv_2= '{' ( (lv_body_3_0= ruleBody ) )* otherlv_4= '}'
            {
            // InternalRest.g:79:3: ()
            // InternalRest.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getRequestKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRest.g:94:3: ( (lv_body_3_0= ruleBody ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRest.g:95:4: (lv_body_3_0= ruleBody )
            	    {
            	    // InternalRest.g:95:4: (lv_body_3_0= ruleBody )
            	    // InternalRest.g:96:5: lv_body_3_0= ruleBody
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getBodyBodyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_body_3_0=ruleBody();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_3_0,
            	    						"br.com.poli.restModel.Rest.Body");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBody"
    // InternalRest.g:121:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalRest.g:121:45: (iv_ruleBody= ruleBody EOF )
            // InternalRest.g:122:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalRest.g:128:1: ruleBody returns [EObject current=null] : ( ( () ( (lv_elem_1_0= ruleElem ) ) ) | ( () ( (lv_globAtrib_3_0= ruleAtrib ) ) ) ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        EObject lv_elem_1_0 = null;

        EObject lv_globAtrib_3_0 = null;



        	enterRule();

        try {
            // InternalRest.g:134:2: ( ( ( () ( (lv_elem_1_0= ruleElem ) ) ) | ( () ( (lv_globAtrib_3_0= ruleAtrib ) ) ) ) )
            // InternalRest.g:135:2: ( ( () ( (lv_elem_1_0= ruleElem ) ) ) | ( () ( (lv_globAtrib_3_0= ruleAtrib ) ) ) )
            {
            // InternalRest.g:135:2: ( ( () ( (lv_elem_1_0= ruleElem ) ) ) | ( () ( (lv_globAtrib_3_0= ruleAtrib ) ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==18) ) {
                    alt2=1;
                }
                else if ( (LA2_1==22) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRest.g:136:3: ( () ( (lv_elem_1_0= ruleElem ) ) )
                    {
                    // InternalRest.g:136:3: ( () ( (lv_elem_1_0= ruleElem ) ) )
                    // InternalRest.g:137:4: () ( (lv_elem_1_0= ruleElem ) )
                    {
                    // InternalRest.g:137:4: ()
                    // InternalRest.g:138:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBodyAccess().getBodyAction_0_0(),
                    						current);
                    				

                    }

                    // InternalRest.g:144:4: ( (lv_elem_1_0= ruleElem ) )
                    // InternalRest.g:145:5: (lv_elem_1_0= ruleElem )
                    {
                    // InternalRest.g:145:5: (lv_elem_1_0= ruleElem )
                    // InternalRest.g:146:6: lv_elem_1_0= ruleElem
                    {

                    						newCompositeNode(grammarAccess.getBodyAccess().getElemElemParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elem_1_0=ruleElem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBodyRule());
                    						}
                    						add(
                    							current,
                    							"elem",
                    							lv_elem_1_0,
                    							"br.com.poli.restModel.Rest.Elem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:165:3: ( () ( (lv_globAtrib_3_0= ruleAtrib ) ) )
                    {
                    // InternalRest.g:165:3: ( () ( (lv_globAtrib_3_0= ruleAtrib ) ) )
                    // InternalRest.g:166:4: () ( (lv_globAtrib_3_0= ruleAtrib ) )
                    {
                    // InternalRest.g:166:4: ()
                    // InternalRest.g:167:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBodyAccess().getBodyAction_1_0(),
                    						current);
                    				

                    }

                    // InternalRest.g:173:4: ( (lv_globAtrib_3_0= ruleAtrib ) )
                    // InternalRest.g:174:5: (lv_globAtrib_3_0= ruleAtrib )
                    {
                    // InternalRest.g:174:5: (lv_globAtrib_3_0= ruleAtrib )
                    // InternalRest.g:175:6: lv_globAtrib_3_0= ruleAtrib
                    {

                    						newCompositeNode(grammarAccess.getBodyAccess().getGlobAtribAtribParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_globAtrib_3_0=ruleAtrib();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBodyRule());
                    						}
                    						add(
                    							current,
                    							"globAtrib",
                    							lv_globAtrib_3_0,
                    							"br.com.poli.restModel.Rest.Atrib");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleElem"
    // InternalRest.g:197:1: entryRuleElem returns [EObject current=null] : iv_ruleElem= ruleElem EOF ;
    public final EObject entryRuleElem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElem = null;


        try {
            // InternalRest.g:197:45: (iv_ruleElem= ruleElem EOF )
            // InternalRest.g:198:2: iv_ruleElem= ruleElem EOF
            {
             newCompositeNode(grammarAccess.getElemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElem=ruleElem();

            state._fsp--;

             current =iv_ruleElem; 
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
    // $ANTLR end "entryRuleElem"


    // $ANTLR start "ruleElem"
    // InternalRest.g:204:1: ruleElem returns [EObject current=null] : ( ( (lv_ClassName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_field_2_0= ruleField ) )* otherlv_3= '}' ) ;
    public final EObject ruleElem() throws RecognitionException {
        EObject current = null;

        Token lv_ClassName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_field_2_0 = null;



        	enterRule();

        try {
            // InternalRest.g:210:2: ( ( ( (lv_ClassName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_field_2_0= ruleField ) )* otherlv_3= '}' ) )
            // InternalRest.g:211:2: ( ( (lv_ClassName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_field_2_0= ruleField ) )* otherlv_3= '}' )
            {
            // InternalRest.g:211:2: ( ( (lv_ClassName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_field_2_0= ruleField ) )* otherlv_3= '}' )
            // InternalRest.g:212:3: ( (lv_ClassName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_field_2_0= ruleField ) )* otherlv_3= '}'
            {
            // InternalRest.g:212:3: ( (lv_ClassName_0_0= RULE_ID ) )
            // InternalRest.g:213:4: (lv_ClassName_0_0= RULE_ID )
            {
            // InternalRest.g:213:4: (lv_ClassName_0_0= RULE_ID )
            // InternalRest.g:214:5: lv_ClassName_0_0= RULE_ID
            {
            lv_ClassName_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_ClassName_0_0, grammarAccess.getElemAccess().getClassNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ClassName",
            						lv_ClassName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getElemAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:234:3: ( (lv_field_2_0= ruleField ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRest.g:235:4: (lv_field_2_0= ruleField )
            	    {
            	    // InternalRest.g:235:4: (lv_field_2_0= ruleField )
            	    // InternalRest.g:236:5: lv_field_2_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getElemAccess().getFieldFieldParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_field_2_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"field",
            	    						lv_field_2_0,
            	    						"br.com.poli.restModel.Rest.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getElemAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleElem"


    // $ANTLR start "entryRuleField"
    // InternalRest.g:261:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalRest.g:261:46: (iv_ruleField= ruleField EOF )
            // InternalRest.g:262:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalRest.g:268:1: ruleField returns [EObject current=null] : ( ( () ( (lv_atrib_1_0= ruleAtrib ) ) ) | ( () ( (lv_method_3_0= ruleMethod ) ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        EObject lv_atrib_1_0 = null;

        EObject lv_method_3_0 = null;



        	enterRule();

        try {
            // InternalRest.g:274:2: ( ( ( () ( (lv_atrib_1_0= ruleAtrib ) ) ) | ( () ( (lv_method_3_0= ruleMethod ) ) ) ) )
            // InternalRest.g:275:2: ( ( () ( (lv_atrib_1_0= ruleAtrib ) ) ) | ( () ( (lv_method_3_0= ruleMethod ) ) ) )
            {
            // InternalRest.g:275:2: ( ( () ( (lv_atrib_1_0= ruleAtrib ) ) ) | ( () ( (lv_method_3_0= ruleMethod ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==22) ) {
                    alt4=1;
                }
                else if ( (LA4_1==20) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRest.g:276:3: ( () ( (lv_atrib_1_0= ruleAtrib ) ) )
                    {
                    // InternalRest.g:276:3: ( () ( (lv_atrib_1_0= ruleAtrib ) ) )
                    // InternalRest.g:277:4: () ( (lv_atrib_1_0= ruleAtrib ) )
                    {
                    // InternalRest.g:277:4: ()
                    // InternalRest.g:278:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldAccess().getFieldAction_0_0(),
                    						current);
                    				

                    }

                    // InternalRest.g:284:4: ( (lv_atrib_1_0= ruleAtrib ) )
                    // InternalRest.g:285:5: (lv_atrib_1_0= ruleAtrib )
                    {
                    // InternalRest.g:285:5: (lv_atrib_1_0= ruleAtrib )
                    // InternalRest.g:286:6: lv_atrib_1_0= ruleAtrib
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getAtribAtribParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_atrib_1_0=ruleAtrib();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"atrib",
                    							lv_atrib_1_0,
                    							"br.com.poli.restModel.Rest.Atrib");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:305:3: ( () ( (lv_method_3_0= ruleMethod ) ) )
                    {
                    // InternalRest.g:305:3: ( () ( (lv_method_3_0= ruleMethod ) ) )
                    // InternalRest.g:306:4: () ( (lv_method_3_0= ruleMethod ) )
                    {
                    // InternalRest.g:306:4: ()
                    // InternalRest.g:307:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldAccess().getFieldAction_1_0(),
                    						current);
                    				

                    }

                    // InternalRest.g:313:4: ( (lv_method_3_0= ruleMethod ) )
                    // InternalRest.g:314:5: (lv_method_3_0= ruleMethod )
                    {
                    // InternalRest.g:314:5: (lv_method_3_0= ruleMethod )
                    // InternalRest.g:315:6: lv_method_3_0= ruleMethod
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getMethodMethodParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_method_3_0=ruleMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"method",
                    							lv_method_3_0,
                    							"br.com.poli.restModel.Rest.Method");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // InternalRest.g:337:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalRest.g:337:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalRest.g:338:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalRest.g:344:1: ruleMethod returns [EObject current=null] : ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_par_2_0= ruleParm ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_Tipo_5_0= ruleVALID_TYPES ) ) ( (lv_implem_6_0= RULE_ALMOST__ANY__THING ) )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_mName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_implem_6_0=null;
        EObject lv_par_2_0 = null;

        AntlrDatatypeRuleToken lv_Tipo_5_0 = null;



        	enterRule();

        try {
            // InternalRest.g:350:2: ( ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_par_2_0= ruleParm ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_Tipo_5_0= ruleVALID_TYPES ) ) ( (lv_implem_6_0= RULE_ALMOST__ANY__THING ) )? ) )
            // InternalRest.g:351:2: ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_par_2_0= ruleParm ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_Tipo_5_0= ruleVALID_TYPES ) ) ( (lv_implem_6_0= RULE_ALMOST__ANY__THING ) )? )
            {
            // InternalRest.g:351:2: ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_par_2_0= ruleParm ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_Tipo_5_0= ruleVALID_TYPES ) ) ( (lv_implem_6_0= RULE_ALMOST__ANY__THING ) )? )
            // InternalRest.g:352:3: ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_par_2_0= ruleParm ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_Tipo_5_0= ruleVALID_TYPES ) ) ( (lv_implem_6_0= RULE_ALMOST__ANY__THING ) )?
            {
            // InternalRest.g:352:3: ( (lv_mName_0_0= RULE_ID ) )
            // InternalRest.g:353:4: (lv_mName_0_0= RULE_ID )
            {
            // InternalRest.g:353:4: (lv_mName_0_0= RULE_ID )
            // InternalRest.g:354:5: lv_mName_0_0= RULE_ID
            {
            lv_mName_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_mName_0_0, grammarAccess.getMethodAccess().getMNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mName",
            						lv_mName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRest.g:374:3: ( (lv_par_2_0= ruleParm ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRest.g:375:4: (lv_par_2_0= ruleParm )
            	    {
            	    // InternalRest.g:375:4: (lv_par_2_0= ruleParm )
            	    // InternalRest.g:376:5: lv_par_2_0= ruleParm
            	    {

            	    					newCompositeNode(grammarAccess.getMethodAccess().getParParmParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_par_2_0=ruleParm();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodRule());
            	    					}
            	    					add(
            	    						current,
            	    						"par",
            	    						lv_par_2_0,
            	    						"br.com.poli.restModel.Rest.Parm");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getColonKeyword_4());
            		
            // InternalRest.g:401:3: ( (lv_Tipo_5_0= ruleVALID_TYPES ) )
            // InternalRest.g:402:4: (lv_Tipo_5_0= ruleVALID_TYPES )
            {
            // InternalRest.g:402:4: (lv_Tipo_5_0= ruleVALID_TYPES )
            // InternalRest.g:403:5: lv_Tipo_5_0= ruleVALID_TYPES
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getTipoVALID_TYPESParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_Tipo_5_0=ruleVALID_TYPES();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"Tipo",
            						lv_Tipo_5_0,
            						"br.com.poli.restModel.Rest.VALID_TYPES");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:420:3: ( (lv_implem_6_0= RULE_ALMOST__ANY__THING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ALMOST__ANY__THING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRest.g:421:4: (lv_implem_6_0= RULE_ALMOST__ANY__THING )
                    {
                    // InternalRest.g:421:4: (lv_implem_6_0= RULE_ALMOST__ANY__THING )
                    // InternalRest.g:422:5: lv_implem_6_0= RULE_ALMOST__ANY__THING
                    {
                    lv_implem_6_0=(Token)match(input,RULE_ALMOST__ANY__THING,FOLLOW_2); 

                    					newLeafNode(lv_implem_6_0, grammarAccess.getMethodAccess().getImplemALMOST__ANY__THINGTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"implem",
                    						lv_implem_6_0,
                    						"br.com.poli.restModel.Rest.ALMOST__ANY__THING");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParm"
    // InternalRest.g:442:1: entryRuleParm returns [EObject current=null] : iv_ruleParm= ruleParm EOF ;
    public final EObject entryRuleParm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParm = null;


        try {
            // InternalRest.g:442:45: (iv_ruleParm= ruleParm EOF )
            // InternalRest.g:443:2: iv_ruleParm= ruleParm EOF
            {
             newCompositeNode(grammarAccess.getParmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParm=ruleParm();

            state._fsp--;

             current =iv_ruleParm; 
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
    // $ANTLR end "entryRuleParm"


    // $ANTLR start "ruleParm"
    // InternalRest.g:449:1: ruleParm returns [EObject current=null] : ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Tipo_atri_2_0= ruleVALID_TYPES ) ) ) ;
    public final EObject ruleParm() throws RecognitionException {
        EObject current = null;

        Token lv_atribName_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_Tipo_atri_2_0 = null;



        	enterRule();

        try {
            // InternalRest.g:455:2: ( ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Tipo_atri_2_0= ruleVALID_TYPES ) ) ) )
            // InternalRest.g:456:2: ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Tipo_atri_2_0= ruleVALID_TYPES ) ) )
            {
            // InternalRest.g:456:2: ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Tipo_atri_2_0= ruleVALID_TYPES ) ) )
            // InternalRest.g:457:3: ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Tipo_atri_2_0= ruleVALID_TYPES ) )
            {
            // InternalRest.g:457:3: ( (lv_atribName_0_0= RULE_ID ) )
            // InternalRest.g:458:4: (lv_atribName_0_0= RULE_ID )
            {
            // InternalRest.g:458:4: (lv_atribName_0_0= RULE_ID )
            // InternalRest.g:459:5: lv_atribName_0_0= RULE_ID
            {
            lv_atribName_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_atribName_0_0, grammarAccess.getParmAccess().getAtribNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParmRule());
            					}
            					setWithLastConsumed(
            						current,
            						"atribName",
            						lv_atribName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getParmAccess().getColonKeyword_1());
            		
            // InternalRest.g:479:3: ( (lv_Tipo_atri_2_0= ruleVALID_TYPES ) )
            // InternalRest.g:480:4: (lv_Tipo_atri_2_0= ruleVALID_TYPES )
            {
            // InternalRest.g:480:4: (lv_Tipo_atri_2_0= ruleVALID_TYPES )
            // InternalRest.g:481:5: lv_Tipo_atri_2_0= ruleVALID_TYPES
            {

            					newCompositeNode(grammarAccess.getParmAccess().getTipo_atriVALID_TYPESParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_Tipo_atri_2_0=ruleVALID_TYPES();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParmRule());
            					}
            					set(
            						current,
            						"Tipo_atri",
            						lv_Tipo_atri_2_0,
            						"br.com.poli.restModel.Rest.VALID_TYPES");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleParm"


    // $ANTLR start "entryRuleAtrib"
    // InternalRest.g:502:1: entryRuleAtrib returns [EObject current=null] : iv_ruleAtrib= ruleAtrib EOF ;
    public final EObject entryRuleAtrib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtrib = null;


        try {
            // InternalRest.g:502:46: (iv_ruleAtrib= ruleAtrib EOF )
            // InternalRest.g:503:2: iv_ruleAtrib= ruleAtrib EOF
            {
             newCompositeNode(grammarAccess.getAtribRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtrib=ruleAtrib();

            state._fsp--;

             current =iv_ruleAtrib; 
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
    // $ANTLR end "entryRuleAtrib"


    // $ANTLR start "ruleAtrib"
    // InternalRest.g:509:1: ruleAtrib returns [EObject current=null] : ( ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Tipo_2_0= RULE_INT_TYPES ) ) (otherlv_3= ':' ( (lv_ValueInt_4_0= RULE_INT ) ) )? ) | ( ( (lv_atribName_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_Tipo_7_0= 'boolean' ) ) (otherlv_8= ':' ( (lv_ValueBool_9_0= RULE_BOOL ) ) )? ) | ( ( (lv_atribName_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_Tipo_12_0= RULE_FLOAT_TYPES ) ) (otherlv_13= ':' ( (lv_ValueFlo_14_0= RULE_FLOAT ) ) )? ) | ( ( (lv_atribName_15_0= RULE_ID ) ) otherlv_16= ':' ( (lv_Tipo_17_0= 'String' ) ) (otherlv_18= ':' ( (lv_ValueStr_19_0= RULE_STRING ) ) )? ) | ( ( (lv_atribName_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_Tipo_22_0= 'char' ) ) (otherlv_23= ':' ( (lv_ValueChr_24_0= RULE_CHAR ) ) )? ) | ( ( (lv_atribName_25_0= RULE_ID ) ) otherlv_26= ':' ( (lv_Tipo_27_0= ruleTYPE_NAME ) ) ) ) ;
    public final EObject ruleAtrib() throws RecognitionException {
        EObject current = null;

        Token lv_atribName_0_0=null;
        Token otherlv_1=null;
        Token lv_Tipo_2_0=null;
        Token otherlv_3=null;
        Token lv_ValueInt_4_0=null;
        Token lv_atribName_5_0=null;
        Token otherlv_6=null;
        Token lv_Tipo_7_0=null;
        Token otherlv_8=null;
        Token lv_ValueBool_9_0=null;
        Token lv_atribName_10_0=null;
        Token otherlv_11=null;
        Token lv_Tipo_12_0=null;
        Token otherlv_13=null;
        Token lv_ValueFlo_14_0=null;
        Token lv_atribName_15_0=null;
        Token otherlv_16=null;
        Token lv_Tipo_17_0=null;
        Token otherlv_18=null;
        Token lv_ValueStr_19_0=null;
        Token lv_atribName_20_0=null;
        Token otherlv_21=null;
        Token lv_Tipo_22_0=null;
        Token otherlv_23=null;
        Token lv_ValueChr_24_0=null;
        Token lv_atribName_25_0=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_Tipo_27_0 = null;



        	enterRule();

        try {
            // InternalRest.g:515:2: ( ( ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Tipo_2_0= RULE_INT_TYPES ) ) (otherlv_3= ':' ( (lv_ValueInt_4_0= RULE_INT ) ) )? ) | ( ( (lv_atribName_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_Tipo_7_0= 'boolean' ) ) (otherlv_8= ':' ( (lv_ValueBool_9_0= RULE_BOOL ) ) )? ) | ( ( (lv_atribName_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_Tipo_12_0= RULE_FLOAT_TYPES ) ) (otherlv_13= ':' ( (lv_ValueFlo_14_0= RULE_FLOAT ) ) )? ) | ( ( (lv_atribName_15_0= RULE_ID ) ) otherlv_16= ':' ( (lv_Tipo_17_0= 'String' ) ) (otherlv_18= ':' ( (lv_ValueStr_19_0= RULE_STRING ) ) )? ) | ( ( (lv_atribName_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_Tipo_22_0= 'char' ) ) (otherlv_23= ':' ( (lv_ValueChr_24_0= RULE_CHAR ) ) )? ) | ( ( (lv_atribName_25_0= RULE_ID ) ) otherlv_26= ':' ( (lv_Tipo_27_0= ruleTYPE_NAME ) ) ) ) )
            // InternalRest.g:516:2: ( ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Tipo_2_0= RULE_INT_TYPES ) ) (otherlv_3= ':' ( (lv_ValueInt_4_0= RULE_INT ) ) )? ) | ( ( (lv_atribName_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_Tipo_7_0= 'boolean' ) ) (otherlv_8= ':' ( (lv_ValueBool_9_0= RULE_BOOL ) ) )? ) | ( ( (lv_atribName_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_Tipo_12_0= RULE_FLOAT_TYPES ) ) (otherlv_13= ':' ( (lv_ValueFlo_14_0= RULE_FLOAT ) ) )? ) | ( ( (lv_atribName_15_0= RULE_ID ) ) otherlv_16= ':' ( (lv_Tipo_17_0= 'String' ) ) (otherlv_18= ':' ( (lv_ValueStr_19_0= RULE_STRING ) ) )? ) | ( ( (lv_atribName_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_Tipo_22_0= 'char' ) ) (otherlv_23= ':' ( (lv_ValueChr_24_0= RULE_CHAR ) ) )? ) | ( ( (lv_atribName_25_0= RULE_ID ) ) otherlv_26= ':' ( (lv_Tipo_27_0= ruleTYPE_NAME ) ) ) )
            {
            // InternalRest.g:516:2: ( ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Tipo_2_0= RULE_INT_TYPES ) ) (otherlv_3= ':' ( (lv_ValueInt_4_0= RULE_INT ) ) )? ) | ( ( (lv_atribName_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_Tipo_7_0= 'boolean' ) ) (otherlv_8= ':' ( (lv_ValueBool_9_0= RULE_BOOL ) ) )? ) | ( ( (lv_atribName_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_Tipo_12_0= RULE_FLOAT_TYPES ) ) (otherlv_13= ':' ( (lv_ValueFlo_14_0= RULE_FLOAT ) ) )? ) | ( ( (lv_atribName_15_0= RULE_ID ) ) otherlv_16= ':' ( (lv_Tipo_17_0= 'String' ) ) (otherlv_18= ':' ( (lv_ValueStr_19_0= RULE_STRING ) ) )? ) | ( ( (lv_atribName_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_Tipo_22_0= 'char' ) ) (otherlv_23= ':' ( (lv_ValueChr_24_0= RULE_CHAR ) ) )? ) | ( ( (lv_atribName_25_0= RULE_ID ) ) otherlv_26= ':' ( (lv_Tipo_27_0= ruleTYPE_NAME ) ) ) )
            int alt12=6;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==22) ) {
                    switch ( input.LA(3) ) {
                    case 25:
                        {
                        alt12=5;
                        }
                        break;
                    case 23:
                        {
                        alt12=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt12=6;
                        }
                        break;
                    case RULE_FLOAT_TYPES:
                        {
                        alt12=3;
                        }
                        break;
                    case 24:
                        {
                        alt12=4;
                        }
                        break;
                    case RULE_INT_TYPES:
                        {
                        alt12=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRest.g:517:3: ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Tipo_2_0= RULE_INT_TYPES ) ) (otherlv_3= ':' ( (lv_ValueInt_4_0= RULE_INT ) ) )? )
                    {
                    // InternalRest.g:517:3: ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Tipo_2_0= RULE_INT_TYPES ) ) (otherlv_3= ':' ( (lv_ValueInt_4_0= RULE_INT ) ) )? )
                    // InternalRest.g:518:4: ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Tipo_2_0= RULE_INT_TYPES ) ) (otherlv_3= ':' ( (lv_ValueInt_4_0= RULE_INT ) ) )?
                    {
                    // InternalRest.g:518:4: ( (lv_atribName_0_0= RULE_ID ) )
                    // InternalRest.g:519:5: (lv_atribName_0_0= RULE_ID )
                    {
                    // InternalRest.g:519:5: (lv_atribName_0_0= RULE_ID )
                    // InternalRest.g:520:6: lv_atribName_0_0= RULE_ID
                    {
                    lv_atribName_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_atribName_0_0, grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtribRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"atribName",
                    							lv_atribName_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtribAccess().getColonKeyword_0_1());
                    			
                    // InternalRest.g:540:4: ( (lv_Tipo_2_0= RULE_INT_TYPES ) )
                    // InternalRest.g:541:5: (lv_Tipo_2_0= RULE_INT_TYPES )
                    {
                    // InternalRest.g:541:5: (lv_Tipo_2_0= RULE_INT_TYPES )
                    // InternalRest.g:542:6: lv_Tipo_2_0= RULE_INT_TYPES
                    {
                    lv_Tipo_2_0=(Token)match(input,RULE_INT_TYPES,FOLLOW_11); 

                    						newLeafNode(lv_Tipo_2_0, grammarAccess.getAtribAccess().getTipoINT_TYPESTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtribRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Tipo",
                    							lv_Tipo_2_0,
                    							"br.com.poli.restModel.Rest.INT_TYPES");
                    					

                    }


                    }

                    // InternalRest.g:558:4: (otherlv_3= ':' ( (lv_ValueInt_4_0= RULE_INT ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==22) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalRest.g:559:5: otherlv_3= ':' ( (lv_ValueInt_4_0= RULE_INT ) )
                            {
                            otherlv_3=(Token)match(input,22,FOLLOW_12); 

                            					newLeafNode(otherlv_3, grammarAccess.getAtribAccess().getColonKeyword_0_3_0());
                            				
                            // InternalRest.g:563:5: ( (lv_ValueInt_4_0= RULE_INT ) )
                            // InternalRest.g:564:6: (lv_ValueInt_4_0= RULE_INT )
                            {
                            // InternalRest.g:564:6: (lv_ValueInt_4_0= RULE_INT )
                            // InternalRest.g:565:7: lv_ValueInt_4_0= RULE_INT
                            {
                            lv_ValueInt_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                            							newLeafNode(lv_ValueInt_4_0, grammarAccess.getAtribAccess().getValueIntINTTerminalRuleCall_0_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtribRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"ValueInt",
                            								lv_ValueInt_4_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:584:3: ( ( (lv_atribName_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_Tipo_7_0= 'boolean' ) ) (otherlv_8= ':' ( (lv_ValueBool_9_0= RULE_BOOL ) ) )? )
                    {
                    // InternalRest.g:584:3: ( ( (lv_atribName_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_Tipo_7_0= 'boolean' ) ) (otherlv_8= ':' ( (lv_ValueBool_9_0= RULE_BOOL ) ) )? )
                    // InternalRest.g:585:4: ( (lv_atribName_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_Tipo_7_0= 'boolean' ) ) (otherlv_8= ':' ( (lv_ValueBool_9_0= RULE_BOOL ) ) )?
                    {
                    // InternalRest.g:585:4: ( (lv_atribName_5_0= RULE_ID ) )
                    // InternalRest.g:586:5: (lv_atribName_5_0= RULE_ID )
                    {
                    // InternalRest.g:586:5: (lv_atribName_5_0= RULE_ID )
                    // InternalRest.g:587:6: lv_atribName_5_0= RULE_ID
                    {
                    lv_atribName_5_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_atribName_5_0, grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtribRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"atribName",
                    							lv_atribName_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getAtribAccess().getColonKeyword_1_1());
                    			
                    // InternalRest.g:607:4: ( (lv_Tipo_7_0= 'boolean' ) )
                    // InternalRest.g:608:5: (lv_Tipo_7_0= 'boolean' )
                    {
                    // InternalRest.g:608:5: (lv_Tipo_7_0= 'boolean' )
                    // InternalRest.g:609:6: lv_Tipo_7_0= 'boolean'
                    {
                    lv_Tipo_7_0=(Token)match(input,23,FOLLOW_11); 

                    						newLeafNode(lv_Tipo_7_0, grammarAccess.getAtribAccess().getTipoBooleanKeyword_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtribRule());
                    						}
                    						setWithLastConsumed(current, "Tipo", lv_Tipo_7_0, "boolean");
                    					

                    }


                    }

                    // InternalRest.g:621:4: (otherlv_8= ':' ( (lv_ValueBool_9_0= RULE_BOOL ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==22) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRest.g:622:5: otherlv_8= ':' ( (lv_ValueBool_9_0= RULE_BOOL ) )
                            {
                            otherlv_8=(Token)match(input,22,FOLLOW_14); 

                            					newLeafNode(otherlv_8, grammarAccess.getAtribAccess().getColonKeyword_1_3_0());
                            				
                            // InternalRest.g:626:5: ( (lv_ValueBool_9_0= RULE_BOOL ) )
                            // InternalRest.g:627:6: (lv_ValueBool_9_0= RULE_BOOL )
                            {
                            // InternalRest.g:627:6: (lv_ValueBool_9_0= RULE_BOOL )
                            // InternalRest.g:628:7: lv_ValueBool_9_0= RULE_BOOL
                            {
                            lv_ValueBool_9_0=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                            							newLeafNode(lv_ValueBool_9_0, grammarAccess.getAtribAccess().getValueBoolBOOLTerminalRuleCall_1_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtribRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"ValueBool",
                            								lv_ValueBool_9_0,
                            								"br.com.poli.restModel.Rest.BOOL");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRest.g:647:3: ( ( (lv_atribName_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_Tipo_12_0= RULE_FLOAT_TYPES ) ) (otherlv_13= ':' ( (lv_ValueFlo_14_0= RULE_FLOAT ) ) )? )
                    {
                    // InternalRest.g:647:3: ( ( (lv_atribName_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_Tipo_12_0= RULE_FLOAT_TYPES ) ) (otherlv_13= ':' ( (lv_ValueFlo_14_0= RULE_FLOAT ) ) )? )
                    // InternalRest.g:648:4: ( (lv_atribName_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_Tipo_12_0= RULE_FLOAT_TYPES ) ) (otherlv_13= ':' ( (lv_ValueFlo_14_0= RULE_FLOAT ) ) )?
                    {
                    // InternalRest.g:648:4: ( (lv_atribName_10_0= RULE_ID ) )
                    // InternalRest.g:649:5: (lv_atribName_10_0= RULE_ID )
                    {
                    // InternalRest.g:649:5: (lv_atribName_10_0= RULE_ID )
                    // InternalRest.g:650:6: lv_atribName_10_0= RULE_ID
                    {
                    lv_atribName_10_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_atribName_10_0, grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtribRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"atribName",
                    							lv_atribName_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getAtribAccess().getColonKeyword_2_1());
                    			
                    // InternalRest.g:670:4: ( (lv_Tipo_12_0= RULE_FLOAT_TYPES ) )
                    // InternalRest.g:671:5: (lv_Tipo_12_0= RULE_FLOAT_TYPES )
                    {
                    // InternalRest.g:671:5: (lv_Tipo_12_0= RULE_FLOAT_TYPES )
                    // InternalRest.g:672:6: lv_Tipo_12_0= RULE_FLOAT_TYPES
                    {
                    lv_Tipo_12_0=(Token)match(input,RULE_FLOAT_TYPES,FOLLOW_11); 

                    						newLeafNode(lv_Tipo_12_0, grammarAccess.getAtribAccess().getTipoFLOAT_TYPESTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtribRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Tipo",
                    							lv_Tipo_12_0,
                    							"br.com.poli.restModel.Rest.FLOAT_TYPES");
                    					

                    }


                    }

                    // InternalRest.g:688:4: (otherlv_13= ':' ( (lv_ValueFlo_14_0= RULE_FLOAT ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==22) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRest.g:689:5: otherlv_13= ':' ( (lv_ValueFlo_14_0= RULE_FLOAT ) )
                            {
                            otherlv_13=(Token)match(input,22,FOLLOW_16); 

                            					newLeafNode(otherlv_13, grammarAccess.getAtribAccess().getColonKeyword_2_3_0());
                            				
                            // InternalRest.g:693:5: ( (lv_ValueFlo_14_0= RULE_FLOAT ) )
                            // InternalRest.g:694:6: (lv_ValueFlo_14_0= RULE_FLOAT )
                            {
                            // InternalRest.g:694:6: (lv_ValueFlo_14_0= RULE_FLOAT )
                            // InternalRest.g:695:7: lv_ValueFlo_14_0= RULE_FLOAT
                            {
                            lv_ValueFlo_14_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                            							newLeafNode(lv_ValueFlo_14_0, grammarAccess.getAtribAccess().getValueFloFLOATTerminalRuleCall_2_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtribRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"ValueFlo",
                            								lv_ValueFlo_14_0,
                            								"br.com.poli.restModel.Rest.FLOAT");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRest.g:714:3: ( ( (lv_atribName_15_0= RULE_ID ) ) otherlv_16= ':' ( (lv_Tipo_17_0= 'String' ) ) (otherlv_18= ':' ( (lv_ValueStr_19_0= RULE_STRING ) ) )? )
                    {
                    // InternalRest.g:714:3: ( ( (lv_atribName_15_0= RULE_ID ) ) otherlv_16= ':' ( (lv_Tipo_17_0= 'String' ) ) (otherlv_18= ':' ( (lv_ValueStr_19_0= RULE_STRING ) ) )? )
                    // InternalRest.g:715:4: ( (lv_atribName_15_0= RULE_ID ) ) otherlv_16= ':' ( (lv_Tipo_17_0= 'String' ) ) (otherlv_18= ':' ( (lv_ValueStr_19_0= RULE_STRING ) ) )?
                    {
                    // InternalRest.g:715:4: ( (lv_atribName_15_0= RULE_ID ) )
                    // InternalRest.g:716:5: (lv_atribName_15_0= RULE_ID )
                    {
                    // InternalRest.g:716:5: (lv_atribName_15_0= RULE_ID )
                    // InternalRest.g:717:6: lv_atribName_15_0= RULE_ID
                    {
                    lv_atribName_15_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_atribName_15_0, grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtribRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"atribName",
                    							lv_atribName_15_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_16, grammarAccess.getAtribAccess().getColonKeyword_3_1());
                    			
                    // InternalRest.g:737:4: ( (lv_Tipo_17_0= 'String' ) )
                    // InternalRest.g:738:5: (lv_Tipo_17_0= 'String' )
                    {
                    // InternalRest.g:738:5: (lv_Tipo_17_0= 'String' )
                    // InternalRest.g:739:6: lv_Tipo_17_0= 'String'
                    {
                    lv_Tipo_17_0=(Token)match(input,24,FOLLOW_11); 

                    						newLeafNode(lv_Tipo_17_0, grammarAccess.getAtribAccess().getTipoStringKeyword_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtribRule());
                    						}
                    						setWithLastConsumed(current, "Tipo", lv_Tipo_17_0, "String");
                    					

                    }


                    }

                    // InternalRest.g:751:4: (otherlv_18= ':' ( (lv_ValueStr_19_0= RULE_STRING ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==22) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRest.g:752:5: otherlv_18= ':' ( (lv_ValueStr_19_0= RULE_STRING ) )
                            {
                            otherlv_18=(Token)match(input,22,FOLLOW_18); 

                            					newLeafNode(otherlv_18, grammarAccess.getAtribAccess().getColonKeyword_3_3_0());
                            				
                            // InternalRest.g:756:5: ( (lv_ValueStr_19_0= RULE_STRING ) )
                            // InternalRest.g:757:6: (lv_ValueStr_19_0= RULE_STRING )
                            {
                            // InternalRest.g:757:6: (lv_ValueStr_19_0= RULE_STRING )
                            // InternalRest.g:758:7: lv_ValueStr_19_0= RULE_STRING
                            {
                            lv_ValueStr_19_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            							newLeafNode(lv_ValueStr_19_0, grammarAccess.getAtribAccess().getValueStrSTRINGTerminalRuleCall_3_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtribRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"ValueStr",
                            								lv_ValueStr_19_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRest.g:777:3: ( ( (lv_atribName_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_Tipo_22_0= 'char' ) ) (otherlv_23= ':' ( (lv_ValueChr_24_0= RULE_CHAR ) ) )? )
                    {
                    // InternalRest.g:777:3: ( ( (lv_atribName_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_Tipo_22_0= 'char' ) ) (otherlv_23= ':' ( (lv_ValueChr_24_0= RULE_CHAR ) ) )? )
                    // InternalRest.g:778:4: ( (lv_atribName_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_Tipo_22_0= 'char' ) ) (otherlv_23= ':' ( (lv_ValueChr_24_0= RULE_CHAR ) ) )?
                    {
                    // InternalRest.g:778:4: ( (lv_atribName_20_0= RULE_ID ) )
                    // InternalRest.g:779:5: (lv_atribName_20_0= RULE_ID )
                    {
                    // InternalRest.g:779:5: (lv_atribName_20_0= RULE_ID )
                    // InternalRest.g:780:6: lv_atribName_20_0= RULE_ID
                    {
                    lv_atribName_20_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_atribName_20_0, grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtribRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"atribName",
                    							lv_atribName_20_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_21, grammarAccess.getAtribAccess().getColonKeyword_4_1());
                    			
                    // InternalRest.g:800:4: ( (lv_Tipo_22_0= 'char' ) )
                    // InternalRest.g:801:5: (lv_Tipo_22_0= 'char' )
                    {
                    // InternalRest.g:801:5: (lv_Tipo_22_0= 'char' )
                    // InternalRest.g:802:6: lv_Tipo_22_0= 'char'
                    {
                    lv_Tipo_22_0=(Token)match(input,25,FOLLOW_11); 

                    						newLeafNode(lv_Tipo_22_0, grammarAccess.getAtribAccess().getTipoCharKeyword_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtribRule());
                    						}
                    						setWithLastConsumed(current, "Tipo", lv_Tipo_22_0, "char");
                    					

                    }


                    }

                    // InternalRest.g:814:4: (otherlv_23= ':' ( (lv_ValueChr_24_0= RULE_CHAR ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==22) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalRest.g:815:5: otherlv_23= ':' ( (lv_ValueChr_24_0= RULE_CHAR ) )
                            {
                            otherlv_23=(Token)match(input,22,FOLLOW_20); 

                            					newLeafNode(otherlv_23, grammarAccess.getAtribAccess().getColonKeyword_4_3_0());
                            				
                            // InternalRest.g:819:5: ( (lv_ValueChr_24_0= RULE_CHAR ) )
                            // InternalRest.g:820:6: (lv_ValueChr_24_0= RULE_CHAR )
                            {
                            // InternalRest.g:820:6: (lv_ValueChr_24_0= RULE_CHAR )
                            // InternalRest.g:821:7: lv_ValueChr_24_0= RULE_CHAR
                            {
                            lv_ValueChr_24_0=(Token)match(input,RULE_CHAR,FOLLOW_2); 

                            							newLeafNode(lv_ValueChr_24_0, grammarAccess.getAtribAccess().getValueChrCHARTerminalRuleCall_4_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtribRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"ValueChr",
                            								lv_ValueChr_24_0,
                            								"br.com.poli.restModel.Rest.CHAR");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalRest.g:840:3: ( ( (lv_atribName_25_0= RULE_ID ) ) otherlv_26= ':' ( (lv_Tipo_27_0= ruleTYPE_NAME ) ) )
                    {
                    // InternalRest.g:840:3: ( ( (lv_atribName_25_0= RULE_ID ) ) otherlv_26= ':' ( (lv_Tipo_27_0= ruleTYPE_NAME ) ) )
                    // InternalRest.g:841:4: ( (lv_atribName_25_0= RULE_ID ) ) otherlv_26= ':' ( (lv_Tipo_27_0= ruleTYPE_NAME ) )
                    {
                    // InternalRest.g:841:4: ( (lv_atribName_25_0= RULE_ID ) )
                    // InternalRest.g:842:5: (lv_atribName_25_0= RULE_ID )
                    {
                    // InternalRest.g:842:5: (lv_atribName_25_0= RULE_ID )
                    // InternalRest.g:843:6: lv_atribName_25_0= RULE_ID
                    {
                    lv_atribName_25_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_atribName_25_0, grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtribRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"atribName",
                    							lv_atribName_25_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_26, grammarAccess.getAtribAccess().getColonKeyword_5_1());
                    			
                    // InternalRest.g:863:4: ( (lv_Tipo_27_0= ruleTYPE_NAME ) )
                    // InternalRest.g:864:5: (lv_Tipo_27_0= ruleTYPE_NAME )
                    {
                    // InternalRest.g:864:5: (lv_Tipo_27_0= ruleTYPE_NAME )
                    // InternalRest.g:865:6: lv_Tipo_27_0= ruleTYPE_NAME
                    {

                    						newCompositeNode(grammarAccess.getAtribAccess().getTipoTYPE_NAMEParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Tipo_27_0=ruleTYPE_NAME();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtribRule());
                    						}
                    						set(
                    							current,
                    							"Tipo",
                    							lv_Tipo_27_0,
                    							"br.com.poli.restModel.Rest.TYPE_NAME");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleAtrib"


    // $ANTLR start "entryRuleTYPE_NAME"
    // InternalRest.g:887:1: entryRuleTYPE_NAME returns [String current=null] : iv_ruleTYPE_NAME= ruleTYPE_NAME EOF ;
    public final String entryRuleTYPE_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE_NAME = null;


        try {
            // InternalRest.g:887:49: (iv_ruleTYPE_NAME= ruleTYPE_NAME EOF )
            // InternalRest.g:888:2: iv_ruleTYPE_NAME= ruleTYPE_NAME EOF
            {
             newCompositeNode(grammarAccess.getTYPE_NAMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE_NAME=ruleTYPE_NAME();

            state._fsp--;

             current =iv_ruleTYPE_NAME.getText(); 
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
    // $ANTLR end "entryRuleTYPE_NAME"


    // $ANTLR start "ruleTYPE_NAME"
    // InternalRest.g:894:1: ruleTYPE_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '<' ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )* this_ID_5= RULE_ID kw= '>' )? ) ;
    public final AntlrDatatypeRuleToken ruleTYPE_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_5=null;
        AntlrDatatypeRuleToken this_VALID_TYPES_3 = null;



        	enterRule();

        try {
            // InternalRest.g:900:2: ( (this_ID_0= RULE_ID (kw= '<' ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )* this_ID_5= RULE_ID kw= '>' )? ) )
            // InternalRest.g:901:2: (this_ID_0= RULE_ID (kw= '<' ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )* this_ID_5= RULE_ID kw= '>' )? )
            {
            // InternalRest.g:901:2: (this_ID_0= RULE_ID (kw= '<' ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )* this_ID_5= RULE_ID kw= '>' )? )
            // InternalRest.g:902:3: this_ID_0= RULE_ID (kw= '<' ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )* this_ID_5= RULE_ID kw= '>' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_0());
            		
            // InternalRest.g:909:3: (kw= '<' ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )* this_ID_5= RULE_ID kw= '>' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRest.g:910:4: kw= '<' ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )* this_ID_5= RULE_ID kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTYPE_NAMEAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalRest.g:915:4: ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            int LA14_1 = input.LA(2);

                            if ( (LA14_1==27) ) {
                                alt14=1;
                            }


                        }
                        else if ( (LA14_0==RULE_INT_TYPES||LA14_0==RULE_FLOAT_TYPES||(LA14_0>=23 && LA14_0<=25)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRest.g:916:5: (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ','
                    	    {
                    	    // InternalRest.g:916:5: (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES )
                    	    int alt13=2;
                    	    int LA13_0 = input.LA(1);

                    	    if ( (LA13_0==RULE_ID) ) {
                    	        alt13=1;
                    	    }
                    	    else if ( (LA13_0==RULE_INT_TYPES||LA13_0==RULE_FLOAT_TYPES||(LA13_0>=23 && LA13_0<=25)) ) {
                    	        alt13=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 13, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt13) {
                    	        case 1 :
                    	            // InternalRest.g:917:6: this_ID_2= RULE_ID
                    	            {
                    	            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_24); 

                    	            						current.merge(this_ID_2);
                    	            					

                    	            						newLeafNode(this_ID_2, grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_1_1_0_0());
                    	            					

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalRest.g:925:6: this_VALID_TYPES_3= ruleVALID_TYPES
                    	            {

                    	            						newCompositeNode(grammarAccess.getTYPE_NAMEAccess().getVALID_TYPESParserRuleCall_1_1_0_1());
                    	            					
                    	            pushFollow(FOLLOW_24);
                    	            this_VALID_TYPES_3=ruleVALID_TYPES();

                    	            state._fsp--;


                    	            						current.merge(this_VALID_TYPES_3);
                    	            					

                    	            						afterParserOrEnumRuleCall();
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    kw=(Token)match(input,27,FOLLOW_23); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getTYPE_NAMEAccess().getCommaKeyword_1_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_25); 

                    				current.merge(this_ID_5);
                    			

                    				newLeafNode(this_ID_5, grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_1_2());
                    			
                    kw=(Token)match(input,28,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTYPE_NAMEAccess().getGreaterThanSignKeyword_1_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleTYPE_NAME"


    // $ANTLR start "entryRuleVALID_TYPES"
    // InternalRest.g:959:1: entryRuleVALID_TYPES returns [String current=null] : iv_ruleVALID_TYPES= ruleVALID_TYPES EOF ;
    public final String entryRuleVALID_TYPES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_TYPES = null;


        try {
            // InternalRest.g:959:51: (iv_ruleVALID_TYPES= ruleVALID_TYPES EOF )
            // InternalRest.g:960:2: iv_ruleVALID_TYPES= ruleVALID_TYPES EOF
            {
             newCompositeNode(grammarAccess.getVALID_TYPESRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVALID_TYPES=ruleVALID_TYPES();

            state._fsp--;

             current =iv_ruleVALID_TYPES.getText(); 
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
    // $ANTLR end "entryRuleVALID_TYPES"


    // $ANTLR start "ruleVALID_TYPES"
    // InternalRest.g:966:1: ruleVALID_TYPES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'boolean' | kw= 'char' | this_INT_TYPES_3= RULE_INT_TYPES | this_FLOAT_TYPES_4= RULE_FLOAT_TYPES ) ;
    public final AntlrDatatypeRuleToken ruleVALID_TYPES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_TYPES_3=null;
        Token this_FLOAT_TYPES_4=null;


        	enterRule();

        try {
            // InternalRest.g:972:2: ( (kw= 'String' | kw= 'boolean' | kw= 'char' | this_INT_TYPES_3= RULE_INT_TYPES | this_FLOAT_TYPES_4= RULE_FLOAT_TYPES ) )
            // InternalRest.g:973:2: (kw= 'String' | kw= 'boolean' | kw= 'char' | this_INT_TYPES_3= RULE_INT_TYPES | this_FLOAT_TYPES_4= RULE_FLOAT_TYPES )
            {
            // InternalRest.g:973:2: (kw= 'String' | kw= 'boolean' | kw= 'char' | this_INT_TYPES_3= RULE_INT_TYPES | this_FLOAT_TYPES_4= RULE_FLOAT_TYPES )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt16=1;
                }
                break;
            case 23:
                {
                alt16=2;
                }
                break;
            case 25:
                {
                alt16=3;
                }
                break;
            case RULE_INT_TYPES:
                {
                alt16=4;
                }
                break;
            case RULE_FLOAT_TYPES:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRest.g:974:3: kw= 'String'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVALID_TYPESAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:980:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVALID_TYPESAccess().getBooleanKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRest.g:986:3: kw= 'char'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVALID_TYPESAccess().getCharKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRest.g:992:3: this_INT_TYPES_3= RULE_INT_TYPES
                    {
                    this_INT_TYPES_3=(Token)match(input,RULE_INT_TYPES,FOLLOW_2); 

                    			current.merge(this_INT_TYPES_3);
                    		

                    			newLeafNode(this_INT_TYPES_3, grammarAccess.getVALID_TYPESAccess().getINT_TYPESTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRest.g:1000:3: this_FLOAT_TYPES_4= RULE_FLOAT_TYPES
                    {
                    this_FLOAT_TYPES_4=(Token)match(input,RULE_FLOAT_TYPES,FOLLOW_2); 

                    			current.merge(this_FLOAT_TYPES_4);
                    		

                    			newLeafNode(this_FLOAT_TYPES_4, grammarAccess.getVALID_TYPESAccess().getFLOAT_TYPESTerminalRuleCall_4());
                    		

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
    // $ANTLR end "ruleVALID_TYPES"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003800240L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000003800250L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});

}