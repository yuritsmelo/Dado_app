package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

//    lateinit var resultado : ImageView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        val botao : Button = findViewById(R.id.main_button_lancar)
//        botao.text = "Jogar"
//        val texto = findViewById<TextView>(R.id.main_textview_texto)
//        texto.text = ""
        binding.mainButtonLancar.text = "Jogar"
        binding.mainTextviewTexto
        binding.mainButtonLancar.setOnClickListener {
            jogar()
        }

//        botao.setOnClickListener{
////            Toast.makeText(this, "Clicou", Toast.LENGTH_SHORT).show()
//            jogar()
//        }
//        resultado = findViewById(R.id.main_image_dado)
    }

    private fun jogar(){
        val numero = Random.nextInt(6)+1

        val resultadoText: TextView = findViewById(R.id.main_textview_texto)
        resultadoText.text = numero.toString()

        val resultado = findViewById<ImageView>(R.id.main_image_dado)
        val drawableResource = when (numero){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
//        resultado.setImageResource(drawableResource)
        binding.mainImageDado.setImageResource(drawableResource)
    }
}