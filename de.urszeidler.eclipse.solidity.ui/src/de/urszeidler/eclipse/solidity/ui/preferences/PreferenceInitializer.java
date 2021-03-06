package de.urszeidler.eclipse.solidity.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import de.urszeidler.eclipse.solidity.ui.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE, Activator.PLUGIN_ID);
		
		store.setDefault(PreferenceConstants.GENERATE_HTML, true);
		store.setDefault(PreferenceConstants.GENERATE_CONTRACT_FILES, true);
		store.setDefault(PreferenceConstants.GENERATION_ALL_IN_ONE_FILE, false);
		store.setDefault(PreferenceConstants.GENERATE_MIX, true);
		store.setDefault(PreferenceConstants.GENERATE_WEB3, true);
		store.setDefault(PreferenceConstants.GENERATE_MARKDOWN, true);
		store.setDefault(PreferenceConstants.GENERATION_TARGET, "mix");
		store.setDefault(PreferenceConstants.GENERATION_TARGET_DOC, "doc");
		store.setDefault(PreferenceConstants.GENERATE_JS_CONTROLLER, true);
		store.setDefault(PreferenceConstants.GENERATE_JS_CONTROLLER_TARGET, "mix/js");
		store.setDefault(PreferenceConstants.GENERATE_JS_TEST, true);
		store.setDefault(PreferenceConstants.GENERATE_JS_TEST_TARGET, "mix/test");
		store.setDefault(PreferenceConstants.GENERATE_ABI_TARGET, "mix/abi");
		store.setDefault(PreferenceConstants.GENERATE_ABI, true);
		store.setDefault(PreferenceConstants.VERSION_PRAGMA, "pragma solidity ^0.4.0;");

		store.setDefault(PreferenceConstants.GENERATOR_PROJECT_SETTINGS, false);
		
		store.setDefault(PreferenceConstants.JS_FILE_HEADER, "// file header");
		store.setDefault(PreferenceConstants.CONTRACT_FILE_HEADER, "/*\n*\n*\n*/");
		
		store.setDefault(PreferenceConstants.GENERATE_JAVA_INTERFACE, true);
		store.setDefault(PreferenceConstants.GENERATE_JAVA_NONBLOCKING, false);
		store.setDefault(PreferenceConstants.GENERATION_JAVA_INTERFACE_TARGET, "src/");
		store.setDefault(PreferenceConstants.GENERATE_JAVA_TESTS, true);
		store.setDefault(PreferenceConstants.GENERATION_JAVA_TEST_TARGET, "test/");
		
		store.setDefault(PreferenceConstants.GENERATION_JAVA_2_SOLIDITY_TYPES, 
				"string,uint,uint256,int,address,bool,byte,bytes32");
		store.setDefault(PreferenceConstants.GENERATION_JAVA_2_SOLIDITY_TYPE_PREFIX+"string", "String");
		store.setDefault(PreferenceConstants.GENERATION_JAVA_2_SOLIDITY_TYPE_PREFIX+"uint", "Integer");
		store.setDefault(PreferenceConstants.GENERATION_JAVA_2_SOLIDITY_TYPE_PREFIX+"uint256", "Integer");
		store.setDefault(PreferenceConstants.GENERATION_JAVA_2_SOLIDITY_TYPE_PREFIX+"address", "org.adridadou.ethereum.propeller.values.EthAddress");
		store.setDefault(PreferenceConstants.GENERATION_JAVA_2_SOLIDITY_TYPE_PREFIX+"bool", "Boolean");
		store.setDefault(PreferenceConstants.GENERATION_JAVA_2_SOLIDITY_TYPE_PREFIX+"int", "Integer");
		store.setDefault(PreferenceConstants.GENERATION_JAVA_2_SOLIDITY_TYPE_PREFIX+"real", "Double");
		store.setDefault(PreferenceConstants.GENERATION_JAVA_2_SOLIDITY_TYPE_PREFIX+"byte", "Byte");
		store.setDefault(PreferenceConstants.GENERATION_JAVA_2_SOLIDITY_TYPE_PREFIX+"bytes32", "Byte[]");
	}

}
