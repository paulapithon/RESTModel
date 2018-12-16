/*
 * generated by Xtext 2.15.0
 */
grammar InternalRest;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package br.com.poli.restModel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getModelAccess().getModelAction_0(),
					$current);
			}
		)
		otherlv_1='Request'
		{
			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getRequestKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getBodyBodyParserRuleCall_3_0());
				}
				lv_body_3_0=ruleBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"body",
						lv_body_3_0,
						"br.com.poli.restModel.Rest.Body");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleBody
entryRuleBody returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBodyRule()); }
	iv_ruleBody=ruleBody
	{ $current=$iv_ruleBody.current; }
	EOF;

// Rule Body
ruleBody returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getBodyAccess().getBodyAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getBodyAccess().getElemElemParserRuleCall_0_1_0());
					}
					lv_elem_1_0=ruleElem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBodyRule());
						}
						add(
							$current,
							"elem",
							lv_elem_1_0,
							"br.com.poli.restModel.Rest.Elem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getBodyAccess().getBodyAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getBodyAccess().getGlobAtribAtribParserRuleCall_1_1_0());
					}
					lv_globAtrib_3_0=ruleAtrib
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBodyRule());
						}
						add(
							$current,
							"globAtrib",
							lv_globAtrib_3_0,
							"br.com.poli.restModel.Rest.Atrib");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleElem
entryRuleElem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElemRule()); }
	iv_ruleElem=ruleElem
	{ $current=$iv_ruleElem.current; }
	EOF;

// Rule Elem
ruleElem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_ClassName_0_0=RULE_ID
				{
					newLeafNode(lv_ClassName_0_0, grammarAccess.getElemAccess().getClassNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getElemRule());
					}
					setWithLastConsumed(
						$current,
						"ClassName",
						lv_ClassName_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getElemAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getElemAccess().getFieldFieldParserRuleCall_2_0());
				}
				lv_field_2_0=ruleField
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElemRule());
					}
					add(
						$current,
						"field",
						lv_field_2_0,
						"br.com.poli.restModel.Rest.Field");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getElemAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleField
entryRuleField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldRule()); }
	iv_ruleField=ruleField
	{ $current=$iv_ruleField.current; }
	EOF;

// Rule Field
ruleField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getFieldAccess().getFieldAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getFieldAccess().getAtribAtribParserRuleCall_0_1_0());
					}
					lv_atrib_1_0=ruleAtrib
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFieldRule());
						}
						set(
							$current,
							"atrib",
							lv_atrib_1_0,
							"br.com.poli.restModel.Rest.Atrib");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getFieldAccess().getFieldAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getFieldAccess().getMethodMethodParserRuleCall_1_1_0());
					}
					lv_method_3_0=ruleMethod
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFieldRule());
						}
						set(
							$current,
							"method",
							lv_method_3_0,
							"br.com.poli.restModel.Rest.Method");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleMethod
entryRuleMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodRule()); }
	iv_ruleMethod=ruleMethod
	{ $current=$iv_ruleMethod.current; }
	EOF;

// Rule Method
ruleMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_mName_0_0=RULE_ID
				{
					newLeafNode(lv_mName_0_0, grammarAccess.getMethodAccess().getMNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodRule());
					}
					setWithLastConsumed(
						$current,
						"mName",
						lv_mName_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodAccess().getParParmParserRuleCall_2_0());
				}
				lv_par_2_0=ruleParm
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodRule());
					}
					add(
						$current,
						"par",
						lv_par_2_0,
						"br.com.poli.restModel.Rest.Parm");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getRightParenthesisKeyword_3());
		}
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getColonKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodAccess().getTipoVALID_TYPESParserRuleCall_5_0());
				}
				lv_Tipo_5_0=ruleVALID_TYPES
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodRule());
					}
					set(
						$current,
						"Tipo",
						lv_Tipo_5_0,
						"br.com.poli.restModel.Rest.VALID_TYPES");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_implem_6_0=RULE_ALMOST__ANY__THING
				{
					newLeafNode(lv_implem_6_0, grammarAccess.getMethodAccess().getImplemALMOST__ANY__THINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodRule());
					}
					setWithLastConsumed(
						$current,
						"implem",
						lv_implem_6_0,
						"br.com.poli.restModel.Rest.ALMOST__ANY__THING");
				}
			)
		)?
	)
