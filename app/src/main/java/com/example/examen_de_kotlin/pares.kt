package com.example.examen_de_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fibonaci.*
import kotlinx.android.synthetic.main.activity_fibonaci.btn_atras_par
import kotlinx.android.synthetic.main.activity_pares.*

class pares : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pares)
        click_atras()
        pares_click()
    }
    fun pares_click(){
        gen_par.setOnClickListener()  {
            if (validarNumeros()){
                val nn:Int=(input_par.text.toString()).toInt()
                if (nn>0){
                    var t1 = 2
                    //var t2 = 1
                    var serie=""
                    var separador = ","
                    var count = 0
                    for (binario in 1..nn) {
                        if (binario%2==0){
                            for (num in 1..t1)
                            {
                                if (count>=nn+1)
                                    break
                                serie = serie+t1+separador
                                count++

                            }
                        }else{

                            for (num in 1..t1)
                            {
                                if (count>=nn+1)
                                    break
                                serie = serie+t1+separador
                                count++

                            }
                        }
                        t1=t1+2
                    }
                    txt_area_par.setText(serie)
                    input_par.setText("")
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
        if (input_par.text.toString().length == 0){
            valorRetorno = false
        }
        return valorRetorno
    }
    fun click_atras(){
        btn_atras_par.setOnClickListener(){
            //Toast.makeText(applicationContext,"hola fibonaci",Toast.LENGTH_SHORT).show()
            val ventanaPrincipal: Intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(ventanaPrincipal)
            finish()
        }

    }
}