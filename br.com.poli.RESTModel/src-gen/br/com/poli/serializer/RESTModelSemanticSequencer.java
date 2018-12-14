/*
 * generated by Xtext 2.15.0
 */
package br.com.poli.serializer;

import br.com.poli.rESTModel.Atrib;
import br.com.poli.rESTModel.Body;
import br.com.poli.rESTModel.Elem;
import br.com.poli.rESTModel.Field;
import br.com.poli.rESTModel.Method;
import br.com.poli.rESTModel.MethodBody;
import br.com.poli.rESTModel.RESTModelPackage;
import br.com.poli.rESTModel.Start;
import br.com.poli.services.RESTModelGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RESTModelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RESTModelGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RESTModelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RESTModelPackage.ATRIB:
				sequence_Atrib(context, (Atrib) semanticObject); 
				return; 
			case RESTModelPackage.BODY:
				sequence_Body(context, (Body) semanticObject); 
				return; 
			case RESTModelPackage.ELEM:
				sequence_Elem(context, (Elem) semanticObject); 
				return; 
			case RESTModelPackage.FIELD:
				sequence_Field(context, (Field) semanticObject); 
				return; 
			case RESTModelPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case RESTModelPackage.METHOD_BODY:
				sequence_MethodBody(context, (MethodBody) semanticObject); 
				return; 
			case RESTModelPackage.START:
				sequence_Start(context, (Start) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Atrib returns Atrib
	 *
	 * Constraint:
	 *     (atribName=ID Tipo=ID)
	 */
	protected void sequence_Atrib(ISerializationContext context, Atrib semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RESTModelPackage.Literals.ATRIB__ATRIB_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RESTModelPackage.Literals.ATRIB__ATRIB_NAME));
			if (transientValues.isValueTransient(semanticObject, RESTModelPackage.Literals.ATRIB__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RESTModelPackage.Literals.ATRIB__TIPO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtribAccess().getAtribNameIDTerminalRuleCall_0_0(), semanticObject.getAtribName());
		feeder.accept(grammarAccess.getAtribAccess().getTipoIDTerminalRuleCall_2_0(), semanticObject.getTipo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Body returns Body
	 *
	 * Constraint:
	 *     (elem=Elem | globAtrib=Atrib)?
	 */
	protected void sequence_Body(ISerializationContext context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Elem returns Elem
	 *
	 * Constraint:
	 *     (ClassName=ID field+=Field*)
	 */
	protected void sequence_Elem(ISerializationContext context, Elem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Field returns Field
	 *
	 * Constraint:
	 *     (atrib+=Atrib | meth+=Method)?
	 */
	protected void sequence_Field(ISerializationContext context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MethodBody returns MethodBody
	 *
	 * Constraint:
	 *     body+=ANY_OTHER*
	 */
	protected void sequence_MethodBody(ISerializationContext context, MethodBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Method returns Method
	 *
	 * Constraint:
	 *     (atribName=ID Tipo=ID mbody=MethodBody?)
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Start returns Start
	 *
	 * Constraint:
	 *     body=Body
	 */
	protected void sequence_Start(ISerializationContext context, Start semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RESTModelPackage.Literals.START__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RESTModelPackage.Literals.START__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStartAccess().getBodyBodyParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
}
