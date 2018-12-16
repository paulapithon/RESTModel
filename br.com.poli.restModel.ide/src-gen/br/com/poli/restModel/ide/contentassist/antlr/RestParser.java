/*
 * generated by Xtext 2.15.0
 */
package br.com.poli.restModel.ide.contentassist.antlr;

import br.com.poli.restModel.ide.contentassist.antlr.internal.InternalRestParser;
import br.com.poli.restModel.services.RestGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RestParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RestGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RestGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getBodyAccess().getAlternatives(), "rule__Body__Alternatives");
			builder.put(grammarAccess.getFieldAccess().getAlternatives(), "rule__Field__Alternatives");
			builder.put(grammarAccess.getAtribAccess().getAlternatives(), "rule__Atrib__Alternatives");
			builder.put(grammarAccess.getTYPE_NAMEAccess().getAlternatives_1_1_0(), "rule__TYPE_NAME__Alternatives_1_1_0");
			builder.put(grammarAccess.getVALID_TYPESAccess().getAlternatives(), "rule__VALID_TYPES__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getBodyAccess().getGroup_0(), "rule__Body__Group_0__0");
			builder.put(grammarAccess.getBodyAccess().getGroup_1(), "rule__Body__Group_1__0");
			builder.put(grammarAccess.getElemAccess().getGroup(), "rule__Elem__Group__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_0(), "rule__Field__Group_0__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_1(), "rule__Field__Group_1__0");
			builder.put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
			builder.put(grammarAccess.getParmAccess().getGroup(), "rule__Parm__Group__0");
			builder.put(grammarAccess.getAtribAccess().getGroup_0(), "rule__Atrib__Group_0__0");
			builder.put(grammarAccess.getAtribAccess().getGroup_0_3(), "rule__Atrib__Group_0_3__0");
			builder.put(grammarAccess.getAtribAccess().getGroup_1(), "rule__Atrib__Group_1__0");
			builder.put(grammarAccess.getAtribAccess().getGroup_1_3(), "rule__Atrib__Group_1_3__0");
			builder.put(grammarAccess.getAtribAccess().getGroup_2(), "rule__Atrib__Group_2__0");
			builder.put(grammarAccess.getAtribAccess().getGroup_2_3(), "rule__Atrib__Group_2_3__0");
			builder.put(grammarAccess.getAtribAccess().getGroup_3(), "rule__Atrib__Group_3__0");
			builder.put(grammarAccess.getAtribAccess().getGroup_3_3(), "rule__Atrib__Group_3_3__0");
			builder.put(grammarAccess.getAtribAccess().getGroup_4(), "rule__Atrib__Group_4__0");
			builder.put(grammarAccess.getAtribAccess().getGroup_4_3(), "rule__Atrib__Group_4_3__0");
			builder.put(grammarAccess.getAtribAccess().getGroup_5(), "rule__Atrib__Group_5__0");
			builder.put(grammarAccess.getTYPE_NAMEAccess().getGroup(), "rule__TYPE_NAME__Group__0");
			builder.put(grammarAccess.getTYPE_NAMEAccess().getGroup_1(), "rule__TYPE_NAME__Group_1__0");
			builder.put(grammarAccess.getTYPE_NAMEAccess().getGroup_1_1(), "rule__TYPE_NAME__Group_1_1__0");
			builder.put(grammarAccess.getModelAccess().getBodyAssignment_3(), "rule__Model__BodyAssignment_3");
			builder.put(grammarAccess.getBodyAccess().getElemAssignment_0_1(), "rule__Body__ElemAssignment_0_1");
			builder.put(grammarAccess.getBodyAccess().getGlobAtribAssignment_1_1(), "rule__Body__GlobAtribAssignment_1_1");
			builder.put(grammarAccess.getElemAccess().getClassNameAssignment_0(), "rule__Elem__ClassNameAssignment_0");
			builder.put(grammarAccess.getElemAccess().getFieldAssignment_2(), "rule__Elem__FieldAssignment_2");
			builder.put(grammarAccess.getFieldAccess().getAtribAssignment_0_1(), "rule__Field__AtribAssignment_0_1");
			builder.put(grammarAccess.getFieldAccess().getMethodAssignment_1_1(), "rule__Field__MethodAssignment_1_1");
			builder.put(grammarAccess.getMethodAccess().getMNameAssignment_0(), "rule__Method__MNameAssignment_0");
			builder.put(grammarAccess.getMethodAccess().getParAssignment_2(), "rule__Method__ParAssignment_2");
			builder.put(grammarAccess.getMethodAccess().getTipoAssignment_5(), "rule__Method__TipoAssignment_5");
			builder.put(grammarAccess.getMethodAccess().getImplemAssignment_6(), "rule__Method__ImplemAssignment_6");
			builder.put(grammarAccess.getParmAccess().getAtribNameAssignment_0(), "rule__Parm__AtribNameAssignment_0");
			builder.put(grammarAccess.getParmAccess().getTipo_atriAssignment_2(), "rule__Parm__Tipo_atriAssignment_2");
			builder.put(grammarAccess.getAtribAccess().getAtribNameAssignment_0_0(), "rule__Atrib__AtribNameAssignment_0_0");
			builder.put(grammarAccess.getAtribAccess().getTipoAssignment_0_2(), "rule__Atrib__TipoAssignment_0_2");
			builder.put(grammarAccess.getAtribAccess().getValueIntAssignment_0_3_1(), "rule__Atrib__ValueIntAssignment_0_3_1");
			builder.put(grammarAccess.getAtribAccess().getAtribNameAssignment_1_0(), "rule__Atrib__AtribNameAssignment_1_0");
			builder.put(grammarAccess.getAtribAccess().getTipoAssignment_1_2(), "rule__Atrib__TipoAssignment_1_2");
			builder.put(grammarAccess.getAtribAccess().getValueBoolAssignment_1_3_1(), "rule__Atrib__ValueBoolAssignment_1_3_1");
			builder.put(grammarAccess.getAtribAccess().getAtribNameAssignment_2_0(), "rule__Atrib__AtribNameAssignment_2_0");
			builder.put(grammarAccess.getAtribAccess().getTipoAssignment_2_2(), "rule__Atrib__TipoAssignment_2_2");
			builder.put(grammarAccess.getAtribAccess().getValueFloAssignment_2_3_1(), "rule__Atrib__ValueFloAssignment_2_3_1");
			builder.put(grammarAccess.getAtribAccess().getAtribNameAssignment_3_0(), "rule__Atrib__AtribNameAssignment_3_0");
			builder.put(grammarAccess.getAtribAccess().getTipoAssignment_3_2(), "rule__Atrib__TipoAssignment_3_2");
			builder.put(grammarAccess.getAtribAccess().getValueStrAssignment_3_3_1(), "rule__Atrib__ValueStrAssignment_3_3_1");
			builder.put(grammarAccess.getAtribAccess().getAtribNameAssignment_4_0(), "rule__Atrib__AtribNameAssignment_4_0");
			builder.put(grammarAccess.getAtribAccess().getTipoAssignment_4_2(), "rule__Atrib__TipoAssignment_4_2");
			builder.put(grammarAccess.getAtribAccess().getValueChrAssignment_4_3_1(), "rule__Atrib__ValueChrAssignment_4_3_1");
			builder.put(grammarAccess.getAtribAccess().getAtribNameAssignment_5_0(), "rule__Atrib__AtribNameAssignment_5_0");
			builder.put(grammarAccess.getAtribAccess().getTipoAssignment_5_2(), "rule__Atrib__TipoAssignment_5_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RestGrammarAccess grammarAccess;

	@Override
	protected InternalRestParser createParser() {
		InternalRestParser result = new InternalRestParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RestGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RestGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
