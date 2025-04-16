package com.example.tugas4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {

    private lateinit var wisataRecyclerView: RecyclerView
    private lateinit var wisataList: ArrayList<Image>
    private lateinit var wisataAdapter: ImageAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        wisataList = ArrayList()

        wisataList.add(
            Image(R.drawable.bukit_tungkuwuri, "Bukit Tungku Wiri",
               " Bukit Tungku Wiri, yang dikenal juga sebagai Bukit Teletubbies,"+
                "terletak di Kampung Doyo Lama, Distrik Waibu, Kabupaten Jayapura, Papua."+ "Nama Tungku Wiri berasal dari bahasa lokal, di mana wiri"+ "berarti gunung dan tungku merujuk pada perapian tradisional."+
                "Julukan Bukit Teletubbies diberikan oleh wisatawan karena bentuk perbukitannya "+ "yang bergelombang dan ditutupi rumput hijau, menyerupai latar dalam serial anak-anak Teletubbies.")
        )
        wisataList.add(
            Image(R.drawable.bukit_jokowi, "Bukit Jokowi ",
                "Bukit Jokowi, yang terletak di kawasan Skiland, Distrik Jayapura Selatan, Papua,"+
                "merupakan destinasi wisata yang menawarkan panorama alam spektakuler dari ketinggian."+
                "Dari puncaknya, pengunjung dapat menikmati pemandangan Teluk Youtefa, perbukitan Skyline," +
                "hutan Mendug, serta Kampung Enggros dan Tobati .")
        )
        wisataList.add(
            Image(R.drawable.danau_love, "Danau Love",
                "Danau Love, yang juga dikenal sebagai Danau Imfote, adalah salah satu destinasi wisata alam yang menawan di Jayapura, Papua."+
                "Terletak di Kampung Puai, Distrik Sentani Timur, Kabupaten Jayapura, " +
                "danau ini terkenal karena bentuknya yang menyerupai simbol hati jika dilihat dari ketinggian, "+
                "sehingga mendapatkan julukan \"Danau Love.")
        )
        wisataList.add(
            Image(R.drawable.jembatan_merah, "Jembatan Merah Youtefa",
                "Jembatan Merah Youtefa, yang juga dikenal sebagai Jembatan Youtefa atau Jembatan Merah Holtekamp," +
                "merupakan ikon kebanggaan masyarakat Jayapura, Papua." +
                "Jembatan ini membentang megah di atas Teluk Youtefa, menghubungkan wilayah Hamadi dengan Holtekamp,"+
                "serta memperpendek jarak tempuh dari Kota Jayapura ke Distrik Muara Tami dan Pos Lintas Batas Negara (PLBN) Skouw.")
        )
        wisataList.add(
            Image(R.drawable.kali_biru, "Kali Biru Genyem",
                "Kali Biru Genyem, atau dikenal juga sebagai Warabiae dalam bahasa setempat,"+
                "merupakan destinasi wisata alam yang terletak di Kampung Berab, Distrik Nimbokrang,"+
                "Kabupaten Jayapura, Papua. Terletak di kaki Pegunungan Cyloop," +
                "kawasan ini menawarkan udara yang sejuk dan suasana yang tenang, dikelilingi oleh hutan tropis "+
                "yang lebat dan kontur wilayah pegunungan yang memukau .")
        )
        wisataList.add(
            Image(R.drawable.raja_ampat, "Raja Ampat",
                "Raja Ampat adalah sebuah kabupaten di Provinsi Papua Barat Daya,"+
                "Indonesia, yang terkenal sebagai salah satu surga bahari dunia. Terletak di ujung barat Pulau Papua," +
                "kawasan ini terdiri dari lebih dari 600 pulau, dengan empat pulau utama:"+
                "Waigeo, Misool, Salawati, dan Batanta")
        )

        wisataRecyclerView = findViewById(R.id.myRecyclerView)
        wisataRecyclerView.setHasFixedSize(true)
        wisataRecyclerView.layoutManager = LinearLayoutManager(this)

        wisataAdapter = ImageAdapter(wisataList)
        wisataRecyclerView.adapter = wisataAdapter

        wisataAdapter.onItemClick = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("wisata", it)
            startActivity(intent)
        }
    }
}