package com.nada.studioapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var ctx: Context? = null

    //    /** Duration of wait **/
    //    private final int SPLASH_DISPLAY_LENGTH = 1000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ctx = this
        setContentView(R.layout.activity_main)
        val myThread: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(3000)
                    val intent = Intent(applicationContext, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }
        myThread.start()
    }

}