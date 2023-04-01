package com.example.repaso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var edad: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val calcular = findViewById<Button>(R.id.btncalcular)
        val ir = findViewById<Button>(R.id.btnir)

        calcular.setOnClickListener{

            calcularEdad()

        }
        ir.setOnClickListener{
            cambiar()
        }

    }

    fun calcularEdad(){


        val edad = findViewById<EditText>(R.id.edt2)
        val nom = findViewById<EditText>(R.id.edt1)
        var x = Integer.parseInt(edad.text.toString())


        if (x.equals("")){
            Toast.makeText(this,"Ingrese año de nacimiento",Toast.LENGTH_LONG).show()

        }else {
            var cal = 2023 - x;
            this.edad = cal // Asigna el valor de cal a la variable global edad

            //nom.setText("${cal}")
            Toast.makeText(this, "Su edad es: ${cal}", Toast.LENGTH_LONG).show()
        }
    }

    fun cambiar(){
        val nom= findViewById<EditText>(R.id.edt1)

        //CAMBIAR DE ACTIVITY SE UTILIZAN LOS INTENT

        val intent = Intent(this,MainActivity2::class.java).apply {
            putExtra("mensaje","Nombre: "+nom.text.toString())
            putExtra("edades","Edad: ")
            putExtra("edad",edad)

        }
        startActivity(intent)
    }

}