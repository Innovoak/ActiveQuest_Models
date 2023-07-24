package com.innovoak.apps.activequest.test;

import com.innovoak.util.webhelpers.data.DDLGenerator;

public class DDLGeneratorMain {

	public static void main(String[] args) throws Exception {
		DDLGenerator generator = new DDLGenerator("jdbc:mysql://localhost:3306/activequestdb", "root", "root");

		generator.generate();
	}

}
