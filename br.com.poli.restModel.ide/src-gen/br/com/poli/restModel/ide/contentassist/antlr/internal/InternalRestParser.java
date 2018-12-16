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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT_TYPES", "RULE_FLOAT_TYPES", "RULE_ALMOST__ANY__THING", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_STRING", "RULE_CHAR", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'String'", "'boolean'", "'char'", "'Request'", "'{'", "'}'", "'('", "')'", "':'", "'<'", "'>'", "','"
    };
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_INT_TYPES=5;
    public static final int RULE_CHAR=12;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=13;
    public static final int RULE_FLOAT_TYPES=6;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_BOOL=9;
    public static final int RULE_ALMOST__ANY__THING=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
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


    // $ANTLR start "entryRuleField"
    // InternalRest.g:128:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalRest.g:129:1: ( ruleField EOF )
            // InternalRest.g:130:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalRest.g:137:1: ruleField : ( ( rule__Field__Alternatives ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:141:2: ( ( ( rule__Field__Alternatives ) ) )
            // InternalRest.g:142:2: ( ( rule__Field__Alternatives ) )
            {
            // InternalRest.g:142:2: ( ( rule__Field__Alternatives ) )
            // InternalRest.g:143:3: ( rule__Field__Alternatives )
            {
             before(grammarAccess.getFieldAccess().getAlternatives()); 
            // InternalRest.g:144:3: ( rule__Field__Alternatives )
            // InternalRest.g:144:4: rule__Field__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Field__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // InternalRest.g:153:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalRest.g:154:1: ( ruleMethod EOF )
            // InternalRest.g:155:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalRest.g:162:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:166:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalRest.g:167:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalRest.g:167:2: ( ( rule__Method__Group__0 ) )
            // InternalRest.g:168:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalRest.g:169:3: ( rule__Method__Group__0 )
            // InternalRest.g:169:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParm"
    // InternalRest.g:178:1: entryRuleParm : ruleParm EOF ;
    public final void entryRuleParm() throws RecognitionException {
        try {
            // InternalRest.g:179:1: ( ruleParm EOF )
            // InternalRest.g:180:1: ruleParm EOF
            {
             before(grammarAccess.getParmRule()); 
            pushFollow(FOLLOW_1);
            ruleParm();

            state._fsp--;

             after(grammarAccess.getParmRule()); 
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
    // $ANTLR end "entryRuleParm"


    // $ANTLR start "ruleParm"
    // InternalRest.g:187:1: ruleParm : ( ( rule__Parm__Group__0 ) ) ;
    public final void ruleParm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:191:2: ( ( ( rule__Parm__Group__0 ) ) )
            // InternalRest.g:192:2: ( ( rule__Parm__Group__0 ) )
            {
            // InternalRest.g:192:2: ( ( rule__Parm__Group__0 ) )
            // InternalRest.g:193:3: ( rule__Parm__Group__0 )
            {
             before(grammarAccess.getParmAccess().getGroup()); 
            // InternalRest.g:194:3: ( rule__Parm__Group__0 )
            // InternalRest.g:194:4: rule__Parm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParmAccess().getGroup()); 

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
    // $ANTLR end "ruleParm"


    // $ANTLR start "entryRuleAtrib"
    // InternalRest.g:203:1: entryRuleAtrib : ruleAtrib EOF ;
    public final void entryRuleAtrib() throws RecognitionException {
        try {
            // InternalRest.g:204:1: ( ruleAtrib EOF )
            // InternalRest.g:205:1: ruleAtrib EOF
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
    // InternalRest.g:212:1: ruleAtrib : ( ( rule__Atrib__Alternatives ) ) ;
    public final void ruleAtrib() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:216:2: ( ( ( rule__Atrib__Alternatives ) ) )
            // InternalRest.g:217:2: ( ( rule__Atrib__Alternatives ) )
            {
            // InternalRest.g:217:2: ( ( rule__Atrib__Alternatives ) )
            // InternalRest.g:218:3: ( rule__Atrib__Alternatives )
            {
             before(grammarAccess.getAtribAccess().getAlternatives()); 
            // InternalRest.g:219:3: ( rule__Atrib__Alternatives )
            // InternalRest.g:219:4: rule__Atrib__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleTYPE_NAME"
    // InternalRest.g:228:1: entryRuleTYPE_NAME : ruleTYPE_NAME EOF ;
    public final void entryRuleTYPE_NAME() throws RecognitionException {
        try {
            // InternalRest.g:229:1: ( ruleTYPE_NAME EOF )
            // InternalRest.g:230:1: ruleTYPE_NAME EOF
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
    // InternalRest.g:237:1: ruleTYPE_NAME : ( ( rule__TYPE_NAME__Group__0 ) ) ;
    public final void ruleTYPE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:241:2: ( ( ( rule__TYPE_NAME__Group__0 ) ) )
            // InternalRest.g:242:2: ( ( rule__TYPE_NAME__Group__0 ) )
            {
            // InternalRest.g:242:2: ( ( rule__TYPE_NAME__Group__0 ) )
            // InternalRest.g:243:3: ( rule__TYPE_NAME__Group__0 )
            {
             before(grammarAccess.getTYPE_NAMEAccess().getGroup()); 
            // InternalRest.g:244:3: ( rule__TYPE_NAME__Group__0 )
            // InternalRest.g:244:4: rule__TYPE_NAME__Group__0
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
    // InternalRest.g:253:1: entryRuleVALID_TYPES : ruleVALID_TYPES EOF ;
    public final void entryRuleVALID_TYPES() throws RecognitionException {
        try {
            // InternalRest.g:254:1: ( ruleVALID_TYPES EOF )
            // InternalRest.g:255:1: ruleVALID_TYPES EOF
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
    // InternalRest.g:262:1: ruleVALID_TYPES : ( ( rule__VALID_TYPES__Alternatives ) ) ;
    public final void ruleVALID_TYPES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:266:2: ( ( ( rule__VALID_TYPES__Alternatives ) ) )
            // InternalRest.g:267:2: ( ( rule__VALID_TYPES__Alternatives ) )
            {
            // InternalRest.g:267:2: ( ( rule__VALID_TYPES__Alternatives ) )
            // InternalRest.g:268:3: ( rule__VALID_TYPES__Alternatives )
            {
             before(grammarAccess.getVALID_TYPESAccess().getAlternatives()); 
            // InternalRest.g:269:3: ( rule__VALID_TYPES__Alternatives )
            // InternalRest.g:269:4: rule__VALID_TYPES__Alternatives
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


    // $ANTLR start "rule__Body__Alternatives"
    // InternalRest.g:277:1: rule__Body__Alternatives : ( ( ( rule__Body__Group_0__0 ) ) | ( ( rule__Body__Group_1__0 ) ) );
    public final void rule__Body__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:281:1: ( ( ( rule__Body__Group_0__0 ) ) | ( ( rule__Body__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==25) ) {
                    alt1=2;
                }
                else if ( (LA1_1==21) ) {
                    alt1=1;
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
                    // InternalRest.g:282:2: ( ( rule__Body__Group_0__0 ) )
                    {
                    // InternalRest.g:282:2: ( ( rule__Body__Group_0__0 ) )
                    // InternalRest.g:283:3: ( rule__Body__Group_0__0 )
                    {
                     before(grammarAccess.getBodyAccess().getGroup_0()); 
                    // InternalRest.g:284:3: ( rule__Body__Group_0__0 )
                    // InternalRest.g:284:4: rule__Body__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Body__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:288:2: ( ( rule__Body__Group_1__0 ) )
                    {
                    // InternalRest.g:288:2: ( ( rule__Body__Group_1__0 ) )
                    // InternalRest.g:289:3: ( rule__Body__Group_1__0 )
                    {
                     before(grammarAccess.getBodyAccess().getGroup_1()); 
                    // InternalRest.g:290:3: ( rule__Body__Group_1__0 )
                    // InternalRest.g:290:4: rule__Body__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Body__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Field__Alternatives"
    // InternalRest.g:298:1: rule__Field__Alternatives : ( ( ( rule__Field__Group_0__0 ) ) | ( ( rule__Field__Group_1__0 ) ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:302:1: ( ( ( rule__Field__Group_0__0 ) ) | ( ( rule__Field__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==25) ) {
                    alt2=1;
                }
                else if ( (LA2_1==23) ) {
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
                    // InternalRest.g:303:2: ( ( rule__Field__Group_0__0 ) )
                    {
                    // InternalRest.g:303:2: ( ( rule__Field__Group_0__0 ) )
                    // InternalRest.g:304:3: ( rule__Field__Group_0__0 )
                    {
                     before(grammarAccess.getFieldAccess().getGroup_0()); 
                    // InternalRest.g:305:3: ( rule__Field__Group_0__0 )
                    // InternalRest.g:305:4: rule__Field__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:309:2: ( ( rule__Field__Group_1__0 ) )
                    {
                    // InternalRest.g:309:2: ( ( rule__Field__Group_1__0 ) )
                    // InternalRest.g:310:3: ( rule__Field__Group_1__0 )
                    {
                     before(grammarAccess.getFieldAccess().getGroup_1()); 
                    // InternalRest.g:311:3: ( rule__Field__Group_1__0 )
                    // InternalRest.g:311:4: rule__Field__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Field__Alternatives"


    // $ANTLR start "rule__Atrib__Alternatives"
    // InternalRest.g:319:1: rule__Atrib__Alternatives : ( ( ( rule__Atrib__Group_0__0 ) ) | ( ( rule__Atrib__Group_1__0 ) ) | ( ( rule__Atrib__Group_2__0 ) ) | ( ( rule__Atrib__Group_3__0 ) ) | ( ( rule__Atrib__Group_4__0 ) ) | ( ( rule__Atrib__Group_5__0 ) ) );
    public final void rule__Atrib__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:323:1: ( ( ( rule__Atrib__Group_0__0 ) ) | ( ( rule__Atrib__Group_1__0 ) ) | ( ( rule__Atrib__Group_2__0 ) ) | ( ( rule__Atrib__Group_3__0 ) ) | ( ( rule__Atrib__Group_4__0 ) ) | ( ( rule__Atrib__Group_5__0 ) ) )
            int alt3=6;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==25) ) {
                    switch ( input.LA(3) ) {
                    case 18:
                        {
                        alt3=2;
                        }
                        break;
                    case 17:
                        {
                        alt3=4;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt3=6;
                        }
                        break;
                    case RULE_INT_TYPES:
                        {
                        alt3=1;
                        }
                        break;
                    case RULE_FLOAT_TYPES:
                        {
                        alt3=3;
                        }
                        break;
                    case 19:
                        {
                        alt3=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRest.g:324:2: ( ( rule__Atrib__Group_0__0 ) )
                    {
                    // InternalRest.g:324:2: ( ( rule__Atrib__Group_0__0 ) )
                    // InternalRest.g:325:3: ( rule__Atrib__Group_0__0 )
                    {
                     before(grammarAccess.getAtribAccess().getGroup_0()); 
                    // InternalRest.g:326:3: ( rule__Atrib__Group_0__0 )
                    // InternalRest.g:326:4: rule__Atrib__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atrib__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtribAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:330:2: ( ( rule__Atrib__Group_1__0 ) )
                    {
                    // InternalRest.g:330:2: ( ( rule__Atrib__Group_1__0 ) )
                    // InternalRest.g:331:3: ( rule__Atrib__Group_1__0 )
                    {
                     before(grammarAccess.getAtribAccess().getGroup_1()); 
                    // InternalRest.g:332:3: ( rule__Atrib__Group_1__0 )
                    // InternalRest.g:332:4: rule__Atrib__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atrib__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtribAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRest.g:336:2: ( ( rule__Atrib__Group_2__0 ) )
                    {
                    // InternalRest.g:336:2: ( ( rule__Atrib__Group_2__0 ) )
                    // InternalRest.g:337:3: ( rule__Atrib__Group_2__0 )
                    {
                     before(grammarAccess.getAtribAccess().getGroup_2()); 
                    // InternalRest.g:338:3: ( rule__Atrib__Group_2__0 )
                    // InternalRest.g:338:4: rule__Atrib__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atrib__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtribAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRest.g:342:2: ( ( rule__Atrib__Group_3__0 ) )
                    {
                    // InternalRest.g:342:2: ( ( rule__Atrib__Group_3__0 ) )
                    // InternalRest.g:343:3: ( rule__Atrib__Group_3__0 )
                    {
                     before(grammarAccess.getAtribAccess().getGroup_3()); 
                    // InternalRest.g:344:3: ( rule__Atrib__Group_3__0 )
                    // InternalRest.g:344:4: rule__Atrib__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atrib__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtribAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRest.g:348:2: ( ( rule__Atrib__Group_4__0 ) )
                    {
                    // InternalRest.g:348:2: ( ( rule__Atrib__Group_4__0 ) )
                    // InternalRest.g:349:3: ( rule__Atrib__Group_4__0 )
                    {
                     before(grammarAccess.getAtribAccess().getGroup_4()); 
                    // InternalRest.g:350:3: ( rule__Atrib__Group_4__0 )
                    // InternalRest.g:350:4: rule__Atrib__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atrib__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtribAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRest.g:354:2: ( ( rule__Atrib__Group_5__0 ) )
                    {
                    // InternalRest.g:354:2: ( ( rule__Atrib__Group_5__0 ) )
                    // InternalRest.g:355:3: ( rule__Atrib__Group_5__0 )
                    {
                     before(grammarAccess.getAtribAccess().getGroup_5()); 
                    // InternalRest.g:356:3: ( rule__Atrib__Group_5__0 )
                    // InternalRest.g:356:4: rule__Atrib__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atrib__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtribAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Atrib__Alternatives"


    // $ANTLR start "rule__TYPE_NAME__Alternatives_1_1_0"
    // InternalRest.g:364:1: rule__TYPE_NAME__Alternatives_1_1_0 : ( ( RULE_ID ) | ( ruleVALID_TYPES ) );
    public final void rule__TYPE_NAME__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:368:1: ( ( RULE_ID ) | ( ruleVALID_TYPES ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_INT_TYPES && LA4_0<=RULE_FLOAT_TYPES)||(LA4_0>=17 && LA4_0<=19)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRest.g:369:2: ( RULE_ID )
                    {
                    // InternalRest.g:369:2: ( RULE_ID )
                    // InternalRest.g:370:3: RULE_ID
                    {
                     before(grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_1_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:375:2: ( ruleVALID_TYPES )
                    {
                    // InternalRest.g:375:2: ( ruleVALID_TYPES )
                    // InternalRest.g:376:3: ruleVALID_TYPES
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


    // $ANTLR start "rule__VALID_TYPES__Alternatives"
    // InternalRest.g:385:1: rule__VALID_TYPES__Alternatives : ( ( 'String' ) | ( 'boolean' ) | ( 'char' ) | ( RULE_INT_TYPES ) | ( RULE_FLOAT_TYPES ) );
    public final void rule__VALID_TYPES__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:389:1: ( ( 'String' ) | ( 'boolean' ) | ( 'char' ) | ( RULE_INT_TYPES ) | ( RULE_FLOAT_TYPES ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case RULE_INT_TYPES:
                {
                alt5=4;
                }
                break;
            case RULE_FLOAT_TYPES:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRest.g:390:2: ( 'String' )
                    {
                    // InternalRest.g:390:2: ( 'String' )
                    // InternalRest.g:391:3: 'String'
                    {
                     before(grammarAccess.getVALID_TYPESAccess().getStringKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVALID_TYPESAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:396:2: ( 'boolean' )
                    {
                    // InternalRest.g:396:2: ( 'boolean' )
                    // InternalRest.g:397:3: 'boolean'
                    {
                     before(grammarAccess.getVALID_TYPESAccess().getBooleanKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getVALID_TYPESAccess().getBooleanKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRest.g:402:2: ( 'char' )
                    {
                    // InternalRest.g:402:2: ( 'char' )
                    // InternalRest.g:403:3: 'char'
                    {
                     before(grammarAccess.getVALID_TYPESAccess().getCharKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getVALID_TYPESAccess().getCharKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRest.g:408:2: ( RULE_INT_TYPES )
                    {
                    // InternalRest.g:408:2: ( RULE_INT_TYPES )
                    // InternalRest.g:409:3: RULE_INT_TYPES
                    {
                     before(grammarAccess.getVALID_TYPESAccess().getINT_TYPESTerminalRuleCall_3()); 
                    match(input,RULE_INT_TYPES,FOLLOW_2); 
                     after(grammarAccess.getVALID_TYPESAccess().getINT_TYPESTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRest.g:414:2: ( RULE_FLOAT_TYPES )
                    {
                    // InternalRest.g:414:2: ( RULE_FLOAT_TYPES )
                    // InternalRest.g:415:3: RULE_FLOAT_TYPES
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
    // InternalRest.g:424:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:428:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalRest.g:429:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalRest.g:436:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:440:1: ( ( () ) )
            // InternalRest.g:441:1: ( () )
            {
            // InternalRest.g:441:1: ( () )
            // InternalRest.g:442:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalRest.g:443:2: ()
            // InternalRest.g:443:3: 
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
    // InternalRest.g:451:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:455:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalRest.g:456:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalRest.g:463:1: rule__Model__Group__1__Impl : ( 'Request' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:467:1: ( ( 'Request' ) )
            // InternalRest.g:468:1: ( 'Request' )
            {
            // InternalRest.g:468:1: ( 'Request' )
            // InternalRest.g:469:2: 'Request'
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
    // InternalRest.g:478:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:482:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalRest.g:483:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalRest.g:490:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:494:1: ( ( '{' ) )
            // InternalRest.g:495:1: ( '{' )
            {
            // InternalRest.g:495:1: ( '{' )
            // InternalRest.g:496:2: '{'
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
    // InternalRest.g:505:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:509:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalRest.g:510:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalRest.g:517:1: rule__Model__Group__3__Impl : ( ( rule__Model__BodyAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:521:1: ( ( ( rule__Model__BodyAssignment_3 )* ) )
            // InternalRest.g:522:1: ( ( rule__Model__BodyAssignment_3 )* )
            {
            // InternalRest.g:522:1: ( ( rule__Model__BodyAssignment_3 )* )
            // InternalRest.g:523:2: ( rule__Model__BodyAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getBodyAssignment_3()); 
            // InternalRest.g:524:2: ( rule__Model__BodyAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRest.g:524:3: rule__Model__BodyAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__BodyAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalRest.g:532:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:536:1: ( rule__Model__Group__4__Impl )
            // InternalRest.g:537:2: rule__Model__Group__4__Impl
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
    // InternalRest.g:543:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:547:1: ( ( '}' ) )
            // InternalRest.g:548:1: ( '}' )
            {
            // InternalRest.g:548:1: ( '}' )
            // InternalRest.g:549:2: '}'
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


    // $ANTLR start "rule__Body__Group_0__0"
    // InternalRest.g:559:1: rule__Body__Group_0__0 : rule__Body__Group_0__0__Impl rule__Body__Group_0__1 ;
    public final void rule__Body__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:563:1: ( rule__Body__Group_0__0__Impl rule__Body__Group_0__1 )
            // InternalRest.g:564:2: rule__Body__Group_0__0__Impl rule__Body__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Body__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group_0__1();

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
    // $ANTLR end "rule__Body__Group_0__0"


    // $ANTLR start "rule__Body__Group_0__0__Impl"
    // InternalRest.g:571:1: rule__Body__Group_0__0__Impl : ( () ) ;
    public final void rule__Body__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:575:1: ( ( () ) )
            // InternalRest.g:576:1: ( () )
            {
            // InternalRest.g:576:1: ( () )
            // InternalRest.g:577:2: ()
            {
             before(grammarAccess.getBodyAccess().getBodyAction_0_0()); 
            // InternalRest.g:578:2: ()
            // InternalRest.g:578:3: 
            {
            }

             after(grammarAccess.getBodyAccess().getBodyAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_0__0__Impl"


    // $ANTLR start "rule__Body__Group_0__1"
    // InternalRest.g:586:1: rule__Body__Group_0__1 : rule__Body__Group_0__1__Impl ;
    public final void rule__Body__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:590:1: ( rule__Body__Group_0__1__Impl )
            // InternalRest.g:591:2: rule__Body__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group_0__1__Impl();

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
    // $ANTLR end "rule__Body__Group_0__1"


    // $ANTLR start "rule__Body__Group_0__1__Impl"
    // InternalRest.g:597:1: rule__Body__Group_0__1__Impl : ( ( rule__Body__ElemAssignment_0_1 ) ) ;
    public final void rule__Body__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:601:1: ( ( ( rule__Body__ElemAssignment_0_1 ) ) )
            // InternalRest.g:602:1: ( ( rule__Body__ElemAssignment_0_1 ) )
            {
            // InternalRest.g:602:1: ( ( rule__Body__ElemAssignment_0_1 ) )
            // InternalRest.g:603:2: ( rule__Body__ElemAssignment_0_1 )
            {
             before(grammarAccess.getBodyAccess().getElemAssignment_0_1()); 
            // InternalRest.g:604:2: ( rule__Body__ElemAssignment_0_1 )
            // InternalRest.g:604:3: rule__Body__ElemAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Body__ElemAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getElemAssignment_0_1()); 

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
    // $ANTLR end "rule__Body__Group_0__1__Impl"


    // $ANTLR start "rule__Body__Group_1__0"
    // InternalRest.g:613:1: rule__Body__Group_1__0 : rule__Body__Group_1__0__Impl rule__Body__Group_1__1 ;
    public final void rule__Body__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:617:1: ( rule__Body__Group_1__0__Impl rule__Body__Group_1__1 )
            // InternalRest.g:618:2: rule__Body__Group_1__0__Impl rule__Body__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Body__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group_1__1();

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
    // $ANTLR end "rule__Body__Group_1__0"


    // $ANTLR start "rule__Body__Group_1__0__Impl"
    // InternalRest.g:625:1: rule__Body__Group_1__0__Impl : ( () ) ;
    public final void rule__Body__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:629:1: ( ( () ) )
            // InternalRest.g:630:1: ( () )
            {
            // InternalRest.g:630:1: ( () )
            // InternalRest.g:631:2: ()
            {
             before(grammarAccess.getBodyAccess().getBodyAction_1_0()); 
            // InternalRest.g:632:2: ()
            // InternalRest.g:632:3: 
            {
            }

             after(grammarAccess.getBodyAccess().getBodyAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_1__0__Impl"


    // $ANTLR start "rule__Body__Group_1__1"
    // InternalRest.g:640:1: rule__Body__Group_1__1 : rule__Body__Group_1__1__Impl ;
    public final void rule__Body__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:644:1: ( rule__Body__Group_1__1__Impl )
            // InternalRest.g:645:2: rule__Body__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group_1__1__Impl();

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
    // $ANTLR end "rule__Body__Group_1__1"


    // $ANTLR start "rule__Body__Group_1__1__Impl"
    // InternalRest.g:651:1: rule__Body__Group_1__1__Impl : ( ( rule__Body__GlobAtribAssignment_1_1 ) ) ;
    public final void rule__Body__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:655:1: ( ( ( rule__Body__GlobAtribAssignment_1_1 ) ) )
            // InternalRest.g:656:1: ( ( rule__Body__GlobAtribAssignment_1_1 ) )
            {
            // InternalRest.g:656:1: ( ( rule__Body__GlobAtribAssignment_1_1 ) )
            // InternalRest.g:657:2: ( rule__Body__GlobAtribAssignment_1_1 )
            {
             before(grammarAccess.getBodyAccess().getGlobAtribAssignment_1_1()); 
            // InternalRest.g:658:2: ( rule__Body__GlobAtribAssignment_1_1 )
            // InternalRest.g:658:3: rule__Body__GlobAtribAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Body__GlobAtribAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getGlobAtribAssignment_1_1()); 

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
    // $ANTLR end "rule__Body__Group_1__1__Impl"


    // $ANTLR start "rule__Elem__Group__0"
    // InternalRest.g:667:1: rule__Elem__Group__0 : rule__Elem__Group__0__Impl rule__Elem__Group__1 ;
    public final void rule__Elem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:671:1: ( rule__Elem__Group__0__Impl rule__Elem__Group__1 )
            // InternalRest.g:672:2: rule__Elem__Group__0__Impl rule__Elem__Group__1
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
    // InternalRest.g:679:1: rule__Elem__Group__0__Impl : ( ( rule__Elem__ClassNameAssignment_0 ) ) ;
    public final void rule__Elem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:683:1: ( ( ( rule__Elem__ClassNameAssignment_0 ) ) )
            // InternalRest.g:684:1: ( ( rule__Elem__ClassNameAssignment_0 ) )
            {
            // InternalRest.g:684:1: ( ( rule__Elem__ClassNameAssignment_0 ) )
            // InternalRest.g:685:2: ( rule__Elem__ClassNameAssignment_0 )
            {
             before(grammarAccess.getElemAccess().getClassNameAssignment_0()); 
            // InternalRest.g:686:2: ( rule__Elem__ClassNameAssignment_0 )
            // InternalRest.g:686:3: rule__Elem__ClassNameAssignment_0
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
    // InternalRest.g:694:1: rule__Elem__Group__1 : rule__Elem__Group__1__Impl rule__Elem__Group__2 ;
    public final void rule__Elem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:698:1: ( rule__Elem__Group__1__Impl rule__Elem__Group__2 )
            // InternalRest.g:699:2: rule__Elem__Group__1__Impl rule__Elem__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalRest.g:706:1: rule__Elem__Group__1__Impl : ( '{' ) ;
    public final void rule__Elem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:710:1: ( ( '{' ) )
            // InternalRest.g:711:1: ( '{' )
            {
            // InternalRest.g:711:1: ( '{' )
            // InternalRest.g:712:2: '{'
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
    // InternalRest.g:721:1: rule__Elem__Group__2 : rule__Elem__Group__2__Impl rule__Elem__Group__3 ;
    public final void rule__Elem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:725:1: ( rule__Elem__Group__2__Impl rule__Elem__Group__3 )
            // InternalRest.g:726:2: rule__Elem__Group__2__Impl rule__Elem__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalRest.g:733:1: rule__Elem__Group__2__Impl : ( ( rule__Elem__FieldAssignment_2 )* ) ;
    public final void rule__Elem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:737:1: ( ( ( rule__Elem__FieldAssignment_2 )* ) )
            // InternalRest.g:738:1: ( ( rule__Elem__FieldAssignment_2 )* )
            {
            // InternalRest.g:738:1: ( ( rule__Elem__FieldAssignment_2 )* )
            // InternalRest.g:739:2: ( rule__Elem__FieldAssignment_2 )*
            {
             before(grammarAccess.getElemAccess().getFieldAssignment_2()); 
            // InternalRest.g:740:2: ( rule__Elem__FieldAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRest.g:740:3: rule__Elem__FieldAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Elem__FieldAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getElemAccess().getFieldAssignment_2()); 

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
    // InternalRest.g:748:1: rule__Elem__Group__3 : rule__Elem__Group__3__Impl ;
    public final void rule__Elem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:752:1: ( rule__Elem__Group__3__Impl )
            // InternalRest.g:753:2: rule__Elem__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Elem__Group__3__Impl();

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
    // InternalRest.g:759:1: rule__Elem__Group__3__Impl : ( '}' ) ;
    public final void rule__Elem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:763:1: ( ( '}' ) )
            // InternalRest.g:764:1: ( '}' )
            {
            // InternalRest.g:764:1: ( '}' )
            // InternalRest.g:765:2: '}'
            {
             before(grammarAccess.getElemAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getElemAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__Field__Group_0__0"
    // InternalRest.g:775:1: rule__Field__Group_0__0 : rule__Field__Group_0__0__Impl rule__Field__Group_0__1 ;
    public final void rule__Field__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:779:1: ( rule__Field__Group_0__0__Impl rule__Field__Group_0__1 )
            // InternalRest.g:780:2: rule__Field__Group_0__0__Impl rule__Field__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_0__1();

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
    // $ANTLR end "rule__Field__Group_0__0"


    // $ANTLR start "rule__Field__Group_0__0__Impl"
    // InternalRest.g:787:1: rule__Field__Group_0__0__Impl : ( () ) ;
    public final void rule__Field__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:791:1: ( ( () ) )
            // InternalRest.g:792:1: ( () )
            {
            // InternalRest.g:792:1: ( () )
            // InternalRest.g:793:2: ()
            {
             before(grammarAccess.getFieldAccess().getFieldAction_0_0()); 
            // InternalRest.g:794:2: ()
            // InternalRest.g:794:3: 
            {
            }

             after(grammarAccess.getFieldAccess().getFieldAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_0__0__Impl"


    // $ANTLR start "rule__Field__Group_0__1"
    // InternalRest.g:802:1: rule__Field__Group_0__1 : rule__Field__Group_0__1__Impl ;
    public final void rule__Field__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:806:1: ( rule__Field__Group_0__1__Impl )
            // InternalRest.g:807:2: rule__Field__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_0__1__Impl();

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
    // $ANTLR end "rule__Field__Group_0__1"


    // $ANTLR start "rule__Field__Group_0__1__Impl"
    // InternalRest.g:813:1: rule__Field__Group_0__1__Impl : ( ( rule__Field__AtribAssignment_0_1 ) ) ;
    public final void rule__Field__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:817:1: ( ( ( rule__Field__AtribAssignment_0_1 ) ) )
            // InternalRest.g:818:1: ( ( rule__Field__AtribAssignment_0_1 ) )
            {
            // InternalRest.g:818:1: ( ( rule__Field__AtribAssignment_0_1 ) )
            // InternalRest.g:819:2: ( rule__Field__AtribAssignment_0_1 )
            {
             before(grammarAccess.getFieldAccess().getAtribAssignment_0_1()); 
            // InternalRest.g:820:2: ( rule__Field__AtribAssignment_0_1 )
            // InternalRest.g:820:3: rule__Field__AtribAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__AtribAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAtribAssignment_0_1()); 

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
    // $ANTLR end "rule__Field__Group_0__1__Impl"


    // $ANTLR start "rule__Field__Group_1__0"
    // InternalRest.g:829:1: rule__Field__Group_1__0 : rule__Field__Group_1__0__Impl rule__Field__Group_1__1 ;
    public final void rule__Field__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:833:1: ( rule__Field__Group_1__0__Impl rule__Field__Group_1__1 )
            // InternalRest.g:834:2: rule__Field__Group_1__0__Impl rule__Field__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_1__1();

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
    // $ANTLR end "rule__Field__Group_1__0"


    // $ANTLR start "rule__Field__Group_1__0__Impl"
    // InternalRest.g:841:1: rule__Field__Group_1__0__Impl : ( () ) ;
    public final void rule__Field__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:845:1: ( ( () ) )
            // InternalRest.g:846:1: ( () )
            {
            // InternalRest.g:846:1: ( () )
            // InternalRest.g:847:2: ()
            {
             before(grammarAccess.getFieldAccess().getFieldAction_1_0()); 
            // InternalRest.g:848:2: ()
            // InternalRest.g:848:3: 
            {
            }

             after(grammarAccess.getFieldAccess().getFieldAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_1__0__Impl"


    // $ANTLR start "rule__Field__Group_1__1"
    // InternalRest.g:856:1: rule__Field__Group_1__1 : rule__Field__Group_1__1__Impl ;
    public final void rule__Field__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:860:1: ( rule__Field__Group_1__1__Impl )
            // InternalRest.g:861:2: rule__Field__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_1__1__Impl();

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
    // $ANTLR end "rule__Field__Group_1__1"


    // $ANTLR start "rule__Field__Group_1__1__Impl"
    // InternalRest.g:867:1: rule__Field__Group_1__1__Impl : ( ( rule__Field__MethodAssignment_1_1 ) ) ;
    public final void rule__Field__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:871:1: ( ( ( rule__Field__MethodAssignment_1_1 ) ) )
            // InternalRest.g:872:1: ( ( rule__Field__MethodAssignment_1_1 ) )
            {
            // InternalRest.g:872:1: ( ( rule__Field__MethodAssignment_1_1 ) )
            // InternalRest.g:873:2: ( rule__Field__MethodAssignment_1_1 )
            {
             before(grammarAccess.getFieldAccess().getMethodAssignment_1_1()); 
            // InternalRest.g:874:2: ( rule__Field__MethodAssignment_1_1 )
            // InternalRest.g:874:3: rule__Field__MethodAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__MethodAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getMethodAssignment_1_1()); 

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
    // $ANTLR end "rule__Field__Group_1__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalRest.g:883:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:887:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalRest.g:888:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalRest.g:895:1: rule__Method__Group__0__Impl : ( ( rule__Method__MNameAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:899:1: ( ( ( rule__Method__MNameAssignment_0 ) ) )
            // InternalRest.g:900:1: ( ( rule__Method__MNameAssignment_0 ) )
            {
            // InternalRest.g:900:1: ( ( rule__Method__MNameAssignment_0 ) )
            // InternalRest.g:901:2: ( rule__Method__MNameAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getMNameAssignment_0()); 
            // InternalRest.g:902:2: ( rule__Method__MNameAssignment_0 )
            // InternalRest.g:902:3: rule__Method__MNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__MNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getMNameAssignment_0()); 

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
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalRest.g:910:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:914:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalRest.g:915:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalRest.g:922:1: rule__Method__Group__1__Impl : ( '(' ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:926:1: ( ( '(' ) )
            // InternalRest.g:927:1: ( '(' )
            {
            // InternalRest.g:927:1: ( '(' )
            // InternalRest.g:928:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalRest.g:937:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:941:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalRest.g:942:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalRest.g:949:1: rule__Method__Group__2__Impl : ( ( rule__Method__ParAssignment_2 )* ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:953:1: ( ( ( rule__Method__ParAssignment_2 )* ) )
            // InternalRest.g:954:1: ( ( rule__Method__ParAssignment_2 )* )
            {
            // InternalRest.g:954:1: ( ( rule__Method__ParAssignment_2 )* )
            // InternalRest.g:955:2: ( rule__Method__ParAssignment_2 )*
            {
             before(grammarAccess.getMethodAccess().getParAssignment_2()); 
            // InternalRest.g:956:2: ( rule__Method__ParAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRest.g:956:3: rule__Method__ParAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Method__ParAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getParAssignment_2()); 

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
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalRest.g:964:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:968:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalRest.g:969:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalRest.g:976:1: rule__Method__Group__3__Impl : ( ')' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:980:1: ( ( ')' ) )
            // InternalRest.g:981:1: ( ')' )
            {
            // InternalRest.g:981:1: ( ')' )
            // InternalRest.g:982:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalRest.g:991:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:995:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalRest.g:996:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalRest.g:1003:1: rule__Method__Group__4__Impl : ( ':' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1007:1: ( ( ':' ) )
            // InternalRest.g:1008:1: ( ':' )
            {
            // InternalRest.g:1008:1: ( ':' )
            // InternalRest.g:1009:2: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalRest.g:1018:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1022:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalRest.g:1023:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__6();

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
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalRest.g:1030:1: rule__Method__Group__5__Impl : ( ( rule__Method__TipoAssignment_5 ) ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1034:1: ( ( ( rule__Method__TipoAssignment_5 ) ) )
            // InternalRest.g:1035:1: ( ( rule__Method__TipoAssignment_5 ) )
            {
            // InternalRest.g:1035:1: ( ( rule__Method__TipoAssignment_5 ) )
            // InternalRest.g:1036:2: ( rule__Method__TipoAssignment_5 )
            {
             before(grammarAccess.getMethodAccess().getTipoAssignment_5()); 
            // InternalRest.g:1037:2: ( rule__Method__TipoAssignment_5 )
            // InternalRest.g:1037:3: rule__Method__TipoAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Method__TipoAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTipoAssignment_5()); 

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
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // InternalRest.g:1045:1: rule__Method__Group__6 : rule__Method__Group__6__Impl ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1049:1: ( rule__Method__Group__6__Impl )
            // InternalRest.g:1050:2: rule__Method__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__6__Impl();

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
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // InternalRest.g:1056:1: rule__Method__Group__6__Impl : ( ( rule__Method__ImplemAssignment_6 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1060:1: ( ( ( rule__Method__ImplemAssignment_6 )? ) )
            // InternalRest.g:1061:1: ( ( rule__Method__ImplemAssignment_6 )? )
            {
            // InternalRest.g:1061:1: ( ( rule__Method__ImplemAssignment_6 )? )
            // InternalRest.g:1062:2: ( rule__Method__ImplemAssignment_6 )?
            {
             before(grammarAccess.getMethodAccess().getImplemAssignment_6()); 
            // InternalRest.g:1063:2: ( rule__Method__ImplemAssignment_6 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ALMOST__ANY__THING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRest.g:1063:3: rule__Method__ImplemAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__ImplemAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getImplemAssignment_6()); 

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
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Parm__Group__0"
    // InternalRest.g:1072:1: rule__Parm__Group__0 : rule__Parm__Group__0__Impl rule__Parm__Group__1 ;
    public final void rule__Parm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1076:1: ( rule__Parm__Group__0__Impl rule__Parm__Group__1 )
            // InternalRest.g:1077:2: rule__Parm__Group__0__Impl rule__Parm__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Parm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parm__Group__1();

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
    // $ANTLR end "rule__Parm__Group__0"


    // $ANTLR start "rule__Parm__Group__0__Impl"
    // InternalRest.g:1084:1: rule__Parm__Group__0__Impl : ( ( rule__Parm__AtribNameAssignment_0 ) ) ;
    public final void rule__Parm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1088:1: ( ( ( rule__Parm__AtribNameAssignment_0 ) ) )
            // InternalRest.g:1089:1: ( ( rule__Parm__AtribNameAssignment_0 ) )
            {
            // InternalRest.g:1089:1: ( ( rule__Parm__AtribNameAssignment_0 ) )
            // InternalRest.g:1090:2: ( rule__Parm__AtribNameAssignment_0 )
            {
             before(grammarAccess.getParmAccess().getAtribNameAssignment_0()); 
            // InternalRest.g:1091:2: ( rule__Parm__AtribNameAssignment_0 )
            // InternalRest.g:1091:3: rule__Parm__AtribNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parm__AtribNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParmAccess().getAtribNameAssignment_0()); 

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
    // $ANTLR end "rule__Parm__Group__0__Impl"


    // $ANTLR start "rule__Parm__Group__1"
    // InternalRest.g:1099:1: rule__Parm__Group__1 : rule__Parm__Group__1__Impl rule__Parm__Group__2 ;
    public final void rule__Parm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1103:1: ( rule__Parm__Group__1__Impl rule__Parm__Group__2 )
            // InternalRest.g:1104:2: rule__Parm__Group__1__Impl rule__Parm__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Parm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parm__Group__2();

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
    // $ANTLR end "rule__Parm__Group__1"


    // $ANTLR start "rule__Parm__Group__1__Impl"
    // InternalRest.g:1111:1: rule__Parm__Group__1__Impl : ( ':' ) ;
    public final void rule__Parm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1115:1: ( ( ':' ) )
            // InternalRest.g:1116:1: ( ':' )
            {
            // InternalRest.g:1116:1: ( ':' )
            // InternalRest.g:1117:2: ':'
            {
             before(grammarAccess.getParmAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getParmAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Parm__Group__1__Impl"


    // $ANTLR start "rule__Parm__Group__2"
    // InternalRest.g:1126:1: rule__Parm__Group__2 : rule__Parm__Group__2__Impl ;
    public final void rule__Parm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1130:1: ( rule__Parm__Group__2__Impl )
            // InternalRest.g:1131:2: rule__Parm__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parm__Group__2__Impl();

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
    // $ANTLR end "rule__Parm__Group__2"


    // $ANTLR start "rule__Parm__Group__2__Impl"
    // InternalRest.g:1137:1: rule__Parm__Group__2__Impl : ( ( rule__Parm__Tipo_atriAssignment_2 ) ) ;
    public final void rule__Parm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1141:1: ( ( ( rule__Parm__Tipo_atriAssignment_2 ) ) )
            // InternalRest.g:1142:1: ( ( rule__Parm__Tipo_atriAssignment_2 ) )
            {
            // InternalRest.g:1142:1: ( ( rule__Parm__Tipo_atriAssignment_2 ) )
            // InternalRest.g:1143:2: ( rule__Parm__Tipo_atriAssignment_2 )
            {
             before(grammarAccess.getParmAccess().getTipo_atriAssignment_2()); 
            // InternalRest.g:1144:2: ( rule__Parm__Tipo_atriAssignment_2 )
            // InternalRest.g:1144:3: rule__Parm__Tipo_atriAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parm__Tipo_atriAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParmAccess().getTipo_atriAssignment_2()); 

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
    // $ANTLR end "rule__Parm__Group__2__Impl"


    // $ANTLR start "rule__Atrib__Group_0__0"
    // InternalRest.g:1153:1: rule__Atrib__Group_0__0 : rule__Atrib__Group_0__0__Impl rule__Atrib__Group_0__1 ;
    public final void rule__Atrib__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1157:1: ( rule__Atrib__Group_0__0__Impl rule__Atrib__Group_0__1 )
            // InternalRest.g:1158:2: rule__Atrib__Group_0__0__Impl rule__Atrib__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Atrib__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_0__1();

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
    // $ANTLR end "rule__Atrib__Group_0__0"


    // $ANTLR start "rule__Atrib__Group_0__0__Impl"
    // InternalRest.g:1165:1: rule__Atrib__Group_0__0__Impl : ( ( rule__Atrib__AtribNameAssignment_0_0 ) ) ;
    public final void rule__Atrib__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1169:1: ( ( ( rule__Atrib__AtribNameAssignment_0_0 ) ) )
            // InternalRest.g:1170:1: ( ( rule__Atrib__AtribNameAssignment_0_0 ) )
            {
            // InternalRest.g:1170:1: ( ( rule__Atrib__AtribNameAssignment_0_0 ) )
            // InternalRest.g:1171:2: ( rule__Atrib__AtribNameAssignment_0_0 )
            {
             before(grammarAccess.getAtribAccess().getAtribNameAssignment_0_0()); 
            // InternalRest.g:1172:2: ( rule__Atrib__AtribNameAssignment_0_0 )
            // InternalRest.g:1172:3: rule__Atrib__AtribNameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__AtribNameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getAtribNameAssignment_0_0()); 

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
    // $ANTLR end "rule__Atrib__Group_0__0__Impl"


    // $ANTLR start "rule__Atrib__Group_0__1"
    // InternalRest.g:1180:1: rule__Atrib__Group_0__1 : rule__Atrib__Group_0__1__Impl rule__Atrib__Group_0__2 ;
    public final void rule__Atrib__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1184:1: ( rule__Atrib__Group_0__1__Impl rule__Atrib__Group_0__2 )
            // InternalRest.g:1185:2: rule__Atrib__Group_0__1__Impl rule__Atrib__Group_0__2
            {
            pushFollow(FOLLOW_13);
            rule__Atrib__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_0__2();

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
    // $ANTLR end "rule__Atrib__Group_0__1"


    // $ANTLR start "rule__Atrib__Group_0__1__Impl"
    // InternalRest.g:1192:1: rule__Atrib__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Atrib__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1196:1: ( ( ':' ) )
            // InternalRest.g:1197:1: ( ':' )
            {
            // InternalRest.g:1197:1: ( ':' )
            // InternalRest.g:1198:2: ':'
            {
             before(grammarAccess.getAtribAccess().getColonKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getColonKeyword_0_1()); 

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
    // $ANTLR end "rule__Atrib__Group_0__1__Impl"


    // $ANTLR start "rule__Atrib__Group_0__2"
    // InternalRest.g:1207:1: rule__Atrib__Group_0__2 : rule__Atrib__Group_0__2__Impl rule__Atrib__Group_0__3 ;
    public final void rule__Atrib__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1211:1: ( rule__Atrib__Group_0__2__Impl rule__Atrib__Group_0__3 )
            // InternalRest.g:1212:2: rule__Atrib__Group_0__2__Impl rule__Atrib__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__Atrib__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_0__3();

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
    // $ANTLR end "rule__Atrib__Group_0__2"


    // $ANTLR start "rule__Atrib__Group_0__2__Impl"
    // InternalRest.g:1219:1: rule__Atrib__Group_0__2__Impl : ( ( rule__Atrib__TipoAssignment_0_2 ) ) ;
    public final void rule__Atrib__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1223:1: ( ( ( rule__Atrib__TipoAssignment_0_2 ) ) )
            // InternalRest.g:1224:1: ( ( rule__Atrib__TipoAssignment_0_2 ) )
            {
            // InternalRest.g:1224:1: ( ( rule__Atrib__TipoAssignment_0_2 ) )
            // InternalRest.g:1225:2: ( rule__Atrib__TipoAssignment_0_2 )
            {
             before(grammarAccess.getAtribAccess().getTipoAssignment_0_2()); 
            // InternalRest.g:1226:2: ( rule__Atrib__TipoAssignment_0_2 )
            // InternalRest.g:1226:3: rule__Atrib__TipoAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__TipoAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getTipoAssignment_0_2()); 

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
    // $ANTLR end "rule__Atrib__Group_0__2__Impl"


    // $ANTLR start "rule__Atrib__Group_0__3"
    // InternalRest.g:1234:1: rule__Atrib__Group_0__3 : rule__Atrib__Group_0__3__Impl ;
    public final void rule__Atrib__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1238:1: ( rule__Atrib__Group_0__3__Impl )
            // InternalRest.g:1239:2: rule__Atrib__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group_0__3__Impl();

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
    // $ANTLR end "rule__Atrib__Group_0__3"


    // $ANTLR start "rule__Atrib__Group_0__3__Impl"
    // InternalRest.g:1245:1: rule__Atrib__Group_0__3__Impl : ( ( rule__Atrib__Group_0_3__0 )? ) ;
    public final void rule__Atrib__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1249:1: ( ( ( rule__Atrib__Group_0_3__0 )? ) )
            // InternalRest.g:1250:1: ( ( rule__Atrib__Group_0_3__0 )? )
            {
            // InternalRest.g:1250:1: ( ( rule__Atrib__Group_0_3__0 )? )
            // InternalRest.g:1251:2: ( rule__Atrib__Group_0_3__0 )?
            {
             before(grammarAccess.getAtribAccess().getGroup_0_3()); 
            // InternalRest.g:1252:2: ( rule__Atrib__Group_0_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRest.g:1252:3: rule__Atrib__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atrib__Group_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtribAccess().getGroup_0_3()); 

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
    // $ANTLR end "rule__Atrib__Group_0__3__Impl"


    // $ANTLR start "rule__Atrib__Group_0_3__0"
    // InternalRest.g:1261:1: rule__Atrib__Group_0_3__0 : rule__Atrib__Group_0_3__0__Impl rule__Atrib__Group_0_3__1 ;
    public final void rule__Atrib__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1265:1: ( rule__Atrib__Group_0_3__0__Impl rule__Atrib__Group_0_3__1 )
            // InternalRest.g:1266:2: rule__Atrib__Group_0_3__0__Impl rule__Atrib__Group_0_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Atrib__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_0_3__1();

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
    // $ANTLR end "rule__Atrib__Group_0_3__0"


    // $ANTLR start "rule__Atrib__Group_0_3__0__Impl"
    // InternalRest.g:1273:1: rule__Atrib__Group_0_3__0__Impl : ( ':' ) ;
    public final void rule__Atrib__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1277:1: ( ( ':' ) )
            // InternalRest.g:1278:1: ( ':' )
            {
            // InternalRest.g:1278:1: ( ':' )
            // InternalRest.g:1279:2: ':'
            {
             before(grammarAccess.getAtribAccess().getColonKeyword_0_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getColonKeyword_0_3_0()); 

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
    // $ANTLR end "rule__Atrib__Group_0_3__0__Impl"


    // $ANTLR start "rule__Atrib__Group_0_3__1"
    // InternalRest.g:1288:1: rule__Atrib__Group_0_3__1 : rule__Atrib__Group_0_3__1__Impl ;
    public final void rule__Atrib__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1292:1: ( rule__Atrib__Group_0_3__1__Impl )
            // InternalRest.g:1293:2: rule__Atrib__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group_0_3__1__Impl();

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
    // $ANTLR end "rule__Atrib__Group_0_3__1"


    // $ANTLR start "rule__Atrib__Group_0_3__1__Impl"
    // InternalRest.g:1299:1: rule__Atrib__Group_0_3__1__Impl : ( ( rule__Atrib__ValueIntAssignment_0_3_1 ) ) ;
    public final void rule__Atrib__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1303:1: ( ( ( rule__Atrib__ValueIntAssignment_0_3_1 ) ) )
            // InternalRest.g:1304:1: ( ( rule__Atrib__ValueIntAssignment_0_3_1 ) )
            {
            // InternalRest.g:1304:1: ( ( rule__Atrib__ValueIntAssignment_0_3_1 ) )
            // InternalRest.g:1305:2: ( rule__Atrib__ValueIntAssignment_0_3_1 )
            {
             before(grammarAccess.getAtribAccess().getValueIntAssignment_0_3_1()); 
            // InternalRest.g:1306:2: ( rule__Atrib__ValueIntAssignment_0_3_1 )
            // InternalRest.g:1306:3: rule__Atrib__ValueIntAssignment_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__ValueIntAssignment_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getValueIntAssignment_0_3_1()); 

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
    // $ANTLR end "rule__Atrib__Group_0_3__1__Impl"


    // $ANTLR start "rule__Atrib__Group_1__0"
    // InternalRest.g:1315:1: rule__Atrib__Group_1__0 : rule__Atrib__Group_1__0__Impl rule__Atrib__Group_1__1 ;
    public final void rule__Atrib__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1319:1: ( rule__Atrib__Group_1__0__Impl rule__Atrib__Group_1__1 )
            // InternalRest.g:1320:2: rule__Atrib__Group_1__0__Impl rule__Atrib__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Atrib__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_1__1();

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
    // $ANTLR end "rule__Atrib__Group_1__0"


    // $ANTLR start "rule__Atrib__Group_1__0__Impl"
    // InternalRest.g:1327:1: rule__Atrib__Group_1__0__Impl : ( ( rule__Atrib__AtribNameAssignment_1_0 ) ) ;
    public final void rule__Atrib__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1331:1: ( ( ( rule__Atrib__AtribNameAssignment_1_0 ) ) )
            // InternalRest.g:1332:1: ( ( rule__Atrib__AtribNameAssignment_1_0 ) )
            {
            // InternalRest.g:1332:1: ( ( rule__Atrib__AtribNameAssignment_1_0 ) )
            // InternalRest.g:1333:2: ( rule__Atrib__AtribNameAssignment_1_0 )
            {
             before(grammarAccess.getAtribAccess().getAtribNameAssignment_1_0()); 
            // InternalRest.g:1334:2: ( rule__Atrib__AtribNameAssignment_1_0 )
            // InternalRest.g:1334:3: rule__Atrib__AtribNameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__AtribNameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getAtribNameAssignment_1_0()); 

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
    // $ANTLR end "rule__Atrib__Group_1__0__Impl"


    // $ANTLR start "rule__Atrib__Group_1__1"
    // InternalRest.g:1342:1: rule__Atrib__Group_1__1 : rule__Atrib__Group_1__1__Impl rule__Atrib__Group_1__2 ;
    public final void rule__Atrib__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1346:1: ( rule__Atrib__Group_1__1__Impl rule__Atrib__Group_1__2 )
            // InternalRest.g:1347:2: rule__Atrib__Group_1__1__Impl rule__Atrib__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Atrib__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_1__2();

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
    // $ANTLR end "rule__Atrib__Group_1__1"


    // $ANTLR start "rule__Atrib__Group_1__1__Impl"
    // InternalRest.g:1354:1: rule__Atrib__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Atrib__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1358:1: ( ( ':' ) )
            // InternalRest.g:1359:1: ( ':' )
            {
            // InternalRest.g:1359:1: ( ':' )
            // InternalRest.g:1360:2: ':'
            {
             before(grammarAccess.getAtribAccess().getColonKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getColonKeyword_1_1()); 

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
    // $ANTLR end "rule__Atrib__Group_1__1__Impl"


    // $ANTLR start "rule__Atrib__Group_1__2"
    // InternalRest.g:1369:1: rule__Atrib__Group_1__2 : rule__Atrib__Group_1__2__Impl rule__Atrib__Group_1__3 ;
    public final void rule__Atrib__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1373:1: ( rule__Atrib__Group_1__2__Impl rule__Atrib__Group_1__3 )
            // InternalRest.g:1374:2: rule__Atrib__Group_1__2__Impl rule__Atrib__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__Atrib__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_1__3();

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
    // $ANTLR end "rule__Atrib__Group_1__2"


    // $ANTLR start "rule__Atrib__Group_1__2__Impl"
    // InternalRest.g:1381:1: rule__Atrib__Group_1__2__Impl : ( ( rule__Atrib__TipoAssignment_1_2 ) ) ;
    public final void rule__Atrib__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1385:1: ( ( ( rule__Atrib__TipoAssignment_1_2 ) ) )
            // InternalRest.g:1386:1: ( ( rule__Atrib__TipoAssignment_1_2 ) )
            {
            // InternalRest.g:1386:1: ( ( rule__Atrib__TipoAssignment_1_2 ) )
            // InternalRest.g:1387:2: ( rule__Atrib__TipoAssignment_1_2 )
            {
             before(grammarAccess.getAtribAccess().getTipoAssignment_1_2()); 
            // InternalRest.g:1388:2: ( rule__Atrib__TipoAssignment_1_2 )
            // InternalRest.g:1388:3: rule__Atrib__TipoAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__TipoAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getTipoAssignment_1_2()); 

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
    // $ANTLR end "rule__Atrib__Group_1__2__Impl"


    // $ANTLR start "rule__Atrib__Group_1__3"
    // InternalRest.g:1396:1: rule__Atrib__Group_1__3 : rule__Atrib__Group_1__3__Impl ;
    public final void rule__Atrib__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1400:1: ( rule__Atrib__Group_1__3__Impl )
            // InternalRest.g:1401:2: rule__Atrib__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group_1__3__Impl();

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
    // $ANTLR end "rule__Atrib__Group_1__3"


    // $ANTLR start "rule__Atrib__Group_1__3__Impl"
    // InternalRest.g:1407:1: rule__Atrib__Group_1__3__Impl : ( ( rule__Atrib__Group_1_3__0 )? ) ;
    public final void rule__Atrib__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1411:1: ( ( ( rule__Atrib__Group_1_3__0 )? ) )
            // InternalRest.g:1412:1: ( ( rule__Atrib__Group_1_3__0 )? )
            {
            // InternalRest.g:1412:1: ( ( rule__Atrib__Group_1_3__0 )? )
            // InternalRest.g:1413:2: ( rule__Atrib__Group_1_3__0 )?
            {
             before(grammarAccess.getAtribAccess().getGroup_1_3()); 
            // InternalRest.g:1414:2: ( rule__Atrib__Group_1_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRest.g:1414:3: rule__Atrib__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atrib__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtribAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__Atrib__Group_1__3__Impl"


    // $ANTLR start "rule__Atrib__Group_1_3__0"
    // InternalRest.g:1423:1: rule__Atrib__Group_1_3__0 : rule__Atrib__Group_1_3__0__Impl rule__Atrib__Group_1_3__1 ;
    public final void rule__Atrib__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1427:1: ( rule__Atrib__Group_1_3__0__Impl rule__Atrib__Group_1_3__1 )
            // InternalRest.g:1428:2: rule__Atrib__Group_1_3__0__Impl rule__Atrib__Group_1_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Atrib__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_1_3__1();

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
    // $ANTLR end "rule__Atrib__Group_1_3__0"


    // $ANTLR start "rule__Atrib__Group_1_3__0__Impl"
    // InternalRest.g:1435:1: rule__Atrib__Group_1_3__0__Impl : ( ':' ) ;
    public final void rule__Atrib__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1439:1: ( ( ':' ) )
            // InternalRest.g:1440:1: ( ':' )
            {
            // InternalRest.g:1440:1: ( ':' )
            // InternalRest.g:1441:2: ':'
            {
             before(grammarAccess.getAtribAccess().getColonKeyword_1_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getColonKeyword_1_3_0()); 

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
    // $ANTLR end "rule__Atrib__Group_1_3__0__Impl"


    // $ANTLR start "rule__Atrib__Group_1_3__1"
    // InternalRest.g:1450:1: rule__Atrib__Group_1_3__1 : rule__Atrib__Group_1_3__1__Impl ;
    public final void rule__Atrib__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1454:1: ( rule__Atrib__Group_1_3__1__Impl )
            // InternalRest.g:1455:2: rule__Atrib__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group_1_3__1__Impl();

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
    // $ANTLR end "rule__Atrib__Group_1_3__1"


    // $ANTLR start "rule__Atrib__Group_1_3__1__Impl"
    // InternalRest.g:1461:1: rule__Atrib__Group_1_3__1__Impl : ( ( rule__Atrib__ValueBoolAssignment_1_3_1 ) ) ;
    public final void rule__Atrib__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1465:1: ( ( ( rule__Atrib__ValueBoolAssignment_1_3_1 ) ) )
            // InternalRest.g:1466:1: ( ( rule__Atrib__ValueBoolAssignment_1_3_1 ) )
            {
            // InternalRest.g:1466:1: ( ( rule__Atrib__ValueBoolAssignment_1_3_1 ) )
            // InternalRest.g:1467:2: ( rule__Atrib__ValueBoolAssignment_1_3_1 )
            {
             before(grammarAccess.getAtribAccess().getValueBoolAssignment_1_3_1()); 
            // InternalRest.g:1468:2: ( rule__Atrib__ValueBoolAssignment_1_3_1 )
            // InternalRest.g:1468:3: rule__Atrib__ValueBoolAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__ValueBoolAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getValueBoolAssignment_1_3_1()); 

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
    // $ANTLR end "rule__Atrib__Group_1_3__1__Impl"


    // $ANTLR start "rule__Atrib__Group_2__0"
    // InternalRest.g:1477:1: rule__Atrib__Group_2__0 : rule__Atrib__Group_2__0__Impl rule__Atrib__Group_2__1 ;
    public final void rule__Atrib__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1481:1: ( rule__Atrib__Group_2__0__Impl rule__Atrib__Group_2__1 )
            // InternalRest.g:1482:2: rule__Atrib__Group_2__0__Impl rule__Atrib__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Atrib__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_2__1();

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
    // $ANTLR end "rule__Atrib__Group_2__0"


    // $ANTLR start "rule__Atrib__Group_2__0__Impl"
    // InternalRest.g:1489:1: rule__Atrib__Group_2__0__Impl : ( ( rule__Atrib__AtribNameAssignment_2_0 ) ) ;
    public final void rule__Atrib__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1493:1: ( ( ( rule__Atrib__AtribNameAssignment_2_0 ) ) )
            // InternalRest.g:1494:1: ( ( rule__Atrib__AtribNameAssignment_2_0 ) )
            {
            // InternalRest.g:1494:1: ( ( rule__Atrib__AtribNameAssignment_2_0 ) )
            // InternalRest.g:1495:2: ( rule__Atrib__AtribNameAssignment_2_0 )
            {
             before(grammarAccess.getAtribAccess().getAtribNameAssignment_2_0()); 
            // InternalRest.g:1496:2: ( rule__Atrib__AtribNameAssignment_2_0 )
            // InternalRest.g:1496:3: rule__Atrib__AtribNameAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__AtribNameAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getAtribNameAssignment_2_0()); 

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
    // $ANTLR end "rule__Atrib__Group_2__0__Impl"


    // $ANTLR start "rule__Atrib__Group_2__1"
    // InternalRest.g:1504:1: rule__Atrib__Group_2__1 : rule__Atrib__Group_2__1__Impl rule__Atrib__Group_2__2 ;
    public final void rule__Atrib__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1508:1: ( rule__Atrib__Group_2__1__Impl rule__Atrib__Group_2__2 )
            // InternalRest.g:1509:2: rule__Atrib__Group_2__1__Impl rule__Atrib__Group_2__2
            {
            pushFollow(FOLLOW_17);
            rule__Atrib__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_2__2();

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
    // $ANTLR end "rule__Atrib__Group_2__1"


    // $ANTLR start "rule__Atrib__Group_2__1__Impl"
    // InternalRest.g:1516:1: rule__Atrib__Group_2__1__Impl : ( ':' ) ;
    public final void rule__Atrib__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1520:1: ( ( ':' ) )
            // InternalRest.g:1521:1: ( ':' )
            {
            // InternalRest.g:1521:1: ( ':' )
            // InternalRest.g:1522:2: ':'
            {
             before(grammarAccess.getAtribAccess().getColonKeyword_2_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getColonKeyword_2_1()); 

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
    // $ANTLR end "rule__Atrib__Group_2__1__Impl"


    // $ANTLR start "rule__Atrib__Group_2__2"
    // InternalRest.g:1531:1: rule__Atrib__Group_2__2 : rule__Atrib__Group_2__2__Impl rule__Atrib__Group_2__3 ;
    public final void rule__Atrib__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1535:1: ( rule__Atrib__Group_2__2__Impl rule__Atrib__Group_2__3 )
            // InternalRest.g:1536:2: rule__Atrib__Group_2__2__Impl rule__Atrib__Group_2__3
            {
            pushFollow(FOLLOW_10);
            rule__Atrib__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_2__3();

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
    // $ANTLR end "rule__Atrib__Group_2__2"


    // $ANTLR start "rule__Atrib__Group_2__2__Impl"
    // InternalRest.g:1543:1: rule__Atrib__Group_2__2__Impl : ( ( rule__Atrib__TipoAssignment_2_2 ) ) ;
    public final void rule__Atrib__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1547:1: ( ( ( rule__Atrib__TipoAssignment_2_2 ) ) )
            // InternalRest.g:1548:1: ( ( rule__Atrib__TipoAssignment_2_2 ) )
            {
            // InternalRest.g:1548:1: ( ( rule__Atrib__TipoAssignment_2_2 ) )
            // InternalRest.g:1549:2: ( rule__Atrib__TipoAssignment_2_2 )
            {
             before(grammarAccess.getAtribAccess().getTipoAssignment_2_2()); 
            // InternalRest.g:1550:2: ( rule__Atrib__TipoAssignment_2_2 )
            // InternalRest.g:1550:3: rule__Atrib__TipoAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__TipoAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getTipoAssignment_2_2()); 

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
    // $ANTLR end "rule__Atrib__Group_2__2__Impl"


    // $ANTLR start "rule__Atrib__Group_2__3"
    // InternalRest.g:1558:1: rule__Atrib__Group_2__3 : rule__Atrib__Group_2__3__Impl ;
    public final void rule__Atrib__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1562:1: ( rule__Atrib__Group_2__3__Impl )
            // InternalRest.g:1563:2: rule__Atrib__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group_2__3__Impl();

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
    // $ANTLR end "rule__Atrib__Group_2__3"


    // $ANTLR start "rule__Atrib__Group_2__3__Impl"
    // InternalRest.g:1569:1: rule__Atrib__Group_2__3__Impl : ( ( rule__Atrib__Group_2_3__0 )? ) ;
    public final void rule__Atrib__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1573:1: ( ( ( rule__Atrib__Group_2_3__0 )? ) )
            // InternalRest.g:1574:1: ( ( rule__Atrib__Group_2_3__0 )? )
            {
            // InternalRest.g:1574:1: ( ( rule__Atrib__Group_2_3__0 )? )
            // InternalRest.g:1575:2: ( rule__Atrib__Group_2_3__0 )?
            {
             before(grammarAccess.getAtribAccess().getGroup_2_3()); 
            // InternalRest.g:1576:2: ( rule__Atrib__Group_2_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRest.g:1576:3: rule__Atrib__Group_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atrib__Group_2_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtribAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__Atrib__Group_2__3__Impl"


    // $ANTLR start "rule__Atrib__Group_2_3__0"
    // InternalRest.g:1585:1: rule__Atrib__Group_2_3__0 : rule__Atrib__Group_2_3__0__Impl rule__Atrib__Group_2_3__1 ;
    public final void rule__Atrib__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1589:1: ( rule__Atrib__Group_2_3__0__Impl rule__Atrib__Group_2_3__1 )
            // InternalRest.g:1590:2: rule__Atrib__Group_2_3__0__Impl rule__Atrib__Group_2_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Atrib__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_2_3__1();

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
    // $ANTLR end "rule__Atrib__Group_2_3__0"


    // $ANTLR start "rule__Atrib__Group_2_3__0__Impl"
    // InternalRest.g:1597:1: rule__Atrib__Group_2_3__0__Impl : ( ':' ) ;
    public final void rule__Atrib__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1601:1: ( ( ':' ) )
            // InternalRest.g:1602:1: ( ':' )
            {
            // InternalRest.g:1602:1: ( ':' )
            // InternalRest.g:1603:2: ':'
            {
             before(grammarAccess.getAtribAccess().getColonKeyword_2_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getColonKeyword_2_3_0()); 

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
    // $ANTLR end "rule__Atrib__Group_2_3__0__Impl"


    // $ANTLR start "rule__Atrib__Group_2_3__1"
    // InternalRest.g:1612:1: rule__Atrib__Group_2_3__1 : rule__Atrib__Group_2_3__1__Impl ;
    public final void rule__Atrib__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1616:1: ( rule__Atrib__Group_2_3__1__Impl )
            // InternalRest.g:1617:2: rule__Atrib__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__Atrib__Group_2_3__1"


    // $ANTLR start "rule__Atrib__Group_2_3__1__Impl"
    // InternalRest.g:1623:1: rule__Atrib__Group_2_3__1__Impl : ( ( rule__Atrib__ValueFloAssignment_2_3_1 ) ) ;
    public final void rule__Atrib__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1627:1: ( ( ( rule__Atrib__ValueFloAssignment_2_3_1 ) ) )
            // InternalRest.g:1628:1: ( ( rule__Atrib__ValueFloAssignment_2_3_1 ) )
            {
            // InternalRest.g:1628:1: ( ( rule__Atrib__ValueFloAssignment_2_3_1 ) )
            // InternalRest.g:1629:2: ( rule__Atrib__ValueFloAssignment_2_3_1 )
            {
             before(grammarAccess.getAtribAccess().getValueFloAssignment_2_3_1()); 
            // InternalRest.g:1630:2: ( rule__Atrib__ValueFloAssignment_2_3_1 )
            // InternalRest.g:1630:3: rule__Atrib__ValueFloAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__ValueFloAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getValueFloAssignment_2_3_1()); 

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
    // $ANTLR end "rule__Atrib__Group_2_3__1__Impl"


    // $ANTLR start "rule__Atrib__Group_3__0"
    // InternalRest.g:1639:1: rule__Atrib__Group_3__0 : rule__Atrib__Group_3__0__Impl rule__Atrib__Group_3__1 ;
    public final void rule__Atrib__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1643:1: ( rule__Atrib__Group_3__0__Impl rule__Atrib__Group_3__1 )
            // InternalRest.g:1644:2: rule__Atrib__Group_3__0__Impl rule__Atrib__Group_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRest.g:1651:1: rule__Atrib__Group_3__0__Impl : ( ( rule__Atrib__AtribNameAssignment_3_0 ) ) ;
    public final void rule__Atrib__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1655:1: ( ( ( rule__Atrib__AtribNameAssignment_3_0 ) ) )
            // InternalRest.g:1656:1: ( ( rule__Atrib__AtribNameAssignment_3_0 ) )
            {
            // InternalRest.g:1656:1: ( ( rule__Atrib__AtribNameAssignment_3_0 ) )
            // InternalRest.g:1657:2: ( rule__Atrib__AtribNameAssignment_3_0 )
            {
             before(grammarAccess.getAtribAccess().getAtribNameAssignment_3_0()); 
            // InternalRest.g:1658:2: ( rule__Atrib__AtribNameAssignment_3_0 )
            // InternalRest.g:1658:3: rule__Atrib__AtribNameAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__AtribNameAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getAtribNameAssignment_3_0()); 

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
    // InternalRest.g:1666:1: rule__Atrib__Group_3__1 : rule__Atrib__Group_3__1__Impl rule__Atrib__Group_3__2 ;
    public final void rule__Atrib__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1670:1: ( rule__Atrib__Group_3__1__Impl rule__Atrib__Group_3__2 )
            // InternalRest.g:1671:2: rule__Atrib__Group_3__1__Impl rule__Atrib__Group_3__2
            {
            pushFollow(FOLLOW_19);
            rule__Atrib__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_3__2();

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
    // InternalRest.g:1678:1: rule__Atrib__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Atrib__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1682:1: ( ( ':' ) )
            // InternalRest.g:1683:1: ( ':' )
            {
            // InternalRest.g:1683:1: ( ':' )
            // InternalRest.g:1684:2: ':'
            {
             before(grammarAccess.getAtribAccess().getColonKeyword_3_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getColonKeyword_3_1()); 

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


    // $ANTLR start "rule__Atrib__Group_3__2"
    // InternalRest.g:1693:1: rule__Atrib__Group_3__2 : rule__Atrib__Group_3__2__Impl rule__Atrib__Group_3__3 ;
    public final void rule__Atrib__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1697:1: ( rule__Atrib__Group_3__2__Impl rule__Atrib__Group_3__3 )
            // InternalRest.g:1698:2: rule__Atrib__Group_3__2__Impl rule__Atrib__Group_3__3
            {
            pushFollow(FOLLOW_10);
            rule__Atrib__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_3__3();

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
    // $ANTLR end "rule__Atrib__Group_3__2"


    // $ANTLR start "rule__Atrib__Group_3__2__Impl"
    // InternalRest.g:1705:1: rule__Atrib__Group_3__2__Impl : ( ( rule__Atrib__TipoAssignment_3_2 ) ) ;
    public final void rule__Atrib__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1709:1: ( ( ( rule__Atrib__TipoAssignment_3_2 ) ) )
            // InternalRest.g:1710:1: ( ( rule__Atrib__TipoAssignment_3_2 ) )
            {
            // InternalRest.g:1710:1: ( ( rule__Atrib__TipoAssignment_3_2 ) )
            // InternalRest.g:1711:2: ( rule__Atrib__TipoAssignment_3_2 )
            {
             before(grammarAccess.getAtribAccess().getTipoAssignment_3_2()); 
            // InternalRest.g:1712:2: ( rule__Atrib__TipoAssignment_3_2 )
            // InternalRest.g:1712:3: rule__Atrib__TipoAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__TipoAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getTipoAssignment_3_2()); 

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
    // $ANTLR end "rule__Atrib__Group_3__2__Impl"


    // $ANTLR start "rule__Atrib__Group_3__3"
    // InternalRest.g:1720:1: rule__Atrib__Group_3__3 : rule__Atrib__Group_3__3__Impl ;
    public final void rule__Atrib__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1724:1: ( rule__Atrib__Group_3__3__Impl )
            // InternalRest.g:1725:2: rule__Atrib__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group_3__3__Impl();

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
    // $ANTLR end "rule__Atrib__Group_3__3"


    // $ANTLR start "rule__Atrib__Group_3__3__Impl"
    // InternalRest.g:1731:1: rule__Atrib__Group_3__3__Impl : ( ( rule__Atrib__Group_3_3__0 )? ) ;
    public final void rule__Atrib__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1735:1: ( ( ( rule__Atrib__Group_3_3__0 )? ) )
            // InternalRest.g:1736:1: ( ( rule__Atrib__Group_3_3__0 )? )
            {
            // InternalRest.g:1736:1: ( ( rule__Atrib__Group_3_3__0 )? )
            // InternalRest.g:1737:2: ( rule__Atrib__Group_3_3__0 )?
            {
             before(grammarAccess.getAtribAccess().getGroup_3_3()); 
            // InternalRest.g:1738:2: ( rule__Atrib__Group_3_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRest.g:1738:3: rule__Atrib__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atrib__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtribAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Atrib__Group_3__3__Impl"


    // $ANTLR start "rule__Atrib__Group_3_3__0"
    // InternalRest.g:1747:1: rule__Atrib__Group_3_3__0 : rule__Atrib__Group_3_3__0__Impl rule__Atrib__Group_3_3__1 ;
    public final void rule__Atrib__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1751:1: ( rule__Atrib__Group_3_3__0__Impl rule__Atrib__Group_3_3__1 )
            // InternalRest.g:1752:2: rule__Atrib__Group_3_3__0__Impl rule__Atrib__Group_3_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Atrib__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_3_3__1();

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
    // $ANTLR end "rule__Atrib__Group_3_3__0"


    // $ANTLR start "rule__Atrib__Group_3_3__0__Impl"
    // InternalRest.g:1759:1: rule__Atrib__Group_3_3__0__Impl : ( ':' ) ;
    public final void rule__Atrib__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1763:1: ( ( ':' ) )
            // InternalRest.g:1764:1: ( ':' )
            {
            // InternalRest.g:1764:1: ( ':' )
            // InternalRest.g:1765:2: ':'
            {
             before(grammarAccess.getAtribAccess().getColonKeyword_3_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getColonKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Atrib__Group_3_3__0__Impl"


    // $ANTLR start "rule__Atrib__Group_3_3__1"
    // InternalRest.g:1774:1: rule__Atrib__Group_3_3__1 : rule__Atrib__Group_3_3__1__Impl ;
    public final void rule__Atrib__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1778:1: ( rule__Atrib__Group_3_3__1__Impl )
            // InternalRest.g:1779:2: rule__Atrib__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Atrib__Group_3_3__1"


    // $ANTLR start "rule__Atrib__Group_3_3__1__Impl"
    // InternalRest.g:1785:1: rule__Atrib__Group_3_3__1__Impl : ( ( rule__Atrib__ValueStrAssignment_3_3_1 ) ) ;
    public final void rule__Atrib__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1789:1: ( ( ( rule__Atrib__ValueStrAssignment_3_3_1 ) ) )
            // InternalRest.g:1790:1: ( ( rule__Atrib__ValueStrAssignment_3_3_1 ) )
            {
            // InternalRest.g:1790:1: ( ( rule__Atrib__ValueStrAssignment_3_3_1 ) )
            // InternalRest.g:1791:2: ( rule__Atrib__ValueStrAssignment_3_3_1 )
            {
             before(grammarAccess.getAtribAccess().getValueStrAssignment_3_3_1()); 
            // InternalRest.g:1792:2: ( rule__Atrib__ValueStrAssignment_3_3_1 )
            // InternalRest.g:1792:3: rule__Atrib__ValueStrAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__ValueStrAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getValueStrAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Atrib__Group_3_3__1__Impl"


    // $ANTLR start "rule__Atrib__Group_4__0"
    // InternalRest.g:1801:1: rule__Atrib__Group_4__0 : rule__Atrib__Group_4__0__Impl rule__Atrib__Group_4__1 ;
    public final void rule__Atrib__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1805:1: ( rule__Atrib__Group_4__0__Impl rule__Atrib__Group_4__1 )
            // InternalRest.g:1806:2: rule__Atrib__Group_4__0__Impl rule__Atrib__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Atrib__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_4__1();

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
    // $ANTLR end "rule__Atrib__Group_4__0"


    // $ANTLR start "rule__Atrib__Group_4__0__Impl"
    // InternalRest.g:1813:1: rule__Atrib__Group_4__0__Impl : ( ( rule__Atrib__AtribNameAssignment_4_0 ) ) ;
    public final void rule__Atrib__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1817:1: ( ( ( rule__Atrib__AtribNameAssignment_4_0 ) ) )
            // InternalRest.g:1818:1: ( ( rule__Atrib__AtribNameAssignment_4_0 ) )
            {
            // InternalRest.g:1818:1: ( ( rule__Atrib__AtribNameAssignment_4_0 ) )
            // InternalRest.g:1819:2: ( rule__Atrib__AtribNameAssignment_4_0 )
            {
             before(grammarAccess.getAtribAccess().getAtribNameAssignment_4_0()); 
            // InternalRest.g:1820:2: ( rule__Atrib__AtribNameAssignment_4_0 )
            // InternalRest.g:1820:3: rule__Atrib__AtribNameAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__AtribNameAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getAtribNameAssignment_4_0()); 

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
    // $ANTLR end "rule__Atrib__Group_4__0__Impl"


    // $ANTLR start "rule__Atrib__Group_4__1"
    // InternalRest.g:1828:1: rule__Atrib__Group_4__1 : rule__Atrib__Group_4__1__Impl rule__Atrib__Group_4__2 ;
    public final void rule__Atrib__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1832:1: ( rule__Atrib__Group_4__1__Impl rule__Atrib__Group_4__2 )
            // InternalRest.g:1833:2: rule__Atrib__Group_4__1__Impl rule__Atrib__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__Atrib__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_4__2();

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
    // $ANTLR end "rule__Atrib__Group_4__1"


    // $ANTLR start "rule__Atrib__Group_4__1__Impl"
    // InternalRest.g:1840:1: rule__Atrib__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Atrib__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1844:1: ( ( ':' ) )
            // InternalRest.g:1845:1: ( ':' )
            {
            // InternalRest.g:1845:1: ( ':' )
            // InternalRest.g:1846:2: ':'
            {
             before(grammarAccess.getAtribAccess().getColonKeyword_4_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getColonKeyword_4_1()); 

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
    // $ANTLR end "rule__Atrib__Group_4__1__Impl"


    // $ANTLR start "rule__Atrib__Group_4__2"
    // InternalRest.g:1855:1: rule__Atrib__Group_4__2 : rule__Atrib__Group_4__2__Impl rule__Atrib__Group_4__3 ;
    public final void rule__Atrib__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1859:1: ( rule__Atrib__Group_4__2__Impl rule__Atrib__Group_4__3 )
            // InternalRest.g:1860:2: rule__Atrib__Group_4__2__Impl rule__Atrib__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__Atrib__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_4__3();

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
    // $ANTLR end "rule__Atrib__Group_4__2"


    // $ANTLR start "rule__Atrib__Group_4__2__Impl"
    // InternalRest.g:1867:1: rule__Atrib__Group_4__2__Impl : ( ( rule__Atrib__TipoAssignment_4_2 ) ) ;
    public final void rule__Atrib__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1871:1: ( ( ( rule__Atrib__TipoAssignment_4_2 ) ) )
            // InternalRest.g:1872:1: ( ( rule__Atrib__TipoAssignment_4_2 ) )
            {
            // InternalRest.g:1872:1: ( ( rule__Atrib__TipoAssignment_4_2 ) )
            // InternalRest.g:1873:2: ( rule__Atrib__TipoAssignment_4_2 )
            {
             before(grammarAccess.getAtribAccess().getTipoAssignment_4_2()); 
            // InternalRest.g:1874:2: ( rule__Atrib__TipoAssignment_4_2 )
            // InternalRest.g:1874:3: rule__Atrib__TipoAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__TipoAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getTipoAssignment_4_2()); 

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
    // $ANTLR end "rule__Atrib__Group_4__2__Impl"


    // $ANTLR start "rule__Atrib__Group_4__3"
    // InternalRest.g:1882:1: rule__Atrib__Group_4__3 : rule__Atrib__Group_4__3__Impl ;
    public final void rule__Atrib__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1886:1: ( rule__Atrib__Group_4__3__Impl )
            // InternalRest.g:1887:2: rule__Atrib__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group_4__3__Impl();

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
    // $ANTLR end "rule__Atrib__Group_4__3"


    // $ANTLR start "rule__Atrib__Group_4__3__Impl"
    // InternalRest.g:1893:1: rule__Atrib__Group_4__3__Impl : ( ( rule__Atrib__Group_4_3__0 )? ) ;
    public final void rule__Atrib__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1897:1: ( ( ( rule__Atrib__Group_4_3__0 )? ) )
            // InternalRest.g:1898:1: ( ( rule__Atrib__Group_4_3__0 )? )
            {
            // InternalRest.g:1898:1: ( ( rule__Atrib__Group_4_3__0 )? )
            // InternalRest.g:1899:2: ( rule__Atrib__Group_4_3__0 )?
            {
             before(grammarAccess.getAtribAccess().getGroup_4_3()); 
            // InternalRest.g:1900:2: ( rule__Atrib__Group_4_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRest.g:1900:3: rule__Atrib__Group_4_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atrib__Group_4_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtribAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Atrib__Group_4__3__Impl"


    // $ANTLR start "rule__Atrib__Group_4_3__0"
    // InternalRest.g:1909:1: rule__Atrib__Group_4_3__0 : rule__Atrib__Group_4_3__0__Impl rule__Atrib__Group_4_3__1 ;
    public final void rule__Atrib__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1913:1: ( rule__Atrib__Group_4_3__0__Impl rule__Atrib__Group_4_3__1 )
            // InternalRest.g:1914:2: rule__Atrib__Group_4_3__0__Impl rule__Atrib__Group_4_3__1
            {
            pushFollow(FOLLOW_22);
            rule__Atrib__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_4_3__1();

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
    // $ANTLR end "rule__Atrib__Group_4_3__0"


    // $ANTLR start "rule__Atrib__Group_4_3__0__Impl"
    // InternalRest.g:1921:1: rule__Atrib__Group_4_3__0__Impl : ( ':' ) ;
    public final void rule__Atrib__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1925:1: ( ( ':' ) )
            // InternalRest.g:1926:1: ( ':' )
            {
            // InternalRest.g:1926:1: ( ':' )
            // InternalRest.g:1927:2: ':'
            {
             before(grammarAccess.getAtribAccess().getColonKeyword_4_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getColonKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Atrib__Group_4_3__0__Impl"


    // $ANTLR start "rule__Atrib__Group_4_3__1"
    // InternalRest.g:1936:1: rule__Atrib__Group_4_3__1 : rule__Atrib__Group_4_3__1__Impl ;
    public final void rule__Atrib__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1940:1: ( rule__Atrib__Group_4_3__1__Impl )
            // InternalRest.g:1941:2: rule__Atrib__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Atrib__Group_4_3__1"


    // $ANTLR start "rule__Atrib__Group_4_3__1__Impl"
    // InternalRest.g:1947:1: rule__Atrib__Group_4_3__1__Impl : ( ( rule__Atrib__ValueChrAssignment_4_3_1 ) ) ;
    public final void rule__Atrib__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1951:1: ( ( ( rule__Atrib__ValueChrAssignment_4_3_1 ) ) )
            // InternalRest.g:1952:1: ( ( rule__Atrib__ValueChrAssignment_4_3_1 ) )
            {
            // InternalRest.g:1952:1: ( ( rule__Atrib__ValueChrAssignment_4_3_1 ) )
            // InternalRest.g:1953:2: ( rule__Atrib__ValueChrAssignment_4_3_1 )
            {
             before(grammarAccess.getAtribAccess().getValueChrAssignment_4_3_1()); 
            // InternalRest.g:1954:2: ( rule__Atrib__ValueChrAssignment_4_3_1 )
            // InternalRest.g:1954:3: rule__Atrib__ValueChrAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__ValueChrAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getValueChrAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Atrib__Group_4_3__1__Impl"


    // $ANTLR start "rule__Atrib__Group_5__0"
    // InternalRest.g:1963:1: rule__Atrib__Group_5__0 : rule__Atrib__Group_5__0__Impl rule__Atrib__Group_5__1 ;
    public final void rule__Atrib__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1967:1: ( rule__Atrib__Group_5__0__Impl rule__Atrib__Group_5__1 )
            // InternalRest.g:1968:2: rule__Atrib__Group_5__0__Impl rule__Atrib__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Atrib__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_5__1();

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
    // $ANTLR end "rule__Atrib__Group_5__0"


    // $ANTLR start "rule__Atrib__Group_5__0__Impl"
    // InternalRest.g:1975:1: rule__Atrib__Group_5__0__Impl : ( ( rule__Atrib__AtribNameAssignment_5_0 ) ) ;
    public final void rule__Atrib__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1979:1: ( ( ( rule__Atrib__AtribNameAssignment_5_0 ) ) )
            // InternalRest.g:1980:1: ( ( rule__Atrib__AtribNameAssignment_5_0 ) )
            {
            // InternalRest.g:1980:1: ( ( rule__Atrib__AtribNameAssignment_5_0 ) )
            // InternalRest.g:1981:2: ( rule__Atrib__AtribNameAssignment_5_0 )
            {
             before(grammarAccess.getAtribAccess().getAtribNameAssignment_5_0()); 
            // InternalRest.g:1982:2: ( rule__Atrib__AtribNameAssignment_5_0 )
            // InternalRest.g:1982:3: rule__Atrib__AtribNameAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__AtribNameAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getAtribNameAssignment_5_0()); 

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
    // $ANTLR end "rule__Atrib__Group_5__0__Impl"


    // $ANTLR start "rule__Atrib__Group_5__1"
    // InternalRest.g:1990:1: rule__Atrib__Group_5__1 : rule__Atrib__Group_5__1__Impl rule__Atrib__Group_5__2 ;
    public final void rule__Atrib__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1994:1: ( rule__Atrib__Group_5__1__Impl rule__Atrib__Group_5__2 )
            // InternalRest.g:1995:2: rule__Atrib__Group_5__1__Impl rule__Atrib__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__Atrib__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group_5__2();

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
    // $ANTLR end "rule__Atrib__Group_5__1"


    // $ANTLR start "rule__Atrib__Group_5__1__Impl"
    // InternalRest.g:2002:1: rule__Atrib__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Atrib__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2006:1: ( ( ':' ) )
            // InternalRest.g:2007:1: ( ':' )
            {
            // InternalRest.g:2007:1: ( ':' )
            // InternalRest.g:2008:2: ':'
            {
             before(grammarAccess.getAtribAccess().getColonKeyword_5_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getColonKeyword_5_1()); 

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
    // $ANTLR end "rule__Atrib__Group_5__1__Impl"


    // $ANTLR start "rule__Atrib__Group_5__2"
    // InternalRest.g:2017:1: rule__Atrib__Group_5__2 : rule__Atrib__Group_5__2__Impl ;
    public final void rule__Atrib__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2021:1: ( rule__Atrib__Group_5__2__Impl )
            // InternalRest.g:2022:2: rule__Atrib__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group_5__2__Impl();

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
    // $ANTLR end "rule__Atrib__Group_5__2"


    // $ANTLR start "rule__Atrib__Group_5__2__Impl"
    // InternalRest.g:2028:1: rule__Atrib__Group_5__2__Impl : ( ( rule__Atrib__TipoAssignment_5_2 ) ) ;
    public final void rule__Atrib__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2032:1: ( ( ( rule__Atrib__TipoAssignment_5_2 ) ) )
            // InternalRest.g:2033:1: ( ( rule__Atrib__TipoAssignment_5_2 ) )
            {
            // InternalRest.g:2033:1: ( ( rule__Atrib__TipoAssignment_5_2 ) )
            // InternalRest.g:2034:2: ( rule__Atrib__TipoAssignment_5_2 )
            {
             before(grammarAccess.getAtribAccess().getTipoAssignment_5_2()); 
            // InternalRest.g:2035:2: ( rule__Atrib__TipoAssignment_5_2 )
            // InternalRest.g:2035:3: rule__Atrib__TipoAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__TipoAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getTipoAssignment_5_2()); 

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
    // $ANTLR end "rule__Atrib__Group_5__2__Impl"


    // $ANTLR start "rule__TYPE_NAME__Group__0"
    // InternalRest.g:2044:1: rule__TYPE_NAME__Group__0 : rule__TYPE_NAME__Group__0__Impl rule__TYPE_NAME__Group__1 ;
    public final void rule__TYPE_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2048:1: ( rule__TYPE_NAME__Group__0__Impl rule__TYPE_NAME__Group__1 )
            // InternalRest.g:2049:2: rule__TYPE_NAME__Group__0__Impl rule__TYPE_NAME__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalRest.g:2056:1: rule__TYPE_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__TYPE_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2060:1: ( ( RULE_ID ) )
            // InternalRest.g:2061:1: ( RULE_ID )
            {
            // InternalRest.g:2061:1: ( RULE_ID )
            // InternalRest.g:2062:2: RULE_ID
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
    // InternalRest.g:2071:1: rule__TYPE_NAME__Group__1 : rule__TYPE_NAME__Group__1__Impl ;
    public final void rule__TYPE_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2075:1: ( rule__TYPE_NAME__Group__1__Impl )
            // InternalRest.g:2076:2: rule__TYPE_NAME__Group__1__Impl
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
    // InternalRest.g:2082:1: rule__TYPE_NAME__Group__1__Impl : ( ( rule__TYPE_NAME__Group_1__0 )? ) ;
    public final void rule__TYPE_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2086:1: ( ( ( rule__TYPE_NAME__Group_1__0 )? ) )
            // InternalRest.g:2087:1: ( ( rule__TYPE_NAME__Group_1__0 )? )
            {
            // InternalRest.g:2087:1: ( ( rule__TYPE_NAME__Group_1__0 )? )
            // InternalRest.g:2088:2: ( rule__TYPE_NAME__Group_1__0 )?
            {
             before(grammarAccess.getTYPE_NAMEAccess().getGroup_1()); 
            // InternalRest.g:2089:2: ( rule__TYPE_NAME__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRest.g:2089:3: rule__TYPE_NAME__Group_1__0
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
    // InternalRest.g:2098:1: rule__TYPE_NAME__Group_1__0 : rule__TYPE_NAME__Group_1__0__Impl rule__TYPE_NAME__Group_1__1 ;
    public final void rule__TYPE_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2102:1: ( rule__TYPE_NAME__Group_1__0__Impl rule__TYPE_NAME__Group_1__1 )
            // InternalRest.g:2103:2: rule__TYPE_NAME__Group_1__0__Impl rule__TYPE_NAME__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalRest.g:2110:1: rule__TYPE_NAME__Group_1__0__Impl : ( '<' ) ;
    public final void rule__TYPE_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2114:1: ( ( '<' ) )
            // InternalRest.g:2115:1: ( '<' )
            {
            // InternalRest.g:2115:1: ( '<' )
            // InternalRest.g:2116:2: '<'
            {
             before(grammarAccess.getTYPE_NAMEAccess().getLessThanSignKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRest.g:2125:1: rule__TYPE_NAME__Group_1__1 : rule__TYPE_NAME__Group_1__1__Impl rule__TYPE_NAME__Group_1__2 ;
    public final void rule__TYPE_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2129:1: ( rule__TYPE_NAME__Group_1__1__Impl rule__TYPE_NAME__Group_1__2 )
            // InternalRest.g:2130:2: rule__TYPE_NAME__Group_1__1__Impl rule__TYPE_NAME__Group_1__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalRest.g:2137:1: rule__TYPE_NAME__Group_1__1__Impl : ( ( rule__TYPE_NAME__Group_1_1__0 )* ) ;
    public final void rule__TYPE_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2141:1: ( ( ( rule__TYPE_NAME__Group_1_1__0 )* ) )
            // InternalRest.g:2142:1: ( ( rule__TYPE_NAME__Group_1_1__0 )* )
            {
            // InternalRest.g:2142:1: ( ( rule__TYPE_NAME__Group_1_1__0 )* )
            // InternalRest.g:2143:2: ( rule__TYPE_NAME__Group_1_1__0 )*
            {
             before(grammarAccess.getTYPE_NAMEAccess().getGroup_1_1()); 
            // InternalRest.g:2144:2: ( rule__TYPE_NAME__Group_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==28) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>=RULE_INT_TYPES && LA16_0<=RULE_FLOAT_TYPES)||(LA16_0>=17 && LA16_0<=19)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRest.g:2144:3: rule__TYPE_NAME__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__TYPE_NAME__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalRest.g:2152:1: rule__TYPE_NAME__Group_1__2 : rule__TYPE_NAME__Group_1__2__Impl rule__TYPE_NAME__Group_1__3 ;
    public final void rule__TYPE_NAME__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2156:1: ( rule__TYPE_NAME__Group_1__2__Impl rule__TYPE_NAME__Group_1__3 )
            // InternalRest.g:2157:2: rule__TYPE_NAME__Group_1__2__Impl rule__TYPE_NAME__Group_1__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalRest.g:2164:1: rule__TYPE_NAME__Group_1__2__Impl : ( RULE_ID ) ;
    public final void rule__TYPE_NAME__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2168:1: ( ( RULE_ID ) )
            // InternalRest.g:2169:1: ( RULE_ID )
            {
            // InternalRest.g:2169:1: ( RULE_ID )
            // InternalRest.g:2170:2: RULE_ID
            {
             before(grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_1_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_1_2()); 

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
    // InternalRest.g:2179:1: rule__TYPE_NAME__Group_1__3 : rule__TYPE_NAME__Group_1__3__Impl ;
    public final void rule__TYPE_NAME__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2183:1: ( rule__TYPE_NAME__Group_1__3__Impl )
            // InternalRest.g:2184:2: rule__TYPE_NAME__Group_1__3__Impl
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
    // InternalRest.g:2190:1: rule__TYPE_NAME__Group_1__3__Impl : ( '>' ) ;
    public final void rule__TYPE_NAME__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2194:1: ( ( '>' ) )
            // InternalRest.g:2195:1: ( '>' )
            {
            // InternalRest.g:2195:1: ( '>' )
            // InternalRest.g:2196:2: '>'
            {
             before(grammarAccess.getTYPE_NAMEAccess().getGreaterThanSignKeyword_1_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRest.g:2206:1: rule__TYPE_NAME__Group_1_1__0 : rule__TYPE_NAME__Group_1_1__0__Impl rule__TYPE_NAME__Group_1_1__1 ;
    public final void rule__TYPE_NAME__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2210:1: ( rule__TYPE_NAME__Group_1_1__0__Impl rule__TYPE_NAME__Group_1_1__1 )
            // InternalRest.g:2211:2: rule__TYPE_NAME__Group_1_1__0__Impl rule__TYPE_NAME__Group_1_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalRest.g:2218:1: rule__TYPE_NAME__Group_1_1__0__Impl : ( ( rule__TYPE_NAME__Alternatives_1_1_0 ) ) ;
    public final void rule__TYPE_NAME__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2222:1: ( ( ( rule__TYPE_NAME__Alternatives_1_1_0 ) ) )
            // InternalRest.g:2223:1: ( ( rule__TYPE_NAME__Alternatives_1_1_0 ) )
            {
            // InternalRest.g:2223:1: ( ( rule__TYPE_NAME__Alternatives_1_1_0 ) )
            // InternalRest.g:2224:2: ( rule__TYPE_NAME__Alternatives_1_1_0 )
            {
             before(grammarAccess.getTYPE_NAMEAccess().getAlternatives_1_1_0()); 
            // InternalRest.g:2225:2: ( rule__TYPE_NAME__Alternatives_1_1_0 )
            // InternalRest.g:2225:3: rule__TYPE_NAME__Alternatives_1_1_0
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
    // InternalRest.g:2233:1: rule__TYPE_NAME__Group_1_1__1 : rule__TYPE_NAME__Group_1_1__1__Impl ;
    public final void rule__TYPE_NAME__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2237:1: ( rule__TYPE_NAME__Group_1_1__1__Impl )
            // InternalRest.g:2238:2: rule__TYPE_NAME__Group_1_1__1__Impl
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
    // InternalRest.g:2244:1: rule__TYPE_NAME__Group_1_1__1__Impl : ( ',' ) ;
    public final void rule__TYPE_NAME__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2248:1: ( ( ',' ) )
            // InternalRest.g:2249:1: ( ',' )
            {
            // InternalRest.g:2249:1: ( ',' )
            // InternalRest.g:2250:2: ','
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


    // $ANTLR start "rule__Model__BodyAssignment_3"
    // InternalRest.g:2260:1: rule__Model__BodyAssignment_3 : ( ruleBody ) ;
    public final void rule__Model__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2264:1: ( ( ruleBody ) )
            // InternalRest.g:2265:2: ( ruleBody )
            {
            // InternalRest.g:2265:2: ( ruleBody )
            // InternalRest.g:2266:3: ruleBody
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


    // $ANTLR start "rule__Body__ElemAssignment_0_1"
    // InternalRest.g:2275:1: rule__Body__ElemAssignment_0_1 : ( ruleElem ) ;
    public final void rule__Body__ElemAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2279:1: ( ( ruleElem ) )
            // InternalRest.g:2280:2: ( ruleElem )
            {
            // InternalRest.g:2280:2: ( ruleElem )
            // InternalRest.g:2281:3: ruleElem
            {
             before(grammarAccess.getBodyAccess().getElemElemParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElem();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getElemElemParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Body__ElemAssignment_0_1"


    // $ANTLR start "rule__Body__GlobAtribAssignment_1_1"
    // InternalRest.g:2290:1: rule__Body__GlobAtribAssignment_1_1 : ( ruleAtrib ) ;
    public final void rule__Body__GlobAtribAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2294:1: ( ( ruleAtrib ) )
            // InternalRest.g:2295:2: ( ruleAtrib )
            {
            // InternalRest.g:2295:2: ( ruleAtrib )
            // InternalRest.g:2296:3: ruleAtrib
            {
             before(grammarAccess.getBodyAccess().getGlobAtribAtribParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtrib();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getGlobAtribAtribParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Body__GlobAtribAssignment_1_1"


    // $ANTLR start "rule__Elem__ClassNameAssignment_0"
    // InternalRest.g:2305:1: rule__Elem__ClassNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Elem__ClassNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2309:1: ( ( RULE_ID ) )
            // InternalRest.g:2310:2: ( RULE_ID )
            {
            // InternalRest.g:2310:2: ( RULE_ID )
            // InternalRest.g:2311:3: RULE_ID
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


    // $ANTLR start "rule__Elem__FieldAssignment_2"
    // InternalRest.g:2320:1: rule__Elem__FieldAssignment_2 : ( ruleField ) ;
    public final void rule__Elem__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2324:1: ( ( ruleField ) )
            // InternalRest.g:2325:2: ( ruleField )
            {
            // InternalRest.g:2325:2: ( ruleField )
            // InternalRest.g:2326:3: ruleField
            {
             before(grammarAccess.getElemAccess().getFieldFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getElemAccess().getFieldFieldParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Elem__FieldAssignment_2"


    // $ANTLR start "rule__Field__AtribAssignment_0_1"
    // InternalRest.g:2335:1: rule__Field__AtribAssignment_0_1 : ( ruleAtrib ) ;
    public final void rule__Field__AtribAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2339:1: ( ( ruleAtrib ) )
            // InternalRest.g:2340:2: ( ruleAtrib )
            {
            // InternalRest.g:2340:2: ( ruleAtrib )
            // InternalRest.g:2341:3: ruleAtrib
            {
             before(grammarAccess.getFieldAccess().getAtribAtribParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtrib();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getAtribAtribParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Field__AtribAssignment_0_1"


    // $ANTLR start "rule__Field__MethodAssignment_1_1"
    // InternalRest.g:2350:1: rule__Field__MethodAssignment_1_1 : ( ruleMethod ) ;
    public final void rule__Field__MethodAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2354:1: ( ( ruleMethod ) )
            // InternalRest.g:2355:2: ( ruleMethod )
            {
            // InternalRest.g:2355:2: ( ruleMethod )
            // InternalRest.g:2356:3: ruleMethod
            {
             before(grammarAccess.getFieldAccess().getMethodMethodParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getMethodMethodParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Field__MethodAssignment_1_1"


    // $ANTLR start "rule__Method__MNameAssignment_0"
    // InternalRest.g:2365:1: rule__Method__MNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Method__MNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2369:1: ( ( RULE_ID ) )
            // InternalRest.g:2370:2: ( RULE_ID )
            {
            // InternalRest.g:2370:2: ( RULE_ID )
            // InternalRest.g:2371:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getMNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getMNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Method__MNameAssignment_0"


    // $ANTLR start "rule__Method__ParAssignment_2"
    // InternalRest.g:2380:1: rule__Method__ParAssignment_2 : ( ruleParm ) ;
    public final void rule__Method__ParAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2384:1: ( ( ruleParm ) )
            // InternalRest.g:2385:2: ( ruleParm )
            {
            // InternalRest.g:2385:2: ( ruleParm )
            // InternalRest.g:2386:3: ruleParm
            {
             before(grammarAccess.getMethodAccess().getParParmParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParm();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParParmParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Method__ParAssignment_2"


    // $ANTLR start "rule__Method__TipoAssignment_5"
    // InternalRest.g:2395:1: rule__Method__TipoAssignment_5 : ( ruleVALID_TYPES ) ;
    public final void rule__Method__TipoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2399:1: ( ( ruleVALID_TYPES ) )
            // InternalRest.g:2400:2: ( ruleVALID_TYPES )
            {
            // InternalRest.g:2400:2: ( ruleVALID_TYPES )
            // InternalRest.g:2401:3: ruleVALID_TYPES
            {
             before(grammarAccess.getMethodAccess().getTipoVALID_TYPESParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleVALID_TYPES();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTipoVALID_TYPESParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Method__TipoAssignment_5"


    // $ANTLR start "rule__Method__ImplemAssignment_6"
    // InternalRest.g:2410:1: rule__Method__ImplemAssignment_6 : ( RULE_ALMOST__ANY__THING ) ;
    public final void rule__Method__ImplemAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2414:1: ( ( RULE_ALMOST__ANY__THING ) )
            // InternalRest.g:2415:2: ( RULE_ALMOST__ANY__THING )
            {
            // InternalRest.g:2415:2: ( RULE_ALMOST__ANY__THING )
            // InternalRest.g:2416:3: RULE_ALMOST__ANY__THING
            {
             before(grammarAccess.getMethodAccess().getImplemALMOST__ANY__THINGTerminalRuleCall_6_0()); 
            match(input,RULE_ALMOST__ANY__THING,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getImplemALMOST__ANY__THINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Method__ImplemAssignment_6"


    // $ANTLR start "rule__Parm__AtribNameAssignment_0"
    // InternalRest.g:2425:1: rule__Parm__AtribNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parm__AtribNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2429:1: ( ( RULE_ID ) )
            // InternalRest.g:2430:2: ( RULE_ID )
            {
            // InternalRest.g:2430:2: ( RULE_ID )
            // InternalRest.g:2431:3: RULE_ID
            {
             before(grammarAccess.getParmAccess().getAtribNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParmAccess().getAtribNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Parm__AtribNameAssignment_0"


    // $ANTLR start "rule__Parm__Tipo_atriAssignment_2"
    // InternalRest.g:2440:1: rule__Parm__Tipo_atriAssignment_2 : ( ruleVALID_TYPES ) ;
    public final void rule__Parm__Tipo_atriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2444:1: ( ( ruleVALID_TYPES ) )
            // InternalRest.g:2445:2: ( ruleVALID_TYPES )
            {
            // InternalRest.g:2445:2: ( ruleVALID_TYPES )
            // InternalRest.g:2446:3: ruleVALID_TYPES
            {
             before(grammarAccess.getParmAccess().getTipo_atriVALID_TYPESParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVALID_TYPES();

            state._fsp--;

             after(grammarAccess.getParmAccess().getTipo_atriVALID_TYPESParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Parm__Tipo_atriAssignment_2"


    // $ANTLR start "rule__Atrib__AtribNameAssignment_0_0"
    // InternalRest.g:2455:1: rule__Atrib__AtribNameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Atrib__AtribNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2459:1: ( ( RULE_ID ) )
            // InternalRest.g:2460:2: ( RULE_ID )
            {
            // InternalRest.g:2460:2: ( RULE_ID )
            // InternalRest.g:2461:3: RULE_ID
            {
             before(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Atrib__AtribNameAssignment_0_0"


    // $ANTLR start "rule__Atrib__TipoAssignment_0_2"
    // InternalRest.g:2470:1: rule__Atrib__TipoAssignment_0_2 : ( RULE_INT_TYPES ) ;
    public final void rule__Atrib__TipoAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2474:1: ( ( RULE_INT_TYPES ) )
            // InternalRest.g:2475:2: ( RULE_INT_TYPES )
            {
            // InternalRest.g:2475:2: ( RULE_INT_TYPES )
            // InternalRest.g:2476:3: RULE_INT_TYPES
            {
             before(grammarAccess.getAtribAccess().getTipoINT_TYPESTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT_TYPES,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getTipoINT_TYPESTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Atrib__TipoAssignment_0_2"


    // $ANTLR start "rule__Atrib__ValueIntAssignment_0_3_1"
    // InternalRest.g:2485:1: rule__Atrib__ValueIntAssignment_0_3_1 : ( RULE_INT ) ;
    public final void rule__Atrib__ValueIntAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2489:1: ( ( RULE_INT ) )
            // InternalRest.g:2490:2: ( RULE_INT )
            {
            // InternalRest.g:2490:2: ( RULE_INT )
            // InternalRest.g:2491:3: RULE_INT
            {
             before(grammarAccess.getAtribAccess().getValueIntINTTerminalRuleCall_0_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getValueIntINTTerminalRuleCall_0_3_1_0()); 

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
    // $ANTLR end "rule__Atrib__ValueIntAssignment_0_3_1"


    // $ANTLR start "rule__Atrib__AtribNameAssignment_1_0"
    // InternalRest.g:2500:1: rule__Atrib__AtribNameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Atrib__AtribNameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2504:1: ( ( RULE_ID ) )
            // InternalRest.g:2505:2: ( RULE_ID )
            {
            // InternalRest.g:2505:2: ( RULE_ID )
            // InternalRest.g:2506:3: RULE_ID
            {
             before(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Atrib__AtribNameAssignment_1_0"


    // $ANTLR start "rule__Atrib__TipoAssignment_1_2"
    // InternalRest.g:2515:1: rule__Atrib__TipoAssignment_1_2 : ( ( 'boolean' ) ) ;
    public final void rule__Atrib__TipoAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2519:1: ( ( ( 'boolean' ) ) )
            // InternalRest.g:2520:2: ( ( 'boolean' ) )
            {
            // InternalRest.g:2520:2: ( ( 'boolean' ) )
            // InternalRest.g:2521:3: ( 'boolean' )
            {
             before(grammarAccess.getAtribAccess().getTipoBooleanKeyword_1_2_0()); 
            // InternalRest.g:2522:3: ( 'boolean' )
            // InternalRest.g:2523:4: 'boolean'
            {
             before(grammarAccess.getAtribAccess().getTipoBooleanKeyword_1_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getTipoBooleanKeyword_1_2_0()); 

            }

             after(grammarAccess.getAtribAccess().getTipoBooleanKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Atrib__TipoAssignment_1_2"


    // $ANTLR start "rule__Atrib__ValueBoolAssignment_1_3_1"
    // InternalRest.g:2534:1: rule__Atrib__ValueBoolAssignment_1_3_1 : ( RULE_BOOL ) ;
    public final void rule__Atrib__ValueBoolAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2538:1: ( ( RULE_BOOL ) )
            // InternalRest.g:2539:2: ( RULE_BOOL )
            {
            // InternalRest.g:2539:2: ( RULE_BOOL )
            // InternalRest.g:2540:3: RULE_BOOL
            {
             before(grammarAccess.getAtribAccess().getValueBoolBOOLTerminalRuleCall_1_3_1_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getValueBoolBOOLTerminalRuleCall_1_3_1_0()); 

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
    // $ANTLR end "rule__Atrib__ValueBoolAssignment_1_3_1"


    // $ANTLR start "rule__Atrib__AtribNameAssignment_2_0"
    // InternalRest.g:2549:1: rule__Atrib__AtribNameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Atrib__AtribNameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2553:1: ( ( RULE_ID ) )
            // InternalRest.g:2554:2: ( RULE_ID )
            {
            // InternalRest.g:2554:2: ( RULE_ID )
            // InternalRest.g:2555:3: RULE_ID
            {
             before(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Atrib__AtribNameAssignment_2_0"


    // $ANTLR start "rule__Atrib__TipoAssignment_2_2"
    // InternalRest.g:2564:1: rule__Atrib__TipoAssignment_2_2 : ( RULE_FLOAT_TYPES ) ;
    public final void rule__Atrib__TipoAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2568:1: ( ( RULE_FLOAT_TYPES ) )
            // InternalRest.g:2569:2: ( RULE_FLOAT_TYPES )
            {
            // InternalRest.g:2569:2: ( RULE_FLOAT_TYPES )
            // InternalRest.g:2570:3: RULE_FLOAT_TYPES
            {
             before(grammarAccess.getAtribAccess().getTipoFLOAT_TYPESTerminalRuleCall_2_2_0()); 
            match(input,RULE_FLOAT_TYPES,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getTipoFLOAT_TYPESTerminalRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Atrib__TipoAssignment_2_2"


    // $ANTLR start "rule__Atrib__ValueFloAssignment_2_3_1"
    // InternalRest.g:2579:1: rule__Atrib__ValueFloAssignment_2_3_1 : ( RULE_FLOAT ) ;
    public final void rule__Atrib__ValueFloAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2583:1: ( ( RULE_FLOAT ) )
            // InternalRest.g:2584:2: ( RULE_FLOAT )
            {
            // InternalRest.g:2584:2: ( RULE_FLOAT )
            // InternalRest.g:2585:3: RULE_FLOAT
            {
             before(grammarAccess.getAtribAccess().getValueFloFLOATTerminalRuleCall_2_3_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getValueFloFLOATTerminalRuleCall_2_3_1_0()); 

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
    // $ANTLR end "rule__Atrib__ValueFloAssignment_2_3_1"


    // $ANTLR start "rule__Atrib__AtribNameAssignment_3_0"
    // InternalRest.g:2594:1: rule__Atrib__AtribNameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Atrib__AtribNameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2598:1: ( ( RULE_ID ) )
            // InternalRest.g:2599:2: ( RULE_ID )
            {
            // InternalRest.g:2599:2: ( RULE_ID )
            // InternalRest.g:2600:3: RULE_ID
            {
             before(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Atrib__AtribNameAssignment_3_0"


    // $ANTLR start "rule__Atrib__TipoAssignment_3_2"
    // InternalRest.g:2609:1: rule__Atrib__TipoAssignment_3_2 : ( ( 'String' ) ) ;
    public final void rule__Atrib__TipoAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2613:1: ( ( ( 'String' ) ) )
            // InternalRest.g:2614:2: ( ( 'String' ) )
            {
            // InternalRest.g:2614:2: ( ( 'String' ) )
            // InternalRest.g:2615:3: ( 'String' )
            {
             before(grammarAccess.getAtribAccess().getTipoStringKeyword_3_2_0()); 
            // InternalRest.g:2616:3: ( 'String' )
            // InternalRest.g:2617:4: 'String'
            {
             before(grammarAccess.getAtribAccess().getTipoStringKeyword_3_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getTipoStringKeyword_3_2_0()); 

            }

             after(grammarAccess.getAtribAccess().getTipoStringKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Atrib__TipoAssignment_3_2"


    // $ANTLR start "rule__Atrib__ValueStrAssignment_3_3_1"
    // InternalRest.g:2628:1: rule__Atrib__ValueStrAssignment_3_3_1 : ( RULE_STRING ) ;
    public final void rule__Atrib__ValueStrAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2632:1: ( ( RULE_STRING ) )
            // InternalRest.g:2633:2: ( RULE_STRING )
            {
            // InternalRest.g:2633:2: ( RULE_STRING )
            // InternalRest.g:2634:3: RULE_STRING
            {
             before(grammarAccess.getAtribAccess().getValueStrSTRINGTerminalRuleCall_3_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getValueStrSTRINGTerminalRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Atrib__ValueStrAssignment_3_3_1"


    // $ANTLR start "rule__Atrib__AtribNameAssignment_4_0"
    // InternalRest.g:2643:1: rule__Atrib__AtribNameAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__Atrib__AtribNameAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2647:1: ( ( RULE_ID ) )
            // InternalRest.g:2648:2: ( RULE_ID )
            {
            // InternalRest.g:2648:2: ( RULE_ID )
            // InternalRest.g:2649:3: RULE_ID
            {
             before(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_4_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Atrib__AtribNameAssignment_4_0"


    // $ANTLR start "rule__Atrib__TipoAssignment_4_2"
    // InternalRest.g:2658:1: rule__Atrib__TipoAssignment_4_2 : ( ( 'char' ) ) ;
    public final void rule__Atrib__TipoAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2662:1: ( ( ( 'char' ) ) )
            // InternalRest.g:2663:2: ( ( 'char' ) )
            {
            // InternalRest.g:2663:2: ( ( 'char' ) )
            // InternalRest.g:2664:3: ( 'char' )
            {
             before(grammarAccess.getAtribAccess().getTipoCharKeyword_4_2_0()); 
            // InternalRest.g:2665:3: ( 'char' )
            // InternalRest.g:2666:4: 'char'
            {
             before(grammarAccess.getAtribAccess().getTipoCharKeyword_4_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getTipoCharKeyword_4_2_0()); 

            }

             after(grammarAccess.getAtribAccess().getTipoCharKeyword_4_2_0()); 

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
    // $ANTLR end "rule__Atrib__TipoAssignment_4_2"


    // $ANTLR start "rule__Atrib__ValueChrAssignment_4_3_1"
    // InternalRest.g:2677:1: rule__Atrib__ValueChrAssignment_4_3_1 : ( RULE_CHAR ) ;
    public final void rule__Atrib__ValueChrAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2681:1: ( ( RULE_CHAR ) )
            // InternalRest.g:2682:2: ( RULE_CHAR )
            {
            // InternalRest.g:2682:2: ( RULE_CHAR )
            // InternalRest.g:2683:3: RULE_CHAR
            {
             before(grammarAccess.getAtribAccess().getValueChrCHARTerminalRuleCall_4_3_1_0()); 
            match(input,RULE_CHAR,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getValueChrCHARTerminalRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Atrib__ValueChrAssignment_4_3_1"


    // $ANTLR start "rule__Atrib__AtribNameAssignment_5_0"
    // InternalRest.g:2692:1: rule__Atrib__AtribNameAssignment_5_0 : ( RULE_ID ) ;
    public final void rule__Atrib__AtribNameAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2696:1: ( ( RULE_ID ) )
            // InternalRest.g:2697:2: ( RULE_ID )
            {
            // InternalRest.g:2697:2: ( RULE_ID )
            // InternalRest.g:2698:3: RULE_ID
            {
             before(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_5_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Atrib__AtribNameAssignment_5_0"


    // $ANTLR start "rule__Atrib__TipoAssignment_5_2"
    // InternalRest.g:2707:1: rule__Atrib__TipoAssignment_5_2 : ( ruleTYPE_NAME ) ;
    public final void rule__Atrib__TipoAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:2711:1: ( ( ruleTYPE_NAME ) )
            // InternalRest.g:2712:2: ( ruleTYPE_NAME )
            {
            // InternalRest.g:2712:2: ( ruleTYPE_NAME )
            // InternalRest.g:2713:3: ruleTYPE_NAME
            {
             before(grammarAccess.getAtribAccess().getTipoTYPE_NAMEParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_NAME();

            state._fsp--;

             after(grammarAccess.getAtribAccess().getTipoTYPE_NAMEParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Atrib__TipoAssignment_5_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000E0060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000E0070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000E0072L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});

}