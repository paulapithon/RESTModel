package br.com.poli.restModel.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestLexer extends Lexer {
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

    public InternalRestLexer() {;} 
    public InternalRestLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRestLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRest.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:11:7: ( 'String' )
            // InternalRest.g:11:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:12:7: ( 'boolean' )
            // InternalRest.g:12:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:13:7: ( 'char' )
            // InternalRest.g:13:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:14:7: ( 'Request' )
            // InternalRest.g:14:9: 'Request'
            {
            match("Request"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:15:7: ( '{' )
            // InternalRest.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:16:7: ( '}' )
            // InternalRest.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:17:7: ( '(' )
            // InternalRest.g:17:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:18:7: ( ')' )
            // InternalRest.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:19:7: ( ':' )
            // InternalRest.g:19:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:20:7: ( '<' )
            // InternalRest.g:20:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:21:7: ( '>' )
            // InternalRest.g:21:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:22:7: ( ',' )
            // InternalRest.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:2722:11: ( ( 'True' | 'False' ) )
            // InternalRest.g:2722:13: ( 'True' | 'False' )
            {
            // InternalRest.g:2722:13: ( 'True' | 'False' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='T') ) {
                alt1=1;
            }
            else if ( (LA1_0=='F') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRest.g:2722:14: 'True'
                    {
                    match("True"); 


                    }
                    break;
                case 2 :
                    // InternalRest.g:2722:21: 'False'
                    {
                    match("False"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:2724:12: ( '1' .. '9' ( '0' .. '9' )* '.' ( '0' .. '9' )+ )
            // InternalRest.g:2724:14: '1' .. '9' ( '0' .. '9' )* '.' ( '0' .. '9' )+
            {
            matchRange('1','9'); 
            // InternalRest.g:2724:23: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRest.g:2724:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('.'); 
            // InternalRest.g:2724:39: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRest.g:2724:40: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:2726:11: ( '\\'' . '\\'' )
            // InternalRest.g:2726:13: '\\'' . '\\''
            {
            match('\''); 
            matchAny(); 
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_INT_TYPES"
    public final void mRULE_INT_TYPES() throws RecognitionException {
        try {
            int _type = RULE_INT_TYPES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:2728:16: ( ( 'int' | 'long' | 'short' | 'byte' ) )
            // InternalRest.g:2728:18: ( 'int' | 'long' | 'short' | 'byte' )
            {
            // InternalRest.g:2728:18: ( 'int' | 'long' | 'short' | 'byte' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt4=1;
                }
                break;
            case 'l':
                {
                alt4=2;
                }
                break;
            case 's':
                {
                alt4=3;
                }
                break;
            case 'b':
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRest.g:2728:19: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // InternalRest.g:2728:25: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 3 :
                    // InternalRest.g:2728:32: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 4 :
                    // InternalRest.g:2728:40: 'byte'
                    {
                    match("byte"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_TYPES"

    // $ANTLR start "RULE_FLOAT_TYPES"
    public final void mRULE_FLOAT_TYPES() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_TYPES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:2730:18: ( ( 'float' | 'double' ) )
            // InternalRest.g:2730:20: ( 'float' | 'double' )
            {
            // InternalRest.g:2730:20: ( 'float' | 'double' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='f') ) {
                alt5=1;
            }
            else if ( (LA5_0=='d') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRest.g:2730:21: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 2 :
                    // InternalRest.g:2730:29: 'double'
                    {
                    match("double"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_TYPES"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:2732:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRest.g:2732:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRest.g:2732:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRest.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:2734:17: ( '##' ( options {greedy=false; } : . )* '##' )
            // InternalRest.g:2734:19: '##' ( options {greedy=false; } : . )* '##'
            {
            match("##"); 

            // InternalRest.g:2734:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='#') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='#') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='\"')||(LA7_1>='$' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='\"')||(LA7_0>='$' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRest.g:2734:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("##"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_ALMOST__ANY__THING"
    public final void mRULE_ALMOST__ANY__THING() throws RecognitionException {
        try {
            int _type = RULE_ALMOST__ANY__THING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:2736:25: ( ':' '{' (~ ( '}' ) )* '}' )
            // InternalRest.g:2736:27: ':' '{' (~ ( '}' ) )* '}'
            {
            match(':'); 
            match('{'); 
            // InternalRest.g:2736:35: (~ ( '}' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='|')||(LA8_0>='~' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRest.g:2736:35: ~ ( '}' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='|')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALMOST__ANY__THING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:2738:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRest.g:2738:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalRest.g:2738:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRest.g:2738:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalRest.g:2738:39: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRest.g:2738:40: ( '\\r' )? '\\n'
                    {
                    // InternalRest.g:2738:40: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRest.g:2738:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:2740:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRest.g:2740:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRest.g:2740:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRest.g:2740:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRest.g:2740:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRest.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:2742:10: ( ( '0' .. '9' )+ )
            // InternalRest.g:2742:12: ( '0' .. '9' )+
            {
            // InternalRest.g:2742:12: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRest.g:2742:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:2744:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRest.g:2744:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRest.g:2744:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRest.g:2744:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRest.g:2744:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRest.g:2744:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRest.g:2744:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRest.g:2744:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRest.g:2744:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRest.g:2744:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRest.g:2744:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:2746:16: ( . )
            // InternalRest.g:2746:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRest.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_BOOL | RULE_FLOAT | RULE_CHAR | RULE_INT_TYPES | RULE_FLOAT_TYPES | RULE_WS | RULE_ML_COMMENT | RULE_ALMOST__ANY__THING | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ANY_OTHER )
        int alt18=25;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalRest.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalRest.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalRest.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalRest.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalRest.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalRest.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalRest.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalRest.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalRest.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalRest.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalRest.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalRest.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalRest.g:1:82: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 14 :
                // InternalRest.g:1:92: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 15 :
                // InternalRest.g:1:103: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 16 :
                // InternalRest.g:1:113: RULE_INT_TYPES
                {
                mRULE_INT_TYPES(); 

                }
                break;
            case 17 :
                // InternalRest.g:1:128: RULE_FLOAT_TYPES
                {
                mRULE_FLOAT_TYPES(); 

                }
                break;
            case 18 :
                // InternalRest.g:1:145: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // InternalRest.g:1:153: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // InternalRest.g:1:169: RULE_ALMOST__ANY__THING
                {
                mRULE_ALMOST__ANY__THING(); 

                }
                break;
            case 21 :
                // InternalRest.g:1:193: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // InternalRest.g:1:209: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // InternalRest.g:1:217: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // InternalRest.g:1:226: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // InternalRest.g:1:238: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\4\36\4\uffff\1\50\3\uffff\2\36\1\56\1\34\5\36\1\uffff\1\73\1\34\2\uffff\1\34\1\uffff\1\36\1\uffff\4\36\11\uffff\2\36\1\uffff\1\56\3\uffff\1\74\5\36\1\uffff\1\73\2\uffff\7\36\1\106\2\uffff\1\127\4\36\1\73\1\uffff\2\73\2\36\1\127\1\140\1\36\1\142\1\36\1\uffff\1\127\3\36\1\135\1\uffff\2\36\1\uffff\1\36\1\uffff\1\142\1\127\1\152\1\36\1\154\2\36\1\uffff\1\152\1\uffff\1\157\1\160\2\uffff";
    static final String DFA18_eofS =
        "\161\uffff";
    static final String DFA18_minS =
        "\1\0\1\164\1\157\1\150\1\145\4\uffff\1\173\3\uffff\1\162\1\141\1\56\1\0\1\156\1\157\1\150\1\154\1\157\1\uffff\1\43\1\101\2\uffff\1\0\1\uffff\1\162\1\uffff\1\157\1\164\1\141\1\161\11\uffff\1\165\1\154\1\uffff\1\56\1\uffff\2\0\1\47\1\164\1\156\2\157\1\165\1\uffff\1\0\2\uffff\1\151\1\154\1\145\1\162\1\165\1\145\1\163\1\0\2\uffff\1\60\1\147\1\162\1\141\1\142\4\0\1\156\1\145\2\60\1\145\1\60\1\145\1\uffff\1\60\2\164\1\154\1\0\1\uffff\1\147\1\141\1\uffff\1\163\1\uffff\3\60\1\145\1\60\1\156\1\164\1\uffff\1\60\1\uffff\2\60\2\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\164\1\171\1\150\1\145\4\uffff\1\173\3\uffff\1\162\1\141\1\71\1\uffff\1\156\1\157\1\150\1\154\1\157\1\uffff\1\43\1\172\2\uffff\1\uffff\1\uffff\1\162\1\uffff\1\157\1\164\1\141\1\161\11\uffff\1\165\1\154\1\uffff\1\71\1\uffff\2\uffff\1\47\1\164\1\156\2\157\1\165\1\uffff\1\uffff\2\uffff\1\151\1\154\1\145\1\162\1\165\1\145\1\163\1\uffff\2\uffff\1\172\1\147\1\162\1\141\1\142\4\uffff\1\156\1\145\2\172\1\145\1\172\1\145\1\uffff\1\172\2\164\1\154\1\uffff\1\uffff\1\147\1\141\1\uffff\1\163\1\uffff\3\172\1\145\1\172\1\156\1\164\1\uffff\1\172\1\uffff\2\172\2\uffff";
    static final String DFA18_acceptS =
        "\5\uffff\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\14\11\uffff\1\22\2\uffff\1\26\1\27\1\uffff\1\31\1\uffff\1\26\4\uffff\1\5\1\6\1\7\1\10\1\24\1\11\1\12\1\13\1\14\2\uffff\1\27\1\uffff\1\16\10\uffff\1\22\1\uffff\1\25\1\30\10\uffff\2\17\20\uffff\1\20\5\uffff\1\23\2\uffff\1\3\1\uffff\1\15\7\uffff\1\21\1\uffff\1\1\2\uffff\1\2\1\4";
    static final String DFA18_specialS =
        "\1\12\17\uffff\1\4\12\uffff\1\1\25\uffff\1\7\1\2\7\uffff\1\6\11\uffff\1\5\7\uffff\1\10\1\3\1\11\1\13\14\uffff\1\0\24\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\34\2\26\2\34\1\26\22\34\1\26\1\34\1\33\1\27\3\34\1\20\1\7\1\10\2\34\1\14\3\34\1\32\11\17\1\11\1\34\1\12\1\34\1\13\2\34\5\31\1\16\13\31\1\4\1\1\1\15\6\31\3\34\1\30\1\31\1\34\1\31\1\2\1\3\1\25\1\31\1\24\2\31\1\21\2\31\1\22\6\31\1\23\7\31\1\5\1\34\1\6\uff82\34",
            "\1\35",
            "\1\37\11\uffff\1\40",
            "\1\41",
            "\1\42",
            "",
            "",
            "",
            "",
            "\1\47",
            "",
            "",
            "",
            "\1\54",
            "\1\55",
            "\1\60\1\uffff\12\57",
            "\47\62\1\63\64\62\1\61\uffa3\62",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\1\72",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\0\74",
            "",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "",
            "\1\60\1\uffff\12\57",
            "",
            "\47\74\1\104\uffd8\74",
            "\47\74\1\105\uffd8\74",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "\12\117\1\116\2\117\1\115\25\117\1\114\uffdc\117",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\0\74",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\117\1\116\2\117\1\115\25\117\1\134\uffdc\117",
            "\12\135\1\116\ufff5\135",
            "\0\135",
            "\12\117\1\116\2\117\1\115\25\117\1\114\uffdc\117",
            "\1\136",
            "\1\137",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\141",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\143",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\117\1\116\2\117\1\115\25\117\1\134\uffdc\117",
            "",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\153",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\155",
            "\1\156",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_BOOL | RULE_FLOAT | RULE_CHAR | RULE_INT_TYPES | RULE_FLOAT_TYPES | RULE_WS | RULE_ML_COMMENT | RULE_ALMOST__ANY__THING | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_92 = input.LA(1);

                        s = -1;
                        if ( (LA18_92=='#') ) {s = 92;}

                        else if ( (LA18_92=='\r') ) {s = 77;}

                        else if ( (LA18_92=='\n') ) {s = 78;}

                        else if ( ((LA18_92>='\u0000' && LA18_92<='\t')||(LA18_92>='\u000B' && LA18_92<='\f')||(LA18_92>='\u000E' && LA18_92<='\"')||(LA18_92>='$' && LA18_92<='\uFFFF')) ) {s = 79;}

                        else s = 93;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_27 = input.LA(1);

                        s = -1;
                        if ( ((LA18_27>='\u0000' && LA18_27<='\uFFFF')) ) {s = 60;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_50 = input.LA(1);

                        s = -1;
                        if ( (LA18_50=='\'') ) {s = 69;}

                        else if ( ((LA18_50>='\u0000' && LA18_50<='&')||(LA18_50>='(' && LA18_50<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_77 = input.LA(1);

                        s = -1;
                        if ( (LA18_77=='\n') ) {s = 78;}

                        else if ( ((LA18_77>='\u0000' && LA18_77<='\t')||(LA18_77>='\u000B' && LA18_77<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_16 = input.LA(1);

                        s = -1;
                        if ( (LA18_16=='\\') ) {s = 49;}

                        else if ( ((LA18_16>='\u0000' && LA18_16<='&')||(LA18_16>='(' && LA18_16<='[')||(LA18_16>=']' && LA18_16<='\uFFFF')) ) {s = 50;}

                        else if ( (LA18_16=='\'') ) {s = 51;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_68 = input.LA(1);

                        s = -1;
                        if ( ((LA18_68>='\u0000' && LA18_68<='\uFFFF')) ) {s = 60;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_58 = input.LA(1);

                        s = -1;
                        if ( (LA18_58=='#') ) {s = 76;}

                        else if ( (LA18_58=='\r') ) {s = 77;}

                        else if ( (LA18_58=='\n') ) {s = 78;}

                        else if ( ((LA18_58>='\u0000' && LA18_58<='\t')||(LA18_58>='\u000B' && LA18_58<='\f')||(LA18_58>='\u000E' && LA18_58<='\"')||(LA18_58>='$' && LA18_58<='\uFFFF')) ) {s = 79;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_49 = input.LA(1);

                        s = -1;
                        if ( (LA18_49=='\'') ) {s = 68;}

                        else if ( ((LA18_49>='\u0000' && LA18_49<='&')||(LA18_49>='(' && LA18_49<='\uFFFF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_76 = input.LA(1);

                        s = -1;
                        if ( (LA18_76=='#') ) {s = 92;}

                        else if ( (LA18_76=='\r') ) {s = 77;}

                        else if ( (LA18_76=='\n') ) {s = 78;}

                        else if ( ((LA18_76>='\u0000' && LA18_76<='\t')||(LA18_76>='\u000B' && LA18_76<='\f')||(LA18_76>='\u000E' && LA18_76<='\"')||(LA18_76>='$' && LA18_76<='\uFFFF')) ) {s = 79;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA18_78 = input.LA(1);

                        s = -1;
                        if ( ((LA18_78>='\u0000' && LA18_78<='\uFFFF')) ) {s = 93;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='S') ) {s = 1;}

                        else if ( (LA18_0=='b') ) {s = 2;}

                        else if ( (LA18_0=='c') ) {s = 3;}

                        else if ( (LA18_0=='R') ) {s = 4;}

                        else if ( (LA18_0=='{') ) {s = 5;}

                        else if ( (LA18_0=='}') ) {s = 6;}

                        else if ( (LA18_0=='(') ) {s = 7;}

                        else if ( (LA18_0==')') ) {s = 8;}

                        else if ( (LA18_0==':') ) {s = 9;}

                        else if ( (LA18_0=='<') ) {s = 10;}

                        else if ( (LA18_0=='>') ) {s = 11;}

                        else if ( (LA18_0==',') ) {s = 12;}

                        else if ( (LA18_0=='T') ) {s = 13;}

                        else if ( (LA18_0=='F') ) {s = 14;}

                        else if ( ((LA18_0>='1' && LA18_0<='9')) ) {s = 15;}

                        else if ( (LA18_0=='\'') ) {s = 16;}

                        else if ( (LA18_0=='i') ) {s = 17;}

                        else if ( (LA18_0=='l') ) {s = 18;}

                        else if ( (LA18_0=='s') ) {s = 19;}

                        else if ( (LA18_0=='f') ) {s = 20;}

                        else if ( (LA18_0=='d') ) {s = 21;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 22;}

                        else if ( (LA18_0=='#') ) {s = 23;}

                        else if ( (LA18_0=='^') ) {s = 24;}

                        else if ( ((LA18_0>='A' && LA18_0<='E')||(LA18_0>='G' && LA18_0<='Q')||(LA18_0>='U' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='a'||LA18_0=='e'||(LA18_0>='g' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='k')||(LA18_0>='m' && LA18_0<='r')||(LA18_0>='t' && LA18_0<='z')) ) {s = 25;}

                        else if ( (LA18_0=='0') ) {s = 26;}

                        else if ( (LA18_0=='\"') ) {s = 27;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='$' && LA18_0<='&')||(LA18_0>='*' && LA18_0<='+')||(LA18_0>='-' && LA18_0<='/')||LA18_0==';'||LA18_0=='='||(LA18_0>='?' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||LA18_0=='|'||(LA18_0>='~' && LA18_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA18_79 = input.LA(1);

                        s = -1;
                        if ( (LA18_79=='#') ) {s = 76;}

                        else if ( (LA18_79=='\r') ) {s = 77;}

                        else if ( (LA18_79=='\n') ) {s = 78;}

                        else if ( ((LA18_79>='\u0000' && LA18_79<='\t')||(LA18_79>='\u000B' && LA18_79<='\f')||(LA18_79>='\u000E' && LA18_79<='\"')||(LA18_79>='$' && LA18_79<='\uFFFF')) ) {s = 79;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}