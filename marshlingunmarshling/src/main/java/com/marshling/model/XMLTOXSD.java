package com.marshling.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.wiztools.xsdgen.ParseException;
import org.wiztools.xsdgen.XsdGen;

public class XMLTOXSD {
	public static void main(String ar[]) throws FileNotFoundException, IOException, ParseException{
		XsdGen gen = new XsdGen();
		gen.parse(new File(System.getProperty("user.home")+"/marshlingunmarshling/employees.xml"));
		File out = new File(System.getProperty("user.home")+"/marshlingunmarshling/employees.xsd");
		gen.write(new FileOutputStream(out));
		if(out!=null){
			System.out.println("xsd created");
		}
	}
}