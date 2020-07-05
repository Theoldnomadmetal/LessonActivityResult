package com.example.lessonactivityresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val chboxfilm1 = findViewById<CheckBox>(R.id.chbox1)
        val chboxfilm2 = findViewById<CheckBox>(R.id.chbox2)
        val chboxfilm3 = findViewById<CheckBox>(R.id.chbox3)
        val gobutton = findViewById<Button>(R.id.button2)



        gobutton.setOnClickListener {
            val intent2 = Intent()
            val chboxPulp = chboxfilm1.isChecked
            val chboxSnatch = chboxfilm2.isChecked
            val chboxJackie = chboxfilm3.isChecked
            intent2.putExtra("pulpfiction", chboxPulp)
            intent2.putExtra("snatch", chboxSnatch )
            intent2.putExtra("jackiebr", chboxJackie)




            setResult(Activity.RESULT_OK, intent2)
            finish()
        }


    }
}