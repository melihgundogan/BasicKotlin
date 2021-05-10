package com.melihgundogan.contextproject

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

@Suppress("UNUSED_ANONYMOUS_PARAMETER")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toast , Alert

        //applicationContext -> app context
        //this , this@MainActivity -> aktivitenin context


        Toast.makeText(this,"Hoşgeldin!",Toast.LENGTH_LONG).show()

    }

    fun mesajGoster(view: View){

        val uyariMesaji = AlertDialog.Builder(this)
        uyariMesaji.setTitle("Şifre Hatası")
        uyariMesaji.setMessage("Şifreyi girmediniz,baştan denemek ister misiniz?")
        uyariMesaji.setPositiveButton("Evet",DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(this,"Baştan deniyorsunuz",Toast.LENGTH_LONG).show()
        })

        uyariMesaji.setNegativeButton("Hayır") {dialogInterface, i ->
            Toast.makeText(this,"Hayırı seçtiniz,denemiyorsunuz",Toast.LENGTH_LONG).show()
        }

        uyariMesaji.show()


    }
}