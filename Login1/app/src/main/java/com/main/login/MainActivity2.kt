package com.main.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        reDo()
    }

    public fun reDo()
    {

        button.setOnClickListener()
        {
            var intent = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(intent)
        }

    }


}