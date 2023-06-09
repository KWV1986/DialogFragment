package com.hsbc.com.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.hsbc.com.dialogfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding : ActivityMainBinding
     private val TAG = "Main Activity"
     var count = 0
     var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        mainBinding.btnok.setOnClickListener {
            openDialogFragment()
        }
        Log.i(TAG,"Added a log in test branch")


    }

    private fun openDialogFragment() {

        val fragmentManager : FragmentManager = supportFragmentManager
        val dialogFragment = DialogFragment()
        dialogFragment.isCancelable = false
        dialogFragment.show(fragmentManager,"MyDialogFragment")


    }

    fun sendData(name: String, age: String) {
        val name = mainBinding.txtName.text.toString().plus(name)
        mainBinding.txtName.text = name
        mainBinding.txtAge.text = age
    }
}