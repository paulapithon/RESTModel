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
            // InternalRest.g:17:7: ( 'package' )
            // InternalRest.g:17:9: 'package'
            {
            match("package"); 


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
            // InternalRest.g:18:7: ( ':' )
            // InternalRest.g:18:9: ':'
            {
            match(':'); 

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
            // InternalRest.g:19:7: ( 'new' )
            // InternalRest.g:19:9: 'new'
            {
            match("new"); 


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
            // InternalRest.g:20:7: ( '(' )
            // InternalRest.g:20:9: '('
            {
            match('('); 

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
            // InternalRest.g:21:7: ( ')' )
            // InternalRest.g:21:9: ')'
            {
            match(')'); 

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

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:23:7: ( '<' )
            // InternalRest.g:23:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:24:7: ( '>' )
            // InternalRest.g:24:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:25:7: ( '.' )
            // InternalRest.g:25:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRest.g:2251:11: ( ( 'True' | 'False' ) )
            // InternalRest.g:2251:13: ( 'True' | 'False' )
            {
            // InternalRest.g:2251:13: ( 'True' | 'False' )
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
                    // InternalRest.g:2251:14: 'True'
                    {
                    match("True"); 


                    }
                    break;
                case 2 :
                    // InternalRest.g:2251:21: 'False'
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
            // InternalRest.g:2253:12: ( '1' .. '9' ( '0' .. '9' )* '.' ( '0' .. '9' )+ )
            // InternalRest.g:2253:14: '1' .. '9' ( '0' .. '9' )* '.' ( '0' .. '9' )+
            {
            matchRange('1','9'); 
            // InternalRest.g:2253:23: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRest.g:2253:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('.'); 
            // InternalRest.g:2253:39: ( '0' .. '9' )+
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
            	    // InternalRest.g:2253:40: '0' .. '9'
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
            // InternalRest.g:2255:11: ( '\\'' . '\\'' )
            // InternalRest.g:2255:13: '\\'' . '\\''
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
            // InternalRest.g:2257:16: ( ( 'int' | 'long' | 'short' | 'byte' ) )
            // InternalRest.g:2257:18: ( 'int' | 'long' | 'short' | 'byte' )
            {
            // InternalRest.g:2257:18: ( 'int' | 'long' | 'short' | 'byte' )
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
                    // InternalRest.g:2257:19: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // InternalRest.g:2257:25: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 3 :
                    // InternalRest.g:2257:32: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 4 :
                    // InternalRest.g:2257:40: 'byte'
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
            // InternalRest.g:2259:18: ( ( 'float' | 'double' ) )
            // InternalRest.g:2259:20: ( 'float' | 'double' )
            {
            // InternalRest.g:2259:20: ( 'float' | 'double' )
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
                    // InternalRest.g:2259:21: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 2 :
                    // InternalRest.g:2259:29: 'double'
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
            // InternalRest.g:2261:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRest.g:2261:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRest.g:2261:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalRest.g:2263:17: ( '##' ( options {greedy=false; } : . )* '##' )
            // InternalRest.g:2263:19: '##' ( options {greedy=false; } : . )* '##'
            {
            match("##"); 

            // InternalRest.g:2263:24: ( options {greedy=false; } : . )*
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
            	    // InternalRest.g:2263:52: .
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
            // InternalRest.g:2265:25: ( ':' '{' (~ ( '}' ) )* '}' )
            // InternalRest.g:2265:27: ':' '{' (~ ( '}' ) )* '}'
            {
            match(':'); 
            match('{'); 
            // InternalRest.g:2265:35: (~ ( '}' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='|')||(LA8_0>='~' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRest.g:2265:35: ~ ( '}' )
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
            // InternalRest.g:2267:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRest.g:2267:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalRest.g:2267:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRest.g:2267:23: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalRest.g:2267:39: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRest.g:2267:40: ( '\\r' )? '\\n'
                    {
                    // InternalRest.g:2267:40: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRest.g:2267:40: '\\r'
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
            // InternalRest.g:2269:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRest.g:2269:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRest.g:2269:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRest.g:2269:11: '^'
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

            // InternalRest.g:2269:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalRest.g:2271:10: ( ( '0' .. '9' )+ )
            // InternalRest.g:2271:12: ( '0' .. '9' )+
            {
            // InternalRest.g:2271:12: ( '0' .. '9' )+
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
            	    // InternalRest.g:2271:13: '0' .. '9'
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
            // InternalRest.g:2273:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRest.g:2273:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRest.g:2273:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalRest.g:2273:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRest.g:2273:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalRest.g:2273:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRest.g:2273:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalRest.g:2273:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRest.g:2273:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalRest.g:2273:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRest.g:2273:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalRest.g:2275:16: ( . )
            // InternalRest.g:2275:18: .
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
        // InternalRest.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_BOOL | RULE_FLOAT | RULE_CHAR | RULE_INT_TYPES | RULE_FLOAT_TYPES | RULE_WS | RULE_ML_COMMENT | RULE_ALMOST__ANY__THING | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ANY_OTHER )
        int alt18=28;
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
                // InternalRest.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalRest.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalRest.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalRest.g:1:100: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 17 :
                // InternalRest.g:1:110: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 18 :
                // InternalRest.g:1:121: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 19 :
                // InternalRest.g:1:131: RULE_INT_TYPES
                {
                mRULE_INT_TYPES(); 

                }
                break;
            case 20 :
                // InternalRest.g:1:146: RULE_FLOAT_TYPES
                {
                mRULE_FLOAT_TYPES(); 

                }
                break;
            case 21 :
                // InternalRest.g:1:163: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // InternalRest.g:1:171: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // InternalRest.g:1:187: RULE_ALMOST__ANY__THING
                {
                mRULE_ALMOST__ANY__THING(); 

                }
                break;
            case 24 :
                // InternalRest.g:1:211: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalRest.g:1:227: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // InternalRest.g:1:235: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // InternalRest.g:1:244: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // InternalRest.g:1:256: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\4\41\2\uffff\1\41\1\52\1\41\6\uffff\2\41\1\64\1\37\5\41\1\uffff\1\101\1\37\2\uffff\1\37\1\uffff\1\41\1\uffff\4\41\2\uffff\1\41\2\uffff\1\41\6\uffff\2\41\1\uffff\1\64\3\uffff\1\102\5\41\1\uffff\1\101\2\uffff\6\41\1\136\2\41\1\116\2\uffff\1\141\4\41\1\uffff\3\101\2\41\1\141\1\152\2\41\1\uffff\1\155\1\41\1\uffff\1\141\3\41\1\uffff\1\146\2\41\1\uffff\2\41\1\uffff\1\155\1\141\1\166\1\41\1\170\3\41\1\uffff\1\166\1\uffff\1\174\1\175\1\176\3\uffff";
    static final String DFA18_eofS =
        "\177\uffff";
    static final String DFA18_minS =
        "\1\0\1\164\1\157\1\150\1\145\2\uffff\1\141\1\173\1\145\6\uffff\1\162\1\141\1\56\1\0\1\156\1\157\1\150\1\154\1\157\1\uffff\1\43\1\101\2\uffff\1\0\1\uffff\1\162\1\uffff\1\157\1\164\1\141\1\161\2\uffff\1\143\2\uffff\1\167\6\uffff\1\165\1\154\1\uffff\1\56\1\uffff\2\0\1\47\1\164\1\156\2\157\1\165\1\uffff\1\0\2\uffff\1\151\1\154\1\145\1\162\1\165\1\153\1\60\1\145\1\163\1\0\2\uffff\1\60\1\147\1\162\1\141\1\142\4\0\1\156\1\145\2\60\1\145\1\141\1\uffff\1\60\1\145\1\uffff\1\60\2\164\1\154\1\uffff\1\0\1\147\1\141\1\uffff\1\163\1\147\1\uffff\3\60\1\145\1\60\1\156\1\164\1\145\1\uffff\1\60\1\uffff\3\60\3\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\164\1\171\1\150\1\145\2\uffff\1\141\1\173\1\145\6\uffff\1\162\1\141\1\71\1\uffff\1\156\1\157\1\150\1\154\1\157\1\uffff\1\43\1\172\2\uffff\1\uffff\1\uffff\1\162\1\uffff\1\157\1\164\1\141\1\161\2\uffff\1\143\2\uffff\1\167\6\uffff\1\165\1\154\1\uffff\1\71\1\uffff\2\uffff\1\47\1\164\1\156\2\157\1\165\1\uffff\1\uffff\2\uffff\1\151\1\154\1\145\1\162\1\165\1\153\1\172\1\145\1\163\1\uffff\2\uffff\1\172\1\147\1\162\1\141\1\142\4\uffff\1\156\1\145\2\172\1\145\1\141\1\uffff\1\172\1\145\1\uffff\1\172\2\164\1\154\1\uffff\1\uffff\1\147\1\141\1\uffff\1\163\1\147\1\uffff\3\172\1\145\1\172\1\156\1\164\1\145\1\uffff\1\172\1\uffff\3\172\3\uffff";
    static final String DFA18_acceptS =
        "\5\uffff\1\5\1\6\3\uffff\1\12\1\13\1\14\1\15\1\16\1\17\11\uffff\1\25\2\uffff\1\31\1\32\1\uffff\1\34\1\uffff\1\31\4\uffff\1\5\1\6\1\uffff\1\27\1\10\1\uffff\1\12\1\13\1\14\1\15\1\16\1\17\2\uffff\1\32\1\uffff\1\21\10\uffff\1\25\1\uffff\1\30\1\33\12\uffff\2\22\17\uffff\1\11\2\uffff\1\23\4\uffff\1\26\3\uffff\1\3\2\uffff\1\20\10\uffff\1\24\1\uffff\1\1\3\uffff\1\2\1\4\1\7";
    static final String DFA18_specialS =
        "\1\2\22\uffff\1\12\12\uffff\1\5\30\uffff\1\0\1\3\7\uffff\1\6\13\uffff\1\10\7\uffff\1\1\1\13\1\7\1\11\17\uffff\1\4\27\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\37\2\31\2\37\1\31\22\37\1\31\1\37\1\36\1\32\3\37\1\23\1\12\1\13\2\37\1\14\1\37\1\17\1\37\1\35\11\22\1\10\1\37\1\15\1\37\1\16\2\37\5\34\1\21\13\34\1\4\1\1\1\20\6\34\3\37\1\33\1\34\1\37\1\34\1\2\1\3\1\30\1\34\1\27\2\34\1\24\2\34\1\25\1\34\1\11\1\34\1\7\2\34\1\26\7\34\1\5\1\37\1\6\uff82\37",
            "\1\40",
            "\1\42\11\uffff\1\43",
            "\1\44",
            "\1\45",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\66\1\uffff\12\65",
            "\47\70\1\71\64\70\1\67\uffa3\70",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "\1\100",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\102",
            "",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "",
            "\1\110",
            "",
            "",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "",
            "\1\66\1\uffff\12\65",
            "",
            "\47\102\1\114\uffd8\102",
            "\47\102\1\115\uffd8\102",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\12\127\1\125\2\127\1\124\25\127\1\126\uffdc\127",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\137",
            "\1\140",
            "\0\102",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\12\146\1\125\ufff5\146",
            "\0\146",
            "\12\127\1\125\2\127\1\124\25\127\1\147\uffdc\127",
            "\12\127\1\125\2\127\1\124\25\127\1\126\uffdc\127",
            "\1\150",
            "\1\151",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\153",
            "\1\154",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\156",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\12\127\1\125\2\127\1\124\25\127\1\147\uffdc\127",
            "\1\162",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\167",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
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
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_BOOL | RULE_FLOAT | RULE_CHAR | RULE_INT_TYPES | RULE_FLOAT_TYPES | RULE_WS | RULE_ML_COMMENT | RULE_ALMOST__ANY__THING | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_55 = input.LA(1);

                        s = -1;
                        if ( (LA18_55=='\'') ) {s = 76;}

                        else if ( ((LA18_55>='\u0000' && LA18_55<='&')||(LA18_55>='(' && LA18_55<='\uFFFF')) ) {s = 66;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_84 = input.LA(1);

                        s = -1;
                        if ( (LA18_84=='\n') ) {s = 85;}

                        else if ( ((LA18_84>='\u0000' && LA18_84<='\t')||(LA18_84>='\u000B' && LA18_84<='\uFFFF')) ) {s = 102;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='S') ) {s = 1;}

                        else if ( (LA18_0=='b') ) {s = 2;}

                        else if ( (LA18_0=='c') ) {s = 3;}

                        else if ( (LA18_0=='R') ) {s = 4;}

                        else if ( (LA18_0=='{') ) {s = 5;}

                        else if ( (LA18_0=='}') ) {s = 6;}

                        else if ( (LA18_0=='p') ) {s = 7;}

                        else if ( (LA18_0==':') ) {s = 8;}

                        else if ( (LA18_0=='n') ) {s = 9;}

                        else if ( (LA18_0=='(') ) {s = 10;}

                        else if ( (LA18_0==')') ) {s = 11;}

                        else if ( (LA18_0==',') ) {s = 12;}

                        else if ( (LA18_0=='<') ) {s = 13;}

                        else if ( (LA18_0=='>') ) {s = 14;}

                        else if ( (LA18_0=='.') ) {s = 15;}

                        else if ( (LA18_0=='T') ) {s = 16;}

                        else if ( (LA18_0=='F') ) {s = 17;}

                        else if ( ((LA18_0>='1' && LA18_0<='9')) ) {s = 18;}

                        else if ( (LA18_0=='\'') ) {s = 19;}

                        else if ( (LA18_0=='i') ) {s = 20;}

                        else if ( (LA18_0=='l') ) {s = 21;}

                        else if ( (LA18_0=='s') ) {s = 22;}

                        else if ( (LA18_0=='f') ) {s = 23;}

                        else if ( (LA18_0=='d') ) {s = 24;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 25;}

                        else if ( (LA18_0=='#') ) {s = 26;}

                        else if ( (LA18_0=='^') ) {s = 27;}

                        else if ( ((LA18_0>='A' && LA18_0<='E')||(LA18_0>='G' && LA18_0<='Q')||(LA18_0>='U' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='a'||LA18_0=='e'||(LA18_0>='g' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='k')||LA18_0=='m'||LA18_0=='o'||(LA18_0>='q' && LA18_0<='r')||(LA18_0>='t' && LA18_0<='z')) ) {s = 28;}

                        else if ( (LA18_0=='0') ) {s = 29;}

                        else if ( (LA18_0=='\"') ) {s = 30;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='$' && LA18_0<='&')||(LA18_0>='*' && LA18_0<='+')||LA18_0=='-'||LA18_0=='/'||LA18_0==';'||LA18_0=='='||(LA18_0>='?' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||LA18_0=='|'||(LA18_0>='~' && LA18_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_56 = input.LA(1);

                        s = -1;
                        if ( (LA18_56=='\'') ) {s = 77;}

                        else if ( ((LA18_56>='\u0000' && LA18_56<='&')||(LA18_56>='(' && LA18_56<='\uFFFF')) ) {s = 66;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_103 = input.LA(1);

                        s = -1;
                        if ( (LA18_103=='#') ) {s = 103;}

                        else if ( (LA18_103=='\r') ) {s = 84;}

                        else if ( (LA18_103=='\n') ) {s = 85;}

                        else if ( ((LA18_103>='\u0000' && LA18_103<='\t')||(LA18_103>='\u000B' && LA18_103<='\f')||(LA18_103>='\u000E' && LA18_103<='\"')||(LA18_103>='$' && LA18_103<='\uFFFF')) ) {s = 87;}

                        else s = 102;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_30 = input.LA(1);

                        s = -1;
                        if ( ((LA18_30>='\u0000' && LA18_30<='\uFFFF')) ) {s = 66;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_64 = input.LA(1);

                        s = -1;
                        if ( (LA18_64=='\r') ) {s = 84;}

                        else if ( (LA18_64=='\n') ) {s = 85;}

                        else if ( (LA18_64=='#') ) {s = 86;}

                        else if ( ((LA18_64>='\u0000' && LA18_64<='\t')||(LA18_64>='\u000B' && LA18_64<='\f')||(LA18_64>='\u000E' && LA18_64<='\"')||(LA18_64>='$' && LA18_64<='\uFFFF')) ) {s = 87;}

                        else s = 65;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_86 = input.LA(1);

                        s = -1;
                        if ( (LA18_86=='#') ) {s = 103;}

                        else if ( (LA18_86=='\r') ) {s = 84;}

                        else if ( (LA18_86=='\n') ) {s = 85;}

                        else if ( ((LA18_86>='\u0000' && LA18_86<='\t')||(LA18_86>='\u000B' && LA18_86<='\f')||(LA18_86>='\u000E' && LA18_86<='\"')||(LA18_86>='$' && LA18_86<='\uFFFF')) ) {s = 87;}

                        else s = 65;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_76 = input.LA(1);

                        s = -1;
                        if ( ((LA18_76>='\u0000' && LA18_76<='\uFFFF')) ) {s = 66;}

                        else s = 78;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA18_87 = input.LA(1);

                        s = -1;
                        if ( (LA18_87=='\r') ) {s = 84;}

                        else if ( (LA18_87=='\n') ) {s = 85;}

                        else if ( (LA18_87=='#') ) {s = 86;}

                        else if ( ((LA18_87>='\u0000' && LA18_87<='\t')||(LA18_87>='\u000B' && LA18_87<='\f')||(LA18_87>='\u000E' && LA18_87<='\"')||(LA18_87>='$' && LA18_87<='\uFFFF')) ) {s = 87;}

                        else s = 65;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA18_19 = input.LA(1);

                        s = -1;
                        if ( (LA18_19=='\\') ) {s = 55;}

                        else if ( ((LA18_19>='\u0000' && LA18_19<='&')||(LA18_19>='(' && LA18_19<='[')||(LA18_19>=']' && LA18_19<='\uFFFF')) ) {s = 56;}

                        else if ( (LA18_19=='\'') ) {s = 57;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA18_85 = input.LA(1);

                        s = -1;
                        if ( ((LA18_85>='\u0000' && LA18_85<='\uFFFF')) ) {s = 102;}

                        else s = 65;

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