package com.demo;

public class CovertType {

	public static void main(String[] args) {
int number1=89;
char intToChar=(char) number1;
System.out.println(intToChar);
long number2=788;
int longToInt=(int)number2;
System.out.println(longToInt);
long intToLong=number1;
System.out.println(intToLong);
boolean isEmpty=true;
String booleanToInt=Boolean.toString(isEmpty);
String name="false";
boolean stringToBoolean=Boolean.getBoolean(name);
String intString="12345";
int stringToInt=Integer.parseInt(intString);
String intToString=String.valueOf(stringToInt);
double intToDouble=(double) number1;
double doubleNumber=12.34;
int doubleToInt=(int) doubleNumber;
String doubleStringNumber="123.987";
double stringTodouble=Double.parseDouble(doubleStringNumber);
int i=10;
Integer primitiveToObject= new Integer(i);
int objectToprimitive = primitiveToObject;
System.out.println(objectToprimitive);

	}

}
