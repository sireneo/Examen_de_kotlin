package com.example.examen_de_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_binario.*
import kotlinx.android.synthetic.main.activity_fibonaci.*

class binario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_binario)
        binario_click()
        click_atras()
    }
    fun binario_click(){
        gen__binario.setOnClickListener()  {
            if (validarNumeros()){
                val nn:Int=(input_numero_binario.text.toString()).toInt()
                if (nn>0){
                    var t1 = 0
                    var t2 = 1
                    var serie=""
                    var separador = ","
                    var count = 1
                    //while (count <= nn) {
                    for (binario in 1..nn) {
                        if (binario%2==0){
                            for (num in 1..binario)
                            {
                                if (count>=nn+1)
                                    break
                                serie = serie+t2+separador
                                count++

                            }
                        }else{

                            for (num in 1..binario)
                            {
                                if (count>=nn+1)
                                    break
                                serie = serie+t1+separador
                                count++

                            }
                        }
                        }
                    txt_area_binario.setText(serie)
                    input_numero_binario.setText("")
                }else{
                    Toast.makeText(applicationContext,"Ingrese un Numero Mayor a Cero", Toast.LENGTH_SHORT).show()

                }
            }else{
                Toast.makeText(applicationContext,"Ingrese un Numero ", Toast.LENGTH_SHORT).show()
            }



        }

    }

    fun validarNumeros():Boolean{
        var valorRetorno: Boolean = true
        if (input_numero_binario.text.toString().length == 0){
            valorRetorno = false
        }
        return valorRetorno
    }
    fun click_atras(){
        btn_atras_binario.setOnClickListener(){
            //Toast.makeText(applicationContext,"hola fibonaci",Toast.LENGTH_SHORT).show()
            val ventanaPrincipal: Intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(ventanaPrincipal)
            finish()
        }

    }
}