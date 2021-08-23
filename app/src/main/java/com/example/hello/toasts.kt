package com.example.hello

import android.app.Activity
import android.widget.Toast

fun Activity.ToastMessage(str:String){
    Toast.makeText(this,str, Toast.LENGTH_LONG).show()
}