;

// Entry rule entryRuleParm
entryRuleParm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParmRule()); }
	iv_ruleParm=ruleParm
	{ $current=$iv_ruleParm.current; }
	EOF;

// Rule Parm
ruleParm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_atribName_0_0=RULE_ID
				{
					newLeafNode(lv_atribName_0_0, grammarAccess.getParmAccess().getAtribNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParmRule());
					}
					setWithLastConsumed(
						$current,
						"atribName",
						lv_atribName_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getParmAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParmAccess().getTipo_atriVALID_TYPESParserRuleCall_2_0());
				}
				lv_Tipo_atri_2_0=ruleVALID_TYPES
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParmRule());
					}
					set(
						$current,
						"Tipo_atri",
						lv_Tipo_atri_2_0,
						"br.com.poli.restModel.Rest.VALID_TYPES");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAtrib
entryRuleAtrib returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtribRule()); }
	iv_ruleAtrib=ruleAtrib
	{ $current=$iv_ruleAtrib.current; }
	EOF;

// Rule Atrib
ruleAtrib returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_atribName_0_0=RULE_ID
					{
						newLeafNode(lv_atribName_0_0, grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtribRule());
						}
						setWithLastConsumed(
							$current,
							"atribName",
							lv_atribName_0_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_1=':'
			{
				newLeafNode(otherlv_1, grammarAccess.getAtribAccess().getColonKeyword_0_1());
			}
			(
				(
					lv_Tipo_2_0=RULE_INT_TYPES
					{
						newLeafNode(lv_Tipo_2_0, grammarAccess.getAtribAccess().getTipoINT_TYPESTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtribRule());
						}
						setWithLastConsumed(
							$current,
							"Tipo",
							lv_Tipo_2_0,
							"br.com.poli.restModel.Rest.INT_TYPES");
					}
				)
			)
			(
				otherlv_3=':'
				{
					newLeafNode(otherlv_3, grammarAccess.getAtribAccess().getColonKeyword_0_3_0());
				}
				(
					(
						lv_ValueInt_4_0=RULE_INT
						{
							newLeafNode(lv_ValueInt_4_0, grammarAccess.getAtribAccess().getValueIntINTTerminalRuleCall_0_3_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAtribRule());
							}
							setWithLastConsumed(
								$current,
								"ValueInt",
								lv_ValueInt_4_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
			)?
		)
		    |
		(
			(
				(
					lv_atribName_5_0=RULE_ID
					{
						newLeafNode(lv_atribName_5_0, grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtribRule());
						}
						setWithLastConsumed(
							$current,
							"atribName",
							lv_atribName_5_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_6=':'
			{
				newLeafNode(otherlv_6, grammarAccess.getAtribAccess().getColonKeyword_1_1());
			}
			(
				(
					lv_Tipo_7_0='boolean'
					{
						newLeafNode(lv_Tipo_7_0, grammarAccess.getAtribAccess().getTipoBooleanKeyword_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtribRule());
						}
						setWithLastConsumed($current, "Tipo", lv_Tipo_7_0, "boolean");
					}
				)
			)
			(
				otherlv_8=':'
				{
					newLeafNode(otherlv_8, grammarAccess.getAtribAccess().getColonKeyword_1_3_0());
				}
				(
					(
						lv_ValueBool_9_0=RULE_BOOL
						{
							newLeafNode(lv_ValueBool_9_0, grammarAccess.getAtribAccess().getValueBoolBOOLTerminalRuleCall_1_3_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAtribRule());
							}
							setWithLastConsumed(
								$current,
								"ValueBool",
								lv_ValueBool_9_0,
								"br.com.poli.restModel.Rest.BOOL");
						}
					)
				)
			)?
		)
		    |
		(
			(
				(
					lv_atribName_10_0=RULE_ID
					{
						newLeafNode(lv_atribName_10_0, grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtribRule());
						}
						setWithLastConsumed(
							$current,
							"atribName",
							lv_atribName_10_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_11=':'
			{
				newLeafNode(otherlv_11, grammarAccess.getAtribAccess().getColonKeyword_2_1());
			}
			(
				(
					lv_Tipo_12_0=RULE_FLOAT_TYPES
					{
						newLeafNode(lv_Tipo_12_0, grammarAccess.getAtribAccess().getTipoFLOAT_TYPESTerminalRuleCall_2_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtribRule());
						}
						setWithLastConsumed(
							$current,
							"Tipo",
							lv_Tipo_12_0,
							"br.com.poli.restModel.Rest.FLOAT_TYPES");
					}
				)
			)
			(
				otherlv_13=':'
				{
					newLeafNode(otherlv_13, grammarAccess.getAtribAccess().getColonKeyword_2_3_0());
				}
				(
					(
						lv_ValueFlo_14_0=RULE_FLOAT
						{
							newLeafNode(lv_ValueFlo_14_0, grammarAccess.getAtribAccess().getValueFloFLOATTerminalRuleCall_2_3_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAtribRule());
							}
							setWithLastConsumed(
								$current,
								"ValueFlo",
								lv_ValueFlo_14_0,
								"br.com.poli.restModel.Rest.FLOAT");
						}
					)
				)
			)?
		)
		    |
		(
			(
				(
					lv_atribName_15_0=RULE_ID
					{
						newLeafNode(lv_atribName_15_0, grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtribRule());
						}
						setWithLastConsumed(
							$current,
							"atribName",
							lv_atribName_15_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_16=':'
			{
				newLeafNode(otherlv_16, grammarAccess.getAtribAccess().getColonKeyword_3_1());
			}
			(
				(
					lv_Tipo_17_0='String'
					{
						newLeafNode(lv_Tipo_17_0, grammarAccess.getAtribAccess().getTipoStringKeyword_3_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtribRule());
						}
						setWithLastConsumed($current, "Tipo", lv_Tipo_17_0, "String");
					}
				)
			)
			(
				otherlv_18=':'
				{
					newLeafNode(otherlv_18, grammarAccess.getAtribAccess().getColonKeyword_3_3_0());
				}
				(
					(
						lv_ValueStr_19_0=RULE_STRING
						{
							newLeafNode(lv_ValueStr_19_0, grammarAccess.getAtribAccess().getValueStrSTRINGTerminalRuleCall_3_3_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAtribRule());
							}
							setWithLastConsumed(
								$current,
								"ValueStr",
								lv_ValueStr_19_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)?
		)
		    |
		(
			(
				(
					lv_atribName_20_0=RULE_ID
					{
						newLeafNode(lv_atribName_20_0, grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_4_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtribRule());
						}
						setWithLastConsumed(
							$current,
							"atribName",
							lv_atribName_20_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_21=':'
			{
				newLeafNode(otherlv_21, grammarAccess.getAtribAccess().getColonKeyword_4_1());
			}
			(
				(
					lv_Tipo_22_0='char'
					{
						newLeafNode(lv_Tipo_22_0, grammarAccess.getAtribAccess().getTipoCharKeyword_4_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtribRule());
						}
						setWithLastConsumed($current, "Tipo", lv_Tipo_22_0, "char");
					}
				)
			)
			(
				otherlv_23=':'
				{
					newLeafNode(otherlv_23, grammarAccess.getAtribAccess().getColonKeyword_4_3_0());
				}
				(
					(
						lv_ValueChr_24_0=RULE_CHAR
						{
							newLeafNode(lv_ValueChr_24_0, grammarAccess.getAtribAccess().getValueChrCHARTerminalRuleCall_4_3_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAtribRule());
							}
							setWithLastConsumed(
								$current,
								"ValueChr",
								lv_ValueChr_24_0,
								"br.com.poli.restModel.Rest.CHAR");
						}
					)
				)
			)?
		)
		    |
		(
			(
				(
					lv_atribName_25_0=RULE_ID
					{
						newLeafNode(lv_atribName_25_0, grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_5_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtribRule());
						}
						setWithLastConsumed(
							$current,
							"atribName",
							lv_atribName_25_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_26=':'
			{
				newLeafNode(otherlv_26, grammarAccess.getAtribAccess().getColonKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAtribAccess().getTipoTYPE_NAMEParserRuleCall_5_2_0());
					}
					lv_Tipo_27_0=ruleTYPE_NAME
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAtribRule());
						}
						set(
							$current,
							"Tipo",
							lv_Tipo_27_0,
							"br.com.poli.restModel.Rest.TYPE_NAME");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleTYPE_NAME
entryRuleTYPE_NAME returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTYPE_NAMERule()); }
	iv_ruleTYPE_NAME=ruleTYPE_NAME
	{ $current=$iv_ruleTYPE_NAME.current.getText(); }
	EOF;

// Rule TYPE_NAME
ruleTYPE_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='<'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTYPE_NAMEAccess().getLessThanSignKeyword_1_0());
			}
			(
				(
					this_ID_2=RULE_ID
					{
						$current.merge(this_ID_2);
					}
					{
						newLeafNode(this_ID_2, grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_1_1_0_0());
					}
					    |
					{
						newCompositeNode(grammarAccess.getTYPE_NAMEAccess().getVALID_TYPESParserRuleCall_1_1_0_1());
					}
					this_VALID_TYPES_3=ruleVALID_TYPES
					{
						$current.merge(this_VALID_TYPES_3);
					}
					{
						afterParserOrEnumRuleCall();
					}
				)
				kw=','
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getTYPE_NAMEAccess().getCommaKeyword_1_1_1());
				}
			)*
			this_ID_5=RULE_ID
			{
				$current.merge(this_ID_5);
			}
			{
				newLeafNode(this_ID_5, grammarAccess.getTYPE_NAMEAccess().getIDTerminalRuleCall_1_2());
			}
			kw='>'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTYPE_NAMEAccess().getGreaterThanSignKeyword_1_3());
			}
		)?
	)
;

// Entry rule entryRuleVALID_TYPES
entryRuleVALID_TYPES returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVALID_TYPESRule()); }
	iv_ruleVALID_TYPES=ruleVALID_TYPES
	{ $current=$iv_ruleVALID_TYPES.current.getText(); }
	EOF;

