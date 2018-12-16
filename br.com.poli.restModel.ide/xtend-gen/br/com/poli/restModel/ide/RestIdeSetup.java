/**
 * generated by Xtext 2.15.0
 */
package br.com.poli.restModel.ide;

import br.com.poli.restModel.RestRuntimeModule;
import br.com.poli.restModel.RestStandaloneSetup;
import br.com.poli.restModel.ide.RestIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class RestIdeSetup extends RestStandaloneSetup {
  @Override
  public Injector createInjector() {
    RestRuntimeModule _restRuntimeModule = new RestRuntimeModule();
    RestIdeModule _restIdeModule = new RestIdeModule();
    return Guice.createInjector(Modules2.mixin(_restRuntimeModule, _restIdeModule));
  }
}
