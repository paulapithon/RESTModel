/*
 * generated by Xtext 2.15.0
 */
package br.com.poli.restModel


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RestStandaloneSetup extends RestStandaloneSetupGenerated {

	def static void doSetup() {
		new RestStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}