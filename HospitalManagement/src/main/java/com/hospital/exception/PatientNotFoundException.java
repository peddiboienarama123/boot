package com.hospital.exception;

public class PatientNotFoundException extends Exception {
String message;
public PatientNotFoundException()
{
	System.out.println("patient details not found");
}
public PatientNotFoundException(String message)
{
	super(message);
}
}
