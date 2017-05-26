package com.marshling.model;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshlingMainClass {

	private static void unMarshalingExample() throws JAXBException 
	{
		JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		//We had written this file in marshalling example
		Employees emps = (Employees) jaxbUnmarshaller.unmarshal( new File(System.getProperty("user.home")+"/marshlingunmarshling/employees.xml") );

		for(Employee emp : emps.getEmployees())
		{
			System.out.println(emp.getId());
			System.out.println(emp.getFirstName());
		}
	}


	public static void main(String[] args) throws JAXBException {
		UnmarshlingMainClass.unMarshalingExample();
	}

}
