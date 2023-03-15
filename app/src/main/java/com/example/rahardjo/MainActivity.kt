package com.example.rahardjo

import android.app.Notification.EXTRA_TEXT
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btn_intent)
        val btnIntentData = findViewById<Button>(R.id.btn_pindah_data)
        val btnIntentObjek = findViewById<Button>(R.id.btn_pindah_objek)


        btnIntent.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btnIntentObjek.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_intent -> run {
                val intentBiasa = Intent(this@MainActivity, Layar_2::class.java)
                startActivity(intentBiasa)
            }
            R.id.btn_pindah_data -> run {
                val intentData = Intent (this@MainActivity, PindahData::class.java)
                intentData.putExtra(PindahData.EXTRA_TEXT, "Hai, saya belajar dengan rajin")
                startActivity(intentData)
            }
            R.id.btn_pindah_objek -> run {
                val cars = Cars(
                    "Kijang",
                    2003,
                    "BM 1245 KM"
                )
                val intentObjek = Intent (this@MainActivity,PindahObjek::class.java)
                intentObjek.putExtra(PindahObjek.EXTRA_CARS, cars)
                startActivity(intentObjek)
            }

        }
    }
}