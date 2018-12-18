package br.com.poli.restModel.ide.contentassist.antlr.internal;

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
import br.com.poli.restModel.services.RestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT_TYPES", "RULE_FLOAT_TYPES", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_STRING", "RULE_CHAR", "RULE_WS", "RULE_ML_COMMENT", "RULE_ALMOST__ANY__THING", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'String'", "'boolean'", "'char'", "'Request'", "'{'", "'}'", "'package'", "':'", "'new'", "'('", "')'", "','", "'<'", "'>'", "'.'"
    };
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_INT_TYPES=5;
    public static final int RULE_CHAR=11;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_FLOAT_TYPES=6;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_BOOL=8;
    public static final int RULE_ALMOST__ANY__THING=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int RULE_FLOAT=9;
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

    	public void setGrammarAccess(RestGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalRest.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalRest.g:54:1: ( ruleModel EOF )
            // InternalRest.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRest.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalRest.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalRest.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalRest.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalRest.g:69:3: ( rule__Model__Group__0 )
            // InternalRest.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBody"
    // InternalRest.g:78:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // InternalRest.g:79:1: ( ruleBody EOF )
            // InternalRest.g:80:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getBodyRule()); 
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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalRest.g:87:1: ruleBody : ( ( rule__Body__Alternatives ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:91:2: ( ( ( rule__Body__Alternatives ) ) )
            // InternalRest.g:92:2: ( ( rule__Body__Alternatives ) )
            {
            // InternalRest.g:92:2: ( ( rule__Body__Alternatives ) )
            // InternalRest.g:93:3: ( rule__Body__Alternatives )
            {
             before(grammarAccess.getBodyAccess().getAlternatives()); 
            // InternalRest.g:94:3: ( rule__Body__Alternatives )
            // InternalRest.g:94:4: rule__Body__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Body__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleElem"
    // InternalRest.g:103:1: entryRuleElem : ruleElem EOF ;
    public final void entryRuleElem() throws RecognitionException {
        try {
            // InternalRest.g:104:1: ( ruleElem EOF )
            // InternalRest.g:105:1: ruleElem EOF
            {
             before(grammarAccess.getElemRule()); 
            pushFollow(FOLLOW_1);
            ruleElem();

            state._fsp--;

             after(grammarAccess.getElemRule()); 
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
    // $ANTLR end "entryRuleElem"


    // $ANTLR start "ruleElem"
    // InternalRest.g:112:1: ruleElem : ( ( rule__Elem__Group__0 ) ) ;
    public final void ruleElem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:116:2: ( ( ( rule__Elem__Group__0 ) ) )
            // InternalRest.g:117:2: ( ( rule__Elem__Group__0 ) )
            {
            // InternalRest.g:117:2: ( ( rule__Elem__Group__0 ) )
            // InternalRest.g:118:3: ( rule__Elem__Group__0 )
            {
             before(grammarAccess.getElemAccess().getGroup()); 
            // InternalRest.g:119:3: ( rule__Elem__Group__0 )
            // InternalRest.g:119:4: rule__Elem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Elem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElemAccess().getGroup()); 

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
    // $ANTLR end "ruleElem"


    // $ANTLR start "entryRuleAtrib"
    // InternalRest.g:128:1: entryRuleAtrib : ruleAtrib EOF ;
    public final void entryRuleAtrib() throws RecognitionException {
        try {
            // InternalRest.g:129:1: ( ruleAtrib EOF )
            // InternalRest.g:130:1: ruleAtrib EOF
            {
             before(grammarAccess.getAtribRule()); 
            pushFollow(FOLLOW_1);
            ruleAtrib();

            state._fsp--;

             after(grammarAccess.getAtribRule()); 
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
    // $ANTLR end "entryRuleAtrib"


    // $ANTLR start "ruleAtrib"
    // InternalRest.g:137:1: ruleAtrib : ( ( rule__Atrib__Group__0 ) ) ;
    public final void ruleAtrib() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:141:2: ( ( ( rule__Atrib__Group__0 ) ) )
            // InternalRest.g:142:2: ( ( rule__Atrib__Group__0 ) )
            {
            // InternalRest.g:142:2: ( ( rule__Atrib__Group__0 ) )
            // InternalRest.g:143:3: ( rule__Atrib__Group__0 )
            {
             before(grammarAccess.getAtribAccess().getGroup()); 
            // InternalRest.g:144:3: ( rule__Atrib__Group__0 )
            // InternalRest.g:144:4: rule__Atrib__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getGroup()); 

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
    // $ANTLR end "ruleAtrib"


    // $ANTLR start "entryRuleGlobAtrib"
    // InternalRest.g:153:1: entryRuleGlobAtrib : ruleGlobAtrib EOF ;
    public final void entryRuleGlobAtrib() throws RecognitionException {
        try {
            // InternalRest.g:154:1: ( ruleGlobAtrib EOF )
            // InternalRest.g:155:1: ruleGlobAtrib EOF
            {
             before(grammarAccess.getGlobAtribRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobAtrib();

            state._fsp--;

             after(grammarAccess.getGlobAtribRule()); 
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
    // $ANTLR end "entryRuleGlobAtrib"


    // $ANTLR start "ruleGlobAtrib"
    // InternalRest.g:162:1: ruleGlobAtrib : ( ( rule__GlobAtrib__Group__0 ) ) ;
    public final void ruleGlobAtrib() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:166:2: ( ( ( rule__GlobAtrib__Group__0 ) ) )
            // InternalRest.g:167:2: ( ( rule__GlobAtrib__Group__0 ) )
            {
            // InternalRest.g:167:2: ( ( rule__GlobAtrib__Group__0 ) )
            // InternalRest.g:168:3: ( rule__GlobAtrib__Group__0 )
            {
             before(grammarAccess.getGlobAtribAccess().getGroup()); 
            // InternalRest.g:169:3: ( rule__GlobAtrib__Group__0 )
            // InternalRest.g:169:4: rule__GlobAtrib__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobAtrib__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobAtribAccess().getGroup()); 

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
    // $ANTLR end "ruleGlobAtrib"


    // $ANTLR start "entryRuleValues"
    // InternalRest.g:178:1: entryRuleValues : ruleValues EOF ;
    public final void entryRuleValues() throws RecognitionException {
        try {
            // InternalRest.g:179:1: ( ruleValues EOF )
            // InternalRest.g:180:1: ruleValues EOF
            {
             before(grammarAccess.getValuesRule()); 
            pushFollow(FOLLOW_1);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getValuesRule()); 
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
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // InternalRest.g:187:1: ruleValues : ( ( rule__Values__Alternatives ) ) ;
    public final void ruleValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:191:2: ( ( ( rule__Values__Alternatives ) ) )
            // InternalRest.g:192:2: ( ( rule__Values__Alternatives ) )
            {
            // InternalRest.g:192:2: ( ( rule__Values__Alternatives ) )
            // InternalRest.g:193:3: ( rule__Values__Alternatives )
            {
             before(grammarAccess.getValuesAccess().getAlternatives()); 
            // InternalRest.g:194:3: ( rule__Values__Alternatives )
            // InternalRest.g:194:4: rule__Values__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Values__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleTYPE_NAME"
    // InternalRest.g:203:1: entryRuleTYPE_NAME : ruleTYPE_NAME EOF ;
    public final void entryRuleTYPE_NAME() throws RecognitionException {
        try {
            // InternalRest.g:204:1: ( ruleTYPE_NAME EOF )
            // InternalRest.g:205:1: ruleTYPE_NAME EOF
            {
             before(grammarAccess.getTYPE_NAMERule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE_NAME();

            state._fsp--;

             after(grammarAccess.getTYPE_NAMERule()); 
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
    // $ANTLR end "entryRuleTYPE_NAME"


    // $ANTLR start "ruleTYPE_NAME"
    // InternalRest.g:212:1: ruleTYPE_NAME : ( ( rule__TYPE_NAME__Group__0 ) ) ;
    public final void ruleTYPE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:216:2: ( ( ( rule__TYPE_NAME__Group__0 ) ) )
            // InternalRest.g:217:2: ( ( rule__TYPE_NAME__Group__0 ) )
            {
            // InternalRest.g:217:2: ( ( rule__TYPE_NAME__Group__0 ) )
            // InternalRest.g:218:3: ( rule__TYPE_NAME__Group__0 )
            {
             before(grammarAccess.getTYPE_NAMEAccess().getGroup()); 
            // InternalRest.g:219:3: ( rule__TYPE_NAME__Group__0 )
            // InternalRest.g:219:4: rule__TYPE_NAME__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_NAME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTYPE_NAMEAccess().getGroup()); 

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
    // $ANTLR end "ruleTYPE_NAME"


    // $ANTLR start "entryRuleVALID_TYPES"
    // InternalRest.g:228:1: entryRuleVALID_TYPES : ruleVALID_TYPES EOF ;
    public final void entryRuleVALID_TYPES() throws RecognitionException {
        try {
            // InternalRest.g:229:1: ( ruleVALID_TYPES EOF )
            // InternalRest.g:230:1: ruleVALID_TYPES EOF
            {
             before(grammarAccess.getVALID_TYPESRule()); 
            pushFollow(FOLLOW_1);
            ruleVALID_TYPES();

            state._fsp--;

             after(grammarAccess.getVALID_TYPESRule()); 
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
    // $ANTLR end "entryRuleVALID_TYPES"


    // $ANTLR start "ruleVALID_TYPES"
    // InternalRest.g:237:1: ruleVALID_TYPES : ( ( rule__VALID_TYPES__Alternatives ) ) ;
    public final void ruleVALID_TYPES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:241:2: ( ( ( rule__VALID_TYPES__Alternatives ) ) )
            // InternalRest.g:242:2: ( ( rule__VALID_TYPES__Alternatives ) )
            {
            // InternalRest.g:242:2: ( ( rule__VALID_TYPES__Alternatives ) )
            // InternalRest.g:243:3: ( rule__VALID_TYPES__Alternatives )
            {
             before(grammarAccess.getVALID_TYPESAccess().getAlternatives()); 
            // InternalRest.g:244:3: ( rule__VALID_TYPES__Alternatives )
            // InternalRest.g:244:4: rule__VALID_TYPES__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VALID_TYPES__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVALID_TYPESAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVALID_TYPES"


    // $ANTLR start "entryRulePackageName"
    // InternalRest.g:253:1: entryRulePackageName : rulePackageName EOF ;
    public final void entryRulePackageName() throws RecognitionException {
        try {
            // InternalRest.g:254:1: ( rulePackageName EOF )
            // InternalRest.g:255:1: rulePackageName EOF
            {
             before(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_1);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getPackageNameRule()); 
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
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // InternalRest.g:262:1: rulePackageName : ( ( rule__PackageName__Group__0 ) ) ;
    public final void rulePackageName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:266:2: ( ( ( rule__PackageName__Group__0 ) ) )
            // InternalRest.g:267:2: ( ( rule__PackageName__Group__0 ) )
            {
            // InternalRest.g:267:2: ( ( rule__PackageName__Group__0 ) )
            // InternalRest.g:268:3: ( rule__PackageName__Group__0 )
            {
             before(grammarAccess.getPackageNameAccess().getGroup()); 
            // InternalRest.g:269:3: ( rule__PackageName__Group__0 )
            // InternalRest.g:269:4: rule__PackageName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageNameAccess().getGroup()); 

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
    // $ANTLR end "rulePackageName"


    // $ANTLR start "rule__Body__Alternatives"
    // InternalRest.g:277:1: rule__Body__Alternatives : ( ( ( rule__Body__ElemAssignment_0 ) ) | ( ( rule__Body__GlobAtribAssignment_1 ) ) );
    public final void rule__Body__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:281:1: ( ( ( rule__Body__ElemAssignment_0 ) ) | ( ( rule__Body__GlobAtribAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==21) ) {
                    alt1=1;
                }
                else if ( (LA1_1==24) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRest.g:282:2: ( ( rule__Body__ElemAssignment_0 ) )
                    {
                    // InternalRest.g:282:2: ( ( rule__Body__ElemAssignment_0 ) )
                    // InternalRest.g:283:3: ( rule__Body__ElemAssignment_0 )
                    {
                     before(grammarAccess.getBodyAccess().getElemAssignment_0()); 
                    // InternalRest.g:284:3: ( rule__Body__ElemAssignment_0 )
                    // InternalRest.g:284:4: rule__Body__ElemAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Body__ElemAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyAccess().getElemAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:288:2: ( ( rule__Body__GlobAtribAssignment_1 ) )
                    {
                    // InternalRest.g:288:2: ( ( rule__Body__GlobAtribAssignment_1 ) )
                    // InternalRest.g:289:3: ( rule__Body__GlobAtribAssignment_1 )
                    {
                     before(grammarAccess.getBodyAccess().getGlobAtribAssignment_1()); 
                    // InternalRest.g:290:3: ( rule__Body__GlobAtribAssignment_1 )
                    // InternalRest.g:290:4: rule__Body__GlobAtribAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Body__GlobAtribAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyAccess().getGlobAtribAssignment_1()); 

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
    // $ANTLR end "rule__Body__Alternatives"


    // $ANTLR start "rule__Atrib__TipoAlternatives_2_0"
    // InternalRest.g:298:1: rule__Atrib__TipoAlternatives_2_0 : ( ( ruleVALID_TYPES ) | ( ruleTYPE_NAME ) );
    public final void rule__Atrib__TipoAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:302:1: ( ( ruleVALID_TYPES ) | ( ruleTYPE_NAME ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_INT_TYPES && LA2_0<=RULE_FLOAT_TYPES)||(LA2_0>=17 && LA2_0<=19)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRest.g:303:2: ( ruleVALID_TYPES )
                    {
                    // InternalRest.g:303:2: ( ruleVALID_TYPES )
                    // InternalRest.g:304:3: ruleVALID_TYPES
                    {
                     before(grammarAccess.getAtribAccess().getTipoVALID_TYPESParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVALID_TYPES();

                    state._fsp--;

                     after(grammarAccess.getAtribAccess().getTipoVALID_TYPESParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:309:2: ( ruleTYPE_NAME )
                    {
                    // InternalRest.g:309:2: ( ruleTYPE_NAME )
                    // InternalRest.g:310:3: ruleTYPE_NAME
                    {
                     before(grammarAccess.getAtribAccess().getTipoTYPE_NAMEParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTYPE_NAME();

                    state._fsp--;

                     after(grammarAccess.getAtribAccess().getTipoTYPE_NAMEParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Atrib__TipoAlternatives_2_0"


    // $ANTLR start "rule__GlobAtrib__TipoAlternatives_2_0"
    // InternalRest.g:319:1: rule__GlobAtrib__TipoAlternatives_2_0 : ( ( ruleVALID_TYPES ) | ( ruleTYPE_NAME ) );
    public final void rule__GlobAtrib__TipoAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:323:1: ( ( ruleVALID_TYPES ) | ( ruleTYPE_NAME ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_INT_TYPES && LA3_0<=RULE_FLOAT_TYPES)||(LA3_0>=17 && LA3_0<=19)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRest.g:324:2: ( ruleVALID_TYPES )
                    {
                    // InternalRest.g:324:2: ( ruleVALID_TYPES )
                    // InternalRest.g:325:3: ruleVALID_TYPES
                    {
                     before(grammarAccess.getGlobAtribAccess().getTipoVALID_TYPESParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVALID_TYPES();

                    state._fsp--;

                     after(grammarAccess.getGlobAtribAccess().getTipoVALID_TYPESParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:330:2: ( ruleTYPE_NAME )
                    {
                    // InternalRest.g:330:2: ( ruleTYPE_NAME )
                    // InternalRest.g:331:3: ruleTYPE_NAME
                    {
                     before(grammarAccess.getGlobAtribAccess().getTipoTYPE_NAMEParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTYPE_NAME();

                    state._fsp--;

                     after(grammarAccess.getGlobAtribAccess().getTipoTYPE_NAMEParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__GlobAtrib__TipoAlternatives_2_0"


    // $ANTLR start "rule__Values__Alternatives"
    // InternalRest.g:340:1: rule__Values__Alternatives : ( ( ( rule__Values__Group_0__0 ) ) | ( ( rule__Values__Group_1__0 ) ) | ( ( rule__Values__Group_2__0 ) ) | ( ( rule__Values__Group_3__0 ) ) | ( ( rule__Values__Group_4__0 ) ) | ( ( rule__Values__Group_5__0 ) ) );
    public final void rule__Values__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:344:1: ( ( ( rule__Values__Group_0__0 ) ) | ( ( rule__Values__Group_1__0 ) ) | ( ( rule__Values__Group_2__0 ) ) | ( ( rule__Values__Group_3__0 ) ) | ( ( rule__Values__Group_4__0 ) ) | ( ( rule__Values__Group_5__0 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_BOOL:
                {
                alt4=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt4=3;
                }
                break;
            case RULE_STRING:
                {
                alt4=4;
                }
                break;
            case RULE_CHAR:
                {
                alt4=5;
                }
                break;
            case 25:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRest.g:345:2: ( ( rule__Values__Group_0__0 ) )
                    {
                    // InternalRest.g:345:2: ( ( rule__Values__Group_0__0 ) )
                    // InternalRest.g:346:3: ( rule__Values__Group_0__0 )
                    {
                     before(grammarAccess.getValuesAccess().getGroup_0()); 
                    // InternalRest.g:347:3: ( rule__Values__Group_0__0 )
                    // InternalRest.g:347:4: rule__Values__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValuesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:351:2: ( ( rule__Values__Group_1__0 ) )
                    {
                    // InternalRest.g:351:2: ( ( rule__Values__Group_1__0 ) )
                    // InternalRest.g:352:3: ( rule__Values__Group_1__0 )
                    {
                     before(grammarAccess.getValuesAccess().getGroup_1()); 
                    // InternalRest.g:353:3: ( rule__Values__Group_1__0 )
                    // InternalRest.g:353:4: rule__Values__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValuesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRest.g:357:2: ( ( rule__Values__Group_2__0 ) )
                    {
                    // InternalRest.g:357:2: ( ( rule__Values__Group_2__0 ) )
                    // InternalRest.g:358:3: ( rule__Values__Group_2__0 )
                    {
                     before(grammarAccess.getValuesAccess().getGroup_2()); 
                    // InternalRest.g:359:3: ( rule__Values__Group_2__0 )
                    // InternalRest.g:359:4: rule__Values__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValuesAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRest.g:363:2: ( ( rule__Values__Group_3__0 ) )
                    {
                    // InternalRest.g:363:2: ( ( rule__Values__Group_3__0 ) )
                    // InternalRest.g:364:3: ( rule__Values__Group_3__0 )
                    {
                     before(grammarAccess.getValuesAccess().getGroup_3()); 
                    // InternalRest.g:365:3: ( rule__Values__Group_3__0 )
                    // InternalRest.g:365:4: rule__Values__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValuesAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRest.g:369:2: ( ( rule__Values__Group_4__0 ) )
                    {
                    // InternalRest.g:369:2: ( ( rule__Values__Group_4__0 ) )
                    // InternalRest.g:370:3: ( rule__Values__Group_4__0 )
                    {
                     before(grammarAccess.getValuesAccess().getGroup_4()); 
                    // InternalRest.g:371:3: ( rule__Values__Group_4__0 )
                    // InternalRest.g:371:4: rule__Values__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValuesAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRest.g:375:2: ( ( rule__Values__Group_5__0 ) )
                    {
                    // InternalRest.g:375:2: ( ( rule__Values__Group_5__0 ) )
                    // InternalRest.g:376:3: ( rule__Values__Group_5__0 )
                    {
                     before(grammarAccess.getValuesAccess().getGroup_5()); 
                    // InternalRest.g:377:3: ( rule__Values__Group_5__0 )
                    // InternalRest.g:377:4: rule__Values__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValuesAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Values__Alternatives"


    // $ANTLR start "rule__TYPE_NAME__Alternatives_1_1_0"
    // InternalRest.g:385:1: rule__TYPE_NAME__Alternatives_1_1_0 : ( ( RULE_ID ) | ( ruleVALID_TYPES ) );
    public final void rule__TYPE_NAME__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:389:1: ( ( RULE_ID ) | ( ruleVALID_TYPES ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_INT_TYPES && LA5_0<=RULE_FLOAT_TYPES)||(LA5_0>=17 && LA5_0<=19)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRest.g:390:2: ( RULE_ID )
                    {
                    // InternalRest.g:390:2: ( RULE_ID )
                    // InternalRest.g:391:3: RULE_ID
                    {
                     before(grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_1_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:396:2: ( ruleVALID_TYPES )
                    {
                    // InternalRest.g:396:2: ( ruleVALID_TYPES )
                    // InternalRest.g:397:3: ruleVALID_TYPES
                    {
                     before(grammarAccess.getTYPE_NAMEAccess().getVALID_TYPESParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVALID_TYPES();

                    state._fsp--;

                     after(grammarAccess.getTYPE_NAMEAccess().getVALID_TYPESParserRuleCall_1_1_0_1()); 

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
    // $ANTLR end "rule__TYPE_NAME__Alternatives_1_1_0"


    // $ANTLR start "rule__TYPE_NAME__Alternatives_1_2"
    // InternalRest.g:406:1: rule__TYPE_NAME__Alternatives_1_2 : ( ( RULE_ID ) | ( ruleVALID_TYPES ) );
    public final void rule__TYPE_NAME__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:410:1: ( ( RULE_ID ) | ( ruleVALID_TYPES ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_INT_TYPES && LA6_0<=RULE_FLOAT_TYPES)||(LA6_0>=17 && LA6_0<=19)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRest.g:411:2: ( RULE_ID )
                    {
                    // InternalRest.g:411:2: ( RULE_ID )
                    // InternalRest.g:412:3: RULE_ID
                    {
                     before(grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_1_2_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:417:2: ( ruleVALID_TYPES )
                    {
                    // InternalRest.g:417:2: ( ruleVALID_TYPES )
                    // InternalRest.g:418:3: ruleVALID_TYPES
                    {
                     before(grammarAccess.getTYPE_NAMEAccess().getVALID_TYPESParserRuleCall_1_2_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVALID_TYPES();

                    state._fsp--;

                     after(grammarAccess.getTYPE_NAMEAccess().getVALID_TYPESParserRuleCall_1_2_1()); 

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
    // $ANTLR end "rule__TYPE_NAME__Alternatives_1_2"


    // $ANTLR start "rule__VALID_TYPES__Alternatives"
    // InternalRest.g:427:1: rule__VALID_TYPES__Alternatives : ( ( 'String' ) | ( 'boolean' ) | ( 'char' ) | ( RULE_INT_TYPES ) | ( RULE_FLOAT_TYPES ) );
    public final void rule__VALID_TYPES__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:431:1: ( ( 'String' ) | ( 'boolean' ) | ( 'char' ) | ( RULE_INT_TYPES ) | ( RULE_FLOAT_TYPES ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case RULE_INT_TYPES:
                {
                alt7=4;
                }
                break;
            case RULE_FLOAT_TYPES:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRest.g:432:2: ( 'String' )
                    {
                    // InternalRest.g:432:2: ( 'String' )
                    // InternalRest.g:433:3: 'String'
                    {
                     before(grammarAccess.getVALID_TYPESAccess().getStringKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVALID_TYPESAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:438:2: ( 'boolean' )
                    {
                    // InternalRest.g:438:2: ( 'boolean' )
                    // InternalRest.g:439:3: 'boolean'
                    {
                     before(grammarAccess.getVALID_TYPESAccess().getBooleanKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getVALID_TYPESAccess().getBooleanKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRest.g:444:2: ( 'char' )
                    {
                    // InternalRest.g:444:2: ( 'char' )
                    // InternalRest.g:445:3: 'char'
                    {
                     before(grammarAccess.getVALID_TYPESAccess().getCharKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getVALID_TYPESAccess().getCharKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRest.g:450:2: ( RULE_INT_TYPES )
                    {
                    // InternalRest.g:450:2: ( RULE_INT_TYPES )
                    // InternalRest.g:451:3: RULE_INT_TYPES
                    {
                     before(grammarAccess.getVALID_TYPESAccess().getINT_TYPESTerminalRuleCall_3()); 
                    match(input,RULE_INT_TYPES,FOLLOW_2); 
                     after(grammarAccess.getVALID_TYPESAccess().getINT_TYPESTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRest.g:456:2: ( RULE_FLOAT_TYPES )
                    {
                    // InternalRest.g:456:2: ( RULE_FLOAT_TYPES )
                    // InternalRest.g:457:3: RULE_FLOAT_TYPES
                    {
                     before(grammarAccess.getVALID_TYPESAccess().getFLOAT_TYPESTerminalRuleCall_4()); 
                    match(input,RULE_FLOAT_TYPES,FOLLOW_2); 
                     after(grammarAccess.getVALID_TYPESAccess().getFLOAT_TYPESTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__VALID_TYPES__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalRest.g:466:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:470:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalRest.g:471:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalRest.g:478:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:482:1: ( ( () ) )
            // InternalRest.g:483:1: ( () )
            {
            // InternalRest.g:483:1: ( () )
            // InternalRest.g:484:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalRest.g:485:2: ()
            // InternalRest.g:485:3: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalRest.g:493:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:497:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalRest.g:498:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalRest.g:505:1: rule__Model__Group__1__Impl : ( 'Request' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:509:1: ( ( 'Request' ) )
            // InternalRest.g:510:1: ( 'Request' )
            {
            // InternalRest.g:510:1: ( 'Request' )
            // InternalRest.g:511:2: 'Request'
            {
             before(grammarAccess.getModelAccess().getRequestKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRequestKeyword_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalRest.g:520:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:524:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalRest.g:525:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalRest.g:532:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:536:1: ( ( '{' ) )
            // InternalRest.g:537:1: ( '{' )
            {
            // InternalRest.g:537:1: ( '{' )
            // InternalRest.g:538:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalRest.g:547:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:551:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalRest.g:552:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalRest.g:559:1: rule__Model__Group__3__Impl : ( ( rule__Model__BodyAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:563:1: ( ( ( rule__Model__BodyAssignment_3 )* ) )
            // InternalRest.g:564:1: ( ( rule__Model__BodyAssignment_3 )* )
            {
            // InternalRest.g:564:1: ( ( rule__Model__BodyAssignment_3 )* )
            // InternalRest.g:565:2: ( rule__Model__BodyAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getBodyAssignment_3()); 
            // InternalRest.g:566:2: ( rule__Model__BodyAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRest.g:566:3: rule__Model__BodyAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__BodyAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getBodyAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalRest.g:574:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:578:1: ( rule__Model__Group__4__Impl )
            // InternalRest.g:579:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalRest.g:585:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:589:1: ( ( '}' ) )
            // InternalRest.g:590:1: ( '}' )
            {
            // InternalRest.g:590:1: ( '}' )
            // InternalRest.g:591:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Elem__Group__0"
    // InternalRest.g:601:1: rule__Elem__Group__0 : rule__Elem__Group__0__Impl rule__Elem__Group__1 ;
    public final void rule__Elem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:605:1: ( rule__Elem__Group__0__Impl rule__Elem__Group__1 )
            // InternalRest.g:606:2: rule__Elem__Group__0__Impl rule__Elem__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Elem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Elem__Group__1();

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
    // $ANTLR end "rule__Elem__Group__0"


    // $ANTLR start "rule__Elem__Group__0__Impl"
    // InternalRest.g:613:1: rule__Elem__Group__0__Impl : ( ( rule__Elem__ClassNameAssignment_0 ) ) ;
    public final void rule__Elem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:617:1: ( ( ( rule__Elem__ClassNameAssignment_0 ) ) )
            // InternalRest.g:618:1: ( ( rule__Elem__ClassNameAssignment_0 ) )
            {
            // InternalRest.g:618:1: ( ( rule__Elem__ClassNameAssignment_0 ) )
            // InternalRest.g:619:2: ( rule__Elem__ClassNameAssignment_0 )
            {
             before(grammarAccess.getElemAccess().getClassNameAssignment_0()); 
            // InternalRest.g:620:2: ( rule__Elem__ClassNameAssignment_0 )
            // InternalRest.g:620:3: rule__Elem__ClassNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Elem__ClassNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElemAccess().getClassNameAssignment_0()); 

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
    // $ANTLR end "rule__Elem__Group__0__Impl"


    // $ANTLR start "rule__Elem__Group__1"
    // InternalRest.g:628:1: rule__Elem__Group__1 : rule__Elem__Group__1__Impl rule__Elem__Group__2 ;
    public final void rule__Elem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:632:1: ( rule__Elem__Group__1__Impl rule__Elem__Group__2 )
            // InternalRest.g:633:2: rule__Elem__Group__1__Impl rule__Elem__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Elem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Elem__Group__2();

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
    // $ANTLR end "rule__Elem__Group__1"


    // $ANTLR start "rule__Elem__Group__1__Impl"
    // InternalRest.g:640:1: rule__Elem__Group__1__Impl : ( '{' ) ;
    public final void rule__Elem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:644:1: ( ( '{' ) )
            // InternalRest.g:645:1: ( '{' )
            {
            // InternalRest.g:645:1: ( '{' )
            // InternalRest.g:646:2: '{'
            {
             before(grammarAccess.getElemAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getElemAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Elem__Group__1__Impl"


    // $ANTLR start "rule__Elem__Group__2"
    // InternalRest.g:655:1: rule__Elem__Group__2 : rule__Elem__Group__2__Impl rule__Elem__Group__3 ;
    public final void rule__Elem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:659:1: ( rule__Elem__Group__2__Impl rule__Elem__Group__3 )
            // InternalRest.g:660:2: rule__Elem__Group__2__Impl rule__Elem__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Elem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Elem__Group__3();

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
    // $ANTLR end "rule__Elem__Group__2"


    // $ANTLR start "rule__Elem__Group__2__Impl"
    // InternalRest.g:667:1: rule__Elem__Group__2__Impl : ( ( rule__Elem__Group_2__0 )? ) ;
    public final void rule__Elem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:671:1: ( ( ( rule__Elem__Group_2__0 )? ) )
            // InternalRest.g:672:1: ( ( rule__Elem__Group_2__0 )? )
            {
            // InternalRest.g:672:1: ( ( rule__Elem__Group_2__0 )? )
            // InternalRest.g:673:2: ( rule__Elem__Group_2__0 )?
            {
             before(grammarAccess.getElemAccess().getGroup_2()); 
            // InternalRest.g:674:2: ( rule__Elem__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRest.g:674:3: rule__Elem__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Elem__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElemAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Elem__Group__2__Impl"


    // $ANTLR start "rule__Elem__Group__3"
    // InternalRest.g:682:1: rule__Elem__Group__3 : rule__Elem__Group__3__Impl rule__Elem__Group__4 ;
    public final void rule__Elem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:686:1: ( rule__Elem__Group__3__Impl rule__Elem__Group__4 )
            // InternalRest.g:687:2: rule__Elem__Group__3__Impl rule__Elem__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Elem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Elem__Group__4();

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
    // $ANTLR end "rule__Elem__Group__3"


    // $ANTLR start "rule__Elem__Group__3__Impl"
    // InternalRest.g:694:1: rule__Elem__Group__3__Impl : ( ( rule__Elem__AtribAssignment_3 )* ) ;
    public final void rule__Elem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:698:1: ( ( ( rule__Elem__AtribAssignment_3 )* ) )
            // InternalRest.g:699:1: ( ( rule__Elem__AtribAssignment_3 )* )
            {
            // InternalRest.g:699:1: ( ( rule__Elem__AtribAssignment_3 )* )
            // InternalRest.g:700:2: ( rule__Elem__AtribAssignment_3 )*
            {
             before(grammarAccess.getElemAccess().getAtribAssignment_3()); 
            // InternalRest.g:701:2: ( rule__Elem__AtribAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRest.g:701:3: rule__Elem__AtribAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Elem__AtribAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getElemAccess().getAtribAssignment_3()); 

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
    // $ANTLR end "rule__Elem__Group__3__Impl"


    // $ANTLR start "rule__Elem__Group__4"
    // InternalRest.g:709:1: rule__Elem__Group__4 : rule__Elem__Group__4__Impl ;
    public final void rule__Elem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:713:1: ( rule__Elem__Group__4__Impl )
            // InternalRest.g:714:2: rule__Elem__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Elem__Group__4__Impl();

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
    // $ANTLR end "rule__Elem__Group__4"


    // $ANTLR start "rule__Elem__Group__4__Impl"
    // InternalRest.g:720:1: rule__Elem__Group__4__Impl : ( '}' ) ;
    public final void rule__Elem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:724:1: ( ( '}' ) )
            // InternalRest.g:725:1: ( '}' )
            {
            // InternalRest.g:725:1: ( '}' )
            // InternalRest.g:726:2: '}'
            {
             before(grammarAccess.getElemAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getElemAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Elem__Group__4__Impl"


    // $ANTLR start "rule__Elem__Group_2__0"
    // InternalRest.g:736:1: rule__Elem__Group_2__0 : rule__Elem__Group_2__0__Impl rule__Elem__Group_2__1 ;
    public final void rule__Elem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:740:1: ( rule__Elem__Group_2__0__Impl rule__Elem__Group_2__1 )
            // InternalRest.g:741:2: rule__Elem__Group_2__0__Impl rule__Elem__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Elem__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Elem__Group_2__1();

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
    // $ANTLR end "rule__Elem__Group_2__0"


    // $ANTLR start "rule__Elem__Group_2__0__Impl"
    // InternalRest.g:748:1: rule__Elem__Group_2__0__Impl : ( 'package' ) ;
    public final void rule__Elem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:752:1: ( ( 'package' ) )
            // InternalRest.g:753:1: ( 'package' )
            {
            // InternalRest.g:753:1: ( 'package' )
            // InternalRest.g:754:2: 'package'
            {
             before(grammarAccess.getElemAccess().getPackageKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getElemAccess().getPackageKeyword_2_0()); 

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
    // $ANTLR end "rule__Elem__Group_2__0__Impl"


    // $ANTLR start "rule__Elem__Group_2__1"
    // InternalRest.g:763:1: rule__Elem__Group_2__1 : rule__Elem__Group_2__1__Impl ;
    public final void rule__Elem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:767:1: ( rule__Elem__Group_2__1__Impl )
            // InternalRest.g:768:2: rule__Elem__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Elem__Group_2__1__Impl();

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
    // $ANTLR end "rule__Elem__Group_2__1"


    // $ANTLR start "rule__Elem__Group_2__1__Impl"
    // InternalRest.g:774:1: rule__Elem__Group_2__1__Impl : ( ( rule__Elem__PackageAssignment_2_1 ) ) ;
    public final void rule__Elem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:778:1: ( ( ( rule__Elem__PackageAssignment_2_1 ) ) )
            // InternalRest.g:779:1: ( ( rule__Elem__PackageAssignment_2_1 ) )
            {
            // InternalRest.g:779:1: ( ( rule__Elem__PackageAssignment_2_1 ) )
            // InternalRest.g:780:2: ( rule__Elem__PackageAssignment_2_1 )
            {
             before(grammarAccess.getElemAccess().getPackageAssignment_2_1()); 
            // InternalRest.g:781:2: ( rule__Elem__PackageAssignment_2_1 )
            // InternalRest.g:781:3: rule__Elem__PackageAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Elem__PackageAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getElemAccess().getPackageAssignment_2_1()); 

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
    // $ANTLR end "rule__Elem__Group_2__1__Impl"


    // $ANTLR start "rule__Atrib__Group__0"
    // InternalRest.g:790:1: rule__Atrib__Group__0 : rule__Atrib__Group__0__Impl rule__Atrib__Group__1 ;
    public final void rule__Atrib__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:794:1: ( rule__Atrib__Group__0__Impl rule__Atrib__Group__1 )
            // InternalRest.g:795:2: rule__Atrib__Group__0__Impl rule__Atrib__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Atrib__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group__1();

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
    // $ANTLR end "rule__Atrib__Group__0"


    // $ANTLR start "rule__Atrib__Group__0__Impl"
    // InternalRest.g:802:1: rule__Atrib__Group__0__Impl : ( ( rule__Atrib__AtribNameAssignment_0 ) ) ;
    public final void rule__Atrib__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:806:1: ( ( ( rule__Atrib__AtribNameAssignment_0 ) ) )
            // InternalRest.g:807:1: ( ( rule__Atrib__AtribNameAssignment_0 ) )
            {
            // InternalRest.g:807:1: ( ( rule__Atrib__AtribNameAssignment_0 ) )
            // InternalRest.g:808:2: ( rule__Atrib__AtribNameAssignment_0 )
            {
             before(grammarAccess.getAtribAccess().getAtribNameAssignment_0()); 
            // InternalRest.g:809:2: ( rule__Atrib__AtribNameAssignment_0 )
            // InternalRest.g:809:3: rule__Atrib__AtribNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__AtribNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getAtribNameAssignment_0()); 

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
    // $ANTLR end "rule__Atrib__Group__0__Impl"


    // $ANTLR start "rule__Atrib__Group__1"
    // InternalRest.g:817:1: rule__Atrib__Group__1 : rule__Atrib__Group__1__Impl rule__Atrib__Group__2 ;
    public final void rule__Atrib__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:821:1: ( rule__Atrib__Group__1__Impl rule__Atrib__Group__2 )
            // InternalRest.g:822:2: rule__Atrib__Group__1__Impl rule__Atrib__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Atrib__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group__2();

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
    // $ANTLR end "rule__Atrib__Group__1"


    // $ANTLR start "rule__Atrib__Group__1__Impl"
    // InternalRest.g:829:1: rule__Atrib__Group__1__Impl : ( ':' ) ;
    public final void rule__Atrib__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:833:1: ( ( ':' ) )
            // InternalRest.g:834:1: ( ':' )
            {
            // InternalRest.g:834:1: ( ':' )
            // InternalRest.g:835:2: ':'
            {
             before(grammarAccess.getAtribAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Atrib__Group__1__Impl"


    // $ANTLR start "rule__Atrib__Group__2"
    // InternalRest.g:844:1: rule__Atrib__Group__2 : rule__Atrib__Group__2__Impl rule__Atrib__Group__3 ;
    public final void rule__Atrib__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:848:1: ( rule__Atrib__Group__2__Impl rule__Atrib__Group__3 )
            // InternalRest.g:849:2: rule__Atrib__Group__2__Impl rule__Atrib__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Atrib__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group__3();

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
    // $ANTLR end "rule__Atrib__Group__2"


    // $ANTLR start "rule__Atrib__Group__2__Impl"
    // InternalRest.g:856:1: rule__Atrib__Group__2__Impl : ( ( rule__Atrib__TipoAssignment_2 ) ) ;
    public final void rule__Atrib__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:860:1: ( ( ( rule__Atrib__TipoAssignment_2 ) ) )
            // InternalRest.g:861:1: ( ( rule__Atrib__TipoAssignment_2 ) )
            {
            // InternalRest.g:861:1: ( ( rule__Atrib__TipoAssignment_2 ) )
            // InternalRest.g:862:2: ( rule__Atrib__TipoAssignment_2 )
            {
             before(grammarAccess.getAtribAccess().getTipoAssignment_2()); 
            // InternalRest.g:863:2: ( rule__Atrib__TipoAssignment_2 )
            // InternalRest.g:863:3: rule__Atrib__TipoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__TipoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getTipoAssignment_2()); 

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
    // $ANTLR end "rule__Atrib__Group__2__Impl"


    // $ANTLR start "rule__Atrib__Group__3"
    // InternalRest.g:871:1: rule__Atrib__Group__3 : rule__Atrib__Group__3__Impl ;
    public final void rule__Atrib__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:875:1: ( rule__Atrib__Group__3__Impl )
            // InternalRest.g:876:2: rule__Atrib__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group__3__Impl();

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
    // $ANTLR end "rule__Atrib__Group__3"


    // $ANTLR start "rule__Atrib__Group__3__Impl"
    // InternalRest.g:882:1: rule__Atrib__Group__3__Impl : ( ( rule__Atrib__Group_3__0 )? ) ;
    public final void rule__Atrib__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:886:1: ( ( ( rule__Atrib__Group_3__0 )? ) )
            // InternalRest.g:887:1: ( ( rule__Atrib__Group_3__0 )? )
            {
            // InternalRest.g:887:1: ( ( rule__Atrib__Group_3__0 )? )
            // InternalRest.g:888:2: ( rule__Atrib__Group_3__0 )?
            {
             before(grammarAccess.getAtribAccess().getGroup_3()); 
            // InternalRest.g:889:2: ( rule__Atrib__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRest.g:889:3: rule__Atrib__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atrib__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtribAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Atrib__Group__3__Impl"


    // $ANTLR start "rule__Atrib__Group_3__0"
    // InternalRest.g:898:1: rule__Atrib__Group_3__0 : rule__Atrib__Group_3__0__Impl rule__Atrib__Group_3__1 ;
    public final void rule__Atrib__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:902:1: ( rule__Atrib__Group_3__0__Impl rule__Atrib__Group_3__1 )
            // InternalRest.g:903:2: rule__Atrib__Group_3__0__Impl rule__Atrib__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Atrib__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_3__1();

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
    // $ANTLR end "rule__Atrib__Group_3__0"


    // $ANTLR start "rule__Atrib__Group_3__0__Impl"
    // InternalRest.g:910:1: rule__Atrib__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Atrib__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:914:1: ( ( ':' ) )
            // InternalRest.g:915:1: ( ':' )
            {
            // InternalRest.g:915:1: ( ':' )
            // InternalRest.g:916:2: ':'
            {
             before(grammarAccess.getAtribAccess().getColonKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getColonKeyword_3_0()); 

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
    // $ANTLR end "rule__Atrib__Group_3__0__Impl"


    // $ANTLR start "rule__Atrib__Group_3__1"
    // InternalRest.g:925:1: rule__Atrib__Group_3__1 : rule__Atrib__Group_3__1__Impl ;
    public final void rule__Atrib__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:929:1: ( rule__Atrib__Group_3__1__Impl )
            // InternalRest.g:930:2: rule__Atrib__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group_3__1__Impl();

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
    // $ANTLR end "rule__Atrib__Group_3__1"


    // $ANTLR start "rule__Atrib__Group_3__1__Impl"
    // InternalRest.g:936:1: rule__Atrib__Group_3__1__Impl : ( ( rule__Atrib__ValueAssignment_3_1 ) ) ;
    public final void rule__Atrib__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:940:1: ( ( ( rule__Atrib__ValueAssignment_3_1 ) ) )
            // InternalRest.g:941:1: ( ( rule__Atrib__ValueAssignment_3_1 ) )
            {
            // InternalRest.g:941:1: ( ( rule__Atrib__ValueAssignment_3_1 ) )
            // InternalRest.g:942:2: ( rule__Atrib__ValueAssignment_3_1 )
            {
             before(grammarAccess.getAtribAccess().getValueAssignment_3_1()); 
            // InternalRest.g:943:2: ( rule__Atrib__ValueAssignment_3_1 )
            // InternalRest.g:943:3: rule__Atrib__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__Atrib__Group_3__1__Impl"


    // $ANTLR start "rule__GlobAtrib__Group__0"
    // InternalRest.g:952:1: rule__GlobAtrib__Group__0 : rule__GlobAtrib__Group__0__Impl rule__GlobAtrib__Group__1 ;
    public final void rule__GlobAtrib__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:956:1: ( rule__GlobAtrib__Group__0__Impl rule__GlobAtrib__Group__1 )
            // InternalRest.g:957:2: rule__GlobAtrib__Group__0__Impl rule__GlobAtrib__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GlobAtrib__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobAtrib__Group__1();

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
    // $ANTLR end "rule__GlobAtrib__Group__0"


    // $ANTLR start "rule__GlobAtrib__Group__0__Impl"
    // InternalRest.g:964:1: rule__GlobAtrib__Group__0__Impl : ( ( rule__GlobAtrib__AtribNameAssignment_0 ) ) ;
    public final void rule__GlobAtrib__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:968:1: ( ( ( rule__GlobAtrib__AtribNameAssignment_0 ) ) )
            // InternalRest.g:969:1: ( ( rule__GlobAtrib__AtribNameAssignment_0 ) )
            {
            // InternalRest.g:969:1: ( ( rule__GlobAtrib__AtribNameAssignment_0 ) )
            // InternalRest.g:970:2: ( rule__GlobAtrib__AtribNameAssignment_0 )
            {
             before(grammarAccess.getGlobAtribAccess().getAtribNameAssignment_0()); 
            // InternalRest.g:971:2: ( rule__GlobAtrib__AtribNameAssignment_0 )
            // InternalRest.g:971:3: rule__GlobAtrib__AtribNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GlobAtrib__AtribNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGlobAtribAccess().getAtribNameAssignment_0()); 

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
    // $ANTLR end "rule__GlobAtrib__Group__0__Impl"


    // $ANTLR start "rule__GlobAtrib__Group__1"
    // InternalRest.g:979:1: rule__GlobAtrib__Group__1 : rule__GlobAtrib__Group__1__Impl rule__GlobAtrib__Group__2 ;
    public final void rule__GlobAtrib__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:983:1: ( rule__GlobAtrib__Group__1__Impl rule__GlobAtrib__Group__2 )
            // InternalRest.g:984:2: rule__GlobAtrib__Group__1__Impl rule__GlobAtrib__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GlobAtrib__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobAtrib__Group__2();

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
    // $ANTLR end "rule__GlobAtrib__Group__1"


    // $ANTLR start "rule__GlobAtrib__Group__1__Impl"
    // InternalRest.g:991:1: rule__GlobAtrib__Group__1__Impl : ( ':' ) ;
    public final void rule__GlobAtrib__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:995:1: ( ( ':' ) )
            // InternalRest.g:996:1: ( ':' )
            {
            // InternalRest.g:996:1: ( ':' )
            // InternalRest.g:997:2: ':'
            {
             before(grammarAccess.getGlobAtribAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGlobAtribAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__GlobAtrib__Group__1__Impl"


    // $ANTLR start "rule__GlobAtrib__Group__2"
    // InternalRest.g:1006:1: rule__GlobAtrib__Group__2 : rule__GlobAtrib__Group__2__Impl rule__GlobAtrib__Group__3 ;
    public final void rule__GlobAtrib__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1010:1: ( rule__GlobAtrib__Group__2__Impl rule__GlobAtrib__Group__3 )
            // InternalRest.g:1011:2: rule__GlobAtrib__Group__2__Impl rule__GlobAtrib__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__GlobAtrib__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobAtrib__Group__3();

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
    // $ANTLR end "rule__GlobAtrib__Group__2"


    // $ANTLR start "rule__GlobAtrib__Group__2__Impl"
    // InternalRest.g:1018:1: rule__GlobAtrib__Group__2__Impl : ( ( rule__GlobAtrib__TipoAssignment_2 ) ) ;
    public final void rule__GlobAtrib__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1022:1: ( ( ( rule__GlobAtrib__TipoAssignment_2 ) ) )
            // InternalRest.g:1023:1: ( ( rule__GlobAtrib__TipoAssignment_2 ) )
            {
            // InternalRest.g:1023:1: ( ( rule__GlobAtrib__TipoAssignment_2 ) )
            // InternalRest.g:1024:2: ( rule__GlobAtrib__TipoAssignment_2 )
            {
             before(grammarAccess.getGlobAtribAccess().getTipoAssignment_2()); 
            // InternalRest.g:1025:2: ( rule__GlobAtrib__TipoAssignment_2 )
            // InternalRest.g:1025:3: rule__GlobAtrib__TipoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GlobAtrib__TipoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobAtribAccess().getTipoAssignment_2()); 

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
    // $ANTLR end "rule__GlobAtrib__Group__2__Impl"


    // $ANTLR start "rule__GlobAtrib__Group__3"
    // InternalRest.g:1033:1: rule__GlobAtrib__Group__3 : rule__GlobAtrib__Group__3__Impl ;
    public final void rule__GlobAtrib__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1037:1: ( rule__GlobAtrib__Group__3__Impl )
            // InternalRest.g:1038:2: rule__GlobAtrib__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobAtrib__Group__3__Impl();

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
    // $ANTLR end "rule__GlobAtrib__Group__3"


    // $ANTLR start "rule__GlobAtrib__Group__3__Impl"
    // InternalRest.g:1044:1: rule__GlobAtrib__Group__3__Impl : ( ( rule__GlobAtrib__Group_3__0 ) ) ;
    public final void rule__GlobAtrib__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1048:1: ( ( ( rule__GlobAtrib__Group_3__0 ) ) )
            // InternalRest.g:1049:1: ( ( rule__GlobAtrib__Group_3__0 ) )
            {
            // InternalRest.g:1049:1: ( ( rule__GlobAtrib__Group_3__0 ) )
            // InternalRest.g:1050:2: ( rule__GlobAtrib__Group_3__0 )
            {
             before(grammarAccess.getGlobAtribAccess().getGroup_3()); 
            // InternalRest.g:1051:2: ( rule__GlobAtrib__Group_3__0 )
            // InternalRest.g:1051:3: rule__GlobAtrib__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobAtrib__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobAtribAccess().getGroup_3()); 

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
    // $ANTLR end "rule__GlobAtrib__Group__3__Impl"


    // $ANTLR start "rule__GlobAtrib__Group_3__0"
    // InternalRest.g:1060:1: rule__GlobAtrib__Group_3__0 : rule__GlobAtrib__Group_3__0__Impl rule__GlobAtrib__Group_3__1 ;
    public final void rule__GlobAtrib__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1064:1: ( rule__GlobAtrib__Group_3__0__Impl rule__GlobAtrib__Group_3__1 )
            // InternalRest.g:1065:2: rule__GlobAtrib__Group_3__0__Impl rule__GlobAtrib__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__GlobAtrib__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobAtrib__Group_3__1();

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
    // $ANTLR end "rule__GlobAtrib__Group_3__0"


    // $ANTLR start "rule__GlobAtrib__Group_3__0__Impl"
    // InternalRest.g:1072:1: rule__GlobAtrib__Group_3__0__Impl : ( ':' ) ;
    public final void rule__GlobAtrib__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1076:1: ( ( ':' ) )
            // InternalRest.g:1077:1: ( ':' )
            {
            // InternalRest.g:1077:1: ( ':' )
            // InternalRest.g:1078:2: ':'
            {
             before(grammarAccess.getGlobAtribAccess().getColonKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGlobAtribAccess().getColonKeyword_3_0()); 

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
    // $ANTLR end "rule__GlobAtrib__Group_3__0__Impl"


    // $ANTLR start "rule__GlobAtrib__Group_3__1"
    // InternalRest.g:1087:1: rule__GlobAtrib__Group_3__1 : rule__GlobAtrib__Group_3__1__Impl ;
    public final void rule__GlobAtrib__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1091:1: ( rule__GlobAtrib__Group_3__1__Impl )
            // InternalRest.g:1092:2: rule__GlobAtrib__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobAtrib__Group_3__1__Impl();

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
    // $ANTLR end "rule__GlobAtrib__Group_3__1"


    // $ANTLR start "rule__GlobAtrib__Group_3__1__Impl"
    // InternalRest.g:1098:1: rule__GlobAtrib__Group_3__1__Impl : ( ( rule__GlobAtrib__ValueAssignment_3_1 ) ) ;
    public final void rule__GlobAtrib__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1102:1: ( ( ( rule__GlobAtrib__ValueAssignment_3_1 ) ) )
            // InternalRest.g:1103:1: ( ( rule__GlobAtrib__ValueAssignment_3_1 ) )
            {
            // InternalRest.g:1103:1: ( ( rule__GlobAtrib__ValueAssignment_3_1 ) )
            // InternalRest.g:1104:2: ( rule__GlobAtrib__ValueAssignment_3_1 )
            {
             before(grammarAccess.getGlobAtribAccess().getValueAssignment_3_1()); 
            // InternalRest.g:1105:2: ( rule__GlobAtrib__ValueAssignment_3_1 )
            // InternalRest.g:1105:3: rule__GlobAtrib__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobAtrib__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobAtribAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__GlobAtrib__Group_3__1__Impl"


    // $ANTLR start "rule__Values__Group_0__0"
    // InternalRest.g:1114:1: rule__Values__Group_0__0 : rule__Values__Group_0__0__Impl rule__Values__Group_0__1 ;
    public final void rule__Values__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1118:1: ( rule__Values__Group_0__0__Impl rule__Values__Group_0__1 )
            // InternalRest.g:1119:2: rule__Values__Group_0__0__Impl rule__Values__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Values__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group_0__1();

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
    // $ANTLR end "rule__Values__Group_0__0"


    // $ANTLR start "rule__Values__Group_0__0__Impl"
    // InternalRest.g:1126:1: rule__Values__Group_0__0__Impl : ( () ) ;
    public final void rule__Values__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1130:1: ( ( () ) )
            // InternalRest.g:1131:1: ( () )
            {
            // InternalRest.g:1131:1: ( () )
            // InternalRest.g:1132:2: ()
            {
             before(grammarAccess.getValuesAccess().getValuesAction_0_0()); 
            // InternalRest.g:1133:2: ()
            // InternalRest.g:1133:3: 
            {
            }

             after(grammarAccess.getValuesAccess().getValuesAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_0__0__Impl"


    // $ANTLR start "rule__Values__Group_0__1"
    // InternalRest.g:1141:1: rule__Values__Group_0__1 : rule__Values__Group_0__1__Impl ;
    public final void rule__Values__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1145:1: ( rule__Values__Group_0__1__Impl )
            // InternalRest.g:1146:2: rule__Values__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group_0__1__Impl();

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
    // $ANTLR end "rule__Values__Group_0__1"


    // $ANTLR start "rule__Values__Group_0__1__Impl"
    // InternalRest.g:1152:1: rule__Values__Group_0__1__Impl : ( ( rule__Values__IdAssignment_0_1 ) ) ;
    public final void rule__Values__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1156:1: ( ( ( rule__Values__IdAssignment_0_1 ) ) )
            // InternalRest.g:1157:1: ( ( rule__Values__IdAssignment_0_1 ) )
            {
            // InternalRest.g:1157:1: ( ( rule__Values__IdAssignment_0_1 ) )
            // InternalRest.g:1158:2: ( rule__Values__IdAssignment_0_1 )
            {
             before(grammarAccess.getValuesAccess().getIdAssignment_0_1()); 
            // InternalRest.g:1159:2: ( rule__Values__IdAssignment_0_1 )
            // InternalRest.g:1159:3: rule__Values__IdAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Values__IdAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getIdAssignment_0_1()); 

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
    // $ANTLR end "rule__Values__Group_0__1__Impl"


    // $ANTLR start "rule__Values__Group_1__0"
    // InternalRest.g:1168:1: rule__Values__Group_1__0 : rule__Values__Group_1__0__Impl rule__Values__Group_1__1 ;
    public final void rule__Values__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1172:1: ( rule__Values__Group_1__0__Impl rule__Values__Group_1__1 )
            // InternalRest.g:1173:2: rule__Values__Group_1__0__Impl rule__Values__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Values__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group_1__1();

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
    // $ANTLR end "rule__Values__Group_1__0"


    // $ANTLR start "rule__Values__Group_1__0__Impl"
    // InternalRest.g:1180:1: rule__Values__Group_1__0__Impl : ( () ) ;
    public final void rule__Values__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1184:1: ( ( () ) )
            // InternalRest.g:1185:1: ( () )
            {
            // InternalRest.g:1185:1: ( () )
            // InternalRest.g:1186:2: ()
            {
             before(grammarAccess.getValuesAccess().getValuesAction_1_0()); 
            // InternalRest.g:1187:2: ()
            // InternalRest.g:1187:3: 
            {
            }

             after(grammarAccess.getValuesAccess().getValuesAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1__0__Impl"


    // $ANTLR start "rule__Values__Group_1__1"
    // InternalRest.g:1195:1: rule__Values__Group_1__1 : rule__Values__Group_1__1__Impl ;
    public final void rule__Values__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1199:1: ( rule__Values__Group_1__1__Impl )
            // InternalRest.g:1200:2: rule__Values__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group_1__1__Impl();

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
    // $ANTLR end "rule__Values__Group_1__1"


    // $ANTLR start "rule__Values__Group_1__1__Impl"
    // InternalRest.g:1206:1: rule__Values__Group_1__1__Impl : ( ( rule__Values__IdBAssignment_1_1 ) ) ;
    public final void rule__Values__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1210:1: ( ( ( rule__Values__IdBAssignment_1_1 ) ) )
            // InternalRest.g:1211:1: ( ( rule__Values__IdBAssignment_1_1 ) )
            {
            // InternalRest.g:1211:1: ( ( rule__Values__IdBAssignment_1_1 ) )
            // InternalRest.g:1212:2: ( rule__Values__IdBAssignment_1_1 )
            {
             before(grammarAccess.getValuesAccess().getIdBAssignment_1_1()); 
            // InternalRest.g:1213:2: ( rule__Values__IdBAssignment_1_1 )
            // InternalRest.g:1213:3: rule__Values__IdBAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Values__IdBAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getIdBAssignment_1_1()); 

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
    // $ANTLR end "rule__Values__Group_1__1__Impl"


    // $ANTLR start "rule__Values__Group_2__0"
    // InternalRest.g:1222:1: rule__Values__Group_2__0 : rule__Values__Group_2__0__Impl rule__Values__Group_2__1 ;
    public final void rule__Values__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1226:1: ( rule__Values__Group_2__0__Impl rule__Values__Group_2__1 )
            // InternalRest.g:1227:2: rule__Values__Group_2__0__Impl rule__Values__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Values__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group_2__1();

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
    // $ANTLR end "rule__Values__Group_2__0"


    // $ANTLR start "rule__Values__Group_2__0__Impl"
    // InternalRest.g:1234:1: rule__Values__Group_2__0__Impl : ( () ) ;
    public final void rule__Values__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1238:1: ( ( () ) )
            // InternalRest.g:1239:1: ( () )
            {
            // InternalRest.g:1239:1: ( () )
            // InternalRest.g:1240:2: ()
            {
             before(grammarAccess.getValuesAccess().getValuesAction_2_0()); 
            // InternalRest.g:1241:2: ()
            // InternalRest.g:1241:3: 
            {
            }

             after(grammarAccess.getValuesAccess().getValuesAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_2__0__Impl"


    // $ANTLR start "rule__Values__Group_2__1"
    // InternalRest.g:1249:1: rule__Values__Group_2__1 : rule__Values__Group_2__1__Impl ;
    public final void rule__Values__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1253:1: ( rule__Values__Group_2__1__Impl )
            // InternalRest.g:1254:2: rule__Values__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group_2__1__Impl();

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
    // $ANTLR end "rule__Values__Group_2__1"


    // $ANTLR start "rule__Values__Group_2__1__Impl"
    // InternalRest.g:1260:1: rule__Values__Group_2__1__Impl : ( ( rule__Values__IdFAssignment_2_1 ) ) ;
    public final void rule__Values__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1264:1: ( ( ( rule__Values__IdFAssignment_2_1 ) ) )
            // InternalRest.g:1265:1: ( ( rule__Values__IdFAssignment_2_1 ) )
            {
            // InternalRest.g:1265:1: ( ( rule__Values__IdFAssignment_2_1 ) )
            // InternalRest.g:1266:2: ( rule__Values__IdFAssignment_2_1 )
            {
             before(grammarAccess.getValuesAccess().getIdFAssignment_2_1()); 
            // InternalRest.g:1267:2: ( rule__Values__IdFAssignment_2_1 )
            // InternalRest.g:1267:3: rule__Values__IdFAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Values__IdFAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getIdFAssignment_2_1()); 

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
    // $ANTLR end "rule__Values__Group_2__1__Impl"


    // $ANTLR start "rule__Values__Group_3__0"
    // InternalRest.g:1276:1: rule__Values__Group_3__0 : rule__Values__Group_3__0__Impl rule__Values__Group_3__1 ;
    public final void rule__Values__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1280:1: ( rule__Values__Group_3__0__Impl rule__Values__Group_3__1 )
            // InternalRest.g:1281:2: rule__Values__Group_3__0__Impl rule__Values__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Values__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group_3__1();

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
    // $ANTLR end "rule__Values__Group_3__0"


    // $ANTLR start "rule__Values__Group_3__0__Impl"
    // InternalRest.g:1288:1: rule__Values__Group_3__0__Impl : ( () ) ;
    public final void rule__Values__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1292:1: ( ( () ) )
            // InternalRest.g:1293:1: ( () )
            {
            // InternalRest.g:1293:1: ( () )
            // InternalRest.g:1294:2: ()
            {
             before(grammarAccess.getValuesAccess().getValuesAction_3_0()); 
            // InternalRest.g:1295:2: ()
            // InternalRest.g:1295:3: 
            {
            }

             after(grammarAccess.getValuesAccess().getValuesAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_3__0__Impl"


    // $ANTLR start "rule__Values__Group_3__1"
    // InternalRest.g:1303:1: rule__Values__Group_3__1 : rule__Values__Group_3__1__Impl ;
    public final void rule__Values__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1307:1: ( rule__Values__Group_3__1__Impl )
            // InternalRest.g:1308:2: rule__Values__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group_3__1__Impl();

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
    // $ANTLR end "rule__Values__Group_3__1"


    // $ANTLR start "rule__Values__Group_3__1__Impl"
    // InternalRest.g:1314:1: rule__Values__Group_3__1__Impl : ( ( rule__Values__IdSAssignment_3_1 ) ) ;
    public final void rule__Values__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1318:1: ( ( ( rule__Values__IdSAssignment_3_1 ) ) )
            // InternalRest.g:1319:1: ( ( rule__Values__IdSAssignment_3_1 ) )
            {
            // InternalRest.g:1319:1: ( ( rule__Values__IdSAssignment_3_1 ) )
            // InternalRest.g:1320:2: ( rule__Values__IdSAssignment_3_1 )
            {
             before(grammarAccess.getValuesAccess().getIdSAssignment_3_1()); 
            // InternalRest.g:1321:2: ( rule__Values__IdSAssignment_3_1 )
            // InternalRest.g:1321:3: rule__Values__IdSAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Values__IdSAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getIdSAssignment_3_1()); 

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
    // $ANTLR end "rule__Values__Group_3__1__Impl"


    // $ANTLR start "rule__Values__Group_4__0"
    // InternalRest.g:1330:1: rule__Values__Group_4__0 : rule__Values__Group_4__0__Impl rule__Values__Group_4__1 ;
    public final void rule__Values__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1334:1: ( rule__Values__Group_4__0__Impl rule__Values__Group_4__1 )
            // InternalRest.g:1335:2: rule__Values__Group_4__0__Impl rule__Values__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Values__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group_4__1();

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
    // $ANTLR end "rule__Values__Group_4__0"


    // $ANTLR start "rule__Values__Group_4__0__Impl"
    // InternalRest.g:1342:1: rule__Values__Group_4__0__Impl : ( () ) ;
    public final void rule__Values__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1346:1: ( ( () ) )
            // InternalRest.g:1347:1: ( () )
            {
            // InternalRest.g:1347:1: ( () )
            // InternalRest.g:1348:2: ()
            {
             before(grammarAccess.getValuesAccess().getValuesAction_4_0()); 
            // InternalRest.g:1349:2: ()
            // InternalRest.g:1349:3: 
            {
            }

             after(grammarAccess.getValuesAccess().getValuesAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_4__0__Impl"


    // $ANTLR start "rule__Values__Group_4__1"
    // InternalRest.g:1357:1: rule__Values__Group_4__1 : rule__Values__Group_4__1__Impl ;
    public final void rule__Values__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1361:1: ( rule__Values__Group_4__1__Impl )
            // InternalRest.g:1362:2: rule__Values__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group_4__1__Impl();

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
    // $ANTLR end "rule__Values__Group_4__1"


    // $ANTLR start "rule__Values__Group_4__1__Impl"
    // InternalRest.g:1368:1: rule__Values__Group_4__1__Impl : ( ( rule__Values__IdCAssignment_4_1 ) ) ;
    public final void rule__Values__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1372:1: ( ( ( rule__Values__IdCAssignment_4_1 ) ) )
            // InternalRest.g:1373:1: ( ( rule__Values__IdCAssignment_4_1 ) )
            {
            // InternalRest.g:1373:1: ( ( rule__Values__IdCAssignment_4_1 ) )
            // InternalRest.g:1374:2: ( rule__Values__IdCAssignment_4_1 )
            {
             before(grammarAccess.getValuesAccess().getIdCAssignment_4_1()); 
            // InternalRest.g:1375:2: ( rule__Values__IdCAssignment_4_1 )
            // InternalRest.g:1375:3: rule__Values__IdCAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Values__IdCAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getIdCAssignment_4_1()); 

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
    // $ANTLR end "rule__Values__Group_4__1__Impl"


    // $ANTLR start "rule__Values__Group_5__0"
    // InternalRest.g:1384:1: rule__Values__Group_5__0 : rule__Values__Group_5__0__Impl rule__Values__Group_5__1 ;
    public final void rule__Values__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1388:1: ( rule__Values__Group_5__0__Impl rule__Values__Group_5__1 )
            // InternalRest.g:1389:2: rule__Values__Group_5__0__Impl rule__Values__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Values__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group_5__1();

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
    // $ANTLR end "rule__Values__Group_5__0"


    // $ANTLR start "rule__Values__Group_5__0__Impl"
    // InternalRest.g:1396:1: rule__Values__Group_5__0__Impl : ( 'new' ) ;
    public final void rule__Values__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1400:1: ( ( 'new' ) )
            // InternalRest.g:1401:1: ( 'new' )
            {
            // InternalRest.g:1401:1: ( 'new' )
            // InternalRest.g:1402:2: 'new'
            {
             before(grammarAccess.getValuesAccess().getNewKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getNewKeyword_5_0()); 

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
    // $ANTLR end "rule__Values__Group_5__0__Impl"


    // $ANTLR start "rule__Values__Group_5__1"
    // InternalRest.g:1411:1: rule__Values__Group_5__1 : rule__Values__Group_5__1__Impl rule__Values__Group_5__2 ;
    public final void rule__Values__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1415:1: ( rule__Values__Group_5__1__Impl rule__Values__Group_5__2 )
            // InternalRest.g:1416:2: rule__Values__Group_5__1__Impl rule__Values__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__Values__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group_5__2();

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
    // $ANTLR end "rule__Values__Group_5__1"


    // $ANTLR start "rule__Values__Group_5__1__Impl"
    // InternalRest.g:1423:1: rule__Values__Group_5__1__Impl : ( ( rule__Values__IdTAssignment_5_1 ) ) ;
    public final void rule__Values__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1427:1: ( ( ( rule__Values__IdTAssignment_5_1 ) ) )
            // InternalRest.g:1428:1: ( ( rule__Values__IdTAssignment_5_1 ) )
            {
            // InternalRest.g:1428:1: ( ( rule__Values__IdTAssignment_5_1 ) )
            // InternalRest.g:1429:2: ( rule__Values__IdTAssignment_5_1 )
            {
             before(grammarAccess.getValuesAccess().getIdTAssignment_5_1()); 
            // InternalRest.g:1430:2: ( rule__Values__IdTAssignment_5_1 )
            // InternalRest.g:1430:3: rule__Values__IdTAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Values__IdTAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getIdTAssignment_5_1()); 

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
    // $ANTLR end "rule__Values__Group_5__1__Impl"


    // $ANTLR start "rule__Values__Group_5__2"
    // InternalRest.g:1438:1: rule__Values__Group_5__2 : rule__Values__Group_5__2__Impl rule__Values__Group_5__3 ;
    public final void rule__Values__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1442:1: ( rule__Values__Group_5__2__Impl rule__Values__Group_5__3 )
            // InternalRest.g:1443:2: rule__Values__Group_5__2__Impl rule__Values__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__Values__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group_5__3();

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
    // $ANTLR end "rule__Values__Group_5__2"


    // $ANTLR start "rule__Values__Group_5__2__Impl"
    // InternalRest.g:1450:1: rule__Values__Group_5__2__Impl : ( '(' ) ;
    public final void rule__Values__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1454:1: ( ( '(' ) )
            // InternalRest.g:1455:1: ( '(' )
            {
            // InternalRest.g:1455:1: ( '(' )
            // InternalRest.g:1456:2: '('
            {
             before(grammarAccess.getValuesAccess().getLeftParenthesisKeyword_5_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getLeftParenthesisKeyword_5_2()); 

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
    // $ANTLR end "rule__Values__Group_5__2__Impl"


    // $ANTLR start "rule__Values__Group_5__3"
    // InternalRest.g:1465:1: rule__Values__Group_5__3 : rule__Values__Group_5__3__Impl rule__Values__Group_5__4 ;
    public final void rule__Values__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1469:1: ( rule__Values__Group_5__3__Impl rule__Values__Group_5__4 )
            // InternalRest.g:1470:2: rule__Values__Group_5__3__Impl rule__Values__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__Values__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group_5__4();

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
    // $ANTLR end "rule__Values__Group_5__3"


    // $ANTLR start "rule__Values__Group_5__3__Impl"
    // InternalRest.g:1477:1: rule__Values__Group_5__3__Impl : ( ( rule__Values__Group_5_3__0 )? ) ;
    public final void rule__Values__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1481:1: ( ( ( rule__Values__Group_5_3__0 )? ) )
            // InternalRest.g:1482:1: ( ( rule__Values__Group_5_3__0 )? )
            {
            // InternalRest.g:1482:1: ( ( rule__Values__Group_5_3__0 )? )
            // InternalRest.g:1483:2: ( rule__Values__Group_5_3__0 )?
            {
             before(grammarAccess.getValuesAccess().getGroup_5_3()); 
            // InternalRest.g:1484:2: ( rule__Values__Group_5_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRest.g:1484:3: rule__Values__Group_5_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__Group_5_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValuesAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Values__Group_5__3__Impl"


    // $ANTLR start "rule__Values__Group_5__4"
    // InternalRest.g:1492:1: rule__Values__Group_5__4 : rule__Values__Group_5__4__Impl ;
    public final void rule__Values__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1496:1: ( rule__Values__Group_5__4__Impl )
            // InternalRest.g:1497:2: rule__Values__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group_5__4__Impl();

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
    // $ANTLR end "rule__Values__Group_5__4"


    // $ANTLR start "rule__Values__Group_5__4__Impl"
    // InternalRest.g:1503:1: rule__Values__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Values__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1507:1: ( ( ')' ) )
            // InternalRest.g:1508:1: ( ')' )
            {
            // InternalRest.g:1508:1: ( ')' )
            // InternalRest.g:1509:2: ')'
            {
             before(grammarAccess.getValuesAccess().getRightParenthesisKeyword_5_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__Values__Group_5__4__Impl"


    // $ANTLR start "rule__Values__Group_5_3__0"
    // InternalRest.g:1519:1: rule__Values__Group_5_3__0 : rule__Values__Group_5_3__0__Impl rule__Values__Group_5_3__1 ;
    public final void rule__Values__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1523:1: ( rule__Values__Group_5_3__0__Impl rule__Values__Group_5_3__1 )
            // InternalRest.g:1524:2: rule__Values__Group_5_3__0__Impl rule__Values__Group_5_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Values__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group_5_3__1();

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
    // $ANTLR end "rule__Values__Group_5_3__0"


    // $ANTLR start "rule__Values__Group_5_3__0__Impl"
    // InternalRest.g:1531:1: rule__Values__Group_5_3__0__Impl : ( ( rule__Values__Group_5_3_0__0 )* ) ;
    public final void rule__Values__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1535:1: ( ( ( rule__Values__Group_5_3_0__0 )* ) )
            // InternalRest.g:1536:1: ( ( rule__Values__Group_5_3_0__0 )* )
            {
            // InternalRest.g:1536:1: ( ( rule__Values__Group_5_3_0__0 )* )
            // InternalRest.g:1537:2: ( rule__Values__Group_5_3_0__0 )*
            {
             before(grammarAccess.getValuesAccess().getGroup_5_3_0()); 
            // InternalRest.g:1538:2: ( rule__Values__Group_5_3_0__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==28) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalRest.g:1538:3: rule__Values__Group_5_3_0__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Values__Group_5_3_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getValuesAccess().getGroup_5_3_0()); 

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
    // $ANTLR end "rule__Values__Group_5_3__0__Impl"


    // $ANTLR start "rule__Values__Group_5_3__1"
    // InternalRest.g:1546:1: rule__Values__Group_5_3__1 : rule__Values__Group_5_3__1__Impl ;
    public final void rule__Values__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1550:1: ( rule__Values__Group_5_3__1__Impl )
            // InternalRest.g:1551:2: rule__Values__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Values__Group_5_3__1"


    // $ANTLR start "rule__Values__Group_5_3__1__Impl"
    // InternalRest.g:1557:1: rule__Values__Group_5_3__1__Impl : ( ( rule__Values__ParAssignment_5_3_1 ) ) ;
    public final void rule__Values__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1561:1: ( ( ( rule__Values__ParAssignment_5_3_1 ) ) )
            // InternalRest.g:1562:1: ( ( rule__Values__ParAssignment_5_3_1 ) )
            {
            // InternalRest.g:1562:1: ( ( rule__Values__ParAssignment_5_3_1 ) )
            // InternalRest.g:1563:2: ( rule__Values__ParAssignment_5_3_1 )
            {
             before(grammarAccess.getValuesAccess().getParAssignment_5_3_1()); 
            // InternalRest.g:1564:2: ( rule__Values__ParAssignment_5_3_1 )
            // InternalRest.g:1564:3: rule__Values__ParAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Values__ParAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getParAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Values__Group_5_3__1__Impl"


    // $ANTLR start "rule__Values__Group_5_3_0__0"
    // InternalRest.g:1573:1: rule__Values__Group_5_3_0__0 : rule__Values__Group_5_3_0__0__Impl rule__Values__Group_5_3_0__1 ;
    public final void rule__Values__Group_5_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1577:1: ( rule__Values__Group_5_3_0__0__Impl rule__Values__Group_5_3_0__1 )
            // InternalRest.g:1578:2: rule__Values__Group_5_3_0__0__Impl rule__Values__Group_5_3_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Values__Group_5_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group_5_3_0__1();

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
    // $ANTLR end "rule__Values__Group_5_3_0__0"


    // $ANTLR start "rule__Values__Group_5_3_0__0__Impl"
    // InternalRest.g:1585:1: rule__Values__Group_5_3_0__0__Impl : ( ( rule__Values__ParAssignment_5_3_0_0 ) ) ;
    public final void rule__Values__Group_5_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1589:1: ( ( ( rule__Values__ParAssignment_5_3_0_0 ) ) )
            // InternalRest.g:1590:1: ( ( rule__Values__ParAssignment_5_3_0_0 ) )
            {
            // InternalRest.g:1590:1: ( ( rule__Values__ParAssignment_5_3_0_0 ) )
            // InternalRest.g:1591:2: ( rule__Values__ParAssignment_5_3_0_0 )
            {
             before(grammarAccess.getValuesAccess().getParAssignment_5_3_0_0()); 
            // InternalRest.g:1592:2: ( rule__Values__ParAssignment_5_3_0_0 )
            // InternalRest.g:1592:3: rule__Values__ParAssignment_5_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Values__ParAssignment_5_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getParAssignment_5_3_0_0()); 

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
    // $ANTLR end "rule__Values__Group_5_3_0__0__Impl"


    // $ANTLR start "rule__Values__Group_5_3_0__1"
    // InternalRest.g:1600:1: rule__Values__Group_5_3_0__1 : rule__Values__Group_5_3_0__1__Impl ;
    public final void rule__Values__Group_5_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1604:1: ( rule__Values__Group_5_3_0__1__Impl )
            // InternalRest.g:1605:2: rule__Values__Group_5_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group_5_3_0__1__Impl();

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
    // $ANTLR end "rule__Values__Group_5_3_0__1"


    // $ANTLR start "rule__Values__Group_5_3_0__1__Impl"
    // InternalRest.g:1611:1: rule__Values__Group_5_3_0__1__Impl : ( ',' ) ;
    public final void rule__Values__Group_5_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1615:1: ( ( ',' ) )
            // InternalRest.g:1616:1: ( ',' )
            {
            // InternalRest.g:1616:1: ( ',' )
            // InternalRest.g:1617:2: ','
            {
             before(grammarAccess.getValuesAccess().getCommaKeyword_5_3_0_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getCommaKeyword_5_3_0_1()); 

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
    // $ANTLR end "rule__Values__Group_5_3_0__1__Impl"


    // $ANTLR start "rule__TYPE_NAME__Group__0"
    // InternalRest.g:1627:1: rule__TYPE_NAME__Group__0 : rule__TYPE_NAME__Group__0__Impl rule__TYPE_NAME__Group__1 ;
    public final void rule__TYPE_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1631:1: ( rule__TYPE_NAME__Group__0__Impl rule__TYPE_NAME__Group__1 )
            // InternalRest.g:1632:2: rule__TYPE_NAME__Group__0__Impl rule__TYPE_NAME__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__TYPE_NAME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TYPE_NAME__Group__1();

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
    // $ANTLR end "rule__TYPE_NAME__Group__0"


    // $ANTLR start "rule__TYPE_NAME__Group__0__Impl"
    // InternalRest.g:1639:1: rule__TYPE_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__TYPE_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1643:1: ( ( RULE_ID ) )
            // InternalRest.g:1644:1: ( RULE_ID )
            {
            // InternalRest.g:1644:1: ( RULE_ID )
            // InternalRest.g:1645:2: RULE_ID
            {
             before(grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__TYPE_NAME__Group__0__Impl"


    // $ANTLR start "rule__TYPE_NAME__Group__1"
    // InternalRest.g:1654:1: rule__TYPE_NAME__Group__1 : rule__TYPE_NAME__Group__1__Impl ;
    public final void rule__TYPE_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1658:1: ( rule__TYPE_NAME__Group__1__Impl )
            // InternalRest.g:1659:2: rule__TYPE_NAME__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_NAME__Group__1__Impl();

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
    // $ANTLR end "rule__TYPE_NAME__Group__1"


    // $ANTLR start "rule__TYPE_NAME__Group__1__Impl"
    // InternalRest.g:1665:1: rule__TYPE_NAME__Group__1__Impl : ( ( rule__TYPE_NAME__Group_1__0 )? ) ;
    public final void rule__TYPE_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1669:1: ( ( ( rule__TYPE_NAME__Group_1__0 )? ) )
            // InternalRest.g:1670:1: ( ( rule__TYPE_NAME__Group_1__0 )? )
            {
            // InternalRest.g:1670:1: ( ( rule__TYPE_NAME__Group_1__0 )? )
            // InternalRest.g:1671:2: ( rule__TYPE_NAME__Group_1__0 )?
            {
             before(grammarAccess.getTYPE_NAMEAccess().getGroup_1()); 
            // InternalRest.g:1672:2: ( rule__TYPE_NAME__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRest.g:1672:3: rule__TYPE_NAME__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TYPE_NAME__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTYPE_NAMEAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TYPE_NAME__Group__1__Impl"


    // $ANTLR start "rule__TYPE_NAME__Group_1__0"
    // InternalRest.g:1681:1: rule__TYPE_NAME__Group_1__0 : rule__TYPE_NAME__Group_1__0__Impl rule__TYPE_NAME__Group_1__1 ;
    public final void rule__TYPE_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1685:1: ( rule__TYPE_NAME__Group_1__0__Impl rule__TYPE_NAME__Group_1__1 )
            // InternalRest.g:1686:2: rule__TYPE_NAME__Group_1__0__Impl rule__TYPE_NAME__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__TYPE_NAME__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TYPE_NAME__Group_1__1();

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
    // $ANTLR end "rule__TYPE_NAME__Group_1__0"


    // $ANTLR start "rule__TYPE_NAME__Group_1__0__Impl"
    // InternalRest.g:1693:1: rule__TYPE_NAME__Group_1__0__Impl : ( '<' ) ;
    public final void rule__TYPE_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1697:1: ( ( '<' ) )
            // InternalRest.g:1698:1: ( '<' )
            {
            // InternalRest.g:1698:1: ( '<' )
            // InternalRest.g:1699:2: '<'
            {
             before(grammarAccess.getTYPE_NAMEAccess().getLessThanSignKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTYPE_NAMEAccess().getLessThanSignKeyword_1_0()); 

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
    // $ANTLR end "rule__TYPE_NAME__Group_1__0__Impl"


    // $ANTLR start "rule__TYPE_NAME__Group_1__1"
    // InternalRest.g:1708:1: rule__TYPE_NAME__Group_1__1 : rule__TYPE_NAME__Group_1__1__Impl rule__TYPE_NAME__Group_1__2 ;
    public final void rule__TYPE_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1712:1: ( rule__TYPE_NAME__Group_1__1__Impl rule__TYPE_NAME__Group_1__2 )
            // InternalRest.g:1713:2: rule__TYPE_NAME__Group_1__1__Impl rule__TYPE_NAME__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__TYPE_NAME__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TYPE_NAME__Group_1__2();

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
    // $ANTLR end "rule__TYPE_NAME__Group_1__1"


    // $ANTLR start "rule__TYPE_NAME__Group_1__1__Impl"
    // InternalRest.g:1720:1: rule__TYPE_NAME__Group_1__1__Impl : ( ( rule__TYPE_NAME__Group_1_1__0 )* ) ;
    public final void rule__TYPE_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1724:1: ( ( ( rule__TYPE_NAME__Group_1_1__0 )* ) )
            // InternalRest.g:1725:1: ( ( rule__TYPE_NAME__Group_1_1__0 )* )
            {
            // InternalRest.g:1725:1: ( ( rule__TYPE_NAME__Group_1_1__0 )* )
            // InternalRest.g:1726:2: ( rule__TYPE_NAME__Group_1_1__0 )*
            {
             before(grammarAccess.getTYPE_NAMEAccess().getGroup_1_1()); 
            // InternalRest.g:1727:2: ( rule__TYPE_NAME__Group_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==28) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 17:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==28) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3==28) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA15_4 = input.LA(2);

                    if ( (LA15_4==28) ) {
                        alt15=1;
                    }


                    }
                    break;
                case RULE_INT_TYPES:
                    {
                    int LA15_5 = input.LA(2);

                    if ( (LA15_5==28) ) {
                        alt15=1;
                    }


                    }
                    break;
                case RULE_FLOAT_TYPES:
                    {
                    int LA15_6 = input.LA(2);

                    if ( (LA15_6==28) ) {
                        alt15=1;
                    }


                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // InternalRest.g:1727:3: rule__TYPE_NAME__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__TYPE_NAME__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTYPE_NAMEAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__TYPE_NAME__Group_1__1__Impl"


    // $ANTLR start "rule__TYPE_NAME__Group_1__2"
    // InternalRest.g:1735:1: rule__TYPE_NAME__Group_1__2 : rule__TYPE_NAME__Group_1__2__Impl rule__TYPE_NAME__Group_1__3 ;
    public final void rule__TYPE_NAME__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1739:1: ( rule__TYPE_NAME__Group_1__2__Impl rule__TYPE_NAME__Group_1__3 )
            // InternalRest.g:1740:2: rule__TYPE_NAME__Group_1__2__Impl rule__TYPE_NAME__Group_1__3
            {
            pushFollow(FOLLOW_22);
            rule__TYPE_NAME__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TYPE_NAME__Group_1__3();

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
    // $ANTLR end "rule__TYPE_NAME__Group_1__2"


    // $ANTLR start "rule__TYPE_NAME__Group_1__2__Impl"
    // InternalRest.g:1747:1: rule__TYPE_NAME__Group_1__2__Impl : ( ( rule__TYPE_NAME__Alternatives_1_2 ) ) ;
    public final void rule__TYPE_NAME__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1751:1: ( ( ( rule__TYPE_NAME__Alternatives_1_2 ) ) )
            // InternalRest.g:1752:1: ( ( rule__TYPE_NAME__Alternatives_1_2 ) )
            {
            // InternalRest.g:1752:1: ( ( rule__TYPE_NAME__Alternatives_1_2 ) )
            // InternalRest.g:1753:2: ( rule__TYPE_NAME__Alternatives_1_2 )
            {
             before(grammarAccess.getTYPE_NAMEAccess().getAlternatives_1_2()); 
            // InternalRest.g:1754:2: ( rule__TYPE_NAME__Alternatives_1_2 )
            // InternalRest.g:1754:3: rule__TYPE_NAME__Alternatives_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_NAME__Alternatives_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTYPE_NAMEAccess().getAlternatives_1_2()); 

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
    // $ANTLR end "rule__TYPE_NAME__Group_1__2__Impl"


    // $ANTLR start "rule__TYPE_NAME__Group_1__3"
    // InternalRest.g:1762:1: rule__TYPE_NAME__Group_1__3 : rule__TYPE_NAME__Group_1__3__Impl ;
    public final void rule__TYPE_NAME__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1766:1: ( rule__TYPE_NAME__Group_1__3__Impl )
            // InternalRest.g:1767:2: rule__TYPE_NAME__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_NAME__Group_1__3__Impl();

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
    // $ANTLR end "rule__TYPE_NAME__Group_1__3"


    // $ANTLR start "rule__TYPE_NAME__Group_1__3__Impl"
    // InternalRest.g:1773:1: rule__TYPE_NAME__Group_1__3__Impl : ( '>' ) ;
    public final void rule__TYPE_NAME__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1777:1: ( ( '>' ) )
            // InternalRest.g:1778:1: ( '>' )
            {
            // InternalRest.g:1778:1: ( '>' )
            // InternalRest.g:1779:2: '>'
            {
             before(grammarAccess.getTYPE_NAMEAccess().getGreaterThanSignKeyword_1_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTYPE_NAMEAccess().getGreaterThanSignKeyword_1_3()); 

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
    // $ANTLR end "rule__TYPE_NAME__Group_1__3__Impl"


    // $ANTLR start "rule__TYPE_NAME__Group_1_1__0"
    // InternalRest.g:1789:1: rule__TYPE_NAME__Group_1_1__0 : rule__TYPE_NAME__Group_1_1__0__Impl rule__TYPE_NAME__Group_1_1__1 ;
    public final void rule__TYPE_NAME__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1793:1: ( rule__TYPE_NAME__Group_1_1__0__Impl rule__TYPE_NAME__Group_1_1__1 )
            // InternalRest.g:1794:2: rule__TYPE_NAME__Group_1_1__0__Impl rule__TYPE_NAME__Group_1_1__1
            {
            pushFollow(FOLLOW_19);
            rule__TYPE_NAME__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TYPE_NAME__Group_1_1__1();

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
    // $ANTLR end "rule__TYPE_NAME__Group_1_1__0"


    // $ANTLR start "rule__TYPE_NAME__Group_1_1__0__Impl"
    // InternalRest.g:1801:1: rule__TYPE_NAME__Group_1_1__0__Impl : ( ( rule__TYPE_NAME__Alternatives_1_1_0 ) ) ;
    public final void rule__TYPE_NAME__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1805:1: ( ( ( rule__TYPE_NAME__Alternatives_1_1_0 ) ) )
            // InternalRest.g:1806:1: ( ( rule__TYPE_NAME__Alternatives_1_1_0 ) )
            {
            // InternalRest.g:1806:1: ( ( rule__TYPE_NAME__Alternatives_1_1_0 ) )
            // InternalRest.g:1807:2: ( rule__TYPE_NAME__Alternatives_1_1_0 )
            {
             before(grammarAccess.getTYPE_NAMEAccess().getAlternatives_1_1_0()); 
            // InternalRest.g:1808:2: ( rule__TYPE_NAME__Alternatives_1_1_0 )
            // InternalRest.g:1808:3: rule__TYPE_NAME__Alternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_NAME__Alternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTYPE_NAMEAccess().getAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__TYPE_NAME__Group_1_1__0__Impl"


    // $ANTLR start "rule__TYPE_NAME__Group_1_1__1"
    // InternalRest.g:1816:1: rule__TYPE_NAME__Group_1_1__1 : rule__TYPE_NAME__Group_1_1__1__Impl ;
    public final void rule__TYPE_NAME__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1820:1: ( rule__TYPE_NAME__Group_1_1__1__Impl )
            // InternalRest.g:1821:2: rule__TYPE_NAME__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_NAME__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__TYPE_NAME__Group_1_1__1"


    // $ANTLR start "rule__TYPE_NAME__Group_1_1__1__Impl"
    // InternalRest.g:1827:1: rule__TYPE_NAME__Group_1_1__1__Impl : ( ',' ) ;
    public final void rule__TYPE_NAME__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1831:1: ( ( ',' ) )
            // InternalRest.g:1832:1: ( ',' )
            {
            // InternalRest.g:1832:1: ( ',' )
            // InternalRest.g:1833:2: ','
            {
             before(grammarAccess.getTYPE_NAMEAccess().getCommaKeyword_1_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTYPE_NAMEAccess().getCommaKeyword_1_1_1()); 

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
    // $ANTLR end "rule__TYPE_NAME__Group_1_1__1__Impl"


    // $ANTLR start "rule__PackageName__Group__0"
    // InternalRest.g:1843:1: rule__PackageName__Group__0 : rule__PackageName__Group__0__Impl rule__PackageName__Group__1 ;
    public final void rule__PackageName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1847:1: ( rule__PackageName__Group__0__Impl rule__PackageName__Group__1 )
            // InternalRest.g:1848:2: rule__PackageName__Group__0__Impl rule__PackageName__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__PackageName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageName__Group__1();

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
    // $ANTLR end "rule__PackageName__Group__0"


    // $ANTLR start "rule__PackageName__Group__0__Impl"
    // InternalRest.g:1855:1: rule__PackageName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1859:1: ( ( RULE_ID ) )
            // InternalRest.g:1860:1: ( RULE_ID )
            {
            // InternalRest.g:1860:1: ( RULE_ID )
            // InternalRest.g:1861:2: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__PackageName__Group__0__Impl"


    // $ANTLR start "rule__PackageName__Group__1"
    // InternalRest.g:1870:1: rule__PackageName__Group__1 : rule__PackageName__Group__1__Impl ;
    public final void rule__PackageName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1874:1: ( rule__PackageName__Group__1__Impl )
            // InternalRest.g:1875:2: rule__PackageName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageName__Group__1__Impl();

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
    // $ANTLR end "rule__PackageName__Group__1"


    // $ANTLR start "rule__PackageName__Group__1__Impl"
    // InternalRest.g:1881:1: rule__PackageName__Group__1__Impl : ( ( rule__PackageName__Group_1__0 )* ) ;
    public final void rule__PackageName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1885:1: ( ( ( rule__PackageName__Group_1__0 )* ) )
            // InternalRest.g:1886:1: ( ( rule__PackageName__Group_1__0 )* )
            {
            // InternalRest.g:1886:1: ( ( rule__PackageName__Group_1__0 )* )
            // InternalRest.g:1887:2: ( rule__PackageName__Group_1__0 )*
            {
             before(grammarAccess.getPackageNameAccess().getGroup_1()); 
            // InternalRest.g:1888:2: ( rule__PackageName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRest.g:1888:3: rule__PackageName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__PackageName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPackageNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PackageName__Group__1__Impl"


    // $ANTLR start "rule__PackageName__Group_1__0"
    // InternalRest.g:1897:1: rule__PackageName__Group_1__0 : rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 ;
    public final void rule__PackageName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1901:1: ( rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 )
            // InternalRest.g:1902:2: rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__PackageName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageName__Group_1__1();

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
    // $ANTLR end "rule__PackageName__Group_1__0"


    // $ANTLR start "rule__PackageName__Group_1__0__Impl"
    // InternalRest.g:1909:1: rule__PackageName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PackageName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1913:1: ( ( '.' ) )
            // InternalRest.g:1914:1: ( '.' )
            {
            // InternalRest.g:1914:1: ( '.' )
            // InternalRest.g:1915:2: '.'
            {
             before(grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__PackageName__Group_1__0__Impl"


    // $ANTLR start "rule__PackageName__Group_1__1"
    // InternalRest.g:1924:1: rule__PackageName__Group_1__1 : rule__PackageName__Group_1__1__Impl ;
    public final void rule__PackageName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1928:1: ( rule__PackageName__Group_1__1__Impl )
            // InternalRest.g:1929:2: rule__PackageName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageName__Group_1__1__Impl();

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
    // $ANTLR end "rule__PackageName__Group_1__1"


    // $ANTLR start "rule__PackageName__Group_1__1__Impl"
    // InternalRest.g:1935:1: rule__PackageName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1939:1: ( ( RULE_ID ) )
            // InternalRest.g:1940:1: ( RULE_ID )
            {
            // InternalRest.g:1940:1: ( RULE_ID )
            // InternalRest.g:1941:2: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__PackageName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__BodyAssignment_3"
    // InternalRest.g:1951:1: rule__Model__BodyAssignment_3 : ( ruleBody ) ;
    public final void rule__Model__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1955:1: ( ( ruleBody ) )
            // InternalRest.g:1956:2: ( ruleBody )
            {
            // InternalRest.g:1956:2: ( ruleBody )
            // InternalRest.g:1957:3: ruleBody
            {
             before(grammarAccess.getModelAccess().getBodyBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBodyBodyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__BodyAssignment_3"


    // $ANTLR start "rule__Body__ElemAssignment_0"
    // InternalRest.g:1966:1: rule__Body__ElemAssignment_0 : ( ruleElem ) ;
    public final void rule__Body__ElemAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1970:1: ( ( ruleElem ) )
            // InternalRest.g:1971:2: ( ruleElem )
            {
            // InternalRest.g:1971:2: ( ruleElem )
            // InternalRest.g:1972:3: ruleElem
            {
             before(grammarAccess.getBodyAccess().getElemElemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElem();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getElemElemParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Body__ElemAssignment_0"


    // $ANTLR start "rule__Body__GlobAtribAssignment_1"
    // InternalRest.g:1981:1: rule__Body__GlobAtribAssignment_1 : ( ruleGlobAtrib ) ;
    public final void rule__Body__GlobAtribAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1985:1: ( ( ruleGlobAtrib ) )
            // InternalRest.g:1986:2: ( ruleGlobAtrib )
            {
            // InternalRest.g:1986:2: ( ruleGlobAtrib )
            // InternalRest.g:1987:3: ruleGlobAtrib
            {
             before(grammarAccess.getBodyAccess().getGlobAtribGlobAtribParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobAtrib();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getGlobAtribGlobAtribParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Body__GlobAtribAssignment_1"


    // $ANTLR start "rule__Elem__ClassNameAssignment_0"
    // InternalRest.g:1996:1: rule__Elem__ClassNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Elem__ClassNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2000:1: ( ( RULE_ID ) )
            // InternalRest.g:2001:2: ( RULE_ID )
            {
            // InternalRest.g:2001:2: ( RULE_ID )
            // InternalRest.g:2002:3: RULE_ID
            {
             before(grammarAccess.getElemAccess().getClassNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElemAccess().getClassNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Elem__ClassNameAssignment_0"


    // $ANTLR start "rule__Elem__PackageAssignment_2_1"
    // InternalRest.g:2011:1: rule__Elem__PackageAssignment_2_1 : ( rulePackageName ) ;
    public final void rule__Elem__PackageAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2015:1: ( ( rulePackageName ) )
            // InternalRest.g:2016:2: ( rulePackageName )
            {
            // InternalRest.g:2016:2: ( rulePackageName )
            // InternalRest.g:2017:3: rulePackageName
            {
             before(grammarAccess.getElemAccess().getPackagePackageNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getElemAccess().getPackagePackageNameParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Elem__PackageAssignment_2_1"


    // $ANTLR start "rule__Elem__AtribAssignment_3"
    // InternalRest.g:2026:1: rule__Elem__AtribAssignment_3 : ( ruleAtrib ) ;
    public final void rule__Elem__AtribAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2030:1: ( ( ruleAtrib ) )
            // InternalRest.g:2031:2: ( ruleAtrib )
            {
            // InternalRest.g:2031:2: ( ruleAtrib )
            // InternalRest.g:2032:3: ruleAtrib
            {
             before(grammarAccess.getElemAccess().getAtribAtribParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAtrib();

            state._fsp--;

             after(grammarAccess.getElemAccess().getAtribAtribParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Elem__AtribAssignment_3"


    // $ANTLR start "rule__Atrib__AtribNameAssignment_0"
    // InternalRest.g:2041:1: rule__Atrib__AtribNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Atrib__AtribNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2045:1: ( ( RULE_ID ) )
            // InternalRest.g:2046:2: ( RULE_ID )
            {
            // InternalRest.g:2046:2: ( RULE_ID )
            // InternalRest.g:2047:3: RULE_ID
            {
             before(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Atrib__AtribNameAssignment_0"


    // $ANTLR start "rule__Atrib__TipoAssignment_2"
    // InternalRest.g:2056:1: rule__Atrib__TipoAssignment_2 : ( ( rule__Atrib__TipoAlternatives_2_0 ) ) ;
    public final void rule__Atrib__TipoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2060:1: ( ( ( rule__Atrib__TipoAlternatives_2_0 ) ) )
            // InternalRest.g:2061:2: ( ( rule__Atrib__TipoAlternatives_2_0 ) )
            {
            // InternalRest.g:2061:2: ( ( rule__Atrib__TipoAlternatives_2_0 ) )
            // InternalRest.g:2062:3: ( rule__Atrib__TipoAlternatives_2_0 )
            {
             before(grammarAccess.getAtribAccess().getTipoAlternatives_2_0()); 
            // InternalRest.g:2063:3: ( rule__Atrib__TipoAlternatives_2_0 )
            // InternalRest.g:2063:4: rule__Atrib__TipoAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__TipoAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getTipoAlternatives_2_0()); 

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
    // $ANTLR end "rule__Atrib__TipoAssignment_2"


    // $ANTLR start "rule__Atrib__ValueAssignment_3_1"
    // InternalRest.g:2071:1: rule__Atrib__ValueAssignment_3_1 : ( ruleValues ) ;
    public final void rule__Atrib__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2075:1: ( ( ruleValues ) )
            // InternalRest.g:2076:2: ( ruleValues )
            {
            // InternalRest.g:2076:2: ( ruleValues )
            // InternalRest.g:2077:3: ruleValues
            {
             before(grammarAccess.getAtribAccess().getValueValuesParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getAtribAccess().getValueValuesParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Atrib__ValueAssignment_3_1"


    // $ANTLR start "rule__GlobAtrib__AtribNameAssignment_0"
    // InternalRest.g:2086:1: rule__GlobAtrib__AtribNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__GlobAtrib__AtribNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2090:1: ( ( RULE_ID ) )
            // InternalRest.g:2091:2: ( RULE_ID )
            {
            // InternalRest.g:2091:2: ( RULE_ID )
            // InternalRest.g:2092:3: RULE_ID
            {
             before(grammarAccess.getGlobAtribAccess().getAtribNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGlobAtribAccess().getAtribNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__GlobAtrib__AtribNameAssignment_0"


    // $ANTLR start "rule__GlobAtrib__TipoAssignment_2"
    // InternalRest.g:2101:1: rule__GlobAtrib__TipoAssignment_2 : ( ( rule__GlobAtrib__TipoAlternatives_2_0 ) ) ;
    public final void rule__GlobAtrib__TipoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2105:1: ( ( ( rule__GlobAtrib__TipoAlternatives_2_0 ) ) )
            // InternalRest.g:2106:2: ( ( rule__GlobAtrib__TipoAlternatives_2_0 ) )
            {
            // InternalRest.g:2106:2: ( ( rule__GlobAtrib__TipoAlternatives_2_0 ) )
            // InternalRest.g:2107:3: ( rule__GlobAtrib__TipoAlternatives_2_0 )
            {
             before(grammarAccess.getGlobAtribAccess().getTipoAlternatives_2_0()); 
            // InternalRest.g:2108:3: ( rule__GlobAtrib__TipoAlternatives_2_0 )
            // InternalRest.g:2108:4: rule__GlobAtrib__TipoAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GlobAtrib__TipoAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getGlobAtribAccess().getTipoAlternatives_2_0()); 

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
    // $ANTLR end "rule__GlobAtrib__TipoAssignment_2"


    // $ANTLR start "rule__GlobAtrib__ValueAssignment_3_1"
    // InternalRest.g:2116:1: rule__GlobAtrib__ValueAssignment_3_1 : ( ruleValues ) ;
    public final void rule__GlobAtrib__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2120:1: ( ( ruleValues ) )
            // InternalRest.g:2121:2: ( ruleValues )
            {
            // InternalRest.g:2121:2: ( ruleValues )
            // InternalRest.g:2122:3: ruleValues
            {
             before(grammarAccess.getGlobAtribAccess().getValueValuesParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getGlobAtribAccess().getValueValuesParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__GlobAtrib__ValueAssignment_3_1"


    // $ANTLR start "rule__Values__IdAssignment_0_1"
    // InternalRest.g:2131:1: rule__Values__IdAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Values__IdAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2135:1: ( ( RULE_INT ) )
            // InternalRest.g:2136:2: ( RULE_INT )
            {
            // InternalRest.g:2136:2: ( RULE_INT )
            // InternalRest.g:2137:3: RULE_INT
            {
             before(grammarAccess.getValuesAccess().getIdINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getIdINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Values__IdAssignment_0_1"


    // $ANTLR start "rule__Values__IdBAssignment_1_1"
    // InternalRest.g:2146:1: rule__Values__IdBAssignment_1_1 : ( RULE_BOOL ) ;
    public final void rule__Values__IdBAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2150:1: ( ( RULE_BOOL ) )
            // InternalRest.g:2151:2: ( RULE_BOOL )
            {
            // InternalRest.g:2151:2: ( RULE_BOOL )
            // InternalRest.g:2152:3: RULE_BOOL
            {
             before(grammarAccess.getValuesAccess().getIdBBOOLTerminalRuleCall_1_1_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getIdBBOOLTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Values__IdBAssignment_1_1"


    // $ANTLR start "rule__Values__IdFAssignment_2_1"
    // InternalRest.g:2161:1: rule__Values__IdFAssignment_2_1 : ( RULE_FLOAT ) ;
    public final void rule__Values__IdFAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2165:1: ( ( RULE_FLOAT ) )
            // InternalRest.g:2166:2: ( RULE_FLOAT )
            {
            // InternalRest.g:2166:2: ( RULE_FLOAT )
            // InternalRest.g:2167:3: RULE_FLOAT
            {
             before(grammarAccess.getValuesAccess().getIdFFLOATTerminalRuleCall_2_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getIdFFLOATTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Values__IdFAssignment_2_1"


    // $ANTLR start "rule__Values__IdSAssignment_3_1"
    // InternalRest.g:2176:1: rule__Values__IdSAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Values__IdSAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2180:1: ( ( RULE_STRING ) )
            // InternalRest.g:2181:2: ( RULE_STRING )
            {
            // InternalRest.g:2181:2: ( RULE_STRING )
            // InternalRest.g:2182:3: RULE_STRING
            {
             before(grammarAccess.getValuesAccess().getIdSSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getIdSSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Values__IdSAssignment_3_1"


    // $ANTLR start "rule__Values__IdCAssignment_4_1"
    // InternalRest.g:2191:1: rule__Values__IdCAssignment_4_1 : ( RULE_CHAR ) ;
    public final void rule__Values__IdCAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2195:1: ( ( RULE_CHAR ) )
            // InternalRest.g:2196:2: ( RULE_CHAR )
            {
            // InternalRest.g:2196:2: ( RULE_CHAR )
            // InternalRest.g:2197:3: RULE_CHAR
            {
             before(grammarAccess.getValuesAccess().getIdCCHARTerminalRuleCall_4_1_0()); 
            match(input,RULE_CHAR,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getIdCCHARTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Values__IdCAssignment_4_1"


    // $ANTLR start "rule__Values__IdTAssignment_5_1"
    // InternalRest.g:2206:1: rule__Values__IdTAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Values__IdTAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2210:1: ( ( RULE_ID ) )
            // InternalRest.g:2211:2: ( RULE_ID )
            {
            // InternalRest.g:2211:2: ( RULE_ID )
            // InternalRest.g:2212:3: RULE_ID
            {
             before(grammarAccess.getValuesAccess().getIdTIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getIdTIDTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Values__IdTAssignment_5_1"


    // $ANTLR start "rule__Values__ParAssignment_5_3_0_0"
    // InternalRest.g:2221:1: rule__Values__ParAssignment_5_3_0_0 : ( RULE_ID ) ;
    public final void rule__Values__ParAssignment_5_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2225:1: ( ( RULE_ID ) )
            // InternalRest.g:2226:2: ( RULE_ID )
            {
            // InternalRest.g:2226:2: ( RULE_ID )
            // InternalRest.g:2227:3: RULE_ID
            {
             before(grammarAccess.getValuesAccess().getParIDTerminalRuleCall_5_3_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getParIDTerminalRuleCall_5_3_0_0_0()); 

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
    // $ANTLR end "rule__Values__ParAssignment_5_3_0_0"


    // $ANTLR start "rule__Values__ParAssignment_5_3_1"
    // InternalRest.g:2236:1: rule__Values__ParAssignment_5_3_1 : ( RULE_ID ) ;
    public final void rule__Values__ParAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2240:1: ( ( RULE_ID ) )
            // InternalRest.g:2241:2: ( RULE_ID )
            {
            // InternalRest.g:2241:2: ( RULE_ID )
            // InternalRest.g:2242:3: RULE_ID
            {
             before(grammarAccess.getValuesAccess().getParIDTerminalRuleCall_5_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getParIDTerminalRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Values__ParAssignment_5_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000F80L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000E0072L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000002L});

}