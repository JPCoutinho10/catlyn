package com.example.segundoprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortear(view: View){
        val textoResultado = findViewById<TextView>(R.id.text_resultado) //Encontre um intem de interface pelo ID
        val numero = Random().nextInt(1000)
        textoResultado.setText("número gerado $numero")
    }





 }