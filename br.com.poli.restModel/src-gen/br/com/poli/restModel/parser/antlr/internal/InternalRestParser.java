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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_STRING", "RULE_CHAR", "RULE_INT_TYPES", "RULE_FLOAT_TYPES", "RULE_WS", "RULE_ML_COMMENT", "RULE_ALMOST__ANY__THING", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'Request'", "'{'", "'}'", "'package'", "':'", "'new'", "'('", "','", "')'", "'<'", "'>'", "'String'", "'boolean'", "'char'", "'.'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_CHAR=9;
    public static final int RULE_INT_TYPES=10;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_FLOAT_TYPES=11;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_BOOL=6;
    public static final int RULE_ALMOST__ANY__THING=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int RULE_FLOAT=7;
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
    // InternalRest.g:128:1: ruleBody returns [EObject current=null] : ( ( (lv_elem_0_0= ruleElem ) ) | ( (lv_globAtrib_1_0= ruleGlobAtrib ) ) ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        EObject lv_elem_0_0 = null;

        EObject lv_globAtrib_1_0 = null;



        	enterRule();

        try {
            // InternalRest.g:134:2: ( ( ( (lv_elem_0_0= ruleElem ) ) | ( (lv_globAtrib_1_0= ruleGlobAtrib ) ) ) )
            // InternalRest.g:135:2: ( ( (lv_elem_0_0= ruleElem ) ) | ( (lv_globAtrib_1_0= ruleGlobAtrib ) ) )
            {
            // InternalRest.g:135:2: ( ( (lv_elem_0_0= ruleElem ) ) | ( (lv_globAtrib_1_0= ruleGlobAtrib ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==18) ) {
                    alt2=1;
                }
                else if ( (LA2_1==21) ) {
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
                    // InternalRest.g:136:3: ( (lv_elem_0_0= ruleElem ) )
                    {
                    // InternalRest.g:136:3: ( (lv_elem_0_0= ruleElem ) )
                    // InternalRest.g:137:4: (lv_elem_0_0= ruleElem )
                    {
                    // InternalRest.g:137:4: (lv_elem_0_0= ruleElem )
                    // InternalRest.g:138:5: lv_elem_0_0= ruleElem
                    {

                    					newCompositeNode(grammarAccess.getBodyAccess().getElemElemParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elem_0_0=ruleElem();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBodyRule());
                    					}
                    					set(
                    						current,
                    						"elem",
                    						lv_elem_0_0,
                    						"br.com.poli.restModel.Rest.Elem");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:156:3: ( (lv_globAtrib_1_0= ruleGlobAtrib ) )
                    {
                    // InternalRest.g:156:3: ( (lv_globAtrib_1_0= ruleGlobAtrib ) )
                    // InternalRest.g:157:4: (lv_globAtrib_1_0= ruleGlobAtrib )
                    {
                    // InternalRest.g:157:4: (lv_globAtrib_1_0= ruleGlobAtrib )
                    // InternalRest.g:158:5: lv_globAtrib_1_0= ruleGlobAtrib
                    {

                    					newCompositeNode(grammarAccess.getBodyAccess().getGlobAtribGlobAtribParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_globAtrib_1_0=ruleGlobAtrib();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBodyRule());
                    					}
                    					set(
                    						current,
                    						"globAtrib",
                    						lv_globAtrib_1_0,
                    						"br.com.poli.restModel.Rest.GlobAtrib");
                    					afterParserOrEnumRuleCall();
                    				

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
    // InternalRest.g:179:1: entryRuleElem returns [EObject current=null] : iv_ruleElem= ruleElem EOF ;
    public final EObject entryRuleElem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElem = null;


        try {
            // InternalRest.g:179:45: (iv_ruleElem= ruleElem EOF )
            // InternalRest.g:180:2: iv_ruleElem= ruleElem EOF
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
    // InternalRest.g:186:1: ruleElem returns [EObject current=null] : ( ( (lv_ClassName_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'package' ( (lv_package_3_0= rulePackageName ) ) )? ( (lv_atrib_4_0= ruleAtrib ) )* otherlv_5= '}' ) ;
    public final EObject ruleElem() throws RecognitionException {
        EObject current = null;

        Token lv_ClassName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_package_3_0 = null;

        EObject lv_atrib_4_0 = null;



        	enterRule();

        try {
            // InternalRest.g:192:2: ( ( ( (lv_ClassName_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'package' ( (lv_package_3_0= rulePackageName ) ) )? ( (lv_atrib_4_0= ruleAtrib ) )* otherlv_5= '}' ) )
            // InternalRest.g:193:2: ( ( (lv_ClassName_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'package' ( (lv_package_3_0= rulePackageName ) ) )? ( (lv_atrib_4_0= ruleAtrib ) )* otherlv_5= '}' )
            {
            // InternalRest.g:193:2: ( ( (lv_ClassName_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'package' ( (lv_package_3_0= rulePackageName ) ) )? ( (lv_atrib_4_0= ruleAtrib ) )* otherlv_5= '}' )
            // InternalRest.g:194:3: ( (lv_ClassName_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'package' ( (lv_package_3_0= rulePackageName ) ) )? ( (lv_atrib_4_0= ruleAtrib ) )* otherlv_5= '}'
            {
            // InternalRest.g:194:3: ( (lv_ClassName_0_0= RULE_ID ) )
            // InternalRest.g:195:4: (lv_ClassName_0_0= RULE_ID )
            {
            // InternalRest.g:195:4: (lv_ClassName_0_0= RULE_ID )
            // InternalRest.g:196:5: lv_ClassName_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getElemAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:216:3: (otherlv_2= 'package' ( (lv_package_3_0= rulePackageName ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRest.g:217:4: otherlv_2= 'package' ( (lv_package_3_0= rulePackageName ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getElemAccess().getPackageKeyword_2_0());
                    			
                    // InternalRest.g:221:4: ( (lv_package_3_0= rulePackageName ) )
                    // InternalRest.g:222:5: (lv_package_3_0= rulePackageName )
                    {
                    // InternalRest.g:222:5: (lv_package_3_0= rulePackageName )
                    // InternalRest.g:223:6: lv_package_3_0= rulePackageName
                    {

                    						newCompositeNode(grammarAccess.getElemAccess().getPackagePackageNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_package_3_0=rulePackageName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElemRule());
                    						}
                    						set(
                    							current,
                    							"package",
                    							lv_package_3_0,
                    							"br.com.poli.restModel.Rest.PackageName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRest.g:241:3: ( (lv_atrib_4_0= ruleAtrib ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRest.g:242:4: (lv_atrib_4_0= ruleAtrib )
            	    {
            	    // InternalRest.g:242:4: (lv_atrib_4_0= ruleAtrib )
            	    // InternalRest.g:243:5: lv_atrib_4_0= ruleAtrib
            	    {

            	    					newCompositeNode(grammarAccess.getElemAccess().getAtribAtribParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_atrib_4_0=ruleAtrib();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atrib",
            	    						lv_atrib_4_0,
            	    						"br.com.poli.restModel.Rest.Atrib");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getElemAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleAtrib"
    // InternalRest.g:268:1: entryRuleAtrib returns [EObject current=null] : iv_ruleAtrib= ruleAtrib EOF ;
    public final EObject entryRuleAtrib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtrib = null;


        try {
            // InternalRest.g:268:46: (iv_ruleAtrib= ruleAtrib EOF )
            // InternalRest.g:269:2: iv_ruleAtrib= ruleAtrib EOF
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
    // InternalRest.g:275:1: ruleAtrib returns [EObject current=null] : ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) ) ) (otherlv_3= ':' ( (lv_Value_4_0= ruleValues ) ) )? ) ;
    public final EObject ruleAtrib() throws RecognitionException {
        EObject current = null;

        Token lv_atribName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_Tipo_2_1 = null;

        AntlrDatatypeRuleToken lv_Tipo_2_2 = null;

        EObject lv_Value_4_0 = null;



        	enterRule();

        try {
            // InternalRest.g:281:2: ( ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) ) ) (otherlv_3= ':' ( (lv_Value_4_0= ruleValues ) ) )? ) )
            // InternalRest.g:282:2: ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) ) ) (otherlv_3= ':' ( (lv_Value_4_0= ruleValues ) ) )? )
            {
            // InternalRest.g:282:2: ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) ) ) (otherlv_3= ':' ( (lv_Value_4_0= ruleValues ) ) )? )
            // InternalRest.g:283:3: ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) ) ) (otherlv_3= ':' ( (lv_Value_4_0= ruleValues ) ) )?
            {
            // InternalRest.g:283:3: ( (lv_atribName_0_0= RULE_ID ) )
            // InternalRest.g:284:4: (lv_atribName_0_0= RULE_ID )
            {
            // InternalRest.g:284:4: (lv_atribName_0_0= RULE_ID )
            // InternalRest.g:285:5: lv_atribName_0_0= RULE_ID
            {
            lv_atribName_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_atribName_0_0, grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAtribAccess().getColonKeyword_1());
            		
            // InternalRest.g:305:3: ( ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) ) )
            // InternalRest.g:306:4: ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) )
            {
            // InternalRest.g:306:4: ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) )
            // InternalRest.g:307:5: (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME )
            {
            // InternalRest.g:307:5: (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_INT_TYPES && LA5_0<=RULE_FLOAT_TYPES)||(LA5_0>=28 && LA5_0<=30)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRest.g:308:6: lv_Tipo_2_1= ruleVALID_TYPES
                    {

                    						newCompositeNode(grammarAccess.getAtribAccess().getTipoVALID_TYPESParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_Tipo_2_1=ruleVALID_TYPES();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtribRule());
                    						}
                    						set(
                    							current,
                    							"Tipo",
                    							lv_Tipo_2_1,
                    							"br.com.poli.restModel.Rest.VALID_TYPES");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalRest.g:324:6: lv_Tipo_2_2= ruleTYPE_NAME
                    {

                    						newCompositeNode(grammarAccess.getAtribAccess().getTipoTYPE_NAMEParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_9);
                    lv_Tipo_2_2=ruleTYPE_NAME();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtribRule());
                    						}
                    						set(
                    							current,
                    							"Tipo",
                    							lv_Tipo_2_2,
                    							"br.com.poli.restModel.Rest.TYPE_NAME");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalRest.g:342:3: (otherlv_3= ':' ( (lv_Value_4_0= ruleValues ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRest.g:343:4: otherlv_3= ':' ( (lv_Value_4_0= ruleValues ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtribAccess().getColonKeyword_3_0());
                    			
                    // InternalRest.g:347:4: ( (lv_Value_4_0= ruleValues ) )
                    // InternalRest.g:348:5: (lv_Value_4_0= ruleValues )
                    {
                    // InternalRest.g:348:5: (lv_Value_4_0= ruleValues )
                    // InternalRest.g:349:6: lv_Value_4_0= ruleValues
                    {

                    						newCompositeNode(grammarAccess.getAtribAccess().getValueValuesParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Value_4_0=ruleValues();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtribRule());
                    						}
                    						set(
                    							current,
                    							"Value",
                    							lv_Value_4_0,
                    							"br.com.poli.restModel.Rest.Values");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleAtrib"


    // $ANTLR start "entryRuleGlobAtrib"
    // InternalRest.g:371:1: entryRuleGlobAtrib returns [EObject current=null] : iv_ruleGlobAtrib= ruleGlobAtrib EOF ;
    public final EObject entryRuleGlobAtrib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobAtrib = null;


        try {
            // InternalRest.g:371:50: (iv_ruleGlobAtrib= ruleGlobAtrib EOF )
            // InternalRest.g:372:2: iv_ruleGlobAtrib= ruleGlobAtrib EOF
            {
             newCompositeNode(grammarAccess.getGlobAtribRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobAtrib=ruleGlobAtrib();

            state._fsp--;

             current =iv_ruleGlobAtrib; 
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
    // $ANTLR end "entryRuleGlobAtrib"


    // $ANTLR start "ruleGlobAtrib"
    // InternalRest.g:378:1: ruleGlobAtrib returns [EObject current=null] : ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) ) ) (otherlv_3= ':' ( (lv_Value_4_0= ruleValues ) ) ) ) ;
    public final EObject ruleGlobAtrib() throws RecognitionException {
        EObject current = null;

        Token lv_atribName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_Tipo_2_1 = null;

        AntlrDatatypeRuleToken lv_Tipo_2_2 = null;

        EObject lv_Value_4_0 = null;



        	enterRule();

        try {
            // InternalRest.g:384:2: ( ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) ) ) (otherlv_3= ':' ( (lv_Value_4_0= ruleValues ) ) ) ) )
            // InternalRest.g:385:2: ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) ) ) (otherlv_3= ':' ( (lv_Value_4_0= ruleValues ) ) ) )
            {
            // InternalRest.g:385:2: ( ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) ) ) (otherlv_3= ':' ( (lv_Value_4_0= ruleValues ) ) ) )
            // InternalRest.g:386:3: ( (lv_atribName_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) ) ) (otherlv_3= ':' ( (lv_Value_4_0= ruleValues ) ) )
            {
            // InternalRest.g:386:3: ( (lv_atribName_0_0= RULE_ID ) )
            // InternalRest.g:387:4: (lv_atribName_0_0= RULE_ID )
            {
            // InternalRest.g:387:4: (lv_atribName_0_0= RULE_ID )
            // InternalRest.g:388:5: lv_atribName_0_0= RULE_ID
            {
            lv_atribName_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_atribName_0_0, grammarAccess.getGlobAtribAccess().getAtribNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobAtribRule());
            					}
            					setWithLastConsumed(
            						current,
            						"atribName",
            						lv_atribName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobAtribAccess().getColonKeyword_1());
            		
            // InternalRest.g:408:3: ( ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) ) )
            // InternalRest.g:409:4: ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) )
            {
            // InternalRest.g:409:4: ( (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME ) )
            // InternalRest.g:410:5: (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME )
            {
            // InternalRest.g:410:5: (lv_Tipo_2_1= ruleVALID_TYPES | lv_Tipo_2_2= ruleTYPE_NAME )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_INT_TYPES && LA7_0<=RULE_FLOAT_TYPES)||(LA7_0>=28 && LA7_0<=30)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRest.g:411:6: lv_Tipo_2_1= ruleVALID_TYPES
                    {

                    						newCompositeNode(grammarAccess.getGlobAtribAccess().getTipoVALID_TYPESParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_Tipo_2_1=ruleVALID_TYPES();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobAtribRule());
                    						}
                    						set(
                    							current,
                    							"Tipo",
                    							lv_Tipo_2_1,
                    							"br.com.poli.restModel.Rest.VALID_TYPES");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalRest.g:427:6: lv_Tipo_2_2= ruleTYPE_NAME
                    {

                    						newCompositeNode(grammarAccess.getGlobAtribAccess().getTipoTYPE_NAMEParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_7);
                    lv_Tipo_2_2=ruleTYPE_NAME();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobAtribRule());
                    						}
                    						set(
                    							current,
                    							"Tipo",
                    							lv_Tipo_2_2,
                    							"br.com.poli.restModel.Rest.TYPE_NAME");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalRest.g:445:3: (otherlv_3= ':' ( (lv_Value_4_0= ruleValues ) ) )
            // InternalRest.g:446:4: otherlv_3= ':' ( (lv_Value_4_0= ruleValues ) )
            {
            otherlv_3=(Token)match(input,21,FOLLOW_10); 

            				newLeafNode(otherlv_3, grammarAccess.getGlobAtribAccess().getColonKeyword_3_0());
            			
            // InternalRest.g:450:4: ( (lv_Value_4_0= ruleValues ) )
            // InternalRest.g:451:5: (lv_Value_4_0= ruleValues )
            {
            // InternalRest.g:451:5: (lv_Value_4_0= ruleValues )
            // InternalRest.g:452:6: lv_Value_4_0= ruleValues
            {

            						newCompositeNode(grammarAccess.getGlobAtribAccess().getValueValuesParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_Value_4_0=ruleValues();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getGlobAtribRule());
            						}
            						set(
            							current,
            							"Value",
            							lv_Value_4_0,
            							"br.com.poli.restModel.Rest.Values");
            						afterParserOrEnumRuleCall();
            					

            }


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
    // $ANTLR end "ruleGlobAtrib"


    // $ANTLR start "entryRuleValues"
    // InternalRest.g:474:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // InternalRest.g:474:47: (iv_ruleValues= ruleValues EOF )
            // InternalRest.g:475:2: iv_ruleValues= ruleValues EOF
            {
             newCompositeNode(grammarAccess.getValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValues=ruleValues();

            state._fsp--;

             current =iv_ruleValues; 
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
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // InternalRest.g:481:1: ruleValues returns [EObject current=null] : ( ( () ( (lv_Id_1_0= RULE_INT ) ) ) | ( () ( (lv_IdB_3_0= RULE_BOOL ) ) ) | ( () ( (lv_IdF_5_0= RULE_FLOAT ) ) ) | ( () ( (lv_IdS_7_0= RULE_STRING ) ) ) | ( () ( (lv_IdC_9_0= RULE_CHAR ) ) ) | (otherlv_10= 'new' ( (lv_IdT_11_0= RULE_ID ) ) otherlv_12= '(' ( ( ( (lv_Par_13_0= RULE_ID ) ) otherlv_14= ',' )* ( (lv_Par_15_0= RULE_ID ) ) )? otherlv_16= ')' ) ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        Token lv_Id_1_0=null;
        Token lv_IdB_3_0=null;
        Token lv_IdF_5_0=null;
        Token lv_IdS_7_0=null;
        Token lv_IdC_9_0=null;
        Token otherlv_10=null;
        Token lv_IdT_11_0=null;
        Token otherlv_12=null;
        Token lv_Par_13_0=null;
        Token otherlv_14=null;
        Token lv_Par_15_0=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalRest.g:487:2: ( ( ( () ( (lv_Id_1_0= RULE_INT ) ) ) | ( () ( (lv_IdB_3_0= RULE_BOOL ) ) ) | ( () ( (lv_IdF_5_0= RULE_FLOAT ) ) ) | ( () ( (lv_IdS_7_0= RULE_STRING ) ) ) | ( () ( (lv_IdC_9_0= RULE_CHAR ) ) ) | (otherlv_10= 'new' ( (lv_IdT_11_0= RULE_ID ) ) otherlv_12= '(' ( ( ( (lv_Par_13_0= RULE_ID ) ) otherlv_14= ',' )* ( (lv_Par_15_0= RULE_ID ) ) )? otherlv_16= ')' ) ) )
            // InternalRest.g:488:2: ( ( () ( (lv_Id_1_0= RULE_INT ) ) ) | ( () ( (lv_IdB_3_0= RULE_BOOL ) ) ) | ( () ( (lv_IdF_5_0= RULE_FLOAT ) ) ) | ( () ( (lv_IdS_7_0= RULE_STRING ) ) ) | ( () ( (lv_IdC_9_0= RULE_CHAR ) ) ) | (otherlv_10= 'new' ( (lv_IdT_11_0= RULE_ID ) ) otherlv_12= '(' ( ( ( (lv_Par_13_0= RULE_ID ) ) otherlv_14= ',' )* ( (lv_Par_15_0= RULE_ID ) ) )? otherlv_16= ')' ) )
            {
            // InternalRest.g:488:2: ( ( () ( (lv_Id_1_0= RULE_INT ) ) ) | ( () ( (lv_IdB_3_0= RULE_BOOL ) ) ) | ( () ( (lv_IdF_5_0= RULE_FLOAT ) ) ) | ( () ( (lv_IdS_7_0= RULE_STRING ) ) ) | ( () ( (lv_IdC_9_0= RULE_CHAR ) ) ) | (otherlv_10= 'new' ( (lv_IdT_11_0= RULE_ID ) ) otherlv_12= '(' ( ( ( (lv_Par_13_0= RULE_ID ) ) otherlv_14= ',' )* ( (lv_Par_15_0= RULE_ID ) ) )? otherlv_16= ')' ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case RULE_BOOL:
                {
                alt10=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt10=3;
                }
                break;
            case RULE_STRING:
                {
                alt10=4;
                }
                break;
            case RULE_CHAR:
                {
                alt10=5;
                }
                break;
            case 22:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRest.g:489:3: ( () ( (lv_Id_1_0= RULE_INT ) ) )
                    {
                    // InternalRest.g:489:3: ( () ( (lv_Id_1_0= RULE_INT ) ) )
                    // InternalRest.g:490:4: () ( (lv_Id_1_0= RULE_INT ) )
                    {
                    // InternalRest.g:490:4: ()
                    // InternalRest.g:491:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValuesAccess().getValuesAction_0_0(),
                    						current);
                    				

                    }

                    // InternalRest.g:497:4: ( (lv_Id_1_0= RULE_INT ) )
                    // InternalRest.g:498:5: (lv_Id_1_0= RULE_INT )
                    {
                    // InternalRest.g:498:5: (lv_Id_1_0= RULE_INT )
                    // InternalRest.g:499:6: lv_Id_1_0= RULE_INT
                    {
                    lv_Id_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_Id_1_0, grammarAccess.getValuesAccess().getIdINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValuesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Id",
                    							lv_Id_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:517:3: ( () ( (lv_IdB_3_0= RULE_BOOL ) ) )
                    {
                    // InternalRest.g:517:3: ( () ( (lv_IdB_3_0= RULE_BOOL ) ) )
                    // InternalRest.g:518:4: () ( (lv_IdB_3_0= RULE_BOOL ) )
                    {
                    // InternalRest.g:518:4: ()
                    // InternalRest.g:519:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValuesAccess().getValuesAction_1_0(),
                    						current);
                    				

                    }

                    // InternalRest.g:525:4: ( (lv_IdB_3_0= RULE_BOOL ) )
                    // InternalRest.g:526:5: (lv_IdB_3_0= RULE_BOOL )
                    {
                    // InternalRest.g:526:5: (lv_IdB_3_0= RULE_BOOL )
                    // InternalRest.g:527:6: lv_IdB_3_0= RULE_BOOL
                    {
                    lv_IdB_3_0=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                    						newLeafNode(lv_IdB_3_0, grammarAccess.getValuesAccess().getIdBBOOLTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValuesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"IdB",
                    							lv_IdB_3_0,
                    							"br.com.poli.restModel.Rest.BOOL");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRest.g:545:3: ( () ( (lv_IdF_5_0= RULE_FLOAT ) ) )
                    {
                    // InternalRest.g:545:3: ( () ( (lv_IdF_5_0= RULE_FLOAT ) ) )
                    // InternalRest.g:546:4: () ( (lv_IdF_5_0= RULE_FLOAT ) )
                    {
                    // InternalRest.g:546:4: ()
                    // InternalRest.g:547:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValuesAccess().getValuesAction_2_0(),
                    						current);
                    				

                    }

                    // InternalRest.g:553:4: ( (lv_IdF_5_0= RULE_FLOAT ) )
                    // InternalRest.g:554:5: (lv_IdF_5_0= RULE_FLOAT )
                    {
                    // InternalRest.g:554:5: (lv_IdF_5_0= RULE_FLOAT )
                    // InternalRest.g:555:6: lv_IdF_5_0= RULE_FLOAT
                    {
                    lv_IdF_5_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    						newLeafNode(lv_IdF_5_0, grammarAccess.getValuesAccess().getIdFFLOATTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValuesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"IdF",
                    							lv_IdF_5_0,
                    							"br.com.poli.restModel.Rest.FLOAT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRest.g:573:3: ( () ( (lv_IdS_7_0= RULE_STRING ) ) )
                    {
                    // InternalRest.g:573:3: ( () ( (lv_IdS_7_0= RULE_STRING ) ) )
                    // InternalRest.g:574:4: () ( (lv_IdS_7_0= RULE_STRING ) )
                    {
                    // InternalRest.g:574:4: ()
                    // InternalRest.g:575:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValuesAccess().getValuesAction_3_0(),
                    						current);
                    				

                    }

                    // InternalRest.g:581:4: ( (lv_IdS_7_0= RULE_STRING ) )
                    // InternalRest.g:582:5: (lv_IdS_7_0= RULE_STRING )
                    {
                    // InternalRest.g:582:5: (lv_IdS_7_0= RULE_STRING )
                    // InternalRest.g:583:6: lv_IdS_7_0= RULE_STRING
                    {
                    lv_IdS_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_IdS_7_0, grammarAccess.getValuesAccess().getIdSSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValuesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"IdS",
                    							lv_IdS_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRest.g:601:3: ( () ( (lv_IdC_9_0= RULE_CHAR ) ) )
                    {
                    // InternalRest.g:601:3: ( () ( (lv_IdC_9_0= RULE_CHAR ) ) )
                    // InternalRest.g:602:4: () ( (lv_IdC_9_0= RULE_CHAR ) )
                    {
                    // InternalRest.g:602:4: ()
                    // InternalRest.g:603:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValuesAccess().getValuesAction_4_0(),
                    						current);
                    				

                    }

                    // InternalRest.g:609:4: ( (lv_IdC_9_0= RULE_CHAR ) )
                    // InternalRest.g:610:5: (lv_IdC_9_0= RULE_CHAR )
                    {
                    // InternalRest.g:610:5: (lv_IdC_9_0= RULE_CHAR )
                    // InternalRest.g:611:6: lv_IdC_9_0= RULE_CHAR
                    {
                    lv_IdC_9_0=(Token)match(input,RULE_CHAR,FOLLOW_2); 

                    						newLeafNode(lv_IdC_9_0, grammarAccess.getValuesAccess().getIdCCHARTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValuesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"IdC",
                    							lv_IdC_9_0,
                    							"br.com.poli.restModel.Rest.CHAR");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalRest.g:629:3: (otherlv_10= 'new' ( (lv_IdT_11_0= RULE_ID ) ) otherlv_12= '(' ( ( ( (lv_Par_13_0= RULE_ID ) ) otherlv_14= ',' )* ( (lv_Par_15_0= RULE_ID ) ) )? otherlv_16= ')' )
                    {
                    // InternalRest.g:629:3: (otherlv_10= 'new' ( (lv_IdT_11_0= RULE_ID ) ) otherlv_12= '(' ( ( ( (lv_Par_13_0= RULE_ID ) ) otherlv_14= ',' )* ( (lv_Par_15_0= RULE_ID ) ) )? otherlv_16= ')' )
                    // InternalRest.g:630:4: otherlv_10= 'new' ( (lv_IdT_11_0= RULE_ID ) ) otherlv_12= '(' ( ( ( (lv_Par_13_0= RULE_ID ) ) otherlv_14= ',' )* ( (lv_Par_15_0= RULE_ID ) ) )? otherlv_16= ')'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getValuesAccess().getNewKeyword_5_0());
                    			
                    // InternalRest.g:634:4: ( (lv_IdT_11_0= RULE_ID ) )
                    // InternalRest.g:635:5: (lv_IdT_11_0= RULE_ID )
                    {
                    // InternalRest.g:635:5: (lv_IdT_11_0= RULE_ID )
                    // InternalRest.g:636:6: lv_IdT_11_0= RULE_ID
                    {
                    lv_IdT_11_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_IdT_11_0, grammarAccess.getValuesAccess().getIdTIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValuesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"IdT",
                    							lv_IdT_11_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getValuesAccess().getLeftParenthesisKeyword_5_2());
                    			
                    // InternalRest.g:656:4: ( ( ( (lv_Par_13_0= RULE_ID ) ) otherlv_14= ',' )* ( (lv_Par_15_0= RULE_ID ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRest.g:657:5: ( ( (lv_Par_13_0= RULE_ID ) ) otherlv_14= ',' )* ( (lv_Par_15_0= RULE_ID ) )
                            {
                            // InternalRest.g:657:5: ( ( (lv_Par_13_0= RULE_ID ) ) otherlv_14= ',' )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==RULE_ID) ) {
                                    int LA8_1 = input.LA(2);

                                    if ( (LA8_1==24) ) {
                                        alt8=1;
                                    }


                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalRest.g:658:6: ( (lv_Par_13_0= RULE_ID ) ) otherlv_14= ','
                            	    {
                            	    // InternalRest.g:658:6: ( (lv_Par_13_0= RULE_ID ) )
                            	    // InternalRest.g:659:7: (lv_Par_13_0= RULE_ID )
                            	    {
                            	    // InternalRest.g:659:7: (lv_Par_13_0= RULE_ID )
                            	    // InternalRest.g:660:8: lv_Par_13_0= RULE_ID
                            	    {
                            	    lv_Par_13_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                            	    								newLeafNode(lv_Par_13_0, grammarAccess.getValuesAccess().getParIDTerminalRuleCall_5_3_0_0_0());
                            	    							

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getValuesRule());
                            	    								}
                            	    								addWithLastConsumed(
                            	    									current,
                            	    									"Par",
                            	    									lv_Par_13_0,
                            	    									"org.eclipse.xtext.common.Terminals.ID");
                            	    							

                            	    }


                            	    }

                            	    otherlv_14=(Token)match(input,24,FOLLOW_6); 

                            	    						newLeafNode(otherlv_14, grammarAccess.getValuesAccess().getCommaKeyword_5_3_0_1());
                            	    					

                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);

                            // InternalRest.g:681:5: ( (lv_Par_15_0= RULE_ID ) )
                            // InternalRest.g:682:6: (lv_Par_15_0= RULE_ID )
                            {
                            // InternalRest.g:682:6: (lv_Par_15_0= RULE_ID )
                            // InternalRest.g:683:7: lv_Par_15_0= RULE_ID
                            {
                            lv_Par_15_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                            							newLeafNode(lv_Par_15_0, grammarAccess.getValuesAccess().getParIDTerminalRuleCall_5_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getValuesRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"Par",
                            								lv_Par_15_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getValuesAccess().getRightParenthesisKeyword_5_4());
                    			

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
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleTYPE_NAME"
    // InternalRest.g:709:1: entryRuleTYPE_NAME returns [String current=null] : iv_ruleTYPE_NAME= ruleTYPE_NAME EOF ;
    public final String entryRuleTYPE_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE_NAME = null;


        try {
            // InternalRest.g:709:49: (iv_ruleTYPE_NAME= ruleTYPE_NAME EOF )
            // InternalRest.g:710:2: iv_ruleTYPE_NAME= ruleTYPE_NAME EOF
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
    // InternalRest.g:716:1: ruleTYPE_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '<' ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )* (this_ID_5= RULE_ID | this_VALID_TYPES_6= ruleVALID_TYPES ) kw= '>' )? ) ;
    public final AntlrDatatypeRuleToken ruleTYPE_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_5=null;
        AntlrDatatypeRuleToken this_VALID_TYPES_3 = null;

        AntlrDatatypeRuleToken this_VALID_TYPES_6 = null;



        	enterRule();

        try {
            // InternalRest.g:722:2: ( (this_ID_0= RULE_ID (kw= '<' ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )* (this_ID_5= RULE_ID | this_VALID_TYPES_6= ruleVALID_TYPES ) kw= '>' )? ) )
            // InternalRest.g:723:2: (this_ID_0= RULE_ID (kw= '<' ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )* (this_ID_5= RULE_ID | this_VALID_TYPES_6= ruleVALID_TYPES ) kw= '>' )? )
            {
            // InternalRest.g:723:2: (this_ID_0= RULE_ID (kw= '<' ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )* (this_ID_5= RULE_ID | this_VALID_TYPES_6= ruleVALID_TYPES ) kw= '>' )? )
            // InternalRest.g:724:3: this_ID_0= RULE_ID (kw= '<' ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )* (this_ID_5= RULE_ID | this_VALID_TYPES_6= ruleVALID_TYPES ) kw= '>' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_0());
            		
            // InternalRest.g:731:3: (kw= '<' ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )* (this_ID_5= RULE_ID | this_VALID_TYPES_6= ruleVALID_TYPES ) kw= '>' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRest.g:732:4: kw= '<' ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )* (this_ID_5= RULE_ID | this_VALID_TYPES_6= ruleVALID_TYPES ) kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTYPE_NAMEAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalRest.g:737:4: ( (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ',' )*
                    loop12:
                    do {
                        int alt12=2;
                        switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1==24) ) {
                                alt12=1;
                            }


                            }
                            break;
                        case 28:
                            {
                            int LA12_2 = input.LA(2);

                            if ( (LA12_2==24) ) {
                                alt12=1;
                            }


                            }
                            break;
                        case 29:
                            {
                            int LA12_3 = input.LA(2);

                            if ( (LA12_3==24) ) {
                                alt12=1;
                            }


                            }
                            break;
                        case 30:
                            {
                            int LA12_4 = input.LA(2);

                            if ( (LA12_4==24) ) {
                                alt12=1;
                            }


                            }
                            break;
                        case RULE_INT_TYPES:
                            {
                            int LA12_5 = input.LA(2);

                            if ( (LA12_5==24) ) {
                                alt12=1;
                            }


                            }
                            break;
                        case RULE_FLOAT_TYPES:
                            {
                            int LA12_6 = input.LA(2);

                            if ( (LA12_6==24) ) {
                                alt12=1;
                            }


                            }
                            break;

                        }

                        switch (alt12) {
                    	case 1 :
                    	    // InternalRest.g:738:5: (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES ) kw= ','
                    	    {
                    	    // InternalRest.g:738:5: (this_ID_2= RULE_ID | this_VALID_TYPES_3= ruleVALID_TYPES )
                    	    int alt11=2;
                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0==RULE_ID) ) {
                    	        alt11=1;
                    	    }
                    	    else if ( ((LA11_0>=RULE_INT_TYPES && LA11_0<=RULE_FLOAT_TYPES)||(LA11_0>=28 && LA11_0<=30)) ) {
                    	        alt11=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 11, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt11) {
                    	        case 1 :
                    	            // InternalRest.g:739:6: this_ID_2= RULE_ID
                    	            {
                    	            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	            						current.merge(this_ID_2);
                    	            					

                    	            						newLeafNode(this_ID_2, grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_1_1_0_0());
                    	            					

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalRest.g:747:6: this_VALID_TYPES_3= ruleVALID_TYPES
                    	            {

                    	            						newCompositeNode(grammarAccess.getTYPE_NAMEAccess().getVALID_TYPESParserRuleCall_1_1_0_1());
                    	            					
                    	            pushFollow(FOLLOW_13);
                    	            this_VALID_TYPES_3=ruleVALID_TYPES();

                    	            state._fsp--;


                    	            						current.merge(this_VALID_TYPES_3);
                    	            					

                    	            						afterParserOrEnumRuleCall();
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    kw=(Token)match(input,24,FOLLOW_8); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getTYPE_NAMEAccess().getCommaKeyword_1_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalRest.g:764:4: (this_ID_5= RULE_ID | this_VALID_TYPES_6= ruleVALID_TYPES )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    else if ( ((LA13_0>=RULE_INT_TYPES && LA13_0<=RULE_FLOAT_TYPES)||(LA13_0>=28 && LA13_0<=30)) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalRest.g:765:5: this_ID_5= RULE_ID
                            {
                            this_ID_5=(Token)match(input,RULE_ID,FOLLOW_16); 

                            					current.merge(this_ID_5);
                            				

                            					newLeafNode(this_ID_5, grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_1_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRest.g:773:5: this_VALID_TYPES_6= ruleVALID_TYPES
                            {

                            					newCompositeNode(grammarAccess.getTYPE_NAMEAccess().getVALID_TYPESParserRuleCall_1_2_1());
                            				
                            pushFollow(FOLLOW_16);
                            this_VALID_TYPES_6=ruleVALID_TYPES();

                            state._fsp--;


                            					current.merge(this_VALID_TYPES_6);
                            				

                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,27,FOLLOW_2); 

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
    // InternalRest.g:794:1: entryRuleVALID_TYPES returns [String current=null] : iv_ruleVALID_TYPES= ruleVALID_TYPES EOF ;
    public final String entryRuleVALID_TYPES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_TYPES = null;


        try {
            // InternalRest.g:794:51: (iv_ruleVALID_TYPES= ruleVALID_TYPES EOF )
            // InternalRest.g:795:2: iv_ruleVALID_TYPES= ruleVALID_TYPES EOF
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
    // InternalRest.g:801:1: ruleVALID_TYPES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'boolean' | kw= 'char' | this_INT_TYPES_3= RULE_INT_TYPES | this_FLOAT_TYPES_4= RULE_FLOAT_TYPES ) ;
    public final AntlrDatatypeRuleToken ruleVALID_TYPES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_TYPES_3=null;
        Token this_FLOAT_TYPES_4=null;


        	enterRule();

        try {
            // InternalRest.g:807:2: ( (kw= 'String' | kw= 'boolean' | kw= 'char' | this_INT_TYPES_3= RULE_INT_TYPES | this_FLOAT_TYPES_4= RULE_FLOAT_TYPES ) )
            // InternalRest.g:808:2: (kw= 'String' | kw= 'boolean' | kw= 'char' | this_INT_TYPES_3= RULE_INT_TYPES | this_FLOAT_TYPES_4= RULE_FLOAT_TYPES )
            {
            // InternalRest.g:808:2: (kw= 'String' | kw= 'boolean' | kw= 'char' | this_INT_TYPES_3= RULE_INT_TYPES | this_FLOAT_TYPES_4= RULE_FLOAT_TYPES )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case 29:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            case RULE_INT_TYPES:
                {
                alt15=4;
                }
                break;
            case RULE_FLOAT_TYPES:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalRest.g:809:3: kw= 'String'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVALID_TYPESAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:815:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVALID_TYPESAccess().getBooleanKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRest.g:821:3: kw= 'char'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVALID_TYPESAccess().getCharKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRest.g:827:3: this_INT_TYPES_3= RULE_INT_TYPES
                    {
                    this_INT_TYPES_3=(Token)match(input,RULE_INT_TYPES,FOLLOW_2); 

                    			current.merge(this_INT_TYPES_3);
                    		

                    			newLeafNode(this_INT_TYPES_3, grammarAccess.getVALID_TYPESAccess().getINT_TYPESTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRest.g:835:3: this_FLOAT_TYPES_4= RULE_FLOAT_TYPES
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


    // $ANTLR start "entryRulePackageName"
    // InternalRest.g:846:1: entryRulePackageName returns [String current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final String entryRulePackageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageName = null;


        try {
            // InternalRest.g:846:51: (iv_rulePackageName= rulePackageName EOF )
            // InternalRest.g:847:2: iv_rulePackageName= rulePackageName EOF
            {
             newCompositeNode(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageName=rulePackageName();

            state._fsp--;

             current =iv_rulePackageName.getText(); 
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
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // InternalRest.g:853:1: rulePackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken rulePackageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRest.g:859:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRest.g:860:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRest.g:860:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRest.g:861:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalRest.g:868:3: (kw= '.' this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRest.g:869:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // $ANTLR end "rulePackageName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000070000C10L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000004003E0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000002L});

}