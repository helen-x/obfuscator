package com.helen.obfuscatordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestAnnotationKeepSetterGetter getter = new TestAnnotationKeepSetterGetter();
        TestAnnotationKeepPublic keepPublic = new TestAnnotationKeepPublic();
        TestAnnotationKeepSetterGetter setterGetter = new TestAnnotationKeepSetterGetter();
        TestAnnotationKeepThisField keepThisField = new TestAnnotationKeepThisField();
        TestInterfaceKeep interfaceKeep = new TestInterfaceKeep();
    }
}