// Rule VALID_TYPES
ruleVALID_TYPES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='String'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVALID_TYPESAccess().getStringKeyword_0());
		}
		    |
		kw='boolean'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVALID_TYPESAccess().getBooleanKeyword_1());
		}
		    |
		kw='char'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVALID_TYPESAccess().getCharKeyword_2());
		}
		    |
		this_INT_TYPES_3=RULE_INT_TYPES
		{
			$current.merge(this_INT_TYPES_3);
		}
		{
			newLeafNode(this_INT_TYPES_3, grammarAccess.getVALID_TYPESAccess().getINT_TYPESTerminalRuleCall_3());
		}
		    |
		this_FLOAT_TYPES_4=RULE_FLOAT_TYPES
		{
			$current.merge(this_FLOAT_TYPES_4);
		}
		{
			newLeafNode(this_FLOAT_TYPES_4, grammarAccess.getVALID_TYPESAccess().getFLOAT_TYPESTerminalRuleCall_4());
		}
	)
;

RULE_BOOL : ('True'|'False');

RULE_FLOAT : '1'..'9' ('0'..'9')* '.' ('0'..'9')+;

RULE_CHAR : '\'' . '\'';

RULE_INT_TYPES : ('int'|'long'|'short'|'byte');

RULE_FLOAT_TYPES : ('float'|'double');

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ML_COMMENT : '##' ( options {greedy=false;} : . )*'##';

RULE_ALMOST__ANY__THING : ':' '{' ~('}')* '}';

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ANY_OTHER : .;
