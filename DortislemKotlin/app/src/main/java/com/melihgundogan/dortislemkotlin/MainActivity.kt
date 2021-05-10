package com.melihgundogan.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var sayi1 : Int? = null
    var sayi2 : Int? = null
    var sonuc : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla(view: View){

        sayi1 = editText.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()

        if (sayi1 == null || sayi2 == null){
            textView.text = "Sayı Girmeyi Unutmayınız"
        }else {
            sonuc = sayi1!! + sayi2!!
            textView.text = "Sonuç: ${sonuc}"
        }

    }

    fun cıkar(view: View){

        sayi1 = editText.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()

        if (sayi1 == null || sayi2 == null){
            textView.text = "Sayı Girmeyi Unutmayınız"
        }else {
            var sonuc = sayi1!! - sayi2!!
            textView.text = "Sonuç: ${sonuc}"
        }

    }

    fun carp(view: View){

        sayi1 = editText.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()

        if (sayi1 == null || sayi2 == null){
            textView.text = "Sayı Girmeyi Unutmayınız"
        }else {
            var sonuc = sayi1!! * sayi2!!
            textView.text = "Sonuç: ${sonuc}"
        }

    }

    fun bol(view: View){

        sayi1 = editText.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()

        if (sayi1 == null || sayi2 == null){
            textView.text = "Sayı Girmeyi Unutmayınız"
        }else {
            var sonuc = sayi1!! / sayi2!!
            textView.text = "Sonuç: ${sonuc}"
        }

    }
}