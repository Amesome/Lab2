package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        var intent = intent
        val question = intent.getStringExtra("Question")
        val answerEt = findViewById<EditText>(R.id.answerEt)
        val okBtn2 = findViewById<Button>(R.id.okBtn2)

        val questionTv = findViewById<TextView>(R.id.questionTv)
        questionTv.text = question

        okBtn2.setOnClickListener {
            var answer = answerEt.text.toString()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Answer", answer)
            intent.putExtra("Question", question)
            startActivity(intent)
        }
    }
}