package com.demo;

public class NumerologyNumber {
	public int digiNumber(int number) {
		int digit = 0;
		if (number > 0 && number < 10000000) {

			while (number > 0) {

				int rem = number % 10;
				digit = digit + rem;
				number = number / 10;

			}

		}
		return digit;
	}

	public static void main(String[] args) {
		int number = 5670;
		NumerologyNumber numerologyNumber = new NumerologyNumber();
		int numberInOneDigit = numerologyNumber.digiNumber(number);
		if (numberInOneDigit > 9) {
			numberInOneDigit = numerologyNumber.digiNumber(numberInOneDigit);
		}
		System.out.println(numberInOneDigit);
		numerologyNumber.evenOrOdd(number);
	}

	public void evenOrOdd(int number) {
		int i = 0;
		int j = 0;
		while (number > 0) {
			int rem = number % 10;
			 if (rem == 0) {}

			 else if (rem % 2 == 0) {
				i++;
			} else {
				j++;
			}

			number = number / 10;
		}
		System.out.println("the even number: " + i);
		System.out.println("the odd number: " + j);

	}
}
