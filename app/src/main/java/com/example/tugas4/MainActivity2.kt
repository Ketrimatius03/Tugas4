package com.example.tugas4

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    private lateinit var pahlawanRecyclerView: RecyclerView
    private lateinit var pahlawanMyAdapter: MyAdapter
    private lateinit var listpahlawan: ArrayList<ItemData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        pahlawanRecyclerView = findViewById(R.id.pahlawanRV)
        listpahlawan = ArrayList()

        listpahlawan.add(ItemData(R.drawable.johanisdimara, "Johanis A Dimara", "Papua"))
        listpahlawan.add(ItemData(R.drawable.franskaiseipo, "Frans Kaiseipo", "Papua"))
        listpahlawan.add(ItemData(R.drawable.rakartini, "RA.Kartini", "Jawa Tengah"))
        listpahlawan.add(ItemData(R.drawable.teukuumar, "Teuku Umar", "Aceh"))
        listpahlawan.add(ItemData(R.drawable.pattimura, "Pattimura", "Maluku"))
        listpahlawan.add(ItemData(R.drawable.mohhatta, "Mohammad Hatta", "Sumatera Barat"))
        listpahlawan.add(ItemData(R.drawable.silaspapare, "Silas Papare", "Papua"))
        listpahlawan.add(ItemData(R.drawable.sisingamangaraja, "Si Singamangaraja XII", "Sumatera Barat"))



        pahlawanRecyclerView.layoutManager = LinearLayoutManager(this)
        pahlawanRecyclerView.setHasFixedSize(true)
        pahlawanMyAdapter = MyAdapter(listpahlawan)
        pahlawanRecyclerView.adapter = pahlawanMyAdapter
    }

}



