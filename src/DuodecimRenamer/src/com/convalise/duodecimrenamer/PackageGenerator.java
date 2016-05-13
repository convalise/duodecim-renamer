
package com.convalise.duodecimrenamer;

import com.convalise.duodecimrenamer.engine.ResourceManager;

public class PackageGenerator {
	
	public static void main(String[] args) {
		try {
			ResourceManager.generatePackageFile();
		}
		catch(Exception ex) {
			ex.printStackTrace(System.err);
		}
	}
	
}
