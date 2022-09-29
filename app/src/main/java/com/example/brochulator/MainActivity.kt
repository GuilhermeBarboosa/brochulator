package com.example.brochulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var txtOperacaoInserida: TextView
    private lateinit var txtOperacaoRealizada: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.txtOperacaoInserida = findViewById(R.id.txtResult)
        this.txtOperacaoRealizada = findViewById(R.id.txtExpressao)

    }


    fun setNumber(view: View) {

        when (view.id) {
            R.id.numberOne ->
                txtOperacaoInserida.text = txtOperacaoInserida.text.toString() + "1";
            R.id.numberTwo ->
                txtOperacaoInserida.text = txtOperacaoInserida.text.toString() + "2";
            R.id.numberThree ->
                txtOperacaoInserida.text = txtOperacaoInserida.text.toString() + "3";
            R.id.numberFour ->
                txtOperacaoInserida.text = txtOperacaoInserida.text.toString() + "4";
            R.id.numberFive ->
                txtOperacaoInserida.text = txtOperacaoInserida.text.toString() + "5";
            R.id.numberSix ->
                txtOperacaoInserida.text = txtOperacaoInserida.text.toString() + "6";
            R.id.numberSeven ->
                txtOperacaoInserida.text = txtOperacaoInserida.text.toString() + "7";
            R.id.numberEight ->
                txtOperacaoInserida.text = txtOperacaoInserida.text.toString() + "8";
            R.id.numberNine ->
                txtOperacaoInserida.text = txtOperacaoInserida.text.toString() + "9";
            R.id.numberZero ->
                txtOperacaoInserida.text = txtOperacaoInserida.text.toString() + "0";
        }
    }

    fun setOperator(view: View) {
        try{

            when (view.id) {
                R.id.btnLimpar -> {

                }
                R.id.equal -> {

                }
                R.id.dot ->{


                }
                R.id.delete ->{

                }
                R.id.numberPlus -> {

                }
                R.id.numberMinus -> {

                }
                R.id.numberMutiplication -> {

                }
                R.id.btnDivisao ->{

                }
            }
        }catch (e: Exception){
            Log.d("EXCEPTION", e.toString());
        }

    }
}