/**
 * generated by Xtext 2.15.0
 */
package br.com.poli.restModel;

import br.com.poli.restModel.RestStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class RestStandaloneSetup extends RestStandaloneSetupGenerated {
  public static void doSetup() {
    new RestStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
