package com.company;

public class Main {

    public static void main(String[] args)
    {
	    String s = "abcddcba";


        int forCount =0;
        System.out.println(s.length());
        for(int j=0; j<s.length(); j++)
        {
            char d = s.charAt(j);
            char e = s.charAt((s.length()-1)-j);
            System.out.println(d);
            System.out.println(e);


            if(e == d)
            {
                forCount++;
                System.out.println("count: "+forCount);
            }
            else{ forCount =0;}
            if(forCount == (s.length()/2))
            {
                System.out.println("Palindrome!!! with for loop");
                break;
            }


        }

    }
}
