package com.example.examen_de_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click_btn_fibonaci()
        click_btn_pares()
        click_btn_binario()
    }
    fun click_btn_fibonaci(){
        gen_fibonaci.setOnClickListener(){
            val ventanaFibonaci: Intent = Intent(applicationContext,Fibonaci::class.java)
            startActivity(ventanaFibonaci)

        }
    }
    fun click_btn_pares(){
        btn_pares.setOnClickListener(){
            val venatanaPares: Intent = Intent(applicationContext,pares::class.java)
            startActivity(venatanaPares)

        }
    }
    fun click_btn_binario(){
        btn_binario.setOnClickListener(){

            val venatanaBinario: Intent = Intent(applicationContext,binario::class.java)
            startActivity(venatanaBinario)

        }
    }
}