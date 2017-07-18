package com.helen.obfuscatordemo;


import com.helen.obfuscator.ObfuscateKeepAll;

@ObfuscateKeepAll
public class TestAnnotationKeepAll {

    public String name;
    public static String sName;
    private int value;
    private static int sValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getsName() {
        return sName;
    }

    public static void setsName(String sName) {
        TestAnnotationKeepAll.sName = sName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static int getsValue() {
        return sValue;
    }

    public static void setsValue(int sValue) {
        TestAnnotationKeepAll.sValue = sValue;
    }
}
