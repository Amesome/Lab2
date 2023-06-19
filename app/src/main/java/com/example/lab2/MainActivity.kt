package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val questionEt = findViewById<EditText>(R.id.questionEt)
        val okBtn = findViewById<Button>(R.id.okBtn)

        okBtn.setOnClickListener {
            val question = questionEt.text.toString()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("Question",question)
            startActivityForResult(intent,1)
       }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(data != null && requestCode == 1 && resultCode == RESULT_OK) {
            val qaTv = findViewById<TextView>(R.id.qaTv)
            qaTv.text = ("Ответ: "+data.getStringExtra("Answer"))
        }
    }
}
