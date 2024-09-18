package com.example.mad_practical_2_22012011101

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate called")
        showMessage("on create method is called")
//        showSnackbar("onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart called")
        showMessage("onStart method is called")
//        showSnackbar("onStart called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop called")
        showMessage("on stop method is called")
//        showSnackbar("onStop called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume called")
        showMessage("onResume method is called using toast")
//        showSnackbar("onResume called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy called")
        showMessage("on destroy method is called")
//        showSnackbar("onDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart called")
        showMessage("on restart method is called")
//        showSnackbar("onRestart called")
    }

    override fun onPause(){
        super.onPause()
        Log.d(TAG, "onPause called")
        showMessage("onPause method is called")
//        showSnackbar("onPause called")
    }

    fun showMessage(msg:String){
        Log.i(TAG, msg)
    Toast.makeText(this, msg , Toast.LENGTH_SHORT).show()
    }
//     private fun showSnackbar(message: String) {
//         Snackbar.make(findViewById(R.id.main), message, Snackbar.LENGTH_SHORT).show()
//     }

    }

