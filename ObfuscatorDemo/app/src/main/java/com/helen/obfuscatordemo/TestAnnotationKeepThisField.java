package com.helen.obfuscatordemo;


import com.helen.obfuscator.ObfuscateKeepThisField;

public class TestAnnotationKeepThisField {
    
    public String sName;
    public static String sSName;
    private int iValue;
    @ObfuscateKeepThisField
    private static int iSValue;
    @ObfuscateKeepThisField
    private void tFunc(){
    }

    public boolean isbValue() {
        return bValue;
    }

    public void setbValue(boolean bValue) {
        this.bValue = bValue;
    }

    protected  boolean bValue;

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public static String getsSName() {
        return sSName;
    }

    public static void setsSName(String sSName) {
        TestAnnotationKeepThisField.sSName = sSName;
    }

    public int getiValue() {
        return iValue;
    }

    public void setiValue(int iValue) {
        this.iValue = iValue;
    }

    public static int getiSValue() {
        return iSValue;
    }

    public static void setiSValue(int iSValue) {
        TestAnnotationKeepThisField.iSValue = iSValue;
    }
}
