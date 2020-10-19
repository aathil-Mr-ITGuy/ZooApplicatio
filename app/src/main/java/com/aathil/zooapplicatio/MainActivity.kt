package com.aathil.zooapplicatio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity.view.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val title = arrayOf<String>(
        "Camel",
        "Capybara",
        "Caribou",
        "Cassowary",
        "Cat",
        "Caterpillar",
        "Cattle",
        "Chamois",
        "Cheetah",
        "Rabbit",


    )

    val description = arrayOf<String>(
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
    )

    val imagesId = arrayOf<Int>(
            R.drawable.camel,
        R.drawable.capybara,
        R.drawable.caribou,
            R.drawable.cassowary,
        R.drawable.cat,
            R.drawable.caterpillar,
        R.drawable.cattle,
        R.drawable.chamois,
        R.drawable.cheetah,
        R.drawable.rabbit

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //creating list adapter
        var myListAdapter = MyListAdapter(this,title,description,imagesId)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener(){ adapterView, _, position, _ ->
            val intent = Intent(this, AnimalInfo:: class.java)
            intent.putExtra("title", title[position]!!)
            intent.putExtra("des", description[position]!!)
            intent.putExtra("image", imagesId[position]!!)
            startActivity(intent)
//            val itemAtPos = adapterView.getItemAtPosition(position)
//            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
//            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
        }
//        listView.setOnItemClickListener{ adapterView: AdapterView<*>, view1: View, i: Int, l: Long,  ->
//            val intent = Intent(this, AnimalInfo:: class.java)
//            intent.putExtra("title", title[position]!!)
//            intent.putExtra("des", description!!)
//            intent.putExtra("image", imagesId!!)
//            startActivity(intent)
//
//        }
    }
}