package com.sap.stepbystep

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    private var numberOfPresses: Int? = 0
    private val myTag = "myDebuggingTag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(myTag, "onCreate")
        setContentView(R.layout.activity_main)
    }

    fun onLogALine(view: View) {
        Log.d(myTag, "In onLogALine")
        numberOfPresses = numberOfPresses!! + 1
        Log.d(myTag, "Button pressed $numberOfPresses times")
    }

    fun onRegister(view: View) {
        Log.d(myTag, "In onRegister")
    }

    fun onUploadLog(view: View) {
        Log.d(myTag, "In onUploadLog")
    }

    fun onOnlineOData(view: View) {
        Log.d(myTag, "In onOnlineOData")
    }

    fun onOfflineOData(view: View) {
        Log.d(myTag, "In onOfflineOData")
    }
}