package com.hsbc.com.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Toast.makeText(this@FirstActivity,"Hello World",Toast.LENGTH_LONG).show()
    }
}