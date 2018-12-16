/*
 * generated by Xtext 2.15.0
 */
package br.com.poli.restModel.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RestGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRequestKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBodyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBodyBodyParserRuleCall_3_0 = (RuleCall)cBodyAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Model:
		//	{Model} "Request" '{' body+=Body* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Model} "Request" '{' body+=Body* '}'
		public Group getGroup() { return cGroup; }
		
		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }
		
		//"Request"
		public Keyword getRequestKeyword_1() { return cRequestKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//body+=Body*
		public Assignment getBodyAssignment_3() { return cBodyAssignment_3; }
		
		//Body
		public RuleCall getBodyBodyParserRuleCall_3_0() { return cBodyBodyParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class BodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.Body");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cBodyAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cElemAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cElemElemParserRuleCall_0_1_0 = (RuleCall)cElemAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cBodyAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cGlobAtribAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cGlobAtribAtribParserRuleCall_1_1_0 = (RuleCall)cGlobAtribAssignment_1_1.eContents().get(0);
		
		//Body:
		//	{Body} elem+=Elem | {Body} globAtrib+=Atrib;
		@Override public ParserRule getRule() { return rule; }
		
		//{Body} elem+=Elem | {Body} globAtrib+=Atrib
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Body} elem+=Elem
		public Group getGroup_0() { return cGroup_0; }
		
		//{Body}
		public Action getBodyAction_0_0() { return cBodyAction_0_0; }
		
		//elem+=Elem
		public Assignment getElemAssignment_0_1() { return cElemAssignment_0_1; }
		
		//Elem
		public RuleCall getElemElemParserRuleCall_0_1_0() { return cElemElemParserRuleCall_0_1_0; }
		
		//{Body} globAtrib+=Atrib
		public Group getGroup_1() { return cGroup_1; }
		
		//{Body}
		public Action getBodyAction_1_0() { return cBodyAction_1_0; }
		
		//globAtrib+=Atrib
		public Assignment getGlobAtribAssignment_1_1() { return cGlobAtribAssignment_1_1; }
		
		//Atrib
		public RuleCall getGlobAtribAtribParserRuleCall_1_1_0() { return cGlobAtribAtribParserRuleCall_1_1_0; }
	}
	public class ElemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.Elem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cClassNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cClassNameIDTerminalRuleCall_0_0 = (RuleCall)cClassNameAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFieldAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFieldFieldParserRuleCall_2_0 = (RuleCall)cFieldAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Elem:
		//	ClassName=ID '{' field+=Field* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//ClassName=ID '{' field+=Field* '}'
		public Group getGroup() { return cGroup; }
		
		//ClassName=ID
		public Assignment getClassNameAssignment_0() { return cClassNameAssignment_0; }
		
		//ID
		public RuleCall getClassNameIDTerminalRuleCall_0_0() { return cClassNameIDTerminalRuleCall_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//field+=Field*
		public Assignment getFieldAssignment_2() { return cFieldAssignment_2; }
		
		//Field
		public RuleCall getFieldFieldParserRuleCall_2_0() { return cFieldFieldParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.Field");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cFieldAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cAtribAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cAtribAtribParserRuleCall_0_1_0 = (RuleCall)cAtribAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cFieldAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cMethodAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cMethodMethodParserRuleCall_1_1_0 = (RuleCall)cMethodAssignment_1_1.eContents().get(0);
		
		//Field:
		//	{Field} atrib=Atrib | {Field} method=Method;
		@Override public ParserRule getRule() { return rule; }
		
		//{Field} atrib=Atrib | {Field} method=Method
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Field} atrib=Atrib
		public Group getGroup_0() { return cGroup_0; }
		
		//{Field}
		public Action getFieldAction_0_0() { return cFieldAction_0_0; }
		
		//atrib=Atrib
		public Assignment getAtribAssignment_0_1() { return cAtribAssignment_0_1; }
		
		//Atrib
		public RuleCall getAtribAtribParserRuleCall_0_1_0() { return cAtribAtribParserRuleCall_0_1_0; }
		
		//{Field} method=Method
		public Group getGroup_1() { return cGroup_1; }
		
		//{Field}
		public Action getFieldAction_1_0() { return cFieldAction_1_0; }
		
		//method=Method
		public Assignment getMethodAssignment_1_1() { return cMethodAssignment_1_1; }
		
		//Method
		public RuleCall getMethodMethodParserRuleCall_1_1_0() { return cMethodMethodParserRuleCall_1_1_0; }
	}
	public class MethodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.Method");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cMNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cMNameIDTerminalRuleCall_0_0 = (RuleCall)cMNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cParAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cParParmParserRuleCall_2_0 = (RuleCall)cParAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTipoAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTipoVALID_TYPESParserRuleCall_5_0 = (RuleCall)cTipoAssignment_5.eContents().get(0);
		private final Assignment cImplemAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cImplemALMOST__ANY__THINGTerminalRuleCall_6_0 = (RuleCall)cImplemAssignment_6.eContents().get(0);
		
		//Method:
		//	mName=ID '(' par+=Parm* ')' ":" Tipo=VALID_TYPES implem=ALMOST__ANY__THING?;
		@Override public ParserRule getRule() { return rule; }
		
		//mName=ID '(' par+=Parm* ')' ":" Tipo=VALID_TYPES implem=ALMOST__ANY__THING?
		public Group getGroup() { return cGroup; }
		
		//mName=ID
		public Assignment getMNameAssignment_0() { return cMNameAssignment_0; }
		
		//ID
		public RuleCall getMNameIDTerminalRuleCall_0_0() { return cMNameIDTerminalRuleCall_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//par+=Parm*
		public Assignment getParAssignment_2() { return cParAssignment_2; }
		
		//Parm
		public RuleCall getParParmParserRuleCall_2_0() { return cParParmParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
		
		//":"
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//Tipo=VALID_TYPES
		public Assignment getTipoAssignment_5() { return cTipoAssignment_5; }
		
		//VALID_TYPES
		public RuleCall getTipoVALID_TYPESParserRuleCall_5_0() { return cTipoVALID_TYPESParserRuleCall_5_0; }
		
		//implem=ALMOST__ANY__THING?
		public Assignment getImplemAssignment_6() { return cImplemAssignment_6; }
		
		//ALMOST__ANY__THING
		public RuleCall getImplemALMOST__ANY__THINGTerminalRuleCall_6_0() { return cImplemALMOST__ANY__THINGTerminalRuleCall_6_0; }
	}
	public class ParmElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.Parm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAtribNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAtribNameIDTerminalRuleCall_0_0 = (RuleCall)cAtribNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTipo_atriAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTipo_atriVALID_TYPESParserRuleCall_2_0 = (RuleCall)cTipo_atriAssignment_2.eContents().get(0);
		
		//Parm:
		//	atribName=ID ':' Tipo_atri=VALID_TYPES;
		@Override public ParserRule getRule() { return rule; }
		
		//atribName=ID ':' Tipo_atri=VALID_TYPES
		public Group getGroup() { return cGroup; }
		
		//atribName=ID
		public Assignment getAtribNameAssignment_0() { return cAtribNameAssignment_0; }
		
		//ID
		public RuleCall getAtribNameIDTerminalRuleCall_0_0() { return cAtribNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//Tipo_atri=VALID_TYPES
		public Assignment getTipo_atriAssignment_2() { return cTipo_atriAssignment_2; }
		
		//VALID_TYPES
		public RuleCall getTipo_atriVALID_TYPESParserRuleCall_2_0() { return cTipo_atriVALID_TYPESParserRuleCall_2_0; }
	}
	public class AtribElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.Atrib");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cAtribNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cAtribNameIDTerminalRuleCall_0_0_0 = (RuleCall)cAtribNameAssignment_0_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cTipoAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cTipoINT_TYPESTerminalRuleCall_0_2_0 = (RuleCall)cTipoAssignment_0_2.eContents().get(0);
		private final Group cGroup_0_3 = (Group)cGroup_0.eContents().get(3);
		private final Keyword cColonKeyword_0_3_0 = (Keyword)cGroup_0_3.eContents().get(0);
		private final Assignment cValueIntAssignment_0_3_1 = (Assignment)cGroup_0_3.eContents().get(1);
		private final RuleCall cValueIntINTTerminalRuleCall_0_3_1_0 = (RuleCall)cValueIntAssignment_0_3_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cAtribNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cAtribNameIDTerminalRuleCall_1_0_0 = (RuleCall)cAtribNameAssignment_1_0.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cTipoAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final Keyword cTipoBooleanKeyword_1_2_0 = (Keyword)cTipoAssignment_1_2.eContents().get(0);
		private final Group cGroup_1_3 = (Group)cGroup_1.eContents().get(3);
		private final Keyword cColonKeyword_1_3_0 = (Keyword)cGroup_1_3.eContents().get(0);
		private final Assignment cValueBoolAssignment_1_3_1 = (Assignment)cGroup_1_3.eContents().get(1);
		private final RuleCall cValueBoolBOOLTerminalRuleCall_1_3_1_0 = (RuleCall)cValueBoolAssignment_1_3_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Assignment cAtribNameAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cAtribNameIDTerminalRuleCall_2_0_0 = (RuleCall)cAtribNameAssignment_2_0.eContents().get(0);
		private final Keyword cColonKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cTipoAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cTipoFLOAT_TYPESTerminalRuleCall_2_2_0 = (RuleCall)cTipoAssignment_2_2.eContents().get(0);
		private final Group cGroup_2_3 = (Group)cGroup_2.eContents().get(3);
		private final Keyword cColonKeyword_2_3_0 = (Keyword)cGroup_2_3.eContents().get(0);
		private final Assignment cValueFloAssignment_2_3_1 = (Assignment)cGroup_2_3.eContents().get(1);
		private final RuleCall cValueFloFLOATTerminalRuleCall_2_3_1_0 = (RuleCall)cValueFloAssignment_2_3_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Assignment cAtribNameAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cAtribNameIDTerminalRuleCall_3_0_0 = (RuleCall)cAtribNameAssignment_3_0.eContents().get(0);
		private final Keyword cColonKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cTipoAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final Keyword cTipoStringKeyword_3_2_0 = (Keyword)cTipoAssignment_3_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cColonKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cValueStrAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cValueStrSTRINGTerminalRuleCall_3_3_1_0 = (RuleCall)cValueStrAssignment_3_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Assignment cAtribNameAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cAtribNameIDTerminalRuleCall_4_0_0 = (RuleCall)cAtribNameAssignment_4_0.eContents().get(0);
		private final Keyword cColonKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cTipoAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final Keyword cTipoCharKeyword_4_2_0 = (Keyword)cTipoAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cColonKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cValueChrAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cValueChrCHARTerminalRuleCall_4_3_1_0 = (RuleCall)cValueChrAssignment_4_3_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Assignment cAtribNameAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cAtribNameIDTerminalRuleCall_5_0_0 = (RuleCall)cAtribNameAssignment_5_0.eContents().get(0);
		private final Keyword cColonKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cTipoAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cTipoTYPE_NAMEParserRuleCall_5_2_0 = (RuleCall)cTipoAssignment_5_2.eContents().get(0);
		
		//Atrib:
		//	atribName=ID ":" Tipo=INT_TYPES (":" ValueInt=INT)?
		//	| atribName=ID ":" Tipo='boolean' (":" ValueBool=BOOL)?
		//	| atribName=ID ":" Tipo=FLOAT_TYPES (":" ValueFlo=FLOAT)?
		//	| atribName=ID ":" Tipo="String" (":" ValueStr=STRING)?
		//	| atribName=ID ":" Tipo="char" (":" ValueChr=CHAR)?
		//	| atribName=ID ":" Tipo=TYPE_NAME;
		@Override public ParserRule getRule() { return rule; }
		
		//atribName=ID ":" Tipo=INT_TYPES (":" ValueInt=INT)? | atribName=ID ":" Tipo='boolean' (":" ValueBool=BOOL)? |
		//atribName=ID ":" Tipo=FLOAT_TYPES (":" ValueFlo=FLOAT)? | atribName=ID ":" Tipo="String" (":" ValueStr=STRING)? |
		//atribName=ID ":" Tipo="char" (":" ValueChr=CHAR)? | atribName=ID ":" Tipo=TYPE_NAME
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//atribName=ID ":" Tipo=INT_TYPES (":" ValueInt=INT)?
		public Group getGroup_0() { return cGroup_0; }
		
		//atribName=ID
		public Assignment getAtribNameAssignment_0_0() { return cAtribNameAssignment_0_0; }
		
		//ID
		public RuleCall getAtribNameIDTerminalRuleCall_0_0_0() { return cAtribNameIDTerminalRuleCall_0_0_0; }
		
		//":"
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//Tipo=INT_TYPES
		public Assignment getTipoAssignment_0_2() { return cTipoAssignment_0_2; }
		
		//INT_TYPES
		public RuleCall getTipoINT_TYPESTerminalRuleCall_0_2_0() { return cTipoINT_TYPESTerminalRuleCall_0_2_0; }
		
		//(":" ValueInt=INT)?
		public Group getGroup_0_3() { return cGroup_0_3; }
		
		//":"
		public Keyword getColonKeyword_0_3_0() { return cColonKeyword_0_3_0; }
		
		//ValueInt=INT
		public Assignment getValueIntAssignment_0_3_1() { return cValueIntAssignment_0_3_1; }
		
		//INT
		public RuleCall getValueIntINTTerminalRuleCall_0_3_1_0() { return cValueIntINTTerminalRuleCall_0_3_1_0; }
		
		//atribName=ID ":" Tipo='boolean' (":" ValueBool=BOOL)?
		public Group getGroup_1() { return cGroup_1; }
		
		//atribName=ID
		public Assignment getAtribNameAssignment_1_0() { return cAtribNameAssignment_1_0; }
		
		//ID
		public RuleCall getAtribNameIDTerminalRuleCall_1_0_0() { return cAtribNameIDTerminalRuleCall_1_0_0; }
		
		//":"
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }
		
		//Tipo='boolean'
		public Assignment getTipoAssignment_1_2() { return cTipoAssignment_1_2; }
		
		//'boolean'
		public Keyword getTipoBooleanKeyword_1_2_0() { return cTipoBooleanKeyword_1_2_0; }
		
		//(":" ValueBool=BOOL)?
		public Group getGroup_1_3() { return cGroup_1_3; }
		
		//":"
		public Keyword getColonKeyword_1_3_0() { return cColonKeyword_1_3_0; }
		
		//ValueBool=BOOL
		public Assignment getValueBoolAssignment_1_3_1() { return cValueBoolAssignment_1_3_1; }
		
		//BOOL
		public RuleCall getValueBoolBOOLTerminalRuleCall_1_3_1_0() { return cValueBoolBOOLTerminalRuleCall_1_3_1_0; }
		
		//atribName=ID ":" Tipo=FLOAT_TYPES (":" ValueFlo=FLOAT)?
		public Group getGroup_2() { return cGroup_2; }
		
		//atribName=ID
		public Assignment getAtribNameAssignment_2_0() { return cAtribNameAssignment_2_0; }
		
		//ID
		public RuleCall getAtribNameIDTerminalRuleCall_2_0_0() { return cAtribNameIDTerminalRuleCall_2_0_0; }
		
		//":"
		public Keyword getColonKeyword_2_1() { return cColonKeyword_2_1; }
		
		//Tipo=FLOAT_TYPES
		public Assignment getTipoAssignment_2_2() { return cTipoAssignment_2_2; }
		
		//FLOAT_TYPES
		public RuleCall getTipoFLOAT_TYPESTerminalRuleCall_2_2_0() { return cTipoFLOAT_TYPESTerminalRuleCall_2_2_0; }
		
		//(":" ValueFlo=FLOAT)?
		public Group getGroup_2_3() { return cGroup_2_3; }
		
		//":"
		public Keyword getColonKeyword_2_3_0() { return cColonKeyword_2_3_0; }
		
		//ValueFlo=FLOAT
		public Assignment getValueFloAssignment_2_3_1() { return cValueFloAssignment_2_3_1; }
		
		//FLOAT
		public RuleCall getValueFloFLOATTerminalRuleCall_2_3_1_0() { return cValueFloFLOATTerminalRuleCall_2_3_1_0; }
		
		//atribName=ID ":" Tipo="String" (":" ValueStr=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//atribName=ID
		public Assignment getAtribNameAssignment_3_0() { return cAtribNameAssignment_3_0; }
		
		//ID
		public RuleCall getAtribNameIDTerminalRuleCall_3_0_0() { return cAtribNameIDTerminalRuleCall_3_0_0; }
		
		//":"
		public Keyword getColonKeyword_3_1() { return cColonKeyword_3_1; }
		
		//Tipo="String"
		public Assignment getTipoAssignment_3_2() { return cTipoAssignment_3_2; }
		
		//"String"
		public Keyword getTipoStringKeyword_3_2_0() { return cTipoStringKeyword_3_2_0; }
		
		//(":" ValueStr=STRING)?
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//":"
		public Keyword getColonKeyword_3_3_0() { return cColonKeyword_3_3_0; }
		
		//ValueStr=STRING
		public Assignment getValueStrAssignment_3_3_1() { return cValueStrAssignment_3_3_1; }
		
		//STRING
		public RuleCall getValueStrSTRINGTerminalRuleCall_3_3_1_0() { return cValueStrSTRINGTerminalRuleCall_3_3_1_0; }
		
		//atribName=ID ":" Tipo="char" (":" ValueChr=CHAR)?
		public Group getGroup_4() { return cGroup_4; }
		
		//atribName=ID
		public Assignment getAtribNameAssignment_4_0() { return cAtribNameAssignment_4_0; }
		
		//ID
		public RuleCall getAtribNameIDTerminalRuleCall_4_0_0() { return cAtribNameIDTerminalRuleCall_4_0_0; }
		
		//":"
		public Keyword getColonKeyword_4_1() { return cColonKeyword_4_1; }
		
		//Tipo="char"
		public Assignment getTipoAssignment_4_2() { return cTipoAssignment_4_2; }
		
		//"char"
		public Keyword getTipoCharKeyword_4_2_0() { return cTipoCharKeyword_4_2_0; }
		
		//(":" ValueChr=CHAR)?
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//":"
		public Keyword getColonKeyword_4_3_0() { return cColonKeyword_4_3_0; }
		
		//ValueChr=CHAR
		public Assignment getValueChrAssignment_4_3_1() { return cValueChrAssignment_4_3_1; }
		
		//CHAR
		public RuleCall getValueChrCHARTerminalRuleCall_4_3_1_0() { return cValueChrCHARTerminalRuleCall_4_3_1_0; }
		
		//atribName=ID ":" Tipo=TYPE_NAME
		public Group getGroup_5() { return cGroup_5; }
		
		//atribName=ID
		public Assignment getAtribNameAssignment_5_0() { return cAtribNameAssignment_5_0; }
		
		//ID
		public RuleCall getAtribNameIDTerminalRuleCall_5_0_0() { return cAtribNameIDTerminalRuleCall_5_0_0; }
		
		//":"
		public Keyword getColonKeyword_5_1() { return cColonKeyword_5_1; }
		
		//Tipo=TYPE_NAME
		public Assignment getTipoAssignment_5_2() { return cTipoAssignment_5_2; }
		
		//TYPE_NAME
		public RuleCall getTipoTYPE_NAMEParserRuleCall_5_2_0() { return cTipoTYPE_NAMEParserRuleCall_5_2_0; }
	}
	public class TYPE_NAMEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.TYPE_NAME");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLessThanSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Alternatives cAlternatives_1_1_0 = (Alternatives)cGroup_1_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1_0_0 = (RuleCall)cAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cVALID_TYPESParserRuleCall_1_1_0_1 = (RuleCall)cAlternatives_1_1_0.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		private final Keyword cGreaterThanSignKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		//TYPE_NAME:
		//	ID ('<' ((ID | VALID_TYPES) ',')* ID '>')?;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('<' ((ID | VALID_TYPES) ',')* ID '>')?
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('<' ((ID | VALID_TYPES) ',')* ID '>')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'<'
		public Keyword getLessThanSignKeyword_1_0() { return cLessThanSignKeyword_1_0; }
		
		//((ID | VALID_TYPES) ',')*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//ID | VALID_TYPES
		public Alternatives getAlternatives_1_1_0() { return cAlternatives_1_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1_0_0() { return cIDTerminalRuleCall_1_1_0_0; }
		
		//VALID_TYPES
		public RuleCall getVALID_TYPESParserRuleCall_1_1_0_1() { return cVALID_TYPESParserRuleCall_1_1_0_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_1() { return cCommaKeyword_1_1_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_2() { return cIDTerminalRuleCall_1_2; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_1_3() { return cGreaterThanSignKeyword_1_3; }
	}
	public class VALID_TYPESElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.VALID_TYPES");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cStringKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cBooleanKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cCharKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final RuleCall cINT_TYPESTerminalRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cFLOAT_TYPESTerminalRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//VALID_TYPES:
		//	"String"
		//	| 'boolean'
		//	| "char"
		//	| INT_TYPES
		//	| FLOAT_TYPES;
		@Override public ParserRule getRule() { return rule; }
		
		//"String" | 'boolean' | "char" | INT_TYPES | FLOAT_TYPES
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"String"
		public Keyword getStringKeyword_0() { return cStringKeyword_0; }
		
		//'boolean'
		public Keyword getBooleanKeyword_1() { return cBooleanKeyword_1; }
		
		//"char"
		public Keyword getCharKeyword_2() { return cCharKeyword_2; }
		
		//INT_TYPES
		public RuleCall getINT_TYPESTerminalRuleCall_3() { return cINT_TYPESTerminalRuleCall_3; }
		
		//FLOAT_TYPES
		public RuleCall getFLOAT_TYPESTerminalRuleCall_4() { return cFLOAT_TYPESTerminalRuleCall_4; }
	}
	
	
	private final ModelElements pModel;
	private final BodyElements pBody;
	private final ElemElements pElem;
	private final FieldElements pField;
	private final MethodElements pMethod;
	private final ParmElements pParm;
	private final AtribElements pAtrib;
	private final TYPE_NAMEElements pTYPE_NAME;
	private final VALID_TYPESElements pVALID_TYPES;
	private final TerminalRule tBOOL;
	private final TerminalRule tFLOAT;
	private final TerminalRule tCHAR;
	private final TerminalRule tINT_TYPES;
	private final TerminalRule tFLOAT_TYPES;
	private final TerminalRule tWS;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tALMOST__ANY__THING;
	private final TerminalRule tSL_COMMENT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RestGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pBody = new BodyElements();
		this.pElem = new ElemElements();
		this.pField = new FieldElements();
		this.pMethod = new MethodElements();
		this.pParm = new ParmElements();
		this.pAtrib = new AtribElements();
		this.pTYPE_NAME = new TYPE_NAMEElements();
		this.pVALID_TYPES = new VALID_TYPESElements();
		this.tBOOL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.BOOL");
		this.tFLOAT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.FLOAT");
		this.tCHAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.CHAR");
		this.tINT_TYPES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.INT_TYPES");
		this.tFLOAT_TYPES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.FLOAT_TYPES");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.WS");
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.ML_COMMENT");
		this.tALMOST__ANY__THING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.ALMOST__ANY__THING");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.poli.restModel.Rest.SL_COMMENT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("br.com.poli.restModel.Rest".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	{Model} "Request" '{' body+=Body* '}';
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Body:
	//	{Body} elem+=Elem | {Body} globAtrib+=Atrib;
	public BodyElements getBodyAccess() {
		return pBody;
	}
	
	public ParserRule getBodyRule() {
		return getBodyAccess().getRule();
	}
	
	//Elem:
	//	ClassName=ID '{' field+=Field* '}';
	public ElemElements getElemAccess() {
		return pElem;
	}
	
	public ParserRule getElemRule() {
		return getElemAccess().getRule();
	}
	
	//Field:
	//	{Field} atrib=Atrib | {Field} method=Method;
	public FieldElements getFieldAccess() {
		return pField;
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}
	
	//Method:
	//	mName=ID '(' par+=Parm* ')' ":" Tipo=VALID_TYPES implem=ALMOST__ANY__THING?;
	public MethodElements getMethodAccess() {
		return pMethod;
	}
	
	public ParserRule getMethodRule() {
		return getMethodAccess().getRule();
	}
	
	//Parm:
	//	atribName=ID ':' Tipo_atri=VALID_TYPES;
	public ParmElements getParmAccess() {
		return pParm;
	}
	
	public ParserRule getParmRule() {
		return getParmAccess().getRule();
	}
	
	//Atrib:
	//	atribName=ID ":" Tipo=INT_TYPES (":" ValueInt=INT)?
	//	| atribName=ID ":" Tipo='boolean' (":" ValueBool=BOOL)?
	//	| atribName=ID ":" Tipo=FLOAT_TYPES (":" ValueFlo=FLOAT)?
	//	| atribName=ID ":" Tipo="String" (":" ValueStr=STRING)?
	//	| atribName=ID ":" Tipo="char" (":" ValueChr=CHAR)?
	//	| atribName=ID ":" Tipo=TYPE_NAME;
	public AtribElements getAtribAccess() {
		return pAtrib;
	}
	
	public ParserRule getAtribRule() {
		return getAtribAccess().getRule();
	}
	
	//TYPE_NAME:
	//	ID ('<' ((ID | VALID_TYPES) ',')* ID '>')?;
	public TYPE_NAMEElements getTYPE_NAMEAccess() {
		return pTYPE_NAME;
	}
	
	public ParserRule getTYPE_NAMERule() {
		return getTYPE_NAMEAccess().getRule();
	}
	
	//VALID_TYPES:
	//	"String"
	//	| 'boolean'
	//	| "char"
	//	| INT_TYPES
	//	| FLOAT_TYPES;
	public VALID_TYPESElements getVALID_TYPESAccess() {
		return pVALID_TYPES;
	}
	
	public ParserRule getVALID_TYPESRule() {
		return getVALID_TYPESAccess().getRule();
	}
	
	//terminal BOOL:
	//	"True" | "False";
	public TerminalRule getBOOLRule() {
		return tBOOL;
	}
	
	//terminal FLOAT returns ecore::EFloat:
	//	'1'..'9' '0'..'9'* '.' '0'..'9'+;
	public TerminalRule getFLOATRule() {
		return tFLOAT;
	}
	
	//terminal CHAR returns ecore::EChar:
	//	'\'' . '\'';
	public TerminalRule getCHARRule() {
		return tCHAR;
	}
	
	//terminal INT_TYPES:
	//	"int" | "long" | "short" | "byte";
	public TerminalRule getINT_TYPESRule() {
		return tINT_TYPES;
	}
	
	//terminal FLOAT_TYPES:
	//	"float" | "double";
	public TerminalRule getFLOAT_TYPESRule() {
		return tFLOAT_TYPES;
	}
	
	//@Override
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//@Override
	//terminal ML_COMMENT:
	//	'##'->'##';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal ALMOST__ANY__THING:
	//	':' '{' !'}'* '}';
	public TerminalRule getALMOST__ANY__THINGRule() {
		return tALMOST__ANY__THING;
	}
	
	//@Override
	//terminal SL_COMMENT:
	//	'#' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
