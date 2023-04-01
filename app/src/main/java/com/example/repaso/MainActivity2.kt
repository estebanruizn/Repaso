package com.example.repaso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val regresar = findViewById<Button>(R.id.btnregresar)
        val bundle = intent.extras
        val nombre = findViewById<TextView>(R.id.nombre)
        val ac = findViewById<TextView>(R.id.textView4)
        val nom = bundle?.getString("mensaje")
        val eda = bundle?.getInt("edad")

        Toast.makeText(this,"Su nombre es: ${nom} y tiene ${eda} años", Toast.LENGTH_LONG).show()

        nombre.text=nom
        ac.text=eda.toString()

        regresar.setOnClickListener{
            cambiar()
        }



    }

    fun cambiar(){
        val nom= findViewById<EditText>(R.id.edt1)

        //CAMBIAR DE ACTIVITY SE UTILIZAN LOS INTENT

        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

}