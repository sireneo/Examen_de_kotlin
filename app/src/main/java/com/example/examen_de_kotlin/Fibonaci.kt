package com.example.examen_de_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fibonaci.*
import kotlinx.android.synthetic.main.activity_fibonaci.gen_fibonaci
import kotlinx.android.synthetic.main.activity_main.*

class Fibonaci : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fibonaci)
        fibonaci_click()
        click_atras()
    }
    fun fibonaci_click(){
        gen_fibonaci.setOnClickListener()  {
                if (validarNumeros()){
                    val nn:Int=(input_numero.text.toString()).toInt()
                    if (nn>0){
                        var t1 = 0
                        var t2 = 1
                        var serie=""
                        var separador = ","
                        var count = 0
                        while (count <= nn-1) {
                            serie =serie+t1+separador
                            val sum = t1 + t2
                            t1 = t2
                            t2 = sum
                            count = count + 1
                        }
                        txt_area_fibonaci.setText(serie)
                        input_numero.setText("")
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
        if (input_numero.text.toString().length == 0){
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