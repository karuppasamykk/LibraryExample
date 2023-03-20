package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class MyClass {

    public static void sampleToast(Context context ,String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
