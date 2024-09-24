package com.tech.controller;

public class Test {
    public static void main(String[] args) {
        String s="india";
        String temp="";

        for(int i=s.length()-1;i>=0;i--)
        {
            temp+=s.charAt(i);
        }
        System.out.println(temp);
    }

}
