package main;

import java.util.*;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		int i = 0;
		int counter = 0;
		int inputLen = input.length();
		boolean cond = counter <= inputLen;
		ArrayList<String> answerList = new ArrayList<String>();
		for (i = 0; i <= input.length(); i++) {
			if (i < input.length()) {
				String forOutput = input.substring(i, i++);
				String answer = forOutput + forOutput + forOutput;
				answerList.add(answer);
				break;
			} else {
				String forOutput = input.substring(i);
				String answer = forOutput + forOutput + forOutput;
				answerList.add(answer);
				break;
			}
		}

		String fAnswer = "";

		while (cond) {
			String output = answerList.get(counter);
			String outputCalc = fAnswer + output;
			counter++;
		}
		return fAnswer;

	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		int len = input.length();
		int counter = 0;
		if (len >= 8) {
			for (int i = 0; i < len; i++) {
				String output = input.substring(i, i + 4);
				if (output.equals("bert") || output.equals("Bert")) {
					counter++;
					if (counter == 2) {
						String finOutput = 

					}

				} else
					return "";
			}

		} else
			return "";
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		if (a > b && a < c) {
			int firstSecond = a - b;
			int secondThird = c - a;
			if (firstSecond == secondThird) {
				return true;
			} else {
				return false;
			}
		} else if (a < b && b < c) {
			int firstSecond = b - a;
			int secondThird = c - b;
			if (firstSecond == secondThird) {
				return true;
			} else {
				return false;
			}
		} else if (a > b && b > c) {
			int firstSecond = a - b;
			int secondThird = b - c;
			if (firstSecond == secondThird) {
				return true;
			} else {
				return false;
			}

		} else if (a > c && c > b) {
			int firstSecond = a - c;
			int secondThird = c - b;
			if (firstSecond == secondThird) {
				return true;
			} else {
				return false;
			}
		} else if (b > c && c > a) {
			int firstSecond = c - a;
			int secondThird = b - c;
			if (firstSecond == secondThird) {
				return true;
			} else {
				return false;
			}
		} else if (b > a && a > c) {
			int firstSecond = b - a;
			int secondThird = a - c;
			if (firstSecond == secondThird) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		int len = (input.length() / 2) - 1;
		int end = len + a;

		String firstHalf = input.substring(0, len);
		String secHalf = input.substring(end, input.length());
		String answer = firstHalf + secHalf;
		return answer;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("jh") → false
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		int len = input.length() - 3;
		String inputOne = input.toLowerCase();
		if (len <= 0) {
			return false;
		} else if (inputOne.equals("dev")) {
			return true;
		} else if (inputOne.substring(len).equals("dev")) {
			return true;
		} else
			return false;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		int counter = 0;

		for (int i = 0; (i - 2) < input.length(); i++) {
			int t = i + 2;
			if (t >= input.length()) {
				break;
			}
			if (input.substring(i, ++i).equals(input.substring(++i, i + 2))) {
				counter = counter + 1;
				return counter;
			} else if (i + 2 > input.length()) {
				return counter;
			}
		}
		return counter;

	}
	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		int counter = 0;
		for (int i = 0; (i - 4) < arg1.length(); i++) {
			if (i - 3 <= arg1.length()) {
				if (arg1.substring(i, i + 3).equals("Am ") || arg1.substring(i, i + 3).equals("am "))
					if (i == 0) {
						counter++;
						return counter;
					} else if (arg1.substring(i - 1, i + 3).equals(" Am ")
							|| arg1.substring(i - 1, i + 3).equals(" am ")) {
						counter++;
						return counter;
					}
			} else if (i - 3 == arg1.length()) {
				break;
			}
		}
		return counter;
	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5 return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {

		int remainThree = arg1 % 3;
		int remainFive = arg1 % 5;
		if (remainThree == 0 && remainFive == 0) {
			return "fizzbuzz";
		} else if (remainThree == 0) {
			return "fizz";
		} else if (remainFive == 0) {
			return "buzz";
		} else {
			return "error";
		}

	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {
		for (int i = 0; (i - 3) < arg1.length(); i++) {
			if (arg1.substring(i + 2, i + 3).equals(" ")) {
				String input = arg1.substring(i, i + 2);
				String[] sInput = input.split("");

			}
		}
		return 0;

	}

}
