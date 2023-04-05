package com.example.simple_calculator_lora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txt_Answer_Display:TextView
    private lateinit var edt_First:EditText
    private lateinit var edt_Second:EditText
    private lateinit var Button_Add:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //instantiate your variables

        txt_Answer_Display = findViewById(R.id.txtAnswer)
        edt_First = findViewById(R.id.edtFirstNo)
        edt_Second = findViewById(R.id.edtSecondNo)
        Button_Add = findViewById(R.id.btnAdd)

        Button_Add.setOnClickListener {
            var first_num = edt_First.text.toString().trim()
            var second_num = edt_Second.text.toString().trim()

            //Validation of edit_text

            if (first_num.isEmpty() || second_num.isEmpty()) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            }
            else{
                //means has some data
                var result = first_num.toDouble() + second_num.toDouble()
                txt_Answer_Display.text = result.toString()


            }
        }
    }
}