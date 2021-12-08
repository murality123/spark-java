package com.automobile.TwoWheeler;

import com.automobile.Vehicle;

public class Test {

	public static void main(String[] args) {
Hero hero = new Hero();

String heroModeName =hero.getModeName();
String heroOwnerName = hero.getOwnerName();
  String heroReistrationNumber = hero.getReistrationNumber();
  int heroSpeed = hero.getSpeed();
System.out.println("hero vehicle Mode Name : "+ heroModeName);
System.out.println("hero vehicle owner Name : "+ heroOwnerName);
System.out.println("hero vehicle Registration number : "+ heroReistrationNumber);
System.out.println("hero vehicle speed: "+ heroSpeed);
Honda honda = new Honda();


String hondaModeName =hero.getModeName();
String hondaOwnerName = hero.getOwnerName();
  String hondaReistrationNumber = hero.getReistrationNumber();
  int hondaSpeed = hero.getSpeed();
System.out.println("honda vehicle Mode Name : "+ heroModeName);
System.out.println("honda vehicle owner Name : "+ heroOwnerName);
System.out.println("honda vehicle Registration number : "+ heroReistrationNumber);
System.out.println("honda vehicle speed: "+ heroSpeed);

	}

}
