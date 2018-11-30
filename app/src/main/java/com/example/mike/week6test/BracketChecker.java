package com.example.mike.week6test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class BracketChecker {

    public static void main(String[] args) {
        String s = "({})[]";
        System.out.println(check(s));
        s = "[]{]}[";
        System.out.println(check(s));
        s = "[]{}[]{}[]{}()()[({})]";
        System.out.println(check(s));
    }

    public static Boolean check ( String s ){
        while( s.contains("{}") || s.contains("[]") || s.contains("()") ){
            s = s.replaceAll("\\[]", "");
            s = s.replaceAll("\\{}", "");
            s = s.replaceAll("\\(\\)", "");
        }
        if( s.length() > 0 ){
            return false;
        }else{
            return true;
        }
    }


}
