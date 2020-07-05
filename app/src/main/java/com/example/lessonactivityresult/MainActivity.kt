package com.example.lessonactivityresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var textpulpfiction: TextView? = null
    var textsnatch: TextView? = null
    var textJackiebrown: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext =findViewById<Button>(R.id.button1)
        textpulpfiction = findViewById(R.id.kino1)
        textsnatch = findViewById(R.id.kino2)
        textJackiebrown = findViewById(R.id.kino3)


        btnNext.setOnClickListener {
            val intent = Intent (this, SecondActivity ::class.java)

            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 1 && resultCode == Activity.RESULT_OK){
            val resultfilm1 = data?.getBooleanExtra("pulpfiction",false)?:false
            if(resultfilm1){
                textpulpfiction?.text = "Pulp fiction"
            }
            else textpulpfiction?.text = "Не выбрано"
            val resultfilm2 = data?.getBooleanExtra("snatch", false)?:false
            if(resultfilm2){
                textsnatch?.text = "Snatch"
            }else textsnatch?.text = "Не выбрано"
            val resultfilm3 = data?.getBooleanExtra("jackiebr", false)?:false
            if(resultfilm3){
                textJackiebrown?.text = "Jackie Brown"
            }else textJackiebrown?.text = "Не выбрано"



        }
    }
}