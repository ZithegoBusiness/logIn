package com.main.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login()
    }

    public fun login()
    {
        btn.setOnClickListener()
        {

            var user = et_User.text.toString()
            var pass = et_Pass.text.toString()

            if( (user=="Jonathan" && pass=="Rubio")  )
            {
                var intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Error Usuario o Contraseña incorrectos", Toast.LENGTH_LONG).show()
            }


        }
    }
}