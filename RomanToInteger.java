package com;

public class RomanToInteger {
	
	public static int romanToInteger(String s)
	{
        int result = 0;
        int prevValue = 0;

        for (int i=s.length()-1; i>=0; i--)
        {
            char c = s.charAt(i);
            int value;
            switch (c) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Roman numeral character");
            }

            if (value < prevValue)
            {
                result -= value;
            } 
            else
            {
                result += value;
            }

            prevValue = value;
        }
        return result;
    }
	
    public static void main(String[] args) {
        
    	String romanNumeral = "IV";
        int result = romanToInteger(romanNumeral);
        System.out.println(result);
    }
}