/**
 * generated by Xtext 2.15.0
 */
package br.com.poli.restModel.generator;

import br.com.poli.restModel.rest.Atrib;
import br.com.poli.restModel.rest.Body;
import br.com.poli.restModel.rest.Elem;
import br.com.poli.restModel.rest.Field;
import br.com.poli.restModel.rest.Method;
import br.com.poli.restModel.rest.Parm;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RestGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  private String elem;
  
  private String tipoElem;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Body> _filter = Iterables.<Body>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Body.class);
    for (final Body body : _filter) {
      {
        this.elem = "";
        this.tipoElem = "";
        EList<Atrib> _globAtrib = body.getGlobAtrib();
        boolean _tripleNotEquals = (_globAtrib != null);
        if (_tripleNotEquals) {
          EList<Atrib> _globAtrib_1 = body.getGlobAtrib();
          for (final Atrib element : _globAtrib_1) {
            {
              this.tipoElem = element.getTipo();
              String _elem = this.elem;
              String _atribName = element.getAtribName();
              String _plus = ((("public final static " + this.tipoElem) + " ") + _atribName);
              this.elem = (_elem + _plus);
              boolean _equals = this.tipoElem.equals("boolean");
              if (_equals) {
                String _elem_1 = this.elem;
                String _valueBool = element.getValueBool();
                String _plus_1 = ("=" + _valueBool);
                this.elem = (_elem_1 + _plus_1);
              } else {
                boolean _equals_1 = this.tipoElem.equals("String");
                if (_equals_1) {
                  String _elem_2 = this.elem;
                  String _valueStr = element.getValueStr();
                  String _plus_2 = ("=" + _valueStr);
                  this.elem = (_elem_2 + _plus_2);
                } else {
                  boolean _equals_2 = this.tipoElem.equals("char");
                  if (_equals_2) {
                    String _elem_3 = this.elem;
                    char _valueChr = element.getValueChr();
                    String _plus_3 = ("=" + Character.valueOf(_valueChr));
                    this.elem = (_elem_3 + _plus_3);
                  }
                }
              }
              String _elem_4 = this.elem;
              this.elem = (_elem_4 + ";");
            }
          }
        }
        EList<Elem> _elem = body.getElem();
        for (final Elem elem : _elem) {
          String _className = elem.getClassName();
          String _plus = (_className + ".java");
          fsa.generateFile(_plus, this.compile(elem));
        }
      }
    }
  }
  
  public CharSequence compile(final Elem elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _className = elem.getClassName();
    _builder.append(_className);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Field> _field = elem.getField();
      for(final Field art : _field) {
        CharSequence _compile = this.compile(art);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Field f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Method _method = f.getMethod();
      boolean _tripleNotEquals = (_method != null);
      if (_tripleNotEquals) {
        CharSequence _compile = this.compile(f.getMethod());
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      } else {
        {
          Atrib _atrib = f.getAtrib();
          boolean _tripleNotEquals_1 = (_atrib != null);
          if (_tripleNotEquals_1) {
            CharSequence _compile_1 = this.compile(f.getAtrib());
            _builder.append(_compile_1);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Method met) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _tipo = met.getTipo();
    _builder.append(_tipo);
    _builder.append(" ");
    String _mName = met.getMName();
    _builder.append(_mName);
    _builder.append(" (");
    {
      EList<Parm> _par = met.getPar();
      boolean _hasElements = false;
      for(final Parm par : _par) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        String _tipo_atri = par.getTipo_atri();
        _builder.append(_tipo_atri);
        _builder.append(" ");
        String _atribName = par.getAtribName();
        _builder.append(_atribName);
        _builder.append(" ");
      }
    }
    _builder.append(")");
    {
      String _implem = met.getImplem();
      boolean _tripleEquals = (_implem == null);
      if (_tripleEquals) {
        _builder.append(";");
      } else {
        String _substring = met.getImplem().substring(1);
        _builder.append(_substring);
      }
    }
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Atrib atr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _tipo = atr.getTipo();
    _builder.append(_tipo);
    _builder.append(" ");
    String _firstLower = StringExtensions.toFirstLower(atr.getAtribName());
    _builder.append(_firstLower);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    String _tipo_1 = atr.getTipo();
    _builder.append(_tipo_1);
    _builder.append(" get");
    String _firstUpper = StringExtensions.toFirstUpper(atr.getAtribName());
    _builder.append(_firstUpper);
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("returns this.");
    String _firstLower_1 = StringExtensions.toFirstLower(atr.getAtribName());
    _builder.append(_firstLower_1, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void set");
    String _firstUpper_1 = StringExtensions.toFirstUpper(atr.getAtribName());
    _builder.append(_firstUpper_1);
    _builder.append("(");
    String _tipo_2 = atr.getTipo();
    _builder.append(_tipo_2);
    _builder.append(" ");
    String _firstLower_2 = StringExtensions.toFirstLower(atr.getAtribName());
    _builder.append(_firstLower_2);
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("this.");
    String _firstLower_3 = StringExtensions.toFirstLower(atr.getAtribName());
    _builder.append(_firstLower_3, "\t");
    _builder.append(" = ");
    String _firstLower_4 = StringExtensions.toFirstLower(atr.getAtribName());
    _builder.append(_firstLower_4, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
