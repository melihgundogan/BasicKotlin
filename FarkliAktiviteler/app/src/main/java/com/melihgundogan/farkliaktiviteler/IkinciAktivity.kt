package com.melihgundogan.farkliaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ikinci_aktivity.*

class IkinciAktivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_aktivity)

        val intent = intent
        val alinanVeri = intent.getStringExtra("YollananVeri")
        textView2.text = alinanVeri
    }

    fun geriDon(view: View){
        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()

    }
}