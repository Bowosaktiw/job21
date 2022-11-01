package com.example.job21bowo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listKelas = arrayOf(
        "VIVI NUR AISYAH",
        "ZULFA SOFIANA",
        "AHMAD ARDHI SETIAWAN",
        "ANISATHUR ROFIQOH",
        "AYU FEBRIANA PUTRI",
        "BOWO SAKTI W.",
        "DANUARDI WAHYU PL",
        "DEVA BUDIYANA",
        "DWI FEBRI STIYA N",
        "EVA ROHAS",
        "FELIM EDI P"
    )
    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listKelas.indices) {
            list.add(Kelas(listKelas[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}
