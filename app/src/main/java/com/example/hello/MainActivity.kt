package com.example.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    var text=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editText1: EditText
        editText1= findViewById(R.id.editText_firstNum)
        var editText2: EditText
        editText2= findViewById(R.id.editText_secondNum)
        var button: Button
        button = findViewById(R.id.button_equal)
        button.setOnClickListener {
            if(editText1.text.toString().isEmpty()&&editText2.text.toString().isEmpty())
                ToastMessage("No Numbers Please enter number 1 and number 2")
            else if(editText1.text.toString().isEmpty())
                ToastMessage("First number is empty Please enter number 1")
            else if(editText2.text.toString().isEmpty())
                ToastMessage("Second number Please enter number 2")
            else if(editText1.text.toString().isNotEmpty()&&editText2.text.toString().isNotEmpty()) {
                text = "The sum = ${editText1.text.toString().toDouble() + editText2.text.toString().toDouble()}"
                ToastMessage(text)
            }
        }


    }

}