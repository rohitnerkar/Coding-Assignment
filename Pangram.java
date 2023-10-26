package com;

public class Pangram {
	
	public static boolean isPangram(String input)
	{
        input = input.toLowerCase();

        for (char c='a'; c<='z'; c++)
        {
            if (input.indexOf(c) == -1)
            {
                return false;
            }
        }
        return true;
    }
	
    public static void main(String[] args) {
    	
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        System.out.println(isPangram);
    }
}