package com.aathil.zooapplicatio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animal_info.*

class AnimalInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_info)

        val bundle: Bundle? = intent.extras
        val title = bundle?.getString("title")
        val des = bundle?.getString("des")
        val image = bundle?.getInt("image")

        if (image != null) {
            animalImage.setImageResource(image)
        }
        animalName.text = title
        animalDetails.text = des

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = title
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)






    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}