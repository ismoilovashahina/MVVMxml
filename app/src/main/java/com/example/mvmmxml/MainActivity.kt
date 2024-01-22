package com.example.mvmmxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vm = ViewModelProvider(this)[MainViewModel::class.java]

        val text = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)

        text.text = "${vm.count}"

        button.setOnClickListener {
            vm.count++
            text.text = "${vm.count}"
        }
    }
}