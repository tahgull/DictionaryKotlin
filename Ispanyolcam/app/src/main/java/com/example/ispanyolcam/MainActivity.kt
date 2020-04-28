package com.example.ispanyolcam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import android.widget.Toast
import android.widget.AdapterView
import android.text.Editable
import android.text.TextWatcher
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.mancj.materialsearchbar.MaterialSearchBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv = findViewById(R.id.mListView) as ListView
        val searchBar = findViewById(R.id.searchBar) as MaterialSearchBar
        searchBar.setHint("Ara..")
        searchBar.setSpeechMode(true)
        var kelimeler = arrayOf("Uno: Bir",
            "Dos: İki","Tres: Üç","Cuatro:  Dört","Cinco:  Beş","Seis: Altı","Siete: Yedi","Ocho: Sekiz",
            "Nueve: Dokuz","Diez:  On","Once:  Onbir","Amarillo:   Sarı", "Negro: Siyah","Blanco: Beyaz","Azul: Mavi","Rojo: Kırmızı","Verde: Yeşil","Gris: Gri",
            "Abajo: Aşağı (Down,Below)","Abandonar: ayrılmak (abandon,leave)","abrir: açmak (to open, unlock)",
            "absoluto: tam,bütün,tümüyle (absolute, absolutely)","Hola: Merhaba","acuerdo: Anlaşma, Uyum, mutakabat (agreement)",
            "Qué tal?: (Nasılsın?)","abuelo: büyükbaba, dede (gandfather, grandpa)", "acabar: bitirmek (to finish)", "acaso: belki, ihtimal (perhaps, maybe)",
            "Qué pasa?: (Naber?)","acción: aksiyon (action", "aceptar: almak, kabul etmek (to accept, receive, take)",
            "Cómo te va?: (Nasılsın?)","Qué tal?: (Nasılsın?)","Qué pasa?: (Naber?)","Cómo te va?: (Nasılsın?)",
            "Bien: (İyi)","Bien: (İyi)","Muy bien: (Çok iyi)","Así así: (Eh işte)","No tan bien: (Çok iyi değil)","Y tú?: (Ya sen?)",
            "Muy bien: (Çok iyi)","Me llamo: (Benim adım…)","Cómo te llamas?: (Adınız ne?)","Mucho gusto: (Tanıştığıma memnun oldum)","Placér: (Bir zevk)",
            "Así así: (Eh işte)","Encantado/Encantada: (Aynen)","Nos vemos mañana: (Yarın görüşürüz)","Hasta luego: (Sonra görüşürüz)",
            "No tan bien: (Çok iyi değil)","Hasta pronto amigo: (Yakında görüşürüz dostum)","Gracias: (Teşekkür ederim)","De nada: (Rica ederim)","No hay de qué: (Sorun değil)",
            "Y tú?: (Ya sen?)","Disculpe: (Affedersiniz)","Lo siento: (Üzgünüm)","acercar: yaklaşmak (to approach)","Disculpe: (Affedersiniz)","Lo siento: (Üzgünüm)",
            "Me llamo: (Benim adım…)","acción: aksiyon (action", "aceptar: almak, kabul etmek (to accept, receive, take)",
            "Cómo te llamas?: (Adınız ne?)","acompañar: arkadaşlık etmek (to accompany)","actuar: Harekete geçirmek,Çalıştırmak(actuate)",
            "Mucho gusto: (Tanıştığıma memnun oldum)","actitud: hal, tavır(attitude)", "Placér: (Bir zevk)","acordar: kabul etmek, razı olmak(agree, consent)",
            "Encantado/Encantada: (Aynen)","actividad: Çalışma , Faaliyet, Etkinlik (activity)",
            "Nos vemos mañana: (Yarın görüşürüz)","acto: iş, davranış, hareket (act)", "Hasta luego: (Sonra görüşürüz)","acto: iş, davranış, hareket (act)",
            "Hasta pronto amigo: (Yakında görüşürüz dostum)", "Gracias: (Teşekkür ederim)","actual: mevcut, var olan(present)",
            "De nada: (Rica ederim)", "No hay de qué: (Sorun değil)", "Disculpe: (Affedersiniz)", "Lo siento: (Üzgünüm)", "actuar: Harekete geçirmek,Çalıştırmak(actuate)", "acuerdo: Anlaşma, Uyum, mutakabat (agreement)",
            "Doce :  Oniki")


        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, kelimeler)
        lv.setAdapter(adapter)


        searchBar.addTextChangeListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {

            }

            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {

                adapter.getFilter().filter(charSequence)
            }

            override fun afterTextChanged(editable: Editable) {

        }
    })

        lv.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(adapterView: AdapterView<*>, view: View, i: Int, l: Long) {
                Toast.makeText(this@MainActivity, adapter.getItem(i)!!.toString(), Toast.LENGTH_SHORT).show()
            }
        })




    }
}
