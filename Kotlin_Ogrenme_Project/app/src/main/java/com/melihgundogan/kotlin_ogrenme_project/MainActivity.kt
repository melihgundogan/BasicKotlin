package com.melihgundogan.kotlin_ogrenme_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Merhaba Kotlin")
        println(5*10)

        //Değişkenler & Sabitler

        //Integer

        println("----------------Int--------------")

        var a= 5  //variable değişken demek
        var b= 10

        println(a * b)

        var kullanici_yas = 50
        println(kullanici_yas / 5 * 8)

        kullanici_yas = 60
        println(kullanici_yas / 5 * 8)

        val x = 5  // value yani sabit anlamına gelir asla değiştirilmez.Örneğin pi sayısı
        val y = 20

        println(x+y)

        // camelCase   yasSonucu
        // snake_case  yas_sonucu

        val yasSonucu = kullanici_yas * x
        println(yasSonucu)

        //Tanımlama (Defining)
        val benimIntegerim : Int

        //Başlatma,Değerini Atama(Initializing,Initialization)
        benimIntegerim = 5

        var yeniInteger : Int = 20

        println(benimIntegerim / 2)

        //Long

        println("----------------Long--------------")

        var benimLong : Long = 100
        benimLong = 3000000000
        println(benimLong)

        //Double & Float

        println("----------------Double & Float--------------")

        val pi = 3.14

        println(pi * 2)

        val floatPi : Float = 3.14f  //Sonuna f koyunca float olduğu belirtilmiş olur.
        println(floatPi * 2)

        val yeniDouble = 5.0
        println(yeniDouble / 2)


        //String - Metin

        println("----------------String--------------")

        val benimString = "Benim Yeni Metnim"
        println(benimString.length)

        val isim = "Melih"
        val soyisim = "GÜNDOĞAN"

        val tamisim = isim + " "+ soyisim
        println(tamisim)

        val yeniBirString : String
        yeniBirString = "10"

        val baskaBirString = "20"

        println(yeniBirString+baskaBirString)


        //Boolean

        println("----------------Boolean--------------")

        var benimBoolean = true
        benimBoolean = false

        // < => küçüktür
        // > => büyüktür
        // == => eşittir
        // != => eşit değildir
        // <= => küçük eşittir
        // >= => büyük eşittir
        // && => ve
        // || => veya

        println(3 < 5)
        println(4 != 4)

        //Veri Tipi Dönüştürme

        println("----------------Dönüştürme--------------")

        val benimInt = 10
        val BenimLongaCevirenInt = benimInt.toLong()
        println(BenimLongaCevirenInt)

        val kullaniciGirdisi = "50"
        val kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2)

        //Koleksiyonlar

        //Array - Dizi

        println("----------------Dizi--------------")

        val stringOrnegi = "Melih"

        val benimDizim = arrayOf(stringOrnegi,"GÜNDOĞAN","Ahmed","Feyza","İkbal")

        //index   0'dan başlarlar
        println(benimDizim[0])
        println(benimDizim.get(1))  //almak-set
        println(benimDizim.get(2))
        benimDizim[2] = "Emir"
        println(benimDizim.get(2))
        benimDizim.set(4,"Ayşe")    //değiştirmek-ayarlamak-set
        println(benimDizim[3])

        val numaraDizisi = doubleArrayOf(1.0,2.5,3.8)
        println(numaraDizisi.get(2))

        val karisikDizi = arrayOf("Melih",25,2.7,true,false)
        println(karisikDizi.get(3))

        //ArrayList - Listeler

        println("----------------ArrayList--------------")

        val isimListesi = arrayListOf<String>("Melih","Ahmed","Feyza","İkbal")

        println(isimListesi[0])
        println(isimListesi.get(0))

        isimListesi.add("Kürşat")
        isimListesi.add("Yasemin")
        println(isimListesi.get(4))

        val karisikArrayList = arrayListOf<Any>()       //Herhangi bir - any  yani her sınıftan işlem yapabiliriz
        karisikArrayList.add("Melih")
        karisikArrayList.add(8)
        karisikArrayList.add(true)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))

        //Set

        println("----------------Set--------------")

        val ornekDizi = arrayOf(7,8,9,9,8,9,9,10)
        println("index 2: ${ornekDizi[2]}")  //Kod gibi yazdırmak için başına dolar işareti bırakılmaktadır

        println(ornekDizi.size)

        val benimSet = setOf<Int>(7,8,9,9,9,8,10)   // her eleman 1 kere sayılacak
        println(benimSet.size)

        //For Each  Her biri için
        //forEach içine yazılanlar sadece orayı bağlar diğer kısımlara etkisi olmaz
        benimSet.forEach {
            println(it)
        }

        val digerSet = HashSet<String>()
        digerSet.add("Melih")
        digerSet.add("Melih")
        digerSet.add("Melih")
        digerSet.add("Gündoğan")

        digerSet.forEach {
            println(it)
        }

        //Map

        println("----------------Map--------------")

        //Anahtar Kelime - Değer ( Key-Value Pairing)

        val yemekDizisi = arrayOf("Elma","Et","Tavuk")
        val kaloriDizisi = arrayOf(100,400,300)

        println("${yemekDizisi[0]}'nın kalorisi: ${kaloriDizisi[0]}")

        val yemekKaloriMap = hashMapOf<String,Int>()
        yemekKaloriMap.put("Elma",100) //add yerine put kullanılır ve key value olarak 2 değer girişi yapılır
        yemekKaloriMap.put("Et",400)
        yemekKaloriMap.put("Tavuk",200)

        println(yemekKaloriMap.get("Et"))

        val benimMapim = HashMap<String,String>()
        benimMapim.put("Örnek","Değer")

        val yeniMap = hashMapOf<String,Int>("Atıl" to 40, "Örnek" to 50)  // to ile string yerine ne yazılamdı gerektiğini belirtiriz
        println(yeniMap.get("Örnek"))

        //Matematiksel İşlemler

        println("----------------Matematiksel İşlemler--------------")

        var sayi = 9
        println(sayi)
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        var digerSayi = 21
        println(digerSayi > sayi)

        // && => VE
        // || => VEYA

        println(digerSayi > sayi && 2 > 3)
        println(digerSayi > sayi || 2 > 3)

        println(8+7)
        println(10-7)
        println(20*2)
        println(32/3)

        //Remainder - Kalanı Bulmak

        println(10%3)

        //If Kontrolleri

        println("----------------If Statements (Eğer Kontrolleri)--------------")

        val skor = 10

        if (skor < 10) {
            println("Oyunu kaybettin!")
        } else if (skor >= 10 && skor < 20) {
            println("Skorun 10 ve 20 arasında tebrikler")
        } else if (skor >= 20 && skor < 30) {
            println("Skorun 20 ve 30 arasında mükemmelsin")
        } else {
            println("Skorun 30 un üzerinde efsanesin")
        }

        //When - Switch
        //Eğer çok fazla if else oluşursa bunu kullanabiliriz
        println("----------------When--------------")

        var notRakami = 3
        var notStringi = ""

        when(notRakami) {
            0 -> notStringi = "Geçersiz Not"
            1 -> notStringi = "Zayıf"
            2 -> notStringi = "Kötü"
            3 -> notStringi = "Orta"
            4 -> notStringi = "İyi"
            else -> notStringi = "Pek İyi"
        }

        println(notStringi)

        /*
        if (notRakami == 0) {
            notStringi = "Geçersiz Not"
        } else if (notRakami == 1) {
            notStringi = "Zayıf"
        } else if (notRakami == 2) {
            notStringi = "Kötü"
        } else if (notRakami == 3) {
            notStringi = "Orta"
        } else if (notRakami == 4) {
            notStringi = "İyi"
        } else {
            notStringi = "Pek İyi"
        }
        */

        //Döngüler
        println("----------------For Döngüsü--------------")

        val baskaBirDizi = arrayOf(5,10,15,20,25,30)

        val q = baskaBirDizi[0] / 5 + 3
        println(q)

        println("döngü başladı")
        for (num in baskaBirDizi) {
            println(num / 5 + 3)
        }
        println("döngü bitti")

        //indices indexleri bize verir
        for (indeks in baskaBirDizi.indices) {
            println(indeks)
            println(baskaBirDizi[indeks] / 5 + 3)
        }

        // 0..9 range ile aynı ifadedir 0 ile 9 alır
        for (b in 0..9) {
            println(b)
        }

        val benimDigerStringDizim = ArrayList<String>()
        benimDigerStringDizim.add("Melih")
        benimDigerStringDizim.add("GÜNDOĞAN")
        for (str in benimDigerStringDizim) {
            println(str)
        }

        benimDigerStringDizim.forEach {
            println(it)
        }

        //While  Olduğu zaman-olurken-koşul devam ederken çalıştır
        println("----------------While Döngüsü--------------")

        var j = 0

        while (j < 10) {
            println(j)
            j = j + 1
        }
    }
